//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Modification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Modification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CPV" type="{}Cpv" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CODE_NUTS" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LIEU_PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_JOURS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DATE_FIN" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_DEBUT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR" type="{}Valeur"/&gt;
 *         &lt;element name="GROUPEMENT_ECONOMIQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TITULAIRE" type="{}Titulaire" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DESC_MODIF" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BESOIN_TVX" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="MODIF_RNEC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="VALEUR_AVT" type="{}Valeur"/&gt;
 *         &lt;element name="VALEUR_APR" type="{}Valeur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Modification", propOrder = {
    "cpv",
    "codenuts",
    "lieuprincipal",
    "description",
    "dureemois",
    "dureejours",
    "datefin",
    "datedebut",
    "valeur",
    "groupementeconomique",
    "titulaire",
    "descmodif",
    "besointvx",
    "modifrnec",
    "valeuravt",
    "valeurapr"
})
public class Modification {

    @XmlElement(name = "CPV", required = true)
    protected List<Cpv> cpv;
    @XmlElement(name = "CODE_NUTS", required = true)
    protected List<Object> codenuts;
    @XmlElement(name = "LIEU_PRINCIPAL")
    protected String lieuprincipal;
    @XmlElement(name = "DESCRIPTION", required = true)
    protected String description;
    @XmlElement(name = "DUREE_MOIS")
    protected BigDecimal dureemois;
    @XmlElement(name = "DUREE_JOURS")
    protected BigDecimal dureejours;
    @XmlElement(name = "DATE_FIN")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datefin;
    @XmlElement(name = "DATE_DEBUT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datedebut;
    @XmlElement(name = "VALEUR", required = true)
    protected Valeur valeur;
    @XmlElement(name = "GROUPEMENT_ECONOMIQUE")
    protected String groupementeconomique;
    @XmlElement(name = "TITULAIRE", required = true)
    protected List<Titulaire> titulaire;
    @XmlElement(name = "DESC_MODIF", required = true)
    protected String descmodif;
    @XmlElement(name = "BESOIN_TVX")
    protected String besointvx;
    @XmlElement(name = "MODIF_RNEC")
    protected String modifrnec;
    @XmlElement(name = "VALEUR_AVT", required = true)
    protected Valeur valeuravt;
    @XmlElement(name = "VALEUR_APR", required = true)
    protected Valeur valeurapr;

    /**
     * Gets the value of the cpv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cpv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cpv }
     * 
     * 
     */
    public List<Cpv> getCPV() {
        if (cpv == null) {
            cpv = new ArrayList<Cpv>();
        }
        return this.cpv;
    }

    /**
     * Gets the value of the codenuts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codenuts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCODENUTS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getCODENUTS() {
        if (codenuts == null) {
            codenuts = new ArrayList<Object>();
        }
        return this.codenuts;
    }

    /**
     * Obtient la valeur de la propriété lieuprincipal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIEUPRINCIPAL() {
        return lieuprincipal;
    }

    /**
     * Définit la valeur de la propriété lieuprincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIEUPRINCIPAL(String value) {
        this.lieuprincipal = value;
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
     * Obtient la valeur de la propriété valeur.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEUR() {
        return valeur;
    }

    /**
     * Définit la valeur de la propriété valeur.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEUR(Valeur value) {
        this.valeur = value;
    }

    /**
     * Obtient la valeur de la propriété groupementeconomique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPEMENTECONOMIQUE() {
        return groupementeconomique;
    }

    /**
     * Définit la valeur de la propriété groupementeconomique.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPEMENTECONOMIQUE(String value) {
        this.groupementeconomique = value;
    }

    /**
     * Gets the value of the titulaire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titulaire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTITULAIRE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Titulaire }
     * 
     * 
     */
    public List<Titulaire> getTITULAIRE() {
        if (titulaire == null) {
            titulaire = new ArrayList<Titulaire>();
        }
        return this.titulaire;
    }

    /**
     * Obtient la valeur de la propriété descmodif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCMODIF() {
        return descmodif;
    }

    /**
     * Définit la valeur de la propriété descmodif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCMODIF(String value) {
        this.descmodif = value;
    }

    /**
     * Obtient la valeur de la propriété besointvx.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBESOINTVX() {
        return besointvx;
    }

    /**
     * Définit la valeur de la propriété besointvx.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBESOINTVX(String value) {
        this.besointvx = value;
    }

    /**
     * Obtient la valeur de la propriété modifrnec.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMODIFRNEC() {
        return modifrnec;
    }

    /**
     * Définit la valeur de la propriété modifrnec.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMODIFRNEC(String value) {
        this.modifrnec = value;
    }

    /**
     * Obtient la valeur de la propriété valeuravt.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEURAVT() {
        return valeuravt;
    }

    /**
     * Définit la valeur de la propriété valeuravt.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEURAVT(Valeur value) {
        this.valeuravt = value;
    }

    /**
     * Obtient la valeur de la propriété valeurapr.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEURAPR() {
        return valeurapr;
    }

    /**
     * Définit la valeur de la propriété valeurapr.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEURAPR(Valeur value) {
        this.valeurapr = value;
    }

}
