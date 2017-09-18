package com.x.api.strategies;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import fr.gouv.api.Boamp_v230.Annonce;

/**
 * Transformer une instance xml "valide et conforme" en Java Bean.
 *
 */
class UnMarchaller_v230 {
	private Annonce avis = null;

	UnMarchaller_v230(InputStream stream) {
		super();
		try {
			this.avis = (Annonce) unmarshal(stream);
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private Annonce unmarshal(InputStream stream) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Annonce.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		JAXBElement<Annonce> root = jaxbUnmarshaller.unmarshal(new StreamSource(stream), Annonce.class);
		Annonce avis = root.getValue();
		return avis;
	}

	public Annonce getAvis() {
		return avis;
	}
}