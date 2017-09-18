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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ConditionAdministrative complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionAdministrative"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REFERENCE_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETUDES_CONCOURS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="RECOMPENSES_LAUREAT_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="RECOMPENSES_LAUREAT_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="RECOMPENSES_LAUREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INDEMNISATION_PARTICIPANTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONDITIONS_REMISE_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONDITIONS_ET_MODE_PAIEMENT_OBTENIR_DOCUMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_LIMITE_OBTENTION_DOCUMENTS" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="DOCUMENT_PAYANT_OUI"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="VALEUR" type="{}Valeur"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="DOCUMENT_PAYANT_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="PERS_OUVERTURE_OFFRES_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="PERS_OUVERTURE_OFFRES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="DATE_DEBUT_ATTRIBUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DATE_OUVERTURE_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIEU_OUVERTURE_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ABANDON_SAD_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="ABANDON_SAD_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="FIN_ATTRIBUTION_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="FIN_ATTRIBUTION_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ENVOI_ELECTRONIQUE_AVEC_OUTIL_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="ENVOI_ELECTRONIQUE_AVEC_OUTIL_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
@XmlType(name = "ConditionAdministrative", propOrder = {
    "referencemarche",
    "etudesconcours",
    "recompenseslaureatoui",
    "recompenseslaureatnon",
    "recompenseslaureat",
    "indemnisationparticipants",
    "conditionsremiseoffres",
    "conditionsetmodepaiementobtenirdocuments",
    "datelimiteobtentiondocuments",
    "documentpayantoui",
    "documentpayantnon",
    "persouvertureoffresoui",
    "persouvertureoffresnon",
    "datedebutattribution",
    "dateouvertureoffres",
    "lieuouvertureoffres",
    "abandonsadoui",
    "abandonsadnon",
    "finattributionoui",
    "finattributionnon",
    "envoielectroniqueavecoutiloui",
    "envoielectroniqueavecoutilnon"
})
public class ConditionAdministrative {

    @XmlElement(name = "REFERENCE_MARCHE")
    protected String referencemarche;
    @XmlElement(name = "ETUDES_CONCOURS")
    protected String etudesconcours;
    @XmlElement(name = "RECOMPENSES_LAUREAT_OUI")
    protected Object recompenseslaureatoui;
    @XmlElement(name = "RECOMPENSES_LAUREAT_NON")
    protected Object recompenseslaureatnon;
    @XmlElement(name = "RECOMPENSES_LAUREAT")
    protected String recompenseslaureat;
    @XmlElement(name = "INDEMNISATION_PARTICIPANTS")
    protected String indemnisationparticipants;
    @XmlElement(name = "CONDITIONS_REMISE_OFFRES")
    protected String conditionsremiseoffres;
    @XmlElement(name = "CONDITIONS_ET_MODE_PAIEMENT_OBTENIR_DOCUMENTS")
    protected String conditionsetmodepaiementobtenirdocuments;
    @XmlElement(name = "DATE_LIMITE_OBTENTION_DOCUMENTS")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datelimiteobtentiondocuments;
    @XmlElement(name = "DOCUMENT_PAYANT_OUI")
    protected ConditionAdministrative.DOCUMENTPAYANTOUI documentpayantoui;
    @XmlElement(name = "DOCUMENT_PAYANT_NON")
    protected Object documentpayantnon;
    @XmlElement(name = "PERS_OUVERTURE_OFFRES_OUI")
    protected String persouvertureoffresoui;
    @XmlElement(name = "PERS_OUVERTURE_OFFRES_NON")
    protected Object persouvertureoffresnon;
    @XmlElement(name = "DATE_DEBUT_ATTRIBUTION")
    protected String datedebutattribution;
    @XmlElement(name = "DATE_OUVERTURE_OFFRES")
    protected String dateouvertureoffres;
    @XmlElement(name = "LIEU_OUVERTURE_OFFRES")
    protected String lieuouvertureoffres;
    @XmlElement(name = "ABANDON_SAD_OUI")
    protected Object abandonsadoui;
    @XmlElement(name = "ABANDON_SAD_NON")
    protected Object abandonsadnon;
    @XmlElement(name = "FIN_ATTRIBUTION_OUI")
    protected Object finattributionoui;
    @XmlElement(name = "FIN_ATTRIBUTION_NON")
    protected Object finattributionnon;
    @XmlElement(name = "ENVOI_ELECTRONIQUE_AVEC_OUTIL_OUI")
    protected Object envoielectroniqueavecoutiloui;
    @XmlElement(name = "ENVOI_ELECTRONIQUE_AVEC_OUTIL_NON")
    protected Object envoielectroniqueavecoutilnon;

    /**
     * Obtient la valeur de la propriété referencemarche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEMARCHE() {
        return referencemarche;
    }

    /**
     * Définit la valeur de la propriété referencemarche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEMARCHE(String value) {
        this.referencemarche = value;
    }

    /**
     * Obtient la valeur de la propriété etudesconcours.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETUDESCONCOURS() {
        return etudesconcours;
    }

    /**
     * Définit la valeur de la propriété etudesconcours.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETUDESCONCOURS(String value) {
        this.etudesconcours = value;
    }

    /**
     * Obtient la valeur de la propriété recompenseslaureatoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRECOMPENSESLAUREATOUI() {
        return recompenseslaureatoui;
    }

    /**
     * Définit la valeur de la propriété recompenseslaureatoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRECOMPENSESLAUREATOUI(Object value) {
        this.recompenseslaureatoui = value;
    }

    /**
     * Obtient la valeur de la propriété recompenseslaureatnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRECOMPENSESLAUREATNON() {
        return recompenseslaureatnon;
    }

    /**
     * Définit la valeur de la propriété recompenseslaureatnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRECOMPENSESLAUREATNON(Object value) {
        this.recompenseslaureatnon = value;
    }

    /**
     * Obtient la valeur de la propriété recompenseslaureat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRECOMPENSESLAUREAT() {
        return recompenseslaureat;
    }

    /**
     * Définit la valeur de la propriété recompenseslaureat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRECOMPENSESLAUREAT(String value) {
        this.recompenseslaureat = value;
    }

    /**
     * Obtient la valeur de la propriété indemnisationparticipants.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINDEMNISATIONPARTICIPANTS() {
        return indemnisationparticipants;
    }

    /**
     * Définit la valeur de la propriété indemnisationparticipants.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINDEMNISATIONPARTICIPANTS(String value) {
        this.indemnisationparticipants = value;
    }

    /**
     * Obtient la valeur de la propriété conditionsremiseoffres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDITIONSREMISEOFFRES() {
        return conditionsremiseoffres;
    }

    /**
     * Définit la valeur de la propriété conditionsremiseoffres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDITIONSREMISEOFFRES(String value) {
        this.conditionsremiseoffres = value;
    }

    /**
     * Obtient la valeur de la propriété conditionsetmodepaiementobtenirdocuments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDITIONSETMODEPAIEMENTOBTENIRDOCUMENTS() {
        return conditionsetmodepaiementobtenirdocuments;
    }

    /**
     * Définit la valeur de la propriété conditionsetmodepaiementobtenirdocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDITIONSETMODEPAIEMENTOBTENIRDOCUMENTS(String value) {
        this.conditionsetmodepaiementobtenirdocuments = value;
    }

    /**
     * Obtient la valeur de la propriété datelimiteobtentiondocuments.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATELIMITEOBTENTIONDOCUMENTS() {
        return datelimiteobtentiondocuments;
    }

    /**
     * Définit la valeur de la propriété datelimiteobtentiondocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATELIMITEOBTENTIONDOCUMENTS(XMLGregorianCalendar value) {
        this.datelimiteobtentiondocuments = value;
    }

    /**
     * Obtient la valeur de la propriété documentpayantoui.
     * 
     * @return
     *     possible object is
     *     {@link ConditionAdministrative.DOCUMENTPAYANTOUI }
     *     
     */
    public ConditionAdministrative.DOCUMENTPAYANTOUI getDOCUMENTPAYANTOUI() {
        return documentpayantoui;
    }

    /**
     * Définit la valeur de la propriété documentpayantoui.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionAdministrative.DOCUMENTPAYANTOUI }
     *     
     */
    public void setDOCUMENTPAYANTOUI(ConditionAdministrative.DOCUMENTPAYANTOUI value) {
        this.documentpayantoui = value;
    }

    /**
     * Obtient la valeur de la propriété documentpayantnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDOCUMENTPAYANTNON() {
        return documentpayantnon;
    }

    /**
     * Définit la valeur de la propriété documentpayantnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDOCUMENTPAYANTNON(Object value) {
        this.documentpayantnon = value;
    }

    /**
     * Obtient la valeur de la propriété persouvertureoffresoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSOUVERTUREOFFRESOUI() {
        return persouvertureoffresoui;
    }

    /**
     * Définit la valeur de la propriété persouvertureoffresoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSOUVERTUREOFFRESOUI(String value) {
        this.persouvertureoffresoui = value;
    }

    /**
     * Obtient la valeur de la propriété persouvertureoffresnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPERSOUVERTUREOFFRESNON() {
        return persouvertureoffresnon;
    }

    /**
     * Définit la valeur de la propriété persouvertureoffresnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPERSOUVERTUREOFFRESNON(Object value) {
        this.persouvertureoffresnon = value;
    }

    /**
     * Obtient la valeur de la propriété datedebutattribution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEDEBUTATTRIBUTION() {
        return datedebutattribution;
    }

    /**
     * Définit la valeur de la propriété datedebutattribution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEDEBUTATTRIBUTION(String value) {
        this.datedebutattribution = value;
    }

    /**
     * Obtient la valeur de la propriété dateouvertureoffres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATEOUVERTUREOFFRES() {
        return dateouvertureoffres;
    }

    /**
     * Définit la valeur de la propriété dateouvertureoffres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATEOUVERTUREOFFRES(String value) {
        this.dateouvertureoffres = value;
    }

    /**
     * Obtient la valeur de la propriété lieuouvertureoffres.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIEUOUVERTUREOFFRES() {
        return lieuouvertureoffres;
    }

    /**
     * Définit la valeur de la propriété lieuouvertureoffres.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIEUOUVERTUREOFFRES(String value) {
        this.lieuouvertureoffres = value;
    }

    /**
     * Obtient la valeur de la propriété abandonsadoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getABANDONSADOUI() {
        return abandonsadoui;
    }

    /**
     * Définit la valeur de la propriété abandonsadoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setABANDONSADOUI(Object value) {
        this.abandonsadoui = value;
    }

    /**
     * Obtient la valeur de la propriété abandonsadnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getABANDONSADNON() {
        return abandonsadnon;
    }

    /**
     * Définit la valeur de la propriété abandonsadnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setABANDONSADNON(Object value) {
        this.abandonsadnon = value;
    }

    /**
     * Obtient la valeur de la propriété finattributionoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFINATTRIBUTIONOUI() {
        return finattributionoui;
    }

    /**
     * Définit la valeur de la propriété finattributionoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFINATTRIBUTIONOUI(Object value) {
        this.finattributionoui = value;
    }

    /**
     * Obtient la valeur de la propriété finattributionnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFINATTRIBUTIONNON() {
        return finattributionnon;
    }

    /**
     * Définit la valeur de la propriété finattributionnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFINATTRIBUTIONNON(Object value) {
        this.finattributionnon = value;
    }

    /**
     * Obtient la valeur de la propriété envoielectroniqueavecoutiloui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENVOIELECTRONIQUEAVECOUTILOUI() {
        return envoielectroniqueavecoutiloui;
    }

    /**
     * Définit la valeur de la propriété envoielectroniqueavecoutiloui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENVOIELECTRONIQUEAVECOUTILOUI(Object value) {
        this.envoielectroniqueavecoutiloui = value;
    }

    /**
     * Obtient la valeur de la propriété envoielectroniqueavecoutilnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENVOIELECTRONIQUEAVECOUTILNON() {
        return envoielectroniqueavecoutilnon;
    }

    /**
     * Définit la valeur de la propriété envoielectroniqueavecoutilnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENVOIELECTRONIQUEAVECOUTILNON(Object value) {
        this.envoielectroniqueavecoutilnon = value;
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
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element name="VALEUR" type="{}Valeur"/&gt;
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
        "valeur"
    })
    public static class DOCUMENTPAYANTOUI {

        @XmlElement(name = "VALEUR")
        protected Valeur valeur;

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

    }

}
