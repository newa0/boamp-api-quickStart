//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Delegation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Delegation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TEXTE_APPLICATION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DOMAINE" type="{}EnumDomaine"/&gt;
 *         &lt;element name="NATURE_CONVENTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_AN" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DATE_DEBUT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES_PRECISIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delegation", propOrder = {
    "texteapplication",
    "domaine",
    "natureconvention",
    "dureean",
    "dureemois",
    "datedebut",
    "autresprecisions"
})
public class Delegation {

    @XmlElement(name = "TEXTE_APPLICATION", required = true)
    protected String texteapplication;
    @XmlElement(name = "DOMAINE", required = true)
    protected EnumDomaine domaine;
    @XmlElement(name = "NATURE_CONVENTION")
    protected String natureconvention;
    @XmlElement(name = "DUREE_AN")
    protected BigInteger dureean;
    @XmlElement(name = "DUREE_MOIS")
    protected BigInteger dureemois;
    @XmlElement(name = "DATE_DEBUT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datedebut;
    @XmlElement(name = "AUTRES_PRECISIONS")
    protected String autresprecisions;

    /**
     * Obtient la valeur de la propriété texteapplication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTEAPPLICATION() {
        return texteapplication;
    }

    /**
     * Définit la valeur de la propriété texteapplication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTEAPPLICATION(String value) {
        this.texteapplication = value;
    }

    /**
     * Obtient la valeur de la propriété domaine.
     * 
     * @return
     *     possible object is
     *     {@link EnumDomaine }
     *     
     */
    public EnumDomaine getDOMAINE() {
        return domaine;
    }

    /**
     * Définit la valeur de la propriété domaine.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumDomaine }
     *     
     */
    public void setDOMAINE(EnumDomaine value) {
        this.domaine = value;
    }

    /**
     * Obtient la valeur de la propriété natureconvention.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATURECONVENTION() {
        return natureconvention;
    }

    /**
     * Définit la valeur de la propriété natureconvention.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATURECONVENTION(String value) {
        this.natureconvention = value;
    }

    /**
     * Obtient la valeur de la propriété dureean.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDUREEAN() {
        return dureean;
    }

    /**
     * Définit la valeur de la propriété dureean.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDUREEAN(BigInteger value) {
        this.dureean = value;
    }

    /**
     * Obtient la valeur de la propriété dureemois.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDUREEMOIS() {
        return dureemois;
    }

    /**
     * Définit la valeur de la propriété dureemois.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDUREEMOIS(BigInteger value) {
        this.dureemois = value;
    }

    /**
     * Obtient la valeur de la propriété datedebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEDEBUT() {
        return datedebut;
    }

    /**
     * Définit la valeur de la propriété datedebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEDEBUT(XMLGregorianCalendar value) {
        this.datedebut = value;
    }

    /**
     * Obtient la valeur de la propriété autresprecisions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTRESPRECISIONS() {
        return autresprecisions;
    }

    /**
     * Définit la valeur de la propriété autresprecisions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTRESPRECISIONS(String value) {
        this.autresprecisions = value;
    }

}
