//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ObjetArticle complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ObjetArticle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TITRE_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REF_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_MARCHE" type="{}MarcheType" minOccurs="0"/&gt;
 *         &lt;element name="OBJET_COMPLET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CPV" type="{}Cpv" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LIEU_EXEC_LIVR" type="{}Lieu" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="DELEGATION" type="{}Delegation" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="AMP_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="AMP_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AVIS_CORRESPOND" type="{}EnumAvisCorrespondant" minOccurs="0"/&gt;
 *         &lt;element name="AVIS_IMPLIQUE" type="{}EnumAvisImplique" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE" type="{}AccordCadre" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="VARIANTES_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="VARIANTES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CARACTERISTIQUES" type="{}Caracteristiques" minOccurs="0"/&gt;
 *         &lt;element name="DUREE_DELAI" type="{}Delai" minOccurs="0"/&gt;
 *         &lt;element name="DIV_EN_LOTS" type="{}DIV_EN_LOTSType" minOccurs="0"/&gt;
 *         &lt;element name="NB_LOT_OFFRE_MAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="NB_LOT_ATTRIB_MAX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="LOTS_RESERVE_POUVOIR_ADJUDICATEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_LANCEMENT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LOTS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="LOT" type="{}Lot" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "ObjetArticle", propOrder = {
    "titremarche",
    "refmarche",
    "typemarche",
    "objetcomplet",
    "cpv",
    "lieuexeclivr",
    "delegation",
    "ampoui",
    "ampnon",
    "aviscorrespond",
    "avisimplique",
    "accordcadre",
    "variantesoui",
    "variantesnon",
    "caracteristiques",
    "dureedelai",
    "divenlots",
    "nblotoffremax",
    "nblotattribmax",
    "lotsreservepouvoiradjudicateur",
    "datelancement",
    "lots",
    "infocompl"
})
public class ObjetArticle {

    @XmlElement(name = "TITRE_MARCHE")
    protected String titremarche;
    @XmlElement(name = "REF_MARCHE")
    protected String refmarche;
    @XmlElement(name = "TYPE_MARCHE")
    protected MarcheType typemarche;
    @XmlElement(name = "OBJET_COMPLET")
    protected String objetcomplet;
    @XmlElement(name = "CPV")
    protected List<Cpv> cpv;
    @XmlElement(name = "LIEU_EXEC_LIVR")
    protected List<Lieu> lieuexeclivr;
    @XmlElement(name = "DELEGATION")
    protected Delegation delegation;
    @XmlElement(name = "AMP_OUI")
    protected Object ampoui;
    @XmlElement(name = "AMP_NON")
    protected Object ampnon;
    @XmlElement(name = "AVIS_CORRESPOND")
    protected EnumAvisCorrespondant aviscorrespond;
    @XmlElement(name = "AVIS_IMPLIQUE")
    protected EnumAvisImplique avisimplique;
    @XmlElement(name = "ACCORD_CADRE")
    protected AccordCadre accordcadre;
    @XmlElement(name = "VARIANTES_OUI")
    protected Object variantesoui;
    @XmlElement(name = "VARIANTES_NON")
    protected Object variantesnon;
    @XmlElement(name = "CARACTERISTIQUES")
    protected Caracteristiques caracteristiques;
    @XmlElement(name = "DUREE_DELAI")
    protected Delai dureedelai;
    @XmlElement(name = "DIV_EN_LOTS")
    protected DIVENLOTSType divenlots;
    @XmlElement(name = "NB_LOT_OFFRE_MAX")
    protected BigInteger nblotoffremax;
    @XmlElement(name = "NB_LOT_ATTRIB_MAX")
    protected BigInteger nblotattribmax;
    @XmlElement(name = "LOTS_RESERVE_POUVOIR_ADJUDICATEUR")
    protected String lotsreservepouvoiradjudicateur;
    @XmlElement(name = "DATE_LANCEMENT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datelancement;
    @XmlElement(name = "LOTS")
    protected ObjetArticle.LOTS lots;
    @XmlElement(name = "INFO_COMPL")
    protected String infocompl;

    /**
     * Obtient la valeur de la propriété titremarche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITREMARCHE() {
        return titremarche;
    }

    /**
     * Définit la valeur de la propriété titremarche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITREMARCHE(String value) {
        this.titremarche = value;
    }

    /**
     * Obtient la valeur de la propriété refmarche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFMARCHE() {
        return refmarche;
    }

    /**
     * Définit la valeur de la propriété refmarche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFMARCHE(String value) {
        this.refmarche = value;
    }

    /**
     * Obtient la valeur de la propriété typemarche.
     * 
     * @return
     *     possible object is
     *     {@link MarcheType }
     *     
     */
    public MarcheType getTYPEMARCHE() {
        return typemarche;
    }

    /**
     * Définit la valeur de la propriété typemarche.
     * 
     * @param value
     *     allowed object is
     *     {@link MarcheType }
     *     
     */
    public void setTYPEMARCHE(MarcheType value) {
        this.typemarche = value;
    }

    /**
     * Obtient la valeur de la propriété objetcomplet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOBJETCOMPLET() {
        return objetcomplet;
    }

    /**
     * Définit la valeur de la propriété objetcomplet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOBJETCOMPLET(String value) {
        this.objetcomplet = value;
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
     * Gets the value of the lieuexeclivr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lieuexeclivr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLIEUEXECLIVR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lieu }
     * 
     * 
     */
    public List<Lieu> getLIEUEXECLIVR() {
        if (lieuexeclivr == null) {
            lieuexeclivr = new ArrayList<Lieu>();
        }
        return this.lieuexeclivr;
    }

    /**
     * Obtient la valeur de la propriété delegation.
     * 
     * @return
     *     possible object is
     *     {@link Delegation }
     *     
     */
    public Delegation getDELEGATION() {
        return delegation;
    }

    /**
     * Définit la valeur de la propriété delegation.
     * 
     * @param value
     *     allowed object is
     *     {@link Delegation }
     *     
     */
    public void setDELEGATION(Delegation value) {
        this.delegation = value;
    }

    /**
     * Obtient la valeur de la propriété ampoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAMPOUI() {
        return ampoui;
    }

    /**
     * Définit la valeur de la propriété ampoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAMPOUI(Object value) {
        this.ampoui = value;
    }

    /**
     * Obtient la valeur de la propriété ampnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAMPNON() {
        return ampnon;
    }

    /**
     * Définit la valeur de la propriété ampnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAMPNON(Object value) {
        this.ampnon = value;
    }

    /**
     * Obtient la valeur de la propriété aviscorrespond.
     * 
     * @return
     *     possible object is
     *     {@link EnumAvisCorrespondant }
     *     
     */
    public EnumAvisCorrespondant getAVISCORRESPOND() {
        return aviscorrespond;
    }

    /**
     * Définit la valeur de la propriété aviscorrespond.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAvisCorrespondant }
     *     
     */
    public void setAVISCORRESPOND(EnumAvisCorrespondant value) {
        this.aviscorrespond = value;
    }

    /**
     * Obtient la valeur de la propriété avisimplique.
     * 
     * @return
     *     possible object is
     *     {@link EnumAvisImplique }
     *     
     */
    public EnumAvisImplique getAVISIMPLIQUE() {
        return avisimplique;
    }

    /**
     * Définit la valeur de la propriété avisimplique.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAvisImplique }
     *     
     */
    public void setAVISIMPLIQUE(EnumAvisImplique value) {
        this.avisimplique = value;
    }

    /**
     * Obtient la valeur de la propriété accordcadre.
     * 
     * @return
     *     possible object is
     *     {@link AccordCadre }
     *     
     */
    public AccordCadre getACCORDCADRE() {
        return accordcadre;
    }

    /**
     * Définit la valeur de la propriété accordcadre.
     * 
     * @param value
     *     allowed object is
     *     {@link AccordCadre }
     *     
     */
    public void setACCORDCADRE(AccordCadre value) {
        this.accordcadre = value;
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
     * Obtient la valeur de la propriété caracteristiques.
     * 
     * @return
     *     possible object is
     *     {@link Caracteristiques }
     *     
     */
    public Caracteristiques getCARACTERISTIQUES() {
        return caracteristiques;
    }

    /**
     * Définit la valeur de la propriété caracteristiques.
     * 
     * @param value
     *     allowed object is
     *     {@link Caracteristiques }
     *     
     */
    public void setCARACTERISTIQUES(Caracteristiques value) {
        this.caracteristiques = value;
    }

    /**
     * Obtient la valeur de la propriété dureedelai.
     * 
     * @return
     *     possible object is
     *     {@link Delai }
     *     
     */
    public Delai getDUREEDELAI() {
        return dureedelai;
    }

    /**
     * Définit la valeur de la propriété dureedelai.
     * 
     * @param value
     *     allowed object is
     *     {@link Delai }
     *     
     */
    public void setDUREEDELAI(Delai value) {
        this.dureedelai = value;
    }

    /**
     * Obtient la valeur de la propriété divenlots.
     * 
     * @return
     *     possible object is
     *     {@link DIVENLOTSType }
     *     
     */
    public DIVENLOTSType getDIVENLOTS() {
        return divenlots;
    }

    /**
     * Définit la valeur de la propriété divenlots.
     * 
     * @param value
     *     allowed object is
     *     {@link DIVENLOTSType }
     *     
     */
    public void setDIVENLOTS(DIVENLOTSType value) {
        this.divenlots = value;
    }

    /**
     * Obtient la valeur de la propriété nblotoffremax.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBLOTOFFREMAX() {
        return nblotoffremax;
    }

    /**
     * Définit la valeur de la propriété nblotoffremax.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBLOTOFFREMAX(BigInteger value) {
        this.nblotoffremax = value;
    }

    /**
     * Obtient la valeur de la propriété nblotattribmax.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNBLOTATTRIBMAX() {
        return nblotattribmax;
    }

    /**
     * Définit la valeur de la propriété nblotattribmax.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNBLOTATTRIBMAX(BigInteger value) {
        this.nblotattribmax = value;
    }

    /**
     * Obtient la valeur de la propriété lotsreservepouvoiradjudicateur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOTSRESERVEPOUVOIRADJUDICATEUR() {
        return lotsreservepouvoiradjudicateur;
    }

    /**
     * Définit la valeur de la propriété lotsreservepouvoiradjudicateur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOTSRESERVEPOUVOIRADJUDICATEUR(String value) {
        this.lotsreservepouvoiradjudicateur = value;
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
     * Obtient la valeur de la propriété lots.
     * 
     * @return
     *     possible object is
     *     {@link ObjetArticle.LOTS }
     *     
     */
    public ObjetArticle.LOTS getLOTS() {
        return lots;
    }

    /**
     * Définit la valeur de la propriété lots.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjetArticle.LOTS }
     *     
     */
    public void setLOTS(ObjetArticle.LOTS value) {
        this.lots = value;
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


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="LOT" type="{}Lot" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lot"
    })
    public static class LOTS {

        @XmlElement(name = "LOT", required = true)
        protected List<Lot> lot;

        /**
         * Gets the value of the lot property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lot property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLOT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Lot }
         * 
         * 
         */
        public List<Lot> getLOT() {
            if (lot == null) {
                lot = new ArrayList<Lot>();
            }
            return this.lot;
        }

    }

}
