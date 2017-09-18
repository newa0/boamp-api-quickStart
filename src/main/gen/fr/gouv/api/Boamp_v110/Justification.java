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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Justification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Justification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="IRRECEVABLE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AO_OUVERT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AO_RESTREINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PN_PUB_CONCUR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NON_CONFORMES" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PROC_OUVERTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROC_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PREC_INSUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RECHERCHES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PRIX_GLOBAL_IMPOSSIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="COMPRIS_ENTRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PN_NPUB_CONCUR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUCUNE_OFFRE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PROC_OUVERTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROC_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DELAI_INCOMPATIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RECHERCHES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SECRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="URGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES_MAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PN_NPUB_NCONCUR" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MC_RENOUV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MC_NECES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PREST_SIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LAUREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NON_CONFIE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TECHNIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ARTISTIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PROT_DROITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DOM_DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES_MAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Justification", propOrder = {
    "irrecevableAndPNPUBCONCURAndPNNPUBCONCUR"
})
public class Justification {

    @XmlElements({
        @XmlElement(name = "IRRECEVABLE", type = Justification.IRRECEVABLE.class),
        @XmlElement(name = "PN_PUB_CONCUR", type = Justification.PNPUBCONCUR.class),
        @XmlElement(name = "PN_NPUB_CONCUR", type = Justification.PNNPUBCONCUR.class),
        @XmlElement(name = "PN_NPUB_NCONCUR", type = Justification.PNNPUBNCONCUR.class)
    })
    protected List<Object> irrecevableAndPNPUBCONCURAndPNNPUBCONCUR;

    /**
     * Gets the value of the irrecevableAndPNPUBCONCURAndPNNPUBCONCUR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the irrecevableAndPNPUBCONCURAndPNNPUBCONCUR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIRRECEVABLEAndPNPUBCONCURAndPNNPUBCONCUR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Justification.IRRECEVABLE }
     * {@link Justification.PNPUBCONCUR }
     * {@link Justification.PNNPUBCONCUR }
     * {@link Justification.PNNPUBNCONCUR }
     * 
     * 
     */
    public List<Object> getIRRECEVABLEAndPNPUBCONCURAndPNNPUBCONCUR() {
        if (irrecevableAndPNPUBCONCURAndPNNPUBCONCUR == null) {
            irrecevableAndPNPUBCONCURAndPNNPUBCONCUR = new ArrayList<Object>();
        }
        return this.irrecevableAndPNPUBCONCURAndPNNPUBCONCUR;
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
     *         &lt;element name="AO_OUVERT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AO_RESTREINT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "aoouvert",
        "aorestreint",
        "autres"
    })
    public static class IRRECEVABLE {

        @XmlElement(name = "AO_OUVERT")
        protected String aoouvert;
        @XmlElement(name = "AO_RESTREINT")
        protected String aorestreint;
        @XmlElement(name = "AUTRES")
        protected String autres;

        /**
         * Obtient la valeur de la propriété aoouvert.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAOOUVERT() {
            return aoouvert;
        }

        /**
         * Définit la valeur de la propriété aoouvert.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAOOUVERT(String value) {
            this.aoouvert = value;
        }

        /**
         * Obtient la valeur de la propriété aorestreint.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAORESTREINT() {
            return aorestreint;
        }

        /**
         * Définit la valeur de la propriété aorestreint.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAORESTREINT(String value) {
            this.aorestreint = value;
        }

        /**
         * Obtient la valeur de la propriété autres.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTRES() {
            return autres;
        }

        /**
         * Définit la valeur de la propriété autres.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTRES(String value) {
            this.autres = value;
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
     *         &lt;element name="AUCUNE_OFFRE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PROC_OUVERTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROC_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DELAI_INCOMPATIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RECHERCHES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SECRET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="URGENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES_MAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "titreAndAUCUNEOFFREAndDELAIINCOMPATIBLE"
    })
    public static class PNNPUBCONCUR {

        @XmlElementRefs({
            @XmlElementRef(name = "AUTRES_MAR", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RECHERCHES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "URGENCE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUCUNE_OFFRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DELAI_INCOMPATIBLE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SECRET", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> titreAndAUCUNEOFFREAndDELAIINCOMPATIBLE;

        /**
         * Gets the value of the titreAndAUCUNEOFFREAndDELAIINCOMPATIBLE property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndAUCUNEOFFREAndDELAIINCOMPATIBLE property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndAUCUNEOFFREAndDELAIINCOMPATIBLE().add(newItem);
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
         * {@link JAXBElement }{@code <}{@link Justification.PNNPUBCONCUR.AUCUNEOFFRE }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getTITREAndAUCUNEOFFREAndDELAIINCOMPATIBLE() {
            if (titreAndAUCUNEOFFREAndDELAIINCOMPATIBLE == null) {
                titreAndAUCUNEOFFREAndDELAIINCOMPATIBLE = new ArrayList<JAXBElement<?>>();
            }
            return this.titreAndAUCUNEOFFREAndDELAIINCOMPATIBLE;
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
         *         &lt;element name="PROC_OUVERTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROC_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "procouverte",
            "procrestreinte"
        })
        public static class AUCUNEOFFRE {

            @XmlElement(name = "PROC_OUVERTE")
            protected String procouverte;
            @XmlElement(name = "PROC_RESTREINTE")
            protected String procrestreinte;

            /**
             * Obtient la valeur de la propriété procouverte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROCOUVERTE() {
                return procouverte;
            }

            /**
             * Définit la valeur de la propriété procouverte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROCOUVERTE(String value) {
                this.procouverte = value;
            }

            /**
             * Obtient la valeur de la propriété procrestreinte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROCRESTREINTE() {
                return procrestreinte;
            }

            /**
             * Définit la valeur de la propriété procrestreinte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROCRESTREINTE(String value) {
                this.procrestreinte = value;
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
     *         &lt;element name="MC_RENOUV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MC_NECES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PREST_SIM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LAUREAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NON_CONFIE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TECHNIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ARTISTIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROT_DROITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DOM_DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES_MAR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "titreAndMCRENOUVAndMCNECES"
    })
    public static class PNNPUBNCONCUR {

        @XmlElementRefs({
            @XmlElementRef(name = "LAUREAT", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NON_CONFIE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MC_RENOUV", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES_MAR", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "DOM_DEF", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "MC_NECES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PREST_SIM", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> titreAndMCRENOUVAndMCNECES;

        /**
         * Gets the value of the titreAndMCRENOUVAndMCNECES property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndMCRENOUVAndMCNECES property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndMCRENOUVAndMCNECES().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link JAXBElement }{@code <}{@link Justification.PNNPUBNCONCUR.NONCONFIE }{@code >}
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
        public List<JAXBElement<?>> getTITREAndMCRENOUVAndMCNECES() {
            if (titreAndMCRENOUVAndMCNECES == null) {
                titreAndMCRENOUVAndMCNECES = new ArrayList<JAXBElement<?>>();
            }
            return this.titreAndMCRENOUVAndMCNECES;
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
         *         &lt;element name="TECHNIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ARTISTIQUES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROT_DROITS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "techniques",
            "artistiques",
            "protdroits"
        })
        public static class NONCONFIE {

            @XmlElement(name = "TECHNIQUES")
            protected String techniques;
            @XmlElement(name = "ARTISTIQUES")
            protected String artistiques;
            @XmlElement(name = "PROT_DROITS")
            protected String protdroits;

            /**
             * Obtient la valeur de la propriété techniques.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTECHNIQUES() {
                return techniques;
            }

            /**
             * Définit la valeur de la propriété techniques.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTECHNIQUES(String value) {
                this.techniques = value;
            }

            /**
             * Obtient la valeur de la propriété artistiques.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getARTISTIQUES() {
                return artistiques;
            }

            /**
             * Définit la valeur de la propriété artistiques.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setARTISTIQUES(String value) {
                this.artistiques = value;
            }

            /**
             * Obtient la valeur de la propriété protdroits.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROTDROITS() {
                return protdroits;
            }

            /**
             * Définit la valeur de la propriété protdroits.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROTDROITS(String value) {
                this.protdroits = value;
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
     *         &lt;element name="NON_CONFORMES" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PROC_OUVERTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PROC_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PREC_INSUF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RECHERCHES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PRIX_GLOBAL_IMPOSSIBLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="COMPRIS_ENTRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "titreAndNONCONFORMESAndPRECINSUF"
    })
    public static class PNPUBCONCUR {

        @XmlElementRefs({
            @XmlElementRef(name = "PREC_INSUF", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "TITRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "COMPRIS_ENTRE", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "RECHERCHES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "NON_CONFORMES", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "PRIX_GLOBAL_IMPOSSIBLE", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<?>> titreAndNONCONFORMESAndPRECINSUF;

        /**
         * Gets the value of the titreAndNONCONFORMESAndPRECINSUF property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titreAndNONCONFORMESAndPRECINSUF property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITREAndNONCONFORMESAndPRECINSUF().add(newItem);
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
         * {@link JAXBElement }{@code <}{@link Justification.PNPUBCONCUR.NONCONFORMES }{@code >}
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * 
         * 
         */
        public List<JAXBElement<?>> getTITREAndNONCONFORMESAndPRECINSUF() {
            if (titreAndNONCONFORMESAndPRECINSUF == null) {
                titreAndNONCONFORMESAndPRECINSUF = new ArrayList<JAXBElement<?>>();
            }
            return this.titreAndNONCONFORMESAndPRECINSUF;
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
         *         &lt;element name="PROC_OUVERTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PROC_RESTREINTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "procouverte",
            "procrestreinte"
        })
        public static class NONCONFORMES {

            @XmlElement(name = "PROC_OUVERTE")
            protected String procouverte;
            @XmlElement(name = "PROC_RESTREINTE")
            protected String procrestreinte;

            /**
             * Obtient la valeur de la propriété procouverte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROCOUVERTE() {
                return procouverte;
            }

            /**
             * Définit la valeur de la propriété procouverte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROCOUVERTE(String value) {
                this.procouverte = value;
            }

            /**
             * Obtient la valeur de la propriété procrestreinte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPROCRESTREINTE() {
                return procrestreinte;
            }

            /**
             * Définit la valeur de la propriété procrestreinte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPROCRESTREINTE(String value) {
                this.procrestreinte = value;
            }

        }

    }

}
