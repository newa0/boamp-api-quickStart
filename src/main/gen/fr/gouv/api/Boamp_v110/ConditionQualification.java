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
 * <p>Classe Java pour ConditionQualification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionQualification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONDITIONS_DETAILS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="METHODE_VERIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionQualification", propOrder = {
    "titreAndCONDITIONSDETAILSAndMETHODEVERIFICATION"
})
public class ConditionQualification {

    @XmlElementRefs({
        @XmlElementRef(name = "METHODE_VERIFICATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CONDITIONS_DETAILS", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> titreAndCONDITIONSDETAILSAndMETHODEVERIFICATION;

    /**
     * Gets the value of the titreAndCONDITIONSDETAILSAndMETHODEVERIFICATION property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titreAndCONDITIONSDETAILSAndMETHODEVERIFICATION property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITREAndCONDITIONSDETAILSAndMETHODEVERIFICATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getTITREAndCONDITIONSDETAILSAndMETHODEVERIFICATION() {
        if (titreAndCONDITIONSDETAILSAndMETHODEVERIFICATION == null) {
            titreAndCONDITIONSDETAILSAndMETHODEVERIFICATION = new ArrayList<JAXBElement<String>>();
        }
        return this.titreAndCONDITIONSDETAILSAndMETHODEVERIFICATION;
    }

}
