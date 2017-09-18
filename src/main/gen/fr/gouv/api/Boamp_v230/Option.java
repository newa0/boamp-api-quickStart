//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Option complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Option"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="DUREE_JOURS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "Option", propOrder = {
    "oui",
    "description",
    "dureemois",
    "dureejours",
    "non"
})
public class Option {

    @XmlElement(name = "OUI")
    protected Object oui;
    @XmlElement(name = "DESCRIPTION")
    protected Object description;
    @XmlElement(name = "DUREE_MOIS")
    protected BigDecimal dureemois;
    @XmlElement(name = "DUREE_JOURS")
    protected BigDecimal dureejours;
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
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDESCRIPTION() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDESCRIPTION(Object value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété dureemois.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDUREEMOIS() {
        return dureemois;
    }

    /**
     * Définit la valeur de la propriété dureemois.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDUREEMOIS(BigDecimal value) {
        this.dureemois = value;
    }

    /**
     * Obtient la valeur de la propriété dureejours.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDUREEJOURS() {
        return dureejours;
    }

    /**
     * Définit la valeur de la propriété dureejours.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDUREEJOURS(BigDecimal value) {
        this.dureejours = value;
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
