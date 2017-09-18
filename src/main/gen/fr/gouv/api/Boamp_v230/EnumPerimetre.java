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
 * <p>Classe Java pour EnumPerimetre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumPerimetre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CMP-2006" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="CMP-2006-DEFENSE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIRECTIVE-18" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIRECTIVE-17" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIRECTIVE-81" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIRECTIVE-23" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIRECTIVE-24" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIRECTIVE-25" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DSP" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "EnumPerimetre", propOrder = {
    "cmp2006",
    "cmp2006DEFENSE",
    "directive18",
    "directive17",
    "directive81",
    "directive23",
    "directive24",
    "directive25",
    "dsp",
    "autre"
})
public class EnumPerimetre {

    @XmlElement(name = "CMP-2006")
    protected Object cmp2006;
    @XmlElement(name = "CMP-2006-DEFENSE")
    protected Object cmp2006DEFENSE;
    @XmlElement(name = "DIRECTIVE-18")
    protected Object directive18;
    @XmlElement(name = "DIRECTIVE-17")
    protected Object directive17;
    @XmlElement(name = "DIRECTIVE-81")
    protected Object directive81;
    @XmlElement(name = "DIRECTIVE-23")
    protected Object directive23;
    @XmlElement(name = "DIRECTIVE-24")
    protected Object directive24;
    @XmlElement(name = "DIRECTIVE-25")
    protected Object directive25;
    @XmlElement(name = "DSP")
    protected Object dsp;
    @XmlElement(name = "AUTRE")
    protected String autre;

    /**
     * Obtient la valeur de la propriété cmp2006.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCMP2006() {
        return cmp2006;
    }

    /**
     * Définit la valeur de la propriété cmp2006.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCMP2006(Object value) {
        this.cmp2006 = value;
    }

    /**
     * Obtient la valeur de la propriété cmp2006DEFENSE.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCMP2006DEFENSE() {
        return cmp2006DEFENSE;
    }

    /**
     * Définit la valeur de la propriété cmp2006DEFENSE.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCMP2006DEFENSE(Object value) {
        this.cmp2006DEFENSE = value;
    }

    /**
     * Obtient la valeur de la propriété directive18.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIRECTIVE18() {
        return directive18;
    }

    /**
     * Définit la valeur de la propriété directive18.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIRECTIVE18(Object value) {
        this.directive18 = value;
    }

    /**
     * Obtient la valeur de la propriété directive17.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIRECTIVE17() {
        return directive17;
    }

    /**
     * Définit la valeur de la propriété directive17.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIRECTIVE17(Object value) {
        this.directive17 = value;
    }

    /**
     * Obtient la valeur de la propriété directive81.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIRECTIVE81() {
        return directive81;
    }

    /**
     * Définit la valeur de la propriété directive81.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIRECTIVE81(Object value) {
        this.directive81 = value;
    }

    /**
     * Obtient la valeur de la propriété directive23.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIRECTIVE23() {
        return directive23;
    }

    /**
     * Définit la valeur de la propriété directive23.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIRECTIVE23(Object value) {
        this.directive23 = value;
    }

    /**
     * Obtient la valeur de la propriété directive24.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIRECTIVE24() {
        return directive24;
    }

    /**
     * Définit la valeur de la propriété directive24.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIRECTIVE24(Object value) {
        this.directive24 = value;
    }

    /**
     * Obtient la valeur de la propriété directive25.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIRECTIVE25() {
        return directive25;
    }

    /**
     * Définit la valeur de la propriété directive25.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIRECTIVE25(Object value) {
        this.directive25 = value;
    }

    /**
     * Obtient la valeur de la propriété dsp.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDSP() {
        return dsp;
    }

    /**
     * Définit la valeur de la propriété dsp.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDSP(Object value) {
        this.dsp = value;
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
