package com.x.api.core;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 
 * @author Emmanuel PESENTI
 *
 *         27 nov. 2016
 */
public class ServiceSearch {
	private static Logger			log								= Logger.getLogger(ServiceSearch.class);
	private static Document		doc								= null;
	private static List<Item>	items							= null;
	private static int				nbItemsRetournes	= 0;
	private static int				nbItemsExistants	= 0;

	public static List<Item> execute(String urlSearch, String fileFormat, boolean strict) {
		log.warn("Retrieving Boamp.fr Data");
		items = new Vector<Item>();
		if (fileFormat.equals("xml"))
			xmlread(urlSearch);
		else
			jsonread(urlSearch);
		return items;
	}

	private static void xmlread(String urlSearch) {
		log.warn("Creating XML Reader");
		doc = getDocument(urlSearch);
		log.warn("Parsing XML Response");
		if (doc != null) {
			Element root = doc.getDocumentElement();
			NodeList nList = root.getChildNodes();
			nbItemsRetournes = Integer.parseInt(root.getAttribute("nbItemsRetournes"));
			nbItemsExistants = Integer.parseInt(root.getAttribute("nbItemsExistants"));

			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) nNode;
					Item item = new Item();
					item.setId(e.getAttribute("id"));
					item.setValue(e.getAttribute("value"));
					item.setSchema(e.getAttribute("schema"));
					item.setDescription(e.getAttribute("description"));
					items.add(item);
				}
			}
		}
	}

	private static final Document getDocument(String urlSearch) {
		URLConnection conn = null;
		InputStream inputStream = null;
		Document document = null;
		DocumentBuilderFactory factory = null;
		try {
			conn = new URL(urlSearch).openConnection();
			conn.addRequestProperty("Accept", "application/xml");
			inputStream = conn.getInputStream();
			factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = factory.newDocumentBuilder();
			document = dBuilder.parse(inputStream);
			document.getDocumentElement().normalize();
		}
		catch (FileNotFoundException e) {
			// e.printStackTrace();
			nbItemsExistants = 0;
		}
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		catch (SAXException e) {
			e.printStackTrace();
		}
		finally {
			IOUtils.closeQuietly(inputStream);
		}
		return document;
	}

	private static void jsonread(String urlSearch) {
		log.info("json parser not implemented yet..");
	}

	public static final int getNbItemsRetournes() {
		return nbItemsRetournes;
	}

	public static final int getNbItemsExistants() {
		return nbItemsExistants;
	}
}
