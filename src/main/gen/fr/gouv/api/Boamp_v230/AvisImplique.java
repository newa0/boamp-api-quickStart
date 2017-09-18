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
 * <p>Classe Java pour AvisImplique complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AvisImplique"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ACCORD_CADRE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="ACCORD_CADRE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="SAD_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="SAD_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="SAD_AUTRES_ACHETEURS_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="SAD_AUTRES_ACHETEURS_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AvisImplique", propOrder = {
    "accordcadreoui",
    "accordcadrenon",
    "sadoui",
    "sadnon",
    "sadautresacheteursoui",
    "sadautresacheteursnon"
})
public class AvisImplique {

    @XmlElement(name = "ACCORD_CADRE_OUI")
    protected Object accordcadreoui;
    @XmlElement(name = "ACCORD_CADRE_NON")
    protected Object accordcadrenon;
    @XmlElement(name = "SAD_OUI")
    protected Object sadoui;
    @XmlElement(name = "SAD_NON")
    protected Object sadnon;
    @XmlElement(name = "SAD_AUTRES_ACHETEURS_OUI")
    protected Object sadautresacheteursoui;
    @XmlElement(name = "SAD_AUTRES_ACHETEURS_NON")
    protected Object sadautresacheteursnon;

    /**
     * Obtient la valeur de la propriété accordcadreoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACCORDCADREOUI() {
        return accordcadreoui;
    }

    /**
     * Définit la valeur de la propriété accordcadreoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACCORDCADREOUI(Object value) {
        this.accordcadreoui = value;
    }

    /**
     * Obtient la valeur de la propriété accordcadrenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getACCORDCADRENON() {
        return accordcadrenon;
    }

    /**
     * Définit la valeur de la propriété accordcadrenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setACCORDCADRENON(Object value) {
        this.accordcadrenon = value;
    }

    /**
     * Obtient la valeur de la propriété sadoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSADOUI() {
        return sadoui;
    }

    /**
     * Définit la valeur de la propriété sadoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSADOUI(Object value) {
        this.sadoui = value;
    }

    /**
     * Obtient la valeur de la propriété sadnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSADNON() {
        return sadnon;
    }

    /**
     * Définit la valeur de la propriété sadnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSADNON(Object value) {
        this.sadnon = value;
    }

    /**
     * Obtient la valeur de la propriété sadautresacheteursoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSADAUTRESACHETEURSOUI() {
        return sadautresacheteursoui;
    }

    /**
     * Définit la valeur de la propriété sadautresacheteursoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSADAUTRESACHETEURSOUI(Object value) {
        this.sadautresacheteursoui = value;
    }

    /**
     * Obtient la valeur de la propriété sadautresacheteursnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSADAUTRESACHETEURSNON() {
        return sadautresacheteursnon;
    }

    /**
     * Définit la valeur de la propriété sadautresacheteursnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSADAUTRESACHETEURSNON(Object value) {
        this.sadautresacheteursnon = value;
    }

}
