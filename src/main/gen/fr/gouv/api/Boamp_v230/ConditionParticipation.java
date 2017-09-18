//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ConditionParticipation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ConditionParticipation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRITERE_SELECTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SITUATION_JURIDIQUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SITUATION_JURIDIQUE_SST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="CAP_ECO_MARCHE_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="CAP_ECO_MARCHE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CAP_ECO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAP_ECO_SST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAP_ECO_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAP_ECO_NIVEAU_MINI_SST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="CAP_TECH_OFFRE_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="CAP_TECH_OFFRE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CAP_TECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAP_TECH_SST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAP_TECH_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CAP_TECH_NIVEAU_MINI_SST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRITERES_PARTICIPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="MARCHE_RESERVE_OUI"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="ATELIERS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                     &lt;element name="EMPLOIS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="MARCHE_RESERVE_NON" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="PRESTATION_RESERVEE_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="PRESTATION_RESERVEE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="CONDITION_PARTICULIERE_EXECUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="INDICATION_OBLIGATOIRE_NOM_QUALIFICATIONS_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="INDICATION_OBLIGATOIRE_NOM_QUALIFICATIONS_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="JUSTIFICATIFS_CANDIDAT" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="P" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ELIGIBLE_MPS" type="{}typeOuiNon" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionParticipation", propOrder = {
    "critereselection",
    "situationjuridique",
    "situationjuridiquesst",
    "capecomarcheoui",
    "capecomarchenon",
    "capeco",
    "capecosst",
    "capeconiveaumini",
    "capeconiveauminisst",
    "captechoffreoui",
    "captechoffrenon",
    "captech",
    "captechsst",
    "captechniveaumini",
    "captechniveauminisst",
    "criteresparticipation",
    "marchereserveoui",
    "marchereservenon",
    "prestationreserveeoui",
    "prestationreserveenon",
    "conditionparticuliereexecution",
    "indicationobligatoirenomqualificationsoui",
    "indicationobligatoirenomqualificationsnon",
    "justificatifscandidat",
    "eligiblemps"
})
public class ConditionParticipation {

    @XmlElement(name = "CRITERE_SELECTION")
    protected String critereselection;
    @XmlElement(name = "SITUATION_JURIDIQUE")
    protected String situationjuridique;
    @XmlElement(name = "SITUATION_JURIDIQUE_SST")
    protected String situationjuridiquesst;
    @XmlElement(name = "CAP_ECO_MARCHE_OUI")
    protected String capecomarcheoui;
    @XmlElement(name = "CAP_ECO_MARCHE_NON")
    protected Object capecomarchenon;
    @XmlElement(name = "CAP_ECO")
    protected String capeco;
    @XmlElement(name = "CAP_ECO_SST")
    protected String capecosst;
    @XmlElement(name = "CAP_ECO_NIVEAU_MINI")
    protected String capeconiveaumini;
    @XmlElement(name = "CAP_ECO_NIVEAU_MINI_SST")
    protected String capeconiveauminisst;
    @XmlElement(name = "CAP_TECH_OFFRE_OUI")
    protected String captechoffreoui;
    @XmlElement(name = "CAP_TECH_OFFRE_NON")
    protected Object captechoffrenon;
    @XmlElement(name = "CAP_TECH")
    protected String captech;
    @XmlElement(name = "CAP_TECH_SST")
    protected String captechsst;
    @XmlElement(name = "CAP_TECH_NIVEAU_MINI")
    protected String captechniveaumini;
    @XmlElement(name = "CAP_TECH_NIVEAU_MINI_SST")
    protected String captechniveauminisst;
    @XmlElement(name = "CRITERES_PARTICIPATION")
    protected String criteresparticipation;
    @XmlElement(name = "MARCHE_RESERVE_OUI")
    protected ConditionParticipation.MARCHERESERVEOUI marchereserveoui;
    @XmlElement(name = "MARCHE_RESERVE_NON")
    protected String marchereservenon;
    @XmlElement(name = "PRESTATION_RESERVEE_OUI")
    protected String prestationreserveeoui;
    @XmlElement(name = "PRESTATION_RESERVEE_NON")
    protected Object prestationreserveenon;
    @XmlElement(name = "CONDITION_PARTICULIERE_EXECUTION")
    protected String conditionparticuliereexecution;
    @XmlElement(name = "INDICATION_OBLIGATOIRE_NOM_QUALIFICATIONS_OUI")
    protected Object indicationobligatoirenomqualificationsoui;
    @XmlElement(name = "INDICATION_OBLIGATOIRE_NOM_QUALIFICATIONS_NON")
    protected Object indicationobligatoirenomqualificationsnon;
    @XmlElement(name = "JUSTIFICATIFS_CANDIDAT")
    protected ConditionParticipation.JUSTIFICATIFSCANDIDAT justificatifscandidat;
    @XmlElement(name = "ELIGIBLE_MPS")
    protected TypeOuiNon eligiblemps;

    /**
     * Obtient la valeur de la propriété critereselection.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRITERESELECTION() {
        return critereselection;
    }

    /**
     * Définit la valeur de la propriété critereselection.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRITERESELECTION(String value) {
        this.critereselection = value;
    }

    /**
     * Obtient la valeur de la propriété situationjuridique.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITUATIONJURIDIQUE() {
        return situationjuridique;
    }

    /**
     * Définit la valeur de la propriété situationjuridique.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITUATIONJURIDIQUE(String value) {
        this.situationjuridique = value;
    }

    /**
     * Obtient la valeur de la propriété situationjuridiquesst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITUATIONJURIDIQUESST() {
        return situationjuridiquesst;
    }

    /**
     * Définit la valeur de la propriété situationjuridiquesst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITUATIONJURIDIQUESST(String value) {
        this.situationjuridiquesst = value;
    }

    /**
     * Obtient la valeur de la propriété capecomarcheoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPECOMARCHEOUI() {
        return capecomarcheoui;
    }

    /**
     * Définit la valeur de la propriété capecomarcheoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPECOMARCHEOUI(String value) {
        this.capecomarcheoui = value;
    }

    /**
     * Obtient la valeur de la propriété capecomarchenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCAPECOMARCHENON() {
        return capecomarchenon;
    }

    /**
     * Définit la valeur de la propriété capecomarchenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCAPECOMARCHENON(Object value) {
        this.capecomarchenon = value;
    }

    /**
     * Obtient la valeur de la propriété capeco.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPECO() {
        return capeco;
    }

    /**
     * Définit la valeur de la propriété capeco.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPECO(String value) {
        this.capeco = value;
    }

    /**
     * Obtient la valeur de la propriété capecosst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPECOSST() {
        return capecosst;
    }

    /**
     * Définit la valeur de la propriété capecosst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPECOSST(String value) {
        this.capecosst = value;
    }

    /**
     * Obtient la valeur de la propriété capeconiveaumini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPECONIVEAUMINI() {
        return capeconiveaumini;
    }

    /**
     * Définit la valeur de la propriété capeconiveaumini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPECONIVEAUMINI(String value) {
        this.capeconiveaumini = value;
    }

    /**
     * Obtient la valeur de la propriété capeconiveauminisst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPECONIVEAUMINISST() {
        return capeconiveauminisst;
    }

    /**
     * Définit la valeur de la propriété capeconiveauminisst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPECONIVEAUMINISST(String value) {
        this.capeconiveauminisst = value;
    }

    /**
     * Obtient la valeur de la propriété captechoffreoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPTECHOFFREOUI() {
        return captechoffreoui;
    }

    /**
     * Définit la valeur de la propriété captechoffreoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPTECHOFFREOUI(String value) {
        this.captechoffreoui = value;
    }

    /**
     * Obtient la valeur de la propriété captechoffrenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCAPTECHOFFRENON() {
        return captechoffrenon;
    }

    /**
     * Définit la valeur de la propriété captechoffrenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCAPTECHOFFRENON(Object value) {
        this.captechoffrenon = value;
    }

    /**
     * Obtient la valeur de la propriété captech.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPTECH() {
        return captech;
    }

    /**
     * Définit la valeur de la propriété captech.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPTECH(String value) {
        this.captech = value;
    }

    /**
     * Obtient la valeur de la propriété captechsst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPTECHSST() {
        return captechsst;
    }

    /**
     * Définit la valeur de la propriété captechsst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPTECHSST(String value) {
        this.captechsst = value;
    }

    /**
     * Obtient la valeur de la propriété captechniveaumini.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPTECHNIVEAUMINI() {
        return captechniveaumini;
    }

    /**
     * Définit la valeur de la propriété captechniveaumini.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPTECHNIVEAUMINI(String value) {
        this.captechniveaumini = value;
    }

    /**
     * Obtient la valeur de la propriété captechniveauminisst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAPTECHNIVEAUMINISST() {
        return captechniveauminisst;
    }

    /**
     * Définit la valeur de la propriété captechniveauminisst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAPTECHNIVEAUMINISST(String value) {
        this.captechniveauminisst = value;
    }

    /**
     * Obtient la valeur de la propriété criteresparticipation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRITERESPARTICIPATION() {
        return criteresparticipation;
    }

    /**
     * Définit la valeur de la propriété criteresparticipation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRITERESPARTICIPATION(String value) {
        this.criteresparticipation = value;
    }

    /**
     * Obtient la valeur de la propriété marchereserveoui.
     * 
     * @return
     *     possible object is
     *     {@link ConditionParticipation.MARCHERESERVEOUI }
     *     
     */
    public ConditionParticipation.MARCHERESERVEOUI getMARCHERESERVEOUI() {
        return marchereserveoui;
    }

    /**
     * Définit la valeur de la propriété marchereserveoui.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionParticipation.MARCHERESERVEOUI }
     *     
     */
    public void setMARCHERESERVEOUI(ConditionParticipation.MARCHERESERVEOUI value) {
        this.marchereserveoui = value;
    }

    /**
     * Obtient la valeur de la propriété marchereservenon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMARCHERESERVENON() {
        return marchereservenon;
    }

    /**
     * Définit la valeur de la propriété marchereservenon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMARCHERESERVENON(String value) {
        this.marchereservenon = value;
    }

    /**
     * Obtient la valeur de la propriété prestationreserveeoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESTATIONRESERVEEOUI() {
        return prestationreserveeoui;
    }

    /**
     * Définit la valeur de la propriété prestationreserveeoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESTATIONRESERVEEOUI(String value) {
        this.prestationreserveeoui = value;
    }

    /**
     * Obtient la valeur de la propriété prestationreserveenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPRESTATIONRESERVEENON() {
        return prestationreserveenon;
    }

    /**
     * Définit la valeur de la propriété prestationreserveenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPRESTATIONRESERVEENON(Object value) {
        this.prestationreserveenon = value;
    }

    /**
     * Obtient la valeur de la propriété conditionparticuliereexecution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONDITIONPARTICULIEREEXECUTION() {
        return conditionparticuliereexecution;
    }

    /**
     * Définit la valeur de la propriété conditionparticuliereexecution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONDITIONPARTICULIEREEXECUTION(String value) {
        this.conditionparticuliereexecution = value;
    }

    /**
     * Obtient la valeur de la propriété indicationobligatoirenomqualificationsoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINDICATIONOBLIGATOIRENOMQUALIFICATIONSOUI() {
        return indicationobligatoirenomqualificationsoui;
    }

    /**
     * Définit la valeur de la propriété indicationobligatoirenomqualificationsoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINDICATIONOBLIGATOIRENOMQUALIFICATIONSOUI(Object value) {
        this.indicationobligatoirenomqualificationsoui = value;
    }

    /**
     * Obtient la valeur de la propriété indicationobligatoirenomqualificationsnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getINDICATIONOBLIGATOIRENOMQUALIFICATIONSNON() {
        return indicationobligatoirenomqualificationsnon;
    }

    /**
     * Définit la valeur de la propriété indicationobligatoirenomqualificationsnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setINDICATIONOBLIGATOIRENOMQUALIFICATIONSNON(Object value) {
        this.indicationobligatoirenomqualificationsnon = value;
    }

    /**
     * Obtient la valeur de la propriété justificatifscandidat.
     * 
     * @return
     *     possible object is
     *     {@link ConditionParticipation.JUSTIFICATIFSCANDIDAT }
     *     
     */
    public ConditionParticipation.JUSTIFICATIFSCANDIDAT getJUSTIFICATIFSCANDIDAT() {
        return justificatifscandidat;
    }

    /**
     * Définit la valeur de la propriété justificatifscandidat.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionParticipation.JUSTIFICATIFSCANDIDAT }
     *     
     */
    public void setJUSTIFICATIFSCANDIDAT(ConditionParticipation.JUSTIFICATIFSCANDIDAT value) {
        this.justificatifscandidat = value;
    }

    /**
     * Obtient la valeur de la propriété eligiblemps.
     * 
     * @return
     *     possible object is
     *     {@link TypeOuiNon }
     *     
     */
    public TypeOuiNon getELIGIBLEMPS() {
        return eligiblemps;
    }

    /**
     * Définit la valeur de la propriété eligiblemps.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOuiNon }
     *     
     */
    public void setELIGIBLEMPS(TypeOuiNon value) {
        this.eligiblemps = value;
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
     *         &lt;element name="P" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
        "p"
    })
    public static class JUSTIFICATIFSCANDIDAT {

        @XmlElement(name = "P", required = true)
        protected List<String> p;

        /**
         * Gets the value of the p property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the p property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getP().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getP() {
            if (p == null) {
                p = new ArrayList<String>();
            }
            return this.p;
        }

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
     *         &lt;element name="ATELIERS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="EMPLOIS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "ateliersproteges",
        "emploisproteges"
    })
    public static class MARCHERESERVEOUI {

        @XmlElement(name = "ATELIERS_PROTEGES")
        protected Object ateliersproteges;
        @XmlElement(name = "EMPLOIS_PROTEGES")
        protected Object emploisproteges;

        /**
         * Obtient la valeur de la propriété ateliersproteges.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getATELIERSPROTEGES() {
            return ateliersproteges;
        }

        /**
         * Définit la valeur de la propriété ateliersproteges.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setATELIERSPROTEGES(Object value) {
            this.ateliersproteges = value;
        }

        /**
         * Obtient la valeur de la propriété emploisproteges.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEMPLOISPROTEGES() {
            return emploisproteges;
        }

        /**
         * Définit la valeur de la propriété emploisproteges.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEMPLOISPROTEGES(Object value) {
            this.emploisproteges = value;
        }

    }

}
