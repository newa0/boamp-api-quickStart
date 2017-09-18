//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AnnexeD4 complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AnnexeD4"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence minOccurs="0"&gt;
 *             &lt;element name="INFRUCTUEUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;choice minOccurs="0"&gt;
 *               &lt;element name="RAISONS_TECHNIQUES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="RAISONS_ARTISTIQUES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="RAISONS_EXCLUSIVITES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *               &lt;element name="PROPRIETE_INTELLECTUELLE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *             &lt;/choice&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="HORS_SCOPE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="EXPLICATION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnexeD4", propOrder = {
    "infructueux",
    "raisonstechniques",
    "raisonsartistiques",
    "raisonsexclusivites",
    "proprieteintellectuelle",
    "horsscope",
    "explication"
})
public class AnnexeD4 {

    @XmlElement(name = "INFRUCTUEUX")
    protected Object infructueux;
    @XmlElement(name = "RAISONS_TECHNIQUES")
    protected Object raisonstechniques;
    @XmlElement(name = "RAISONS_ARTISTIQUES")
    protected Object raisonsartistiques;
    @XmlElement(name = "RAISONS_EXCLUSIVITES")
    protected Object raisonsexclusivites;
    @XmlElement(name = "PROPRIETE_INTELLECTUELLE")
    protected Object proprieteintellectuelle;
    @XmlElement(name = "HORS_SCOPE")
    protected Object horsscope;
    @XmlElement(name = "EXPLICATION")
    protected Object explication;

    /**
     * Obtient la valeur de la propriété infructueux.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINFRUCTUEUX() {
        return infructueux;
    }

    /**
     * Définit la valeur de la propriété infructueux.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINFRUCTUEUX(Object value) {
        this.infructueux = value;
    }

    /**
     * Obtient la valeur de la propriété raisonstechniques.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRAISONSTECHNIQUES() {
        return raisonstechniques;
    }

    /**
     * Définit la valeur de la propriété raisonstechniques.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRAISONSTECHNIQUES(Object value) {
        this.raisonstechniques = value;
    }

    /**
     * Obtient la valeur de la propriété raisonsartistiques.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRAISONSARTISTIQUES() {
        return raisonsartistiques;
    }

    /**
     * Définit la valeur de la propriété raisonsartistiques.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRAISONSARTISTIQUES(Object value) {
        this.raisonsartistiques = value;
    }

    /**
     * Obtient la valeur de la propriété raisonsexclusivites.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRAISONSEXCLUSIVITES() {
        return raisonsexclusivites;
    }

    /**
     * Définit la valeur de la propriété raisonsexclusivites.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRAISONSEXCLUSIVITES(Object value) {
        this.raisonsexclusivites = value;
    }

    /**
     * Obtient la valeur de la propriété proprieteintellectuelle.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPROPRIETEINTELLECTUELLE() {
        return proprieteintellectuelle;
    }

    /**
     * Définit la valeur de la propriété proprieteintellectuelle.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPROPRIETEINTELLECTUELLE(Object value) {
        this.proprieteintellectuelle = value;
    }

    /**
     * Obtient la valeur de la propriété horsscope.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getHORSSCOPE() {
        return horsscope;
    }

    /**
     * Définit la valeur de la propriété horsscope.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setHORSSCOPE(Object value) {
        this.horsscope = value;
    }

    /**
     * Obtient la valeur de la propriété explication.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEXPLICATION() {
        return explication;
    }

    /**
     * Définit la valeur de la propriété explication.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEXPLICATION(Object value) {
        this.explication = value;
    }

}
