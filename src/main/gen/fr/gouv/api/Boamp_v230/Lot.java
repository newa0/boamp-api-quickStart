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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Lot complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Lot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INTITULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPV" type="{}Cpv" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CODE_NUTS" type="{}typeNUTS" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIEU_PRINCIPAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRITERES_ATTRIBUTION" type="{}Criteres" minOccurs="0"/&gt;
 *         &lt;element name="QUANTITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR_MIN" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR_MAX" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_JOURS" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="DATE_DEBUT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_FIN" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_SYSTEME_QUALIFICATION" type="{}Duree" minOccurs="0"/&gt;
 *         &lt;element name="SUP_QUATRE_ANS_JUSTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUP_HUIT_ANS_JUSTIFICATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_EXECUTION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_LIVRAISON" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DATE_LANCEMENT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="RENOUVELLEMENT_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="RENOUVELLEMENT_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="RENOUVELLEMENT_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NB_CANDIDATS" type="{}NbrCandidat" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="VARIANTES_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="VARIANTES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="OPTIONS_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="OPTIONS_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="OPTIONS_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="CATALOGUE_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="CATALOGUE_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="FONDS_COMMUNAUTAIRES_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="FONDS_COMMUNAUTAIRES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="FONDS_COMMUNAUTAIRES_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INFO_COMPL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Lot", propOrder = {
    "num",
    "intitule",
    "description",
    "cpv",
    "codenuts",
    "lieuprincipal",
    "criteresattribution",
    "quantite",
    "valeur",
    "valeurmin",
    "valeurmax",
    "dureemois",
    "dureejours",
    "datedebut",
    "datefin",
    "dureesystemequalification",
    "supquatreansjustification",
    "suphuitansjustification",
    "dateexecution",
    "datelivraison",
    "datelancement",
    "renouvellementoui",
    "renouvellementnon",
    "renouvellementdescription",
    "nbcandidats",
    "variantesoui",
    "variantesnon",
    "optionsoui",
    "optionsnon",
    "optionsdescription",
    "catalogueelectroniqueoui",
    "catalogueelectroniquenon",
    "fondscommunautairesoui",
    "fondscommunautairesnon",
    "fondscommunautairesdescription",
    "infocompl"
})
public class Lot {

    @XmlElement(name = "NUM")
    protected String num;
    @XmlElement(name = "INTITULE")
    protected String intitule;
    @XmlElement(name = "DESCRIPTION")
    protected String description;
    @XmlElement(name = "CPV")
    protected List<Cpv> cpv;
    @XmlElement(name = "CODE_NUTS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> codenuts;
    @XmlElement(name = "LIEU_PRINCIPAL")
    protected String lieuprincipal;
    @XmlElement(name = "CRITERES_ATTRIBUTION")
    protected Criteres criteresattribution;
    @XmlElement(name = "QUANTITE")
    protected String quantite;
    @XmlElement(name = "VALEUR")
    protected Valeur valeur;
    @XmlElement(name = "VALEUR_MIN")
    protected Valeur valeurmin;
    @XmlElement(name = "VALEUR_MAX")
    protected Valeur valeurmax;
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
    @XmlElement(name = "DUREE_SYSTEME_QUALIFICATION")
    protected Duree dureesystemequalification;
    @XmlElement(name = "SUP_QUATRE_ANS_JUSTIFICATION")
    protected String supquatreansjustification;
    @XmlElement(name = "SUP_HUIT_ANS_JUSTIFICATION")
    protected String suphuitansjustification;
    @XmlElement(name = "DATE_EXECUTION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateexecution;
    @XmlElement(name = "DATE_LIVRAISON")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datelivraison;
    @XmlElement(name = "DATE_LANCEMENT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datelancement;
    @XmlElement(name = "RENOUVELLEMENT_OUI")
    protected Object renouvellementoui;
    @XmlElement(name = "RENOUVELLEMENT_NON")
    protected Object renouvellementnon;
    @XmlElement(name = "RENOUVELLEMENT_DESCRIPTION")
    protected String renouvellementdescription;
    @XmlElement(name = "NB_CANDIDATS")
    protected NbrCandidat nbcandidats;
    @XmlElement(name = "VARIANTES_OUI")
    protected Object variantesoui;
    @XmlElement(name = "VARIANTES_NON")
    protected Object variantesnon;
    @XmlElement(name = "OPTIONS_OUI")
    protected Object optionsoui;
    @XmlElement(name = "OPTIONS_NON")
    protected Object optionsnon;
    @XmlElement(name = "OPTIONS_DESCRIPTION")
    protected String optionsdescription;
    @XmlElement(name = "CATALOGUE_ELECTRONIQUE_OUI")
    protected Object catalogueelectroniqueoui;
    @XmlElement(name = "CATALOGUE_ELECTRONIQUE_NON")
    protected Object catalogueelectroniquenon;
    @XmlElement(name = "FONDS_COMMUNAUTAIRES_OUI")
    protected String fondscommunautairesoui;
    @XmlElement(name = "FONDS_COMMUNAUTAIRES_NON")
    protected Object fondscommunautairesnon;
    @XmlElement(name = "FONDS_COMMUNAUTAIRES_DESCRIPTION")
    protected String fondscommunautairesdescription;
    @XmlElement(name = "INFO_COMPL")
    protected String infocompl;

    /**
     * Obtient la valeur de la propriété num.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUM() {
        return num;
    }

    /**
     * Définit la valeur de la propriété num.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUM(String value) {
        this.num = value;
    }

    /**
     * Obtient la valeur de la propriété intitule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINTITULE() {
        return intitule;
    }

    /**
     * Définit la valeur de la propriété intitule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINTITULE(String value) {
        this.intitule = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getCODENUTS() {
        if (codenuts == null) {
            codenuts = new ArrayList<String>();
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
     * Obtient la valeur de la propriété criteresattribution.
     * 
     * @return
     *     possible object is
     *     {@link Criteres }
     *     
     */
    public Criteres getCRITERESATTRIBUTION() {
        return criteresattribution;
    }

    /**
     * Définit la valeur de la propriété criteresattribution.
     * 
     * @param value
     *     allowed object is
     *     {@link Criteres }
     *     
     */
    public void setCRITERESATTRIBUTION(Criteres value) {
        this.criteresattribution = value;
    }

    /**
     * Obtient la valeur de la propriété quantite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUANTITE() {
        return quantite;
    }

    /**
     * Définit la valeur de la propriété quantite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUANTITE(String value) {
        this.quantite = value;
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
     * Obtient la valeur de la propriété valeurmin.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEURMIN() {
        return valeurmin;
    }

    /**
     * Définit la valeur de la propriété valeurmin.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEURMIN(Valeur value) {
        this.valeurmin = value;
    }

    /**
     * Obtient la valeur de la propriété valeurmax.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEURMAX() {
        return valeurmax;
    }

    /**
     * Définit la valeur de la propriété valeurmax.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEURMAX(Valeur value) {
        this.valeurmax = value;
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
     * Obtient la valeur de la propriété dureesystemequalification.
     * 
     * @return
     *     possible object is
     *     {@link Duree }
     *     
     */
    public Duree getDUREESYSTEMEQUALIFICATION() {
        return dureesystemequalification;
    }

    /**
     * Définit la valeur de la propriété dureesystemequalification.
     * 
     * @param value
     *     allowed object is
     *     {@link Duree }
     *     
     */
    public void setDUREESYSTEMEQUALIFICATION(Duree value) {
        this.dureesystemequalification = value;
    }

    /**
     * Obtient la valeur de la propriété supquatreansjustification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPQUATREANSJUSTIFICATION() {
        return supquatreansjustification;
    }

    /**
     * Définit la valeur de la propriété supquatreansjustification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPQUATREANSJUSTIFICATION(String value) {
        this.supquatreansjustification = value;
    }

    /**
     * Obtient la valeur de la propriété suphuitansjustification.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPHUITANSJUSTIFICATION() {
        return suphuitansjustification;
    }

    /**
     * Définit la valeur de la propriété suphuitansjustification.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPHUITANSJUSTIFICATION(String value) {
        this.suphuitansjustification = value;
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

    /**
     * Obtient la valeur de la propriété datelancement.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATELANCEMENT() {
        return datelancement;
    }

    /**
     * Définit la valeur de la propriété datelancement.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATELANCEMENT(XMLGregorianCalendar value) {
        this.datelancement = value;
    }

    /**
     * Obtient la valeur de la propriété renouvellementoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRENOUVELLEMENTOUI() {
        return renouvellementoui;
    }

    /**
     * Définit la valeur de la propriété renouvellementoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRENOUVELLEMENTOUI(Object value) {
        this.renouvellementoui = value;
    }

    /**
     * Obtient la valeur de la propriété renouvellementnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRENOUVELLEMENTNON() {
        return renouvellementnon;
    }

    /**
     * Définit la valeur de la propriété renouvellementnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRENOUVELLEMENTNON(Object value) {
        this.renouvellementnon = value;
    }

    /**
     * Obtient la valeur de la propriété renouvellementdescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRENOUVELLEMENTDESCRIPTION() {
        return renouvellementdescription;
    }

    /**
     * Définit la valeur de la propriété renouvellementdescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRENOUVELLEMENTDESCRIPTION(String value) {
        this.renouvellementdescription = value;
    }

    /**
     * Obtient la valeur de la propriété nbcandidats.
     * 
     * @return
     *     possible object is
     *     {@link NbrCandidat }
     *     
     */
    public NbrCandidat getNBCANDIDATS() {
        return nbcandidats;
    }

    /**
     * Définit la valeur de la propriété nbcandidats.
     * 
     * @param value
     *     allowed object is
     *     {@link NbrCandidat }
     *     
     */
    public void setNBCANDIDATS(NbrCandidat value) {
        this.nbcandidats = value;
    }

    /**
     * Obtient la valeur de la propriété variantesoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVARIANTESOUI() {
        return variantesoui;
    }

    /**
     * Définit la valeur de la propriété variantesoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVARIANTESOUI(Object value) {
        this.variantesoui = value;
    }

    /**
     * Obtient la valeur de la propriété variantesnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVARIANTESNON() {
        return variantesnon;
    }

    /**
     * Définit la valeur de la propriété variantesnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVARIANTESNON(Object value) {
        this.variantesnon = value;
    }

    /**
     * Obtient la valeur de la propriété optionsoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOPTIONSOUI() {
        return optionsoui;
    }

    /**
     * Définit la valeur de la propriété optionsoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOPTIONSOUI(Object value) {
        this.optionsoui = value;
    }

    /**
     * Obtient la valeur de la propriété optionsnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOPTIONSNON() {
        return optionsnon;
    }

    /**
     * Définit la valeur de la propriété optionsnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOPTIONSNON(Object value) {
        this.optionsnon = value;
    }

    /**
     * Obtient la valeur de la propriété optionsdescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPTIONSDESCRIPTION() {
        return optionsdescription;
    }

    /**
     * Définit la valeur de la propriété optionsdescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPTIONSDESCRIPTION(String value) {
        this.optionsdescription = value;
    }

    /**
     * Obtient la valeur de la propriété catalogueelectroniqueoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCATALOGUEELECTRONIQUEOUI() {
        return catalogueelectroniqueoui;
    }

    /**
     * Définit la valeur de la propriété catalogueelectroniqueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCATALOGUEELECTRONIQUEOUI(Object value) {
        this.catalogueelectroniqueoui = value;
    }

    /**
     * Obtient la valeur de la propriété catalogueelectroniquenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCATALOGUEELECTRONIQUENON() {
        return catalogueelectroniquenon;
    }

    /**
     * Définit la valeur de la propriété catalogueelectroniquenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCATALOGUEELECTRONIQUENON(Object value) {
        this.catalogueelectroniquenon = value;
    }

    /**
     * Obtient la valeur de la propriété fondscommunautairesoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFONDSCOMMUNAUTAIRESOUI() {
        return fondscommunautairesoui;
    }

    /**
     * Définit la valeur de la propriété fondscommunautairesoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFONDSCOMMUNAUTAIRESOUI(String value) {
        this.fondscommunautairesoui = value;
    }

    /**
     * Obtient la valeur de la propriété fondscommunautairesnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFONDSCOMMUNAUTAIRESNON() {
        return fondscommunautairesnon;
    }

    /**
     * Définit la valeur de la propriété fondscommunautairesnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFONDSCOMMUNAUTAIRESNON(Object value) {
        this.fondscommunautairesnon = value;
    }

    /**
     * Obtient la valeur de la propriété fondscommunautairesdescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFONDSCOMMUNAUTAIRESDESCRIPTION() {
        return fondscommunautairesdescription;
    }

    /**
     * Définit la valeur de la propriété fondscommunautairesdescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFONDSCOMMUNAUTAIRESDESCRIPTION(String value) {
        this.fondscommunautairesdescription = value;
    }

    /**
     * Obtient la valeur de la propriété infocompl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINFOCOMPL() {
        return infocompl;
    }

    /**
     * Définit la valeur de la propriété infocompl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINFOCOMPL(String value) {
        this.infocompl = value;
    }

}
