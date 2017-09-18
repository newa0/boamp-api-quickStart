package com.x.api.strategies;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import fr.gouv.api.Boamp_v110.Annonce;

public class Retriever {

	public Object getOneCompleteItemAt(String iden, String xsd, String out) throws Exception {
		URL url = null;

		if (xsd.endsWith("Boamp_v010.xsd")) {
			url = new URL("http://opendata.preprod.ext.dila.fr/opendata/api-boamp/annonces/v010/" + iden);
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("Accept", "application/" + out);
			InputStream stream = conn.getInputStream();
			fr.gouv.api.Boamp_v010.Annonce avis = new UnMarchaller_v010(stream).getAvis();
			new Strategy1().execute(avis);
			// new Strategie2().execute(avis);
		}

		else if (xsd.endsWith("Boamp_v110.xsd")) {
			url = new URL("http://opendata.preprod.ext.dila.fr/opendata/api-boamp/annonces/v110/" + iden);
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("Accept", "application/" + out);
			InputStream stream = conn.getInputStream();
			Annonce avis = new UnMarchaller_v110(stream).getAvis();
			new Strategy1().execute(avis);
			// new Strategie2().execute(avis);
		}

		else if (xsd.endsWith("Boamp_v230.xsd")) {
			url = new URL("http://opendata.preprod.ext.dila.fr/opendata/api-boamp/annonces/v230/" + iden);
			URLConnection conn = url.openConnection();
			conn.addRequestProperty("Accept", "application/" + out);
			InputStream stream = conn.getInputStream();
			fr.gouv.api.Boamp_v230.Annonce avis = new UnMarchaller_v230(stream).getAvis();
			new Strategy1().execute(avis);
			// new Strategie2().execute(avis);
		}
		return null;
	}

}