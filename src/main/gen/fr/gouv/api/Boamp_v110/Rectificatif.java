//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Rectificatif complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Rectificatif"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="PARUT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PARUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NO_ANN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ANNONCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REF_JOUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RUB_INIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TXT_INIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AJOUTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUPPRIMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="APRES_MENTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rectificatif", propOrder = {
    "parutAndPARUTIONAndTYPE"
})
public class Rectificatif {

    @XmlElementRefs({
        @XmlElementRef(name = "RUB_INIT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PARUTION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TYPE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PARUT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DATE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "REF_JOUE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "APRES_MENTION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NO_ANN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TXT_INIT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AJOUTER", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SUPPRIMER", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ANNONCE", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> parutAndPARUTIONAndTYPE;

    /**
     * Gets the value of the parutAndPARUTIONAndTYPE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parutAndPARUTIONAndTYPE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPARUTAndPARUTIONAndTYPE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getPARUTAndPARUTIONAndTYPE() {
        if (parutAndPARUTIONAndTYPE == null) {
            parutAndPARUTIONAndTYPE = new ArrayList<JAXBElement<String>>();
        }
        return this.parutAndPARUTIONAndTYPE;
    }

}
