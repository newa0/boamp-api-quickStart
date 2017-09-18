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
 * <p>Classe Java pour Donnees complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Donnees"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDENTITE" type="{}DetailContact"/&gt;
 *         &lt;element name="TYPE_ORGANISME" type="{}EnumOrganisme" minOccurs="0"/&gt;
 *         &lt;element name="TYPE_POUVOIR_ADJUDICATEUR" type="{}EnumPouvoirAdjudicateur" minOccurs="0"/&gt;
 *         &lt;element name="ACTIVITE_PRINCIPALE" type="{}EnumActivitePrincipale" minOccurs="0"/&gt;
 *         &lt;element name="OBJET" type="{}ObjetArticle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PROCEDURE" type="{}Procedure" minOccurs="0"/&gt;
 *         &lt;element name="PUBLICATION_ANTERIEURE" type="{}PubAnterieure" minOccurs="0"/&gt;
 *         &lt;element name="ATTRIBUTION" type="{}Attribution" minOccurs="0"/&gt;
 *         &lt;element name="RECTIF" type="{}Rectificatif" minOccurs="0"/&gt;
 *         &lt;element name="ANNULATION" type="{}Annulation" minOccurs="0"/&gt;
 *         &lt;element name="CONDITION_DELAI" type="{}ConditionDelai" minOccurs="0"/&gt;
 *         &lt;element name="CONDITION_RELATIVE_MARCHE" type="{}ConditionMarche" minOccurs="0"/&gt;
 *         &lt;element name="CONDITION_PARTICIPATION" type="{}ConditionParticipation" minOccurs="0"/&gt;
 *         &lt;element name="CONDITION_PARTICIPATION_SYSTME_QUALIF" type="{}ConditionQualification" maxOccurs="20" minOccurs="0"/&gt;
 *         &lt;element name="CONDITION_ADMINISTRATIVE" type="{}ConditionAdministrative" minOccurs="0"/&gt;
 *         &lt;element name="RENSEIGNEMENTS_COMPLEMENTAIRES" type="{}ComplementInformation" minOccurs="0"/&gt;
 *         &lt;element name="MODIF" type="{}Modification" minOccurs="0"/&gt;
 *         &lt;element name="ANNEXE_D1" type="{}AnnexeD1" minOccurs="0"/&gt;
 *         &lt;element name="ANNEXE_D2" type="{}AnnexeD2" minOccurs="0"/&gt;
 *         &lt;element name="ANNEXE_D3" type="{}AnnexeD3" minOccurs="0"/&gt;
 *         &lt;element name="ANNEXE_D4" type="{}AnnexeD4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Donnees", propOrder = {
    "identite",
    "typeorganisme",
    "typepouvoiradjudicateur",
    "activiteprincipale",
    "objet",
    "procedure",
    "publicationanterieure",
    "attribution",
    "rectif",
    "annulation",
    "conditiondelai",
    "conditionrelativemarche",
    "conditionparticipation",
    "conditionparticipationsystmequalif",
    "conditionadministrative",
    "renseignementscomplementaires",
    "modif",
    "annexed1",
    "annexed2",
    "annexed3",
    "annexed4"
})
public class Donnees {

    @XmlElement(name = "IDENTITE", required = true)
    protected DetailContact identite;
    @XmlElement(name = "TYPE_ORGANISME")
    protected EnumOrganisme typeorganisme;
    @XmlElement(name = "TYPE_POUVOIR_ADJUDICATEUR")
    protected EnumPouvoirAdjudicateur typepouvoiradjudicateur;
    @XmlElement(name = "ACTIVITE_PRINCIPALE")
    protected EnumActivitePrincipale activiteprincipale;
    @XmlElement(name = "OBJET")
    protected List<ObjetArticle> objet;
    @XmlElement(name = "PROCEDURE")
    protected Procedure procedure;
    @XmlElement(name = "PUBLICATION_ANTERIEURE")
    protected PubAnterieure publicationanterieure;
    @XmlElement(name = "ATTRIBUTION")
    protected Attribution attribution;
    @XmlElement(name = "RECTIF")
    protected Rectificatif rectif;
    @XmlElement(name = "ANNULATION")
    protected Annulation annulation;
    @XmlElement(name = "CONDITION_DELAI")
    protected ConditionDelai conditiondelai;
    @XmlElement(name = "CONDITION_RELATIVE_MARCHE")
    protected ConditionMarche conditionrelativemarche;
    @XmlElement(name = "CONDITION_PARTICIPATION")
    protected ConditionParticipation conditionparticipation;
    @XmlElement(name = "CONDITION_PARTICIPATION_SYSTME_QUALIF")
    protected List<ConditionQualification> conditionparticipationsystmequalif;
    @XmlElement(name = "CONDITION_ADMINISTRATIVE")
    protected ConditionAdministrative conditionadministrative;
    @XmlElement(name = "RENSEIGNEMENTS_COMPLEMENTAIRES")
    protected ComplementInformation renseignementscomplementaires;
    @XmlElement(name = "MODIF")
    protected Modification modif;
    @XmlElement(name = "ANNEXE_D1")
    protected AnnexeD1 annexed1;
    @XmlElement(name = "ANNEXE_D2")
    protected AnnexeD2 annexed2;
    @XmlElement(name = "ANNEXE_D3")
    protected AnnexeD3 annexed3;
    @XmlElement(name = "ANNEXE_D4")
    protected AnnexeD4 annexed4;

    /**
     * Obtient la valeur de la propriété identite.
     * 
     * @return
     *     possible object is
     *     {@link DetailContact }
     *     
     */
    public DetailContact getIDENTITE() {
        return identite;
    }

    /**
     * Définit la valeur de la propriété identite.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailContact }
     *     
     */
    public void setIDENTITE(DetailContact value) {
        this.identite = value;
    }

    /**
     * Obtient la valeur de la propriété typeorganisme.
     * 
     * @return
     *     possible object is
     *     {@link EnumOrganisme }
     *     
     */
    public EnumOrganisme getTYPEORGANISME() {
        return typeorganisme;
    }

    /**
     * Définit la valeur de la propriété typeorganisme.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOrganisme }
     *     
     */
    public void setTYPEORGANISME(EnumOrganisme value) {
        this.typeorganisme = value;
    }

    /**
     * Obtient la valeur de la propriété typepouvoiradjudicateur.
     * 
     * @return
     *     possible object is
     *     {@link EnumPouvoirAdjudicateur }
     *     
     */
    public EnumPouvoirAdjudicateur getTYPEPOUVOIRADJUDICATEUR() {
        return typepouvoiradjudicateur;
    }

    /**
     * Définit la valeur de la propriété typepouvoiradjudicateur.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumPouvoirAdjudicateur }
     *     
     */
    public void setTYPEPOUVOIRADJUDICATEUR(EnumPouvoirAdjudicateur value) {
        this.typepouvoiradjudicateur = value;
    }

    /**
     * Obtient la valeur de la propriété activiteprincipale.
     * 
     * @return
     *     possible object is
     *     {@link EnumActivitePrincipale }
     *     
     */
    public EnumActivitePrincipale getACTIVITEPRINCIPALE() {
        return activiteprincipale;
    }

    /**
     * Définit la valeur de la propriété activiteprincipale.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumActivitePrincipale }
     *     
     */
    public void setACTIVITEPRINCIPALE(EnumActivitePrincipale value) {
        this.activiteprincipale = value;
    }

    /**
     * Gets the value of the objet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOBJET().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjetArticle }
     * 
     * 
     */
    public List<ObjetArticle> getOBJET() {
        if (objet == null) {
            objet = new ArrayList<ObjetArticle>();
        }
        return this.objet;
    }

    /**
     * Obtient la valeur de la propriété procedure.
     * 
     * @return
     *     possible object is
     *     {@link Procedure }
     *     
     */
    public Procedure getPROCEDURE() {
        return procedure;
    }

    /**
     * Définit la valeur de la propriété procedure.
     * 
     * @param value
     *     allowed object is
     *     {@link Procedure }
     *     
     */
    public void setPROCEDURE(Procedure value) {
        this.procedure = value;
    }

    /**
     * Obtient la valeur de la propriété publicationanterieure.
     * 
     * @return
     *     possible object is
     *     {@link PubAnterieure }
     *     
     */
    public PubAnterieure getPUBLICATIONANTERIEURE() {
        return publicationanterieure;
    }

    /**
     * Définit la valeur de la propriété publicationanterieure.
     * 
     * @param value
     *     allowed object is
     *     {@link PubAnterieure }
     *     
     */
    public void setPUBLICATIONANTERIEURE(PubAnterieure value) {
        this.publicationanterieure = value;
    }

    /**
     * Obtient la valeur de la propriété attribution.
     * 
     * @return
     *     possible object is
     *     {@link Attribution }
     *     
     */
    public Attribution getATTRIBUTION() {
        return attribution;
    }

    /**
     * Définit la valeur de la propriété attribution.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribution }
     *     
     */
    public void setATTRIBUTION(Attribution value) {
        this.attribution = value;
    }

    /**
     * Obtient la valeur de la propriété rectif.
     * 
     * @return
     *     possible object is
     *     {@link Rectificatif }
     *     
     */
    public Rectificatif getRECTIF() {
        return rectif;
    }

    /**
     * Définit la valeur de la propriété rectif.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectificatif }
     *     
     */
    public void setRECTIF(Rectificatif value) {
        this.rectif = value;
    }

    /**
     * Obtient la valeur de la propriété annulation.
     * 
     * @return
     *     possible object is
     *     {@link Annulation }
     *     
     */
    public Annulation getANNULATION() {
        return annulation;
    }

    /**
     * Définit la valeur de la propriété annulation.
     * 
     * @param value
     *     allowed object is
     *     {@link Annulation }
     *     
     */
    public void setANNULATION(Annulation value) {
        this.annulation = value;
    }

    /**
     * Obtient la valeur de la propriété conditiondelai.
     * 
     * @return
     *     possible object is
     *     {@link ConditionDelai }
     *     
     */
    public ConditionDelai getCONDITIONDELAI() {
        return conditiondelai;
    }

    /**
     * Définit la valeur de la propriété conditiondelai.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionDelai }
     *     
     */
    public void setCONDITIONDELAI(ConditionDelai value) {
        this.conditiondelai = value;
    }

    /**
     * Obtient la valeur de la propriété conditionrelativemarche.
     * 
     * @return
     *     possible object is
     *     {@link ConditionMarche }
     *     
     */
    public ConditionMarche getCONDITIONRELATIVEMARCHE() {
        return conditionrelativemarche;
    }

    /**
     * Définit la valeur de la propriété conditionrelativemarche.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionMarche }
     *     
     */
    public void setCONDITIONRELATIVEMARCHE(ConditionMarche value) {
        this.conditionrelativemarche = value;
    }

    /**
     * Obtient la valeur de la propriété conditionparticipation.
     * 
     * @return
     *     possible object is
     *     {@link ConditionParticipation }
     *     
     */
    public ConditionParticipation getCONDITIONPARTICIPATION() {
        return conditionparticipation;
    }

    /**
     * Définit la valeur de la propriété conditionparticipation.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionParticipation }
     *     
     */
    public void setCONDITIONPARTICIPATION(ConditionParticipation value) {
        this.conditionparticipation = value;
    }

    /**
     * Gets the value of the conditionparticipationsystmequalif property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditionparticipationsystmequalif property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCONDITIONPARTICIPATIONSYSTMEQUALIF().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionQualification }
     * 
     * 
     */
    public List<ConditionQualification> getCONDITIONPARTICIPATIONSYSTMEQUALIF() {
        if (conditionparticipationsystmequalif == null) {
            conditionparticipationsystmequalif = new ArrayList<ConditionQualification>();
        }
        return this.conditionparticipationsystmequalif;
    }

    /**
     * Obtient la valeur de la propriété conditionadministrative.
     * 
     * @return
     *     possible object is
     *     {@link ConditionAdministrative }
     *     
     */
    public ConditionAdministrative getCONDITIONADMINISTRATIVE() {
        return conditionadministrative;
    }

    /**
     * Définit la valeur de la propriété conditionadministrative.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionAdministrative }
     *     
     */
    public void setCONDITIONADMINISTRATIVE(ConditionAdministrative value) {
        this.conditionadministrative = value;
    }

    /**
     * Obtient la valeur de la propriété renseignementscomplementaires.
     * 
     * @return
     *     possible object is
     *     {@link ComplementInformation }
     *     
     */
    public ComplementInformation getRENSEIGNEMENTSCOMPLEMENTAIRES() {
        return renseignementscomplementaires;
    }

    /**
     * Définit la valeur de la propriété renseignementscomplementaires.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementInformation }
     *     
     */
    public void setRENSEIGNEMENTSCOMPLEMENTAIRES(ComplementInformation value) {
        this.renseignementscomplementaires = value;
    }

    /**
     * Obtient la valeur de la propriété modif.
     * 
     * @return
     *     possible object is
     *     {@link Modification }
     *     
     */
    public Modification getMODIF() {
        return modif;
    }

    /**
     * Définit la valeur de la propriété modif.
     * 
     * @param value
     *     allowed object is
     *     {@link Modification }
     *     
     */
    public void setMODIF(Modification value) {
        this.modif = value;
    }

    /**
     * Obtient la valeur de la propriété annexed1.
     * 
     * @return
     *     possible object is
     *     {@link AnnexeD1 }
     *     
     */
    public AnnexeD1 getANNEXED1() {
        return annexed1;
    }

    /**
     * Définit la valeur de la propriété annexed1.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnexeD1 }
     *     
     */
    public void setANNEXED1(AnnexeD1 value) {
        this.annexed1 = value;
    }

    /**
     * Obtient la valeur de la propriété annexed2.
     * 
     * @return
     *     possible object is
     *     {@link AnnexeD2 }
     *     
     */
    public AnnexeD2 getANNEXED2() {
        return annexed2;
    }

    /**
     * Définit la valeur de la propriété annexed2.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnexeD2 }
     *     
     */
    public void setANNEXED2(AnnexeD2 value) {
        this.annexed2 = value;
    }

    /**
     * Obtient la valeur de la propriété annexed3.
     * 
     * @return
     *     possible object is
     *     {@link AnnexeD3 }
     *     
     */
    public AnnexeD3 getANNEXED3() {
        return annexed3;
    }

    /**
     * Définit la valeur de la propriété annexed3.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnexeD3 }
     *     
     */
    public void setANNEXED3(AnnexeD3 value) {
        this.annexed3 = value;
    }

    /**
     * Obtient la valeur de la propriété annexed4.
     * 
     * @return
     *     possible object is
     *     {@link AnnexeD4 }
     *     
     */
    public AnnexeD4 getANNEXED4() {
        return annexed4;
    }

    /**
     * Définit la valeur de la propriété annexed4.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnexeD4 }
     *     
     */
    public void setANNEXED4(AnnexeD4 value) {
        this.annexed4 = value;
    }

}
