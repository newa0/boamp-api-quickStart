//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour Condition complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Condition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="RELATIVES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAUTIONNEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FINANCEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GROUPEMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FRANÇAIS_SEUL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FORME_JUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_ECO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_ECO_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_TECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_TECH_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES_CONDITIONS_PART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LANGUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PARTICIPATION" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FORME_JUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_ECO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_ECO_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_TECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CAP_TECH_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MARCHE_RESERVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MARCHE_NON_RESERVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ATELIERS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EMPLOIS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRESTATION_RESERVEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PRESTATION_RESERVEE_REFERENCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NOM_QUALIFICATIONS_OBLIGATOIRE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JUSTIFICATIONS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NB_CANDIDATS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NB_MAX_OFFRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NB_MIN_OFFRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CANDIDATS_DEJA_SELECTIONNES" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="VALEUR" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NB_OFFRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRITERES_REDUCTION_NB_CAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="REDUCTION_PROGRESSIVE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="NOMS_PARTICIPANTS_SELECTIONNES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRITERES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRITERES_CCTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRITERES_LISTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LISTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CRITERES_PRIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ENCHERE_ELECTRONIQUE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="ENCHERE_ELECTRONIQUE_RENSEIGNEMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Condition", propOrder = {
    "relativesAndPARTICIPATIONAndJUSTIFICATIONS"
})
public class Condition {

    @XmlElements({
        @XmlElement(name = "RELATIVES", type = Condition.RELATIVES.class),
        @XmlElement(name = "PARTICIPATION", type = Condition.PARTICIPATION.class),
        @XmlElement(name = "JUSTIFICATIONS", type = Condition.JUSTIFICATIONS.class),
        @XmlElement(name = "NB_CANDIDATS", type = Condition.NBCANDIDATS.class),
        @XmlElement(name = "CRITERES", type = Condition.CRITERES.class)
    })
    protected List<Object> relativesAndPARTICIPATIONAndJUSTIFICATIONS;

    /**
     * Gets the value of the relativesAndPARTICIPATIONAndJUSTIFICATIONS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relativesAndPARTICIPATIONAndJUSTIFICATIONS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRELATIVESAndPARTICIPATIONAndJUSTIFICATIONS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Condition.RELATIVES }
     * {@link Condition.PARTICIPATION }
     * {@link Condition.JUSTIFICATIONS }
     * {@link Condition.NBCANDIDATS }
     * {@link Condition.CRITERES }
     * 
     * 
     */
    public List<Object> getRELATIVESAndPARTICIPATIONAndJUSTIFICATIONS() {
        if (relativesAndPARTICIPATIONAndJUSTIFICATIONS == null) {
            relativesAndPARTICIPATIONAndJUSTIFICATIONS = new ArrayList<Object>();
        }
        return this.relativesAndPARTICIPATIONAndJUSTIFICATIONS;
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
     *         &lt;element name="CRITERES_CCTP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRITERES_LISTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LISTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRITERES_PRIX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ENCHERE_ELECTRONIQUE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="ENCHERE_ELECTRONIQUE_RENSEIGNEMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "titreAndCRITERESCCTPAndCRITERESLISTE"
    })
    public static class CRITERES {

        @XmlElementRefs({
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CRITERES_PRIX", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CRITERES_LISTE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LISTE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CRITERES_CCTP", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ENCHERE_ELECTRONIQUE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ENCHERE_ELECTRONIQUE_RENSEIGNEMENTS", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<? extends Serializable>> titreAndCRITERESCCTPAndCRITERESLISTE;

        /**
         * Gets the value of the titreAndCRITERESCCTPAndCRITERESLISTE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndCRITERESCCTPAndCRITERESLISTE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndCRITERESCCTPAndCRITERESLISTE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends Serializable>> getTITREAndCRITERESCCTPAndCRITERESLISTE() {
            if (titreAndCRITERESCCTPAndCRITERESLISTE == null) {
                titreAndCRITERESCCTPAndCRITERESLISTE = new ArrayList<JAXBElement<? extends Serializable>>();
            }
            return this.titreAndCRITERESCCTPAndCRITERESLISTE;
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
        "titreAndAUTRES"
    })
    public static class JUSTIFICATIONS {

        @XmlElementRefs({
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> titreAndAUTRES;

        /**
         * Gets the value of the titreAndAUTRES property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndAUTRES property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndAUTRES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getTITREAndAUTRES() {
            if (titreAndAUTRES == null) {
                titreAndAUTRES = new ArrayList<JAXBElement<String>>();
            }
            return this.titreAndAUTRES;
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
     *         &lt;element name="NB_MAX_OFFRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NB_MIN_OFFRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CANDIDATS_DEJA_SELECTIONNES" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="VALEUR" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NB_OFFRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CRITERES_REDUCTION_NB_CAND" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="REDUCTION_PROGRESSIVE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="NOMS_PARTICIPANTS_SELECTIONNES" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "titreAndNBMAXOFFREAndNBMINOFFRE"
    })
    public static class NBCANDIDATS {

        @XmlElementRefs({
            @XmlElementRef(name = "NB_MAX_OFFRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NOMS_PARTICIPANTS_SELECTIONNES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NB_MIN_OFFRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NB_OFFRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CRITERES_REDUCTION_NB_CAND", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CANDIDATS_DEJA_SELECTIONNES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "REDUCTION_PROGRESSIVE", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> titreAndNBMAXOFFREAndNBMINOFFRE;

        /**
         * Gets the value of the titreAndNBMAXOFFREAndNBMINOFFRE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndNBMAXOFFREAndNBMINOFFRE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndNBMAXOFFREAndNBMINOFFRE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Condition.NBCANDIDATS.CANDIDATSDEJASELECTIONNES }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getTITREAndNBMAXOFFREAndNBMINOFFRE() {
            if (titreAndNBMAXOFFREAndNBMINOFFRE == null) {
                titreAndNBMAXOFFREAndNBMINOFFRE = new ArrayList<JAXBElement<?>>();
            }
            return this.titreAndNBMAXOFFREAndNBMINOFFRE;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="VALEUR" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class CANDIDATSDEJASELECTIONNES {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "VALEUR", required = true)
            protected String valeur;

            /**
             * Obtient la valeur de la propriété value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Définit la valeur de la propriété value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtient la valeur de la propriété valeur.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVALEUR() {
                return valeur;
            }

            /**
             * Définit la valeur de la propriété valeur.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVALEUR(String value) {
                this.valeur = value;
            }

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
     *         &lt;element name="FORME_JUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_ECO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_ECO_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_TECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_TECH_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MARCHE_RESERVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MARCHE_NON_RESERVE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ATELIERS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EMPLOIS_PROTEGES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRESTATION_RESERVEE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PRESTATION_RESERVEE_REFERENCES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NOM_QUALIFICATIONS_OBLIGATOIRE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        "titreAndFORMEJURAndCAPECO"
    })
    public static class PARTICIPATION {

        @XmlElementRefs({
            @XmlElementRef(name = "FORME_JUR", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NOM_QUALIFICATIONS_OBLIGATOIRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "EMPLOIS_PROTEGES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MARCHE_RESERVE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_ECO", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_TECH", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_TECH_NIVEAU_MINI", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MARCHE_NON_RESERVE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_ECO_NIVEAU_MINI", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ATELIERS_PROTEGES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PRESTATION_RESERVEE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PRESTATION_RESERVEE_REFERENCES", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<? extends Serializable>> titreAndFORMEJURAndCAPECO;

        /**
         * Gets the value of the titreAndFORMEJURAndCAPECO property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndFORMEJURAndCAPECO property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndFORMEJURAndCAPECO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends Serializable>> getTITREAndFORMEJURAndCAPECO() {
            if (titreAndFORMEJURAndCAPECO == null) {
                titreAndFORMEJURAndCAPECO = new ArrayList<JAXBElement<? extends Serializable>>();
            }
            return this.titreAndFORMEJURAndCAPECO;
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
     *         &lt;element name="CAUTIONNEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FINANCEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GROUPEMENTS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FRANÇAIS_SEUL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FORME_JUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_ECO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_ECO_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_TECH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CAP_TECH_NIVEAU_MINI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES_CONDITIONS_PART" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LANGUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "titreAndCAUTIONNEMENTAndFINANCEMENT"
    })
    public static class RELATIVES {

        @XmlElementRefs({
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FRAN\u00c7AIS_SEUL", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_ECO", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_TECH", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "LANGUE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_ECO_NIVEAU_MINI", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FORME_JUR", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "GROUPEMENTS", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "FINANCEMENT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAUTIONNEMENT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES_CONDITIONS_PART", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "CAP_TECH_NIVEAU_MINI", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<String>> titreAndCAUTIONNEMENTAndFINANCEMENT;

        /**
         * Gets the value of the titreAndCAUTIONNEMENTAndFINANCEMENT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndCAUTIONNEMENTAndFINANCEMENT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndCAUTIONNEMENTAndFINANCEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<String>> getTITREAndCAUTIONNEMENTAndFINANCEMENT() {
            if (titreAndCAUTIONNEMENTAndFINANCEMENT == null) {
                titreAndCAUTIONNEMENTAndFINANCEMENT = new ArrayList<JAXBElement<String>>();
            }
            return this.titreAndCAUTIONNEMENTAndFINANCEMENT;
        }

    }

}
