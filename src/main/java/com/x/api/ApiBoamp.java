package com.x.api;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Vector;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.x.api.core.Item;
import com.x.api.core.ServiceGet;
import com.x.api.core.ServiceSearch;

/**
 * @author Emmanuel PESENTI
 *
 *         22 nov. 2016
 */
public class ApiBoamp {
	private static Logger				log					= Logger.getLogger(ApiBoamp.class);
	public static final String	DNS					= "http://opendata.prod.ext.dila.fr/opendata/api-boamp/annonces/";
	private String							urlSearch		= DNS;
	private String							urlGetter		= DNS;
	private List<Item>					items				= null;
	private String							fileFormat	= null;
	private File								localCache	= null;

	public static void main(String[] args) throws Exception {
		PropertyConfigurator.configure(ApiBoamp.class.getClassLoader().getResource("log4j.properties"));
		String fileFormat = "xml";// MainHelper.getParam("-fileFormat", args, "xml"); // xml par default
		String critere = "source_cat: v2 dateparution:2016/01/09"; // xml par default
		ApiBoamp api = new ApiBoamp(fileFormat);
		api.search(critere);
		api.getFirstItemForQuickstart();
		// un 2e appel
		critere = "source_cat: v2 dateparution:2016/01/07"; // xml par default
		api.search(critere);
		api.getFirstItemForQuickstart();
	}

	public ApiBoamp() {
		this("xml");
	}

	public ApiBoamp(String fileFormat) {
		this.fileFormat = fileFormat;
		this.localCache = initFileCache();
	}

	public final List<Item> search(String critere) {
		log.info(String.format("Search au format %s ...", fileFormat));
		this.items = new Vector<Item>(1000);
		this.urlSearch = evalUrlSearch(critere);
		List<Item> listItem = ServiceSearch.execute(urlSearch, fileFormat, true);
		if (listItem != null) {
			int nbItemsExistants = ServiceSearch.getNbItemsExistants();
			this.items.addAll(listItem);
			if (nbItemsExistants <= items.size()) {
				for (Item item : items) {
					String idAnnonce = item.getValue();
					String version = item.getVersion();
					log.info("Get annonce where idWeb = " + idAnnonce + " pour la version " + version + ".");

					// Gestion par Cache : Le search peut charger uniquement les annonces en cache, à cette étape
					if (dejaEnCache(idAnnonce, version)) {
						File f = getFileInCache(idAnnonce, version);
						String xmlStr = null;
						try {
							xmlStr = FileUtils.readFileToString(f, Charset.forName("UTF-8"));
						}
						catch (IOException e) {
							e.printStackTrace();
						}
						item.setAvis(xmlStr);
					}
				}
				System.out.printf("\n%s items trouvés...\n\n", items.size());
			}
			return items;
		}
		else
			throw new NullPointerException();
	}

	public final List<Item> get() {
		if (items.size() >= 1) {
			for (Item item : items) {
				get(item);
			}
		}
		return items;
	}

	public final Item get(Item item) {
		log.warn(String.format("Chargement de l'item %s.", item.getValue()));
		String idAnnonce = item.getValue();
		String version = item.getVersion();

		// Gestion par Cache
		if (dejaEnCache(idAnnonce, version)) {
			File f = getFileInCache(idAnnonce, version);
			String xmlStr = null;
			try {
				xmlStr = FileUtils.readFileToString(f, Charset.forName("UTF-8"));
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			item.setAvis(xmlStr);
		}
		else {
			this.urlGetter = DNS + version + "/" + idAnnonce;
			String xmlStr = ServiceGet.execute(urlGetter, idAnnonce, version, fileFormat);
			writeIntoFile(getLocalFile(idAnnonce, fileFormat), xmlStr);
			item.setAvis(xmlStr);
		}
		return item;
	}

	public List<Item> searchComplete(String critere) {
		search(critere);
		get();
		return items;
	}

	private final Item getFirstItemForQuickstart() {
		if (items.size() < 1) {
			return null;
		}
		else {
			log.info("Chargement du premier item Annonce.");
			String idAnnonce = items.get(0).getValue();
			String version = items.get(0).getVersion();
			this.urlGetter = DNS + version + "/" + idAnnonce;
			String xmlStr = ServiceGet.execute(urlGetter, idAnnonce, version, fileFormat);
			items.get(0).setAvis(xmlStr);
			System.out.printf("Description de l'Avis 1 : %s%n", items.get(0).getDescription());
			return items.get(0);
		}
	}

	private final String evalUrlSearch(String critere) {
		String urlSearch = "";
		try {
			urlSearch = DNS + "search?criterion=" + URLEncoder.encode(critere, "UTF-8");
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return urlSearch;
	}

	private final File initFileCache() {
		File cache = new File(System.getProperty("java.io.tmpdir"), ".boamp.fr");
		if (!cache.exists()) {
			cache.mkdir();
		}
		return cache;
	}

	public final String getFileFormat() {
		return fileFormat;
	}

	public final void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public final String getUrlSearch() {
		return urlSearch;
	}

	public final File getLocalCache() {
		return localCache;
	}

	public boolean dejaEnCache(String idAnnonce, String fileFormat) {
		return new File(localCache, idAnnonce + "." + fileFormat).exists();
	}

	public File getLocalFile(String idAnnonce, String fileFormat) {
		return new File(localCache, idAnnonce + "." + fileFormat);
	}

	public final File getFileInCache(String idAnnonce, String fileFormat) {
		if (dejaEnCache(idAnnonce, fileFormat))
			return getLocalFile(idAnnonce, fileFormat);
		else
			return null;
	}

	public final List<Item> getItems() {
		return items;
	}

	private static final File writeIntoFile(File f, String str) {
		try {
			FileUtils.writeStringToFile(f, str, Charset.forName("UTF-8"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return f;
	}
}