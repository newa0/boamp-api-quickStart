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
 * <p>Classe Java pour Reconduction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Reconduction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;element name="NB_RECONDUCTIONS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="NB_RECONDUCTIONS_MIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="NB_RECONDUCTIONS_MAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="CALENDRIER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="DUREE_JOURS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *           &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Reconduction", propOrder = {
    "oui",
    "nbreconductions",
    "nbreconductionsmin",
    "nbreconductionsmax",
    "calendrier",
    "dureemois",
    "dureejours",
    "description",
    "non"
})
public class Reconduction {

    @XmlElement(name = "OUI")
    protected Object oui;
    @XmlElement(name = "NB_RECONDUCTIONS")
    protected BigDecimal nbreconductions;
    @XmlElement(name = "NB_RECONDUCTIONS_MIN")
    protected String nbreconductionsmin;
    @XmlElement(name = "NB_RECONDUCTIONS_MAX")
    protected String nbreconductionsmax;
    @XmlElement(name = "CALENDRIER")
    protected String calendrier;
    @XmlElement(name = "DUREE_MOIS")
    protected BigDecimal dureemois;
    @XmlElement(name = "DUREE_JOURS")
    protected BigDecimal dureejours;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
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
     * Obtient la valeur de la propriété nbreconductions.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNBRECONDUCTIONS() {
        return nbreconductions;
    }

    /**
     * Définit la valeur de la propriété nbreconductions.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNBRECONDUCTIONS(BigDecimal value) {
        this.nbreconductions = value;
    }

    /**
     * Obtient la valeur de la propriété nbreconductionsmin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBRECONDUCTIONSMIN() {
        return nbreconductionsmin;
    }

    /**
     * Définit la valeur de la propriété nbreconductionsmin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBRECONDUCTIONSMIN(String value) {
        this.nbreconductionsmin = value;
    }

    /**
     * Obtient la valeur de la propriété nbreconductionsmax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNBRECONDUCTIONSMAX() {
        return nbreconductionsmax;
    }

    /**
     * Définit la valeur de la propriété nbreconductionsmax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNBRECONDUCTIONSMAX(String value) {
        this.nbreconductionsmax = value;
    }

    /**
     * Obtient la valeur de la propriété calendrier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCALENDRIER() {
        return calendrier;
    }

    /**
     * Définit la valeur de la propriété calendrier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCALENDRIER(String value) {
        this.calendrier = value;
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
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRIPTION() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRIPTION(String value) {
        this.description = value;
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
