package com.x.api.strategies;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import fr.gouv.api.Boamp_v010.Annonce;

/**
 * Transformer une instance xml "valide et conforme" en Java Bean.
 *
 */
class UnMarchaller_v010 {
	private Annonce avis = null;

	UnMarchaller_v010(InputStream stream) {
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
		Annonce car = root.getValue();
		return car;
	}

	public Annonce getAvis() {
		return avis;
	}
}