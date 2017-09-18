package com.x.api.strategies;
import java.io.InputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import fr.gouv.api.Boamp_v110.Annonce;
import fr.gouv.api.Boamp_v110.Parution;

/**
 * Transformer une instance xml "valide et conforme" en Java Bean.
 *
 */
class UnMarchaller_v110 {
	private Annonce avis = null;

	UnMarchaller_v110(InputStream stream) {
		super();
		try {
			this.avis = (Annonce) unmarshal(stream);
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	private Annonce unmarshal(InputStream stream) throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Parution.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		JAXBElement<Parution> root = jaxbUnmarshaller.unmarshal(new StreamSource(stream), Parution.class);
		Parution parution = root.getValue();
		return parution.getANNONCE();
	}

	public Annonce getAvis() {
		return avis;
	}
}