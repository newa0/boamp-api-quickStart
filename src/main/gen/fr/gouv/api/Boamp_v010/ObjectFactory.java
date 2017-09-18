//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:36 AM CEST 
//


package fr.gouv.api.Boamp_v010;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.gouv.api.Boamp_v010 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ANNONCE_QNAME = new QName("", "ANNONCE");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.gouv.api.Boamp_v010
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Annonce }
     * 
     */
    public Annonce createAnnonce() {
        return new Annonce();
    }

    /**
     * Create an instance of {@link Descripteurs }
     * 
     */
    public Descripteurs createDescripteurs() {
        return new Descripteurs();
    }

    /**
     * Create an instance of {@link Descripteur }
     * 
     */
    public Descripteur createDescripteur() {
        return new Descripteur();
    }

    /**
     * Create an instance of {@link ClasseActivites }
     * 
     */
    public ClasseActivites createClasseActivites() {
        return new ClasseActivites();
    }

    /**
     * Create an instance of {@link ClasseActivite }
     * 
     */
    public ClasseActivite createClasseActivite() {
        return new ClasseActivite();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Annonce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ANNONCE")
    public JAXBElement<Annonce> createANNONCE(Annonce value) {
        return new JAXBElement<Annonce>(_ANNONCE_QNAME, Annonce.class, null, value);
    }

}
