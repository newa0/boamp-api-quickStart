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
 * <p>Classe Java pour DIV_EN_LOTSType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DIV_EN_LOTSType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="OFFRE_UN" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *             &lt;element name="OFFRE_PLUSIEURS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *             &lt;element name="OFFRE_TOUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DIV_EN_LOTSType", propOrder = {
    "oui",
    "offreun",
    "offreplusieurs",
    "offretous",
    "non"
})
public class DIVENLOTSType {

    @XmlElement(name = "OUI")
    protected Object oui;
    @XmlElement(name = "OFFRE_UN")
    protected Object offreun;
    @XmlElement(name = "OFFRE_PLUSIEURS")
    protected Object offreplusieurs;
    @XmlElement(name = "OFFRE_TOUS")
    protected Object offretous;
    @XmlElement(name = "NON")
    protected Object non;

    /**
     * Obtient la valeur de la propriété oui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOUI() {
        return oui;
    }

    /**
     * Définit la valeur de la propriété oui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOUI(Object value) {
        this.oui = value;
    }

    /**
     * Obtient la valeur de la propriété offreun.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOFFREUN() {
        return offreun;
    }

    /**
     * Définit la valeur de la propriété offreun.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOFFREUN(Object value) {
        this.offreun = value;
    }

    /**
     * Obtient la valeur de la propriété offreplusieurs.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOFFREPLUSIEURS() {
        return offreplusieurs;
    }

    /**
     * Définit la valeur de la propriété offreplusieurs.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOFFREPLUSIEURS(Object value) {
        this.offreplusieurs = value;
    }

    /**
     * Obtient la valeur de la propriété offretous.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOFFRETOUS() {
        return offretous;
    }

    /**
     * Définit la valeur de la propriété offretous.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOFFRETOUS(Object value) {
        this.offretous = value;
    }

    /**
     * Obtient la valeur de la propriété non.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNON() {
        return non;
    }

    /**
     * Définit la valeur de la propriété non.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNON(Object value) {
        this.non = value;
    }

}
