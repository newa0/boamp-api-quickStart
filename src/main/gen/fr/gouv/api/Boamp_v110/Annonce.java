//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Annonce complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Annonce"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GESTION" type="{}Gestion"/&gt;
 *         &lt;element name="DONNEES"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INFO" type="{}Info" minOccurs="0"/&gt;
 *                   &lt;element name="TYPE_ACTIVITE_ORG" type="{}EnumActiviteOrganisationnelle" minOccurs="0"/&gt;
 *                   &lt;element name="IDENT" type="{}Identite" minOccurs="0"/&gt;
 *                   &lt;element name="OBJET" type="{}Objet" minOccurs="0"/&gt;
 *                   &lt;element name="CARACTERISTIQUES" type="{}Caracteristique" minOccurs="0"/&gt;
 *                   &lt;element name="DUREE" type="{}Duree" minOccurs="0"/&gt;
 *                   &lt;element name="CONDITIONS" type="{}Condition" minOccurs="0"/&gt;
 *                   &lt;element name="PROCEDURE" type="{}Procedure" minOccurs="0"/&gt;
 *                   &lt;element name="PROCEDURES_RECOURS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="INSTANCE_RECOURS" type="{}ContactRecours" minOccurs="0"/&gt;
 *                             &lt;element name="ORGANE_MEDIATION" type="{}ContactRecours" minOccurs="0"/&gt;
 *                             &lt;element name="RENS_RECOURS" type="{}ContactRecours" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PROCEDURES_RECOURS_PRECISIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DELAI" type="{}Delai" minOccurs="0"/&gt;
 *                   &lt;element name="RENSEIGNEMENTS" type="{}Renseignement" minOccurs="0"/&gt;
 *                   &lt;element name="ENVOI_BOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CORRESPONDANTS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence maxOccurs="unbounded"&gt;
 *                             &lt;element name="ADMIN_TECH" type="{}Correspondant" minOccurs="0"/&gt;
 *                             &lt;element name="TECH" type="{}Correspondant" minOccurs="0"/&gt;
 *                             &lt;element name="ADMIN" type="{}Correspondant" minOccurs="0"/&gt;
 *                             &lt;element name="RENS_COMPLT" type="{}Correspondant" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DOCUMENTS" type="{}ContactDocument" minOccurs="0"/&gt;
 *                   &lt;element name="LOTS" type="{}Lot" minOccurs="0"/&gt;
 *                   &lt;element name="CLASSES" type="{}Classes" minOccurs="0"/&gt;
 *                   &lt;element name="CRITERES_D_ATTRIBUTION" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence maxOccurs="unbounded"&gt;
 *                             &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CRITERES_CCTP" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="LISTE_CRITERES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CRITERES_LISTE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CRITERES_SOCIAUX_ENV" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SOCIAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="ENVIRONNEMENTAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DESCRIPTEURS" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DESCRIPTEUR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RECTIF" type="{}Rectificatif" minOccurs="0"/&gt;
 *                   &lt;element name="COND_PART_SYST_QUALIF" type="{}ConditionQualification" minOccurs="0"/&gt;
 *                   &lt;element name="CONSULTATION_CONVENTION" type="{}ContactConsultation" minOccurs="0"/&gt;
 *                   &lt;element name="JUSTIFICATION" type="{}Justification" minOccurs="0"/&gt;
 *                   &lt;element name="MOTIF_RECTIFICATIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MOTIF_ANNULATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ANNEXE_1" type="{}Annexe1" minOccurs="0"/&gt;
 *                   &lt;element name="FORM_15" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="FORM_16" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="FORM_17" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="FORM_17Bis" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="FORM_18" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="FORM_19" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Annonce", propOrder = {
    "gestion",
    "donnees"
})
public class Annonce {

    @XmlElement(name = "GESTION", required = true)
    protected Gestion gestion;
    @XmlElement(name = "DONNEES", required = true)
    protected Annonce.DONNEES donnees;

    /**
     * Obtient la valeur de la propriété gestion.
     * 
     * @return
     *     possible object is
     *     {@link Gestion }
     *     
     */
    public Gestion getGESTION() {
        return gestion;
    }

    /**
     * Définit la valeur de la propriété gestion.
     * 
     * @param value
     *     allowed object is
     *     {@link Gestion }
     *     
     */
    public void setGESTION(Gestion value) {
        this.gestion = value;
    }

    /**
     * Obtient la valeur de la propriété donnees.
     * 
     * @return
     *     possible object is
     *     {@link Annonce.DONNEES }
     *     
     */
    public Annonce.DONNEES getDONNEES() {
        return donnees;
    }

    /**
     * Définit la valeur de la propriété donnees.
     * 
     * @param value
     *     allowed object is
     *     {@link Annonce.DONNEES }
     *     
     */
    public void setDONNEES(Annonce.DONNEES value) {
        this.donnees = value;
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
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INFO" type="{}Info" minOccurs="0"/&gt;
     *         &lt;element name="TYPE_ACTIVITE_ORG" type="{}EnumActiviteOrganisationnelle" minOccurs="0"/&gt;
     *         &lt;element name="IDENT" type="{}Identite" minOccurs="0"/&gt;
     *         &lt;element name="OBJET" type="{}Objet" minOccurs="0"/&gt;
     *         &lt;element name="CARACTERISTIQUES" type="{}Caracteristique" minOccurs="0"/&gt;
     *         &lt;element name="DUREE" type="{}Duree" minOccurs="0"/&gt;
     *         &lt;element name="CONDITIONS" type="{}Condition" minOccurs="0"/&gt;
     *         &lt;element name="PROCEDURE" type="{}Procedure" minOccurs="0"/&gt;
     *         &lt;element name="PROCEDURES_RECOURS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="INSTANCE_RECOURS" type="{}ContactRecours" minOccurs="0"/&gt;
     *                   &lt;element name="ORGANE_MEDIATION" type="{}ContactRecours" minOccurs="0"/&gt;
     *                   &lt;element name="RENS_RECOURS" type="{}ContactRecours" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PROCEDURES_RECOURS_PRECISIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DELAI" type="{}Delai" minOccurs="0"/&gt;
     *         &lt;element name="RENSEIGNEMENTS" type="{}Renseignement" minOccurs="0"/&gt;
     *         &lt;element name="ENVOI_BOMP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CORRESPONDANTS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence maxOccurs="unbounded"&gt;
     *                   &lt;element name="ADMIN_TECH" type="{}Correspondant" minOccurs="0"/&gt;
     *                   &lt;element name="TECH" type="{}Correspondant" minOccurs="0"/&gt;
     *                   &lt;element name="ADMIN" type="{}Correspondant" minOccurs="0"/&gt;
     *                   &lt;element name="RENS_COMPLT" type="{}Correspondant" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DOCUMENTS" type="{}ContactDocument" minOccurs="0"/&gt;
     *         &lt;element name="LOTS" type="{}Lot" minOccurs="0"/&gt;
     *         &lt;element name="CLASSES" type="{}Classes" minOccurs="0"/&gt;
     *         &lt;element name="CRITERES_D_ATTRIBUTION" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence maxOccurs="unbounded"&gt;
     *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CRITERES_CCTP" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="LISTE_CRITERES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CRITERES_LISTE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CRITERES_SOCIAUX_ENV" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SOCIAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="ENVIRONNEMENTAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DESCRIPTEURS" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DESCRIPTEUR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RECTIF" type="{}Rectificatif" minOccurs="0"/&gt;
     *         &lt;element name="COND_PART_SYST_QUALIF" type="{}ConditionQualification" minOccurs="0"/&gt;
     *         &lt;element name="CONSULTATION_CONVENTION" type="{}ContactConsultation" minOccurs="0"/&gt;
     *         &lt;element name="JUSTIFICATION" type="{}Justification" minOccurs="0"/&gt;
     *         &lt;element name="MOTIF_RECTIFICATIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MOTIF_ANNULATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ANNEXE_1" type="{}Annexe1" minOccurs="0"/&gt;
     *         &lt;element name="FORM_15" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="FORM_16" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="FORM_17" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="FORM_17Bis" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="FORM_18" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="FORM_19" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "titreAndINFOAndTYPEACTIVITEORG"
    })
    public static class DONNEES {

        @XmlElementRefs({
            @XmlElementRef(name = "CRITERES_D_ATTRIBUTION", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PROCEDURES_RECOURS_PRECISIONS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LOTS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TYPE_ACTIVITE_ORG", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ANNEXE_1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DESCRIPTEURS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FORM_17", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CORRESPONDANTS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FORM_17Bis", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "INFO", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DUREE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "COND_PART_SYST_QUALIF", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "IDENT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DELAI", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CARACTERISTIQUES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RECTIF", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FORM_16", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MOTIF_ANNULATION", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CLASSES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CONSULTATION_CONVENTION", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CONDITIONS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RENSEIGNEMENTS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DOCUMENTS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FORM_15", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PROCEDURE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FORM_19", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CRITERES_SOCIAUX_ENV", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MOTIF_RECTIFICATIF", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ENVOI_BOMP", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "JUSTIFICATION", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "OBJET", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PROCEDURES_RECOURS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FORM_18", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> titreAndINFOAndTYPEACTIVITEORG;

        /**
         * Gets the value of the titreAndINFOAndTYPEACTIVITEORG property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndINFOAndTYPEACTIVITEORG property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndINFOAndTYPEACTIVITEORG().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Annonce.DONNEES.CRITERESDATTRIBUTION }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Lot }{@code >}
         * {@link JAXBElement }{@code <}{@link EnumActiviteOrganisationnelle }{@code >}
         * {@link JAXBElement }{@code <}{@link Annexe1 }{@code >}
         * {@link JAXBElement }{@code <}{@link Annonce.DONNEES.DESCRIPTEURS }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link Annonce.DONNEES.CORRESPONDANTS }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link Info }{@code >}
         * {@link JAXBElement }{@code <}{@link Duree }{@code >}
         * {@link JAXBElement }{@code <}{@link ConditionQualification }{@code >}
         * {@link JAXBElement }{@code <}{@link Identite }{@code >}
         * {@link JAXBElement }{@code <}{@link Delai }{@code >}
         * {@link JAXBElement }{@code <}{@link Caracteristique }{@code >}
         * {@link JAXBElement }{@code <}{@link Rectificatif }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Classes }{@code >}
         * {@link JAXBElement }{@code <}{@link ContactConsultation }{@code >}
         * {@link JAXBElement }{@code <}{@link Condition }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Renseignement }{@code >}
         * {@link JAXBElement }{@code <}{@link ContactDocument }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link Procedure }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * {@link JAXBElement }{@code <}{@link Annonce.DONNEES.CRITERESSOCIAUXENV }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Justification }{@code >}
         * {@link JAXBElement }{@code <}{@link Objet }{@code >}
         * {@link JAXBElement }{@code <}{@link Annonce.DONNEES.PROCEDURESRECOURS }{@code >}
         * {@link JAXBElement }{@code <}{@link Object }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getTITREAndINFOAndTYPEACTIVITEORG() {
            if (titreAndINFOAndTYPEACTIVITEORG == null) {
                titreAndINFOAndTYPEACTIVITEORG = new ArrayList<JAXBElement<?>>();
            }
            return this.titreAndINFOAndTYPEACTIVITEORG;
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
         *       &lt;sequence maxOccurs="unbounded"&gt;
         *         &lt;element name="ADMIN_TECH" type="{}Correspondant" minOccurs="0"/&gt;
         *         &lt;element name="TECH" type="{}Correspondant" minOccurs="0"/&gt;
         *         &lt;element name="ADMIN" type="{}Correspondant" minOccurs="0"/&gt;
         *         &lt;element name="RENS_COMPLT" type="{}Correspondant" minOccurs="0"/&gt;
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
            "admintechAndTECHAndADMIN"
        })
        public static class CORRESPONDANTS {

            @XmlElementRefs({
                @XmlElementRef(name = "ADMIN", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "TECH", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "ADMIN_TECH", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "RENS_COMPLT", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<Correspondant>> admintechAndTECHAndADMIN;

            /**
             * Gets the value of the admintechAndTECHAndADMIN property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the admintechAndTECHAndADMIN property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getADMINTECHAndTECHAndADMIN().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link Correspondant }{@code >}
             * {@link JAXBElement }{@code <}{@link Correspondant }{@code >}
             * {@link JAXBElement }{@code <}{@link Correspondant }{@code >}
             * {@link JAXBElement }{@code <}{@link Correspondant }{@code >}
             * 
             * 
             */
            public List<JAXBElement<Correspondant>> getADMINTECHAndTECHAndADMIN() {
                if (admintechAndTECHAndADMIN == null) {
                    admintechAndTECHAndADMIN = new ArrayList<JAXBElement<Correspondant>>();
                }
                return this.admintechAndTECHAndADMIN;
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
         *       &lt;sequence maxOccurs="unbounded"&gt;
         *         &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CRITERES_CCTP" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="LISTE_CRITERES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CRITERES_LISTE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "titreAndCRITERESCCTPAndLISTECRITERES"
        })
        public static class CRITERESDATTRIBUTION {

            @XmlElementRefs({
                @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "LISTE_CRITERES", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "CRITERES_LISTE", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "CRITERES_CCTP", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<?>> titreAndCRITERESCCTPAndLISTECRITERES;

            /**
             * Gets the value of the titreAndCRITERESCCTPAndLISTECRITERES property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the titreAndCRITERESCCTPAndLISTECRITERES property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTITREAndCRITERESCCTPAndLISTECRITERES().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link Object }{@code >}
             * {@link JAXBElement }{@code <}{@link Object }{@code >}
             * 
             * 
             */
            public List<JAXBElement<?>> getTITREAndCRITERESCCTPAndLISTECRITERES() {
                if (titreAndCRITERESCCTPAndLISTECRITERES == null) {
                    titreAndCRITERESCCTPAndLISTECRITERES = new ArrayList<JAXBElement<?>>();
                }
                return this.titreAndCRITERESCCTPAndLISTECRITERES;
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
         *       &lt;sequence&gt;
         *         &lt;element name="SOCIAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="ENVIRONNEMENTAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "sociaux",
            "environnementaux"
        })
        public static class CRITERESSOCIAUXENV {

            @XmlElement(name = "SOCIAUX")
            protected Object sociaux;
            @XmlElement(name = "ENVIRONNEMENTAUX")
            protected Object environnementaux;

            /**
             * Obtient la valeur de la propriété sociaux.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSOCIAUX() {
                return sociaux;
            }

            /**
             * Définit la valeur de la propriété sociaux.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSOCIAUX(Object value) {
                this.sociaux = value;
            }

            /**
             * Obtient la valeur de la propriété environnementaux.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getENVIRONNEMENTAUX() {
                return environnementaux;
            }

            /**
             * Définit la valeur de la propriété environnementaux.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setENVIRONNEMENTAUX(Object value) {
                this.environnementaux = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="DESCRIPTEUR" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
            "descripteur"
        })
        public static class DESCRIPTEURS {

            @XmlElement(name = "DESCRIPTEUR", required = true)
            protected List<String> descripteur;

            /**
             * Gets the value of the descripteur property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the descripteur property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDESCRIPTEUR().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getDESCRIPTEUR() {
                if (descripteur == null) {
                    descripteur = new ArrayList<String>();
                }
                return this.descripteur;
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
         *       &lt;sequence&gt;
         *         &lt;element name="INSTANCE_RECOURS" type="{}ContactRecours" minOccurs="0"/&gt;
         *         &lt;element name="ORGANE_MEDIATION" type="{}ContactRecours" minOccurs="0"/&gt;
         *         &lt;element name="RENS_RECOURS" type="{}ContactRecours" minOccurs="0"/&gt;
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
            "instancerecours",
            "organemediation",
            "rensrecours"
        })
        public static class PROCEDURESRECOURS {

            @XmlElement(name = "INSTANCE_RECOURS")
            protected ContactRecours instancerecours;
            @XmlElement(name = "ORGANE_MEDIATION")
            protected ContactRecours organemediation;
            @XmlElement(name = "RENS_RECOURS")
            protected ContactRecours rensrecours;

            /**
             * Obtient la valeur de la propriété instancerecours.
             * 
             * @return
             *     possible object is
             *     {@link ContactRecours }
             *     
             */
            public ContactRecours getINSTANCERECOURS() {
                return instancerecours;
            }

            /**
             * Définit la valeur de la propriété instancerecours.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactRecours }
             *     
             */
            public void setINSTANCERECOURS(ContactRecours value) {
                this.instancerecours = value;
            }

            /**
             * Obtient la valeur de la propriété organemediation.
             * 
             * @return
             *     possible object is
             *     {@link ContactRecours }
             *     
             */
            public ContactRecours getORGANEMEDIATION() {
                return organemediation;
            }

            /**
             * Définit la valeur de la propriété organemediation.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactRecours }
             *     
             */
            public void setORGANEMEDIATION(ContactRecours value) {
                this.organemediation = value;
            }

            /**
             * Obtient la valeur de la propriété rensrecours.
             * 
             * @return
             *     possible object is
             *     {@link ContactRecours }
             *     
             */
            public ContactRecours getRENSRECOURS() {
                return rensrecours;
            }

            /**
             * Définit la valeur de la propriété rensrecours.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactRecours }
             *     
             */
            public void setRENSRECOURS(ContactRecours value) {
                this.rensrecours = value;
            }

        }

    }

}
