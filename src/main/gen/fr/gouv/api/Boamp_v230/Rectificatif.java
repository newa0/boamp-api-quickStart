//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="ANNONCE_ANTERIEUR" type="{}AnnonceAnterieure"/&gt;
 *         &lt;element name="MODIFICATION" type="{}Rectification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="INFO_COMPLEMENTAIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "annonceanterieur",
    "modification",
    "infocomplementaire"
})
public class Rectificatif {

    @XmlElement(name = "ANNONCE_ANTERIEUR", required = true)
    protected AnnonceAnterieure annonceanterieur;
    @XmlElement(name = "MODIFICATION")
    protected List<Rectification> modification;
    @XmlElement(name = "INFO_COMPLEMENTAIRE")
    protected String infocomplementaire;

    /**
     * Obtient la valeur de la propriété annonceanterieur.
     * 
     * @return
     *     possible object is
     *     {@link AnnonceAnterieure }
     *     
     */
    public AnnonceAnterieure getANNONCEANTERIEUR() {
        return annonceanterieur;
    }

    /**
     * Définit la valeur de la propriété annonceanterieur.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnonceAnterieure }
     *     
     */
    public void setANNONCEANTERIEUR(AnnonceAnterieure value) {
        this.annonceanterieur = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMODIFICATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rectification }
     * 
     * 
     */
    public List<Rectification> getMODIFICATION() {
        if (modification == null) {
            modification = new ArrayList<Rectification>();
        }
        return this.modification;
    }

    /**
     * Obtient la valeur de la propriété infocomplementaire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFOCOMPLEMENTAIRE() {
        return infocomplementaire;
    }

    /**
     * Définit la valeur de la propriété infocomplementaire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFOCOMPLEMENTAIRE(String value) {
        this.infocomplementaire = value;
    }

}
