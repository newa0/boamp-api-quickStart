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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Delai complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Delai"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_JOURS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DATE_DEBUT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_FIN" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_EXECUTION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_LIVRAISON" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delai", propOrder = {
    "dureemois",
    "dureejours",
    "datedebut",
    "datefin",
    "dateexecution",
    "datelivraison"
})
public class Delai {

    @XmlElement(name = "DUREE_MOIS")
    protected BigDecimal dureemois;
    @XmlElement(name = "DUREE_JOURS")
    protected BigDecimal dureejours;
    @XmlElement(name = "DATE_DEBUT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datedebut;
    @XmlElement(name = "DATE_FIN")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datefin;
    @XmlElement(name = "DATE_EXECUTION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateexecution;
    @XmlElement(name = "DATE_LIVRAISON")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datelivraison;

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
     * Obtient la valeur de la propriété datefin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEFIN() {
        return datefin;
    }

    /**
     * Définit la valeur de la propriété datefin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEFIN(XMLGregorianCalendar value) {
        this.datefin = value;
    }

    /**
     * Obtient la valeur de la propriété dateexecution.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEEXECUTION() {
        return dateexecution;
    }

    /**
     * Définit la valeur de la propriété dateexecution.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEEXECUTION(XMLGregorianCalendar value) {
        this.dateexecution = value;
    }

    /**
     * Obtient la valeur de la propriété datelivraison.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATELIVRAISON() {
        return datelivraison;
    }

    /**
     * Définit la valeur de la propriété datelivraison.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATELIVRAISON(XMLGregorianCalendar value) {
        this.datelivraison = value;
    }

}
