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
 * <p>Classe Java pour EnumDomaine complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumDomaine"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="EAU_POTABLE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ASSAINISSEMENT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ORDURES_MEN_DECHETS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="TRANSPORTS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ENERGIE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="TELECOMMUNICATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AUTRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumDomaine", propOrder = {
    "eaupotable",
    "assainissement",
    "orduresmendechets",
    "transports",
    "energie",
    "telecommunication",
    "autre"
})
public class EnumDomaine {

    @XmlElement(name = "EAU_POTABLE")
    protected Object eaupotable;
    @XmlElement(name = "ASSAINISSEMENT")
    protected Object assainissement;
    @XmlElement(name = "ORDURES_MEN_DECHETS")
    protected Object orduresmendechets;
    @XmlElement(name = "TRANSPORTS")
    protected Object transports;
    @XmlElement(name = "ENERGIE")
    protected Object energie;
    @XmlElement(name = "TELECOMMUNICATION")
    protected Object telecommunication;
    @XmlElement(name = "AUTRE")
    protected String autre;

    /**
     * Obtient la valeur de la propriété eaupotable.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEAUPOTABLE() {
        return eaupotable;
    }

    /**
     * Définit la valeur de la propriété eaupotable.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEAUPOTABLE(Object value) {
        this.eaupotable = value;
    }

    /**
     * Obtient la valeur de la propriété assainissement.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getASSAINISSEMENT() {
        return assainissement;
    }

    /**
     * Définit la valeur de la propriété assainissement.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setASSAINISSEMENT(Object value) {
        this.assainissement = value;
    }

    /**
     * Obtient la valeur de la propriété orduresmendechets.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getORDURESMENDECHETS() {
        return orduresmendechets;
    }

    /**
     * Définit la valeur de la propriété orduresmendechets.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setORDURESMENDECHETS(Object value) {
        this.orduresmendechets = value;
    }

    /**
     * Obtient la valeur de la propriété transports.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTRANSPORTS() {
        return transports;
    }

    /**
     * Définit la valeur de la propriété transports.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTRANSPORTS(Object value) {
        this.transports = value;
    }

    /**
     * Obtient la valeur de la propriété energie.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENERGIE() {
        return energie;
    }

    /**
     * Définit la valeur de la propriété energie.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENERGIE(Object value) {
        this.energie = value;
    }

    /**
     * Obtient la valeur de la propriété telecommunication.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTELECOMMUNICATION() {
        return telecommunication;
    }

    /**
     * Définit la valeur de la propriété telecommunication.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTELECOMMUNICATION(Object value) {
        this.telecommunication = value;
    }

    /**
     * Obtient la valeur de la propriété autre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTRE() {
        return autre;
    }

    /**
     * Définit la valeur de la propriété autre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTRE(String value) {
        this.autre = value;
    }

}
