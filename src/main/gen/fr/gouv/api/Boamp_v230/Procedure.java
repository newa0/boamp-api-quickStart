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
 * <p>Classe Java pour Procedure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Procedure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE_PROCEDURE" type="{}EnumTypeProcedure" minOccurs="0"/&gt;
 *         &lt;element name="NB_CANDIDATS" type="{}Candidature" minOccurs="0"/&gt;
 *         &lt;element name="AVIS_IMPLIQUE" type="{}AvisImplique" minOccurs="0"/&gt;
 *         &lt;element name="ACCORD_CADRE" type="{}EnumAccordCadre" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ATTRIB_POUVOIR_ADJUDICATEUR_SANS_NEGOCIATION_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ATTRIB_POUVOIR_ADJUDICATEUR_SANS_NEGOCIATION_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ENCHERE_ELECTRONIQUE_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ENCHERE_ELECTRONIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="AMP_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="AMP_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="FONDS_COMMUNAUTAIRES_OUI" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="FONDS_COMMUNAUTAIRES_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="URL_REGLES_NATIONALES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CRITERES_ATTRIBUTION" type="{}CritereAttribution" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="MARCHE_PERIODIQUE_OUI"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="CALENDRIER_PROCHAINS_AVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="MARCHE_PERIODIQUE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="LAUREAT_ATTRIBUTAIRE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="LAUREAT_ATTRIBUTAIRE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="DECISION_JURY_CONTRAIGNANTE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="DECISION_JURY_CONTRAIGNANTE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="MEMBRE_JURY" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Procedure", propOrder = {
    "typeprocedure",
    "nbcandidats",
    "avisimplique",
    "accordcadre",
    "attribpouvoiradjudicateursansnegociationoui",
    "attribpouvoiradjudicateursansnegociationnon",
    "enchereelectroniqueoui",
    "enchereelectroniquenon",
    "ampoui",
    "ampnon",
    "fondscommunautairesoui",
    "fondscommunautairesnon",
    "urlreglesnationales",
    "criteresattribution",
    "marcheperiodiqueoui",
    "marcheperiodiquenon",
    "laureatattributaireoui",
    "laureatattributairenon",
    "decisionjurycontraignanteoui",
    "decisionjurycontraignantenon",
    "membrejury"
})
public class Procedure {

    @XmlElement(name = "TYPE_PROCEDURE")
    protected EnumTypeProcedure typeprocedure;
    @XmlElement(name = "NB_CANDIDATS")
    protected Candidature nbcandidats;
    @XmlElement(name = "AVIS_IMPLIQUE")
    protected AvisImplique avisimplique;
    @XmlElement(name = "ACCORD_CADRE")
    protected EnumAccordCadre accordcadre;
    @XmlElement(name = "ATTRIB_POUVOIR_ADJUDICATEUR_SANS_NEGOCIATION_OUI")
    protected String attribpouvoiradjudicateursansnegociationoui;
    @XmlElement(name = "ATTRIB_POUVOIR_ADJUDICATEUR_SANS_NEGOCIATION_NON")
    protected Object attribpouvoiradjudicateursansnegociationnon;
    @XmlElement(name = "ENCHERE_ELECTRONIQUE_OUI")
    protected String enchereelectroniqueoui;
    @XmlElement(name = "ENCHERE_ELECTRONIQUE_NON")
    protected Object enchereelectroniquenon;
    @XmlElement(name = "AMP_OUI")
    protected Object ampoui;
    @XmlElement(name = "AMP_NON")
    protected Object ampnon;
    @XmlElement(name = "FONDS_COMMUNAUTAIRES_OUI")
    protected String fondscommunautairesoui;
    @XmlElement(name = "FONDS_COMMUNAUTAIRES_NON")
    protected Object fondscommunautairesnon;
    @XmlElement(name = "URL_REGLES_NATIONALES")
    protected String urlreglesnationales;
    @XmlElement(name = "CRITERES_ATTRIBUTION")
    protected CritereAttribution criteresattribution;
    @XmlElement(name = "MARCHE_PERIODIQUE_OUI")
    protected Procedure.MARCHEPERIODIQUEOUI marcheperiodiqueoui;
    @XmlElement(name = "MARCHE_PERIODIQUE_NON")
    protected Object marcheperiodiquenon;
    @XmlElement(name = "LAUREAT_ATTRIBUTAIRE_OUI")
    protected Object laureatattributaireoui;
    @XmlElement(name = "LAUREAT_ATTRIBUTAIRE_NON")
    protected Object laureatattributairenon;
    @XmlElement(name = "DECISION_JURY_CONTRAIGNANTE_OUI")
    protected Object decisionjurycontraignanteoui;
    @XmlElement(name = "DECISION_JURY_CONTRAIGNANTE_NON")
    protected Object decisionjurycontraignantenon;
    @XmlElement(name = "MEMBRE_JURY")
    protected List<Object> membrejury;

    /**
     * Obtient la valeur de la propriété typeprocedure.
     * 
     * @return
     *     possible object is
     *     {@link EnumTypeProcedure }
     *     
     */
    public EnumTypeProcedure getTYPEPROCEDURE() {
        return typeprocedure;
    }

    /**
     * Définit la valeur de la propriété typeprocedure.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTypeProcedure }
     *     
     */
    public void setTYPEPROCEDURE(EnumTypeProcedure value) {
        this.typeprocedure = value;
    }

    /**
     * Obtient la valeur de la propriété nbcandidats.
     * 
     * @return
     *     possible object is
     *     {@link Candidature }
     *     
     */
    public Candidature getNBCANDIDATS() {
        return nbcandidats;
    }

    /**
     * Définit la valeur de la propriété nbcandidats.
     * 
     * @param value
     *     allowed object is
     *     {@link Candidature }
     *     
     */
    public void setNBCANDIDATS(Candidature value) {
        this.nbcandidats = value;
    }

    /**
     * Obtient la valeur de la propriété avisimplique.
     * 
     * @return
     *     possible object is
     *     {@link AvisImplique }
     *     
     */
    public AvisImplique getAVISIMPLIQUE() {
        return avisimplique;
    }

    /**
     * Définit la valeur de la propriété avisimplique.
     * 
     * @param value
     *     allowed object is
     *     {@link AvisImplique }
     *     
     */
    public void setAVISIMPLIQUE(AvisImplique value) {
        this.avisimplique = value;
    }

    /**
     * Obtient la valeur de la propriété accordcadre.
     * 
     * @return
     *     possible object is
     *     {@link EnumAccordCadre }
     *     
     */
    public EnumAccordCadre getACCORDCADRE() {
        return accordcadre;
    }

    /**
     * Définit la valeur de la propriété accordcadre.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumAccordCadre }
     *     
     */
    public void setACCORDCADRE(EnumAccordCadre value) {
        this.accordcadre = value;
    }

    /**
     * Obtient la valeur de la propriété attribpouvoiradjudicateursansnegociationoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATTRIBPOUVOIRADJUDICATEURSANSNEGOCIATIONOUI() {
        return attribpouvoiradjudicateursansnegociationoui;
    }

    /**
     * Définit la valeur de la propriété attribpouvoiradjudicateursansnegociationoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATTRIBPOUVOIRADJUDICATEURSANSNEGOCIATIONOUI(String value) {
        this.attribpouvoiradjudicateursansnegociationoui = value;
    }

    /**
     * Obtient la valeur de la propriété attribpouvoiradjudicateursansnegociationnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getATTRIBPOUVOIRADJUDICATEURSANSNEGOCIATIONNON() {
        return attribpouvoiradjudicateursansnegociationnon;
    }

    /**
     * Définit la valeur de la propriété attribpouvoiradjudicateursansnegociationnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setATTRIBPOUVOIRADJUDICATEURSANSNEGOCIATIONNON(Object value) {
        this.attribpouvoiradjudicateursansnegociationnon = value;
    }

    /**
     * Obtient la valeur de la propriété enchereelectroniqueoui.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getENCHEREELECTRONIQUEOUI() {
        return enchereelectroniqueoui;
    }

    /**
     * Définit la valeur de la propriété enchereelectroniqueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setENCHEREELECTRONIQUEOUI(String value) {
        this.enchereelectroniqueoui = value;
    }

    /**
     * Obtient la valeur de la propriété enchereelectroniquenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENCHEREELECTRONIQUENON() {
        return enchereelectroniquenon;
    }

    /**
     * Définit la valeur de la propriété enchereelectroniquenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENCHEREELECTRONIQUENON(Object value) {
        this.enchereelectroniquenon = value;
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
     * Obtient la valeur de la propriété urlreglesnationales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLREGLESNATIONALES() {
        return urlreglesnationales;
    }

    /**
     * Définit la valeur de la propriété urlreglesnationales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLREGLESNATIONALES(String value) {
        this.urlreglesnationales = value;
    }

    /**
     * Obtient la valeur de la propriété criteresattribution.
     * 
     * @return
     *     possible object is
     *     {@link CritereAttribution }
     *     
     */
    public CritereAttribution getCRITERESATTRIBUTION() {
        return criteresattribution;
    }

    /**
     * Définit la valeur de la propriété criteresattribution.
     * 
     * @param value
     *     allowed object is
     *     {@link CritereAttribution }
     *     
     */
    public void setCRITERESATTRIBUTION(CritereAttribution value) {
        this.criteresattribution = value;
    }

    /**
     * Obtient la valeur de la propriété marcheperiodiqueoui.
     * 
     * @return
     *     possible object is
     *     {@link Procedure.MARCHEPERIODIQUEOUI }
     *     
     */
    public Procedure.MARCHEPERIODIQUEOUI getMARCHEPERIODIQUEOUI() {
        return marcheperiodiqueoui;
    }

    /**
     * Définit la valeur de la propriété marcheperiodiqueoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Procedure.MARCHEPERIODIQUEOUI }
     *     
     */
    public void setMARCHEPERIODIQUEOUI(Procedure.MARCHEPERIODIQUEOUI value) {
        this.marcheperiodiqueoui = value;
    }

    /**
     * Obtient la valeur de la propriété marcheperiodiquenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMARCHEPERIODIQUENON() {
        return marcheperiodiquenon;
    }

    /**
     * Définit la valeur de la propriété marcheperiodiquenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMARCHEPERIODIQUENON(Object value) {
        this.marcheperiodiquenon = value;
    }

    /**
     * Obtient la valeur de la propriété laureatattributaireoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLAUREATATTRIBUTAIREOUI() {
        return laureatattributaireoui;
    }

    /**
     * Définit la valeur de la propriété laureatattributaireoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLAUREATATTRIBUTAIREOUI(Object value) {
        this.laureatattributaireoui = value;
    }

    /**
     * Obtient la valeur de la propriété laureatattributairenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLAUREATATTRIBUTAIRENON() {
        return laureatattributairenon;
    }

    /**
     * Définit la valeur de la propriété laureatattributairenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLAUREATATTRIBUTAIRENON(Object value) {
        this.laureatattributairenon = value;
    }

    /**
     * Obtient la valeur de la propriété decisionjurycontraignanteoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDECISIONJURYCONTRAIGNANTEOUI() {
        return decisionjurycontraignanteoui;
    }

    /**
     * Définit la valeur de la propriété decisionjurycontraignanteoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDECISIONJURYCONTRAIGNANTEOUI(Object value) {
        this.decisionjurycontraignanteoui = value;
    }

    /**
     * Obtient la valeur de la propriété decisionjurycontraignantenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDECISIONJURYCONTRAIGNANTENON() {
        return decisionjurycontraignantenon;
    }

    /**
     * Définit la valeur de la propriété decisionjurycontraignantenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDECISIONJURYCONTRAIGNANTENON(Object value) {
        this.decisionjurycontraignantenon = value;
    }

    /**
     * Gets the value of the membrejury property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the membrejury property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMEMBREJURY().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getMEMBREJURY() {
        if (membrejury == null) {
            membrejury = new ArrayList<Object>();
        }
        return this.membrejury;
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
     *         &lt;element name="CALENDRIER_PROCHAINS_AVIS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "calendrierprochainsavis"
    })
    public static class MARCHEPERIODIQUEOUI {

        @XmlElement(name = "CALENDRIER_PROCHAINS_AVIS")
        protected String calendrierprochainsavis;

        /**
         * Obtient la valeur de la propriété calendrierprochainsavis.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCALENDRIERPROCHAINSAVIS() {
            return calendrierprochainsavis;
        }

        /**
         * Définit la valeur de la propriété calendrierprochainsavis.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCALENDRIERPROCHAINSAVIS(String value) {
            this.calendrierprochainsavis = value;
        }

    }

}
