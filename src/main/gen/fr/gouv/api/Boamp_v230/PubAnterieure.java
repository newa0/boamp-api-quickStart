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
 * <p>Classe Java pour PubAnterieure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PubAnterieure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="OUI" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *           &lt;element name="REFERENCE_PUBLICATION" maxOccurs="unbounded" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="PUBLICATION_PAPIER" maxOccurs="2"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="TYPE_EDITION"&gt;
 *                                 &lt;simpleType&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                     &lt;enumeration value="A"/&gt;
 *                                     &lt;enumeration value="B"/&gt;
 *                                     &lt;enumeration value="C"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/simpleType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="NUM_PARUTION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                               &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                               &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                               &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="PUBLICATION_ELECTRONIQUE"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                               &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="PUBLICATION_JOUE"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="NATURE" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;choice&gt;
 *                                         &lt;element name="AVIS_PRE-INFORMATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_SYSTEM_QUALIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_EXANTE_VOLONTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_MARCHE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_SAD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AVIS_ATTRIBUTION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="AUTRES_PUBLCATIONS_ANTERIEURES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;/choice&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="ANNEE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                               &lt;element name="NUM_PARUTION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                               &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                               &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubAnterieure", propOrder = {
    "oui",
    "referencepublication",
    "non"
})
public class PubAnterieure {

    @XmlElement(name = "OUI")
    protected Object oui;
    @XmlElement(name = "REFERENCE_PUBLICATION")
    protected List<PubAnterieure.REFERENCEPUBLICATION> referencepublication;
    @XmlElement(name = "NON")
    protected Object non;

    /**
     * Obtient la valeur de la propriété oui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOUI() {
        return oui;
    }

    /**
     * Définit la valeur de la propriété oui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOUI(Object value) {
        this.oui = value;
    }

    /**
     * Gets the value of the referencepublication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referencepublication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREFERENCEPUBLICATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubAnterieure.REFERENCEPUBLICATION }
     * 
     * 
     */
    public List<PubAnterieure.REFERENCEPUBLICATION> getREFERENCEPUBLICATION() {
        if (referencepublication == null) {
            referencepublication = new ArrayList<PubAnterieure.REFERENCEPUBLICATION>();
        }
        return this.referencepublication;
    }

    /**
     * Obtient la valeur de la propriété non.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNON() {
        return non;
    }

    /**
     * Définit la valeur de la propriété non.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNON(Object value) {
        this.non = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="PUBLICATION_PAPIER" maxOccurs="2"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TYPE_EDITION"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="A"/&gt;
     *                         &lt;enumeration value="B"/&gt;
     *                         &lt;enumeration value="C"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="NUM_PARUTION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PUBLICATION_ELECTRONIQUE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PUBLICATION_JOUE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NATURE" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="AVIS_PRE-INFORMATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_SYSTEM_QUALIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_EXANTE_VOLONTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_MARCHE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_SAD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AVIS_ATTRIBUTION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element name="AUTRES_PUBLCATIONS_ANTERIEURES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ANNEE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="NUM_PARUTION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "publicationpapier",
        "publicationelectronique",
        "publicationjoue"
    })
    public static class REFERENCEPUBLICATION {

        @XmlElement(name = "PUBLICATION_PAPIER")
        protected List<PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER> publicationpapier;
        @XmlElement(name = "PUBLICATION_ELECTRONIQUE")
        protected PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE publicationelectronique;
        @XmlElement(name = "PUBLICATION_JOUE")
        protected PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE publicationjoue;

        /**
         * Gets the value of the publicationpapier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publicationpapier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPUBLICATIONPAPIER().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER }
         * 
         * 
         */
        public List<PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER> getPUBLICATIONPAPIER() {
            if (publicationpapier == null) {
                publicationpapier = new ArrayList<PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONPAPIER>();
            }
            return this.publicationpapier;
        }

        /**
         * Obtient la valeur de la propriété publicationelectronique.
         * 
         * @return
         *     possible object is
         *     {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE }
         *     
         */
        public PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE getPUBLICATIONELECTRONIQUE() {
            return publicationelectronique;
        }

        /**
         * Définit la valeur de la propriété publicationelectronique.
         * 
         * @param value
         *     allowed object is
         *     {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE }
         *     
         */
        public void setPUBLICATIONELECTRONIQUE(PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONELECTRONIQUE value) {
            this.publicationelectronique = value;
        }

        /**
         * Obtient la valeur de la propriété publicationjoue.
         * 
         * @return
         *     possible object is
         *     {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE }
         *     
         */
        public PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE getPUBLICATIONJOUE() {
            return publicationjoue;
        }

        /**
         * Définit la valeur de la propriété publicationjoue.
         * 
         * @param value
         *     allowed object is
         *     {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE }
         *     
         */
        public void setPUBLICATIONJOUE(PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE value) {
            this.publicationjoue = value;
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
         *         &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
            "datepublication",
            "datefindiffusion"
        })
        public static class PUBLICATIONELECTRONIQUE {

            @XmlElement(name = "DATE_PUBLICATION", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datepublication;
            @XmlElement(name = "DATE_FIN_DIFFUSION", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datefindiffusion;

            /**
             * Obtient la valeur de la propriété datepublication.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEPUBLICATION() {
                return datepublication;
            }

            /**
             * Définit la valeur de la propriété datepublication.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEPUBLICATION(XMLGregorianCalendar value) {
                this.datepublication = value;
            }

            /**
             * Obtient la valeur de la propriété datefindiffusion.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEFINDIFFUSION() {
                return datefindiffusion;
            }

            /**
             * Définit la valeur de la propriété datefindiffusion.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEFINDIFFUSION(XMLGregorianCalendar value) {
                this.datefindiffusion = value;
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
         *         &lt;element name="NATURE" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="AVIS_PRE-INFORMATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_SYSTEM_QUALIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_EXANTE_VOLONTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_MARCHE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_SAD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AVIS_ATTRIBUTION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element name="AUTRES_PUBLCATIONS_ANTERIEURES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ANNEE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="NUM_PARUTION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
            "nature",
            "annee",
            "numparution",
            "numannonce",
            "datepublication"
        })
        public static class PUBLICATIONJOUE {

            @XmlElement(name = "NATURE")
            protected PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE nature;
            @XmlElement(name = "ANNEE", required = true)
            protected BigInteger annee;
            @XmlElement(name = "NUM_PARUTION", required = true)
            protected BigInteger numparution;
            @XmlElement(name = "NUM_ANNONCE", required = true)
            protected BigInteger numannonce;
            @XmlElement(name = "DATE_PUBLICATION")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datepublication;

            /**
             * Obtient la valeur de la propriété nature.
             * 
             * @return
             *     possible object is
             *     {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE }
             *     
             */
            public PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE getNATURE() {
                return nature;
            }

            /**
             * Définit la valeur de la propriété nature.
             * 
             * @param value
             *     allowed object is
             *     {@link PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE }
             *     
             */
            public void setNATURE(PubAnterieure.REFERENCEPUBLICATION.PUBLICATIONJOUE.NATURE value) {
                this.nature = value;
            }

            /**
             * Obtient la valeur de la propriété annee.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getANNEE() {
                return annee;
            }

            /**
             * Définit la valeur de la propriété annee.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setANNEE(BigInteger value) {
                this.annee = value;
            }

            /**
             * Obtient la valeur de la propriété numparution.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMPARUTION() {
                return numparution;
            }

            /**
             * Définit la valeur de la propriété numparution.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMPARUTION(BigInteger value) {
                this.numparution = value;
            }

            /**
             * Obtient la valeur de la propriété numannonce.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMANNONCE() {
                return numannonce;
            }

            /**
             * Définit la valeur de la propriété numannonce.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMANNONCE(BigInteger value) {
                this.numannonce = value;
            }

            /**
             * Obtient la valeur de la propriété datepublication.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEPUBLICATION() {
                return datepublication;
            }

            /**
             * Définit la valeur de la propriété datepublication.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEPUBLICATION(XMLGregorianCalendar value) {
                this.datepublication = value;
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
             *       &lt;choice&gt;
             *         &lt;element name="AVIS_PRE-INFORMATION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_PERIODIQUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_SYSTEM_QUALIF" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_EXANTE_VOLONTAIRE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_MARCHE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_SAD" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_CONCOURS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AVIS_ATTRIBUTION" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="AUTRES_PUBLCATIONS_ANTERIEURES" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *       &lt;/choice&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "avispreinformation",
                "avisperiodique",
                "avissystemqualif",
                "avisprofilacheteur",
                "avisexantevolontaire",
                "avismarche",
                "avissad",
                "avisconcours",
                "avisattribution",
                "autrespublcationsanterieures"
            })
            public static class NATURE {

                @XmlElement(name = "AVIS_PRE-INFORMATION")
                protected Object avispreinformation;
                @XmlElement(name = "AVIS_PERIODIQUE")
                protected Object avisperiodique;
                @XmlElement(name = "AVIS_SYSTEM_QUALIF")
                protected Object avissystemqualif;
                @XmlElement(name = "AVIS_PROFIL_ACHETEUR")
                protected Object avisprofilacheteur;
                @XmlElement(name = "AVIS_EXANTE_VOLONTAIRE")
                protected Object avisexantevolontaire;
                @XmlElement(name = "AVIS_MARCHE")
                protected Object avismarche;
                @XmlElement(name = "AVIS_SAD")
                protected Object avissad;
                @XmlElement(name = "AVIS_CONCOURS")
                protected Object avisconcours;
                @XmlElement(name = "AVIS_ATTRIBUTION")
                protected Object avisattribution;
                @XmlElement(name = "AUTRES_PUBLCATIONS_ANTERIEURES")
                protected Object autrespublcationsanterieures;

                /**
                 * Obtient la valeur de la propriété avispreinformation.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISPREINFORMATION() {
                    return avispreinformation;
                }

                /**
                 * Définit la valeur de la propriété avispreinformation.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISPREINFORMATION(Object value) {
                    this.avispreinformation = value;
                }

                /**
                 * Obtient la valeur de la propriété avisperiodique.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISPERIODIQUE() {
                    return avisperiodique;
                }

                /**
                 * Définit la valeur de la propriété avisperiodique.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISPERIODIQUE(Object value) {
                    this.avisperiodique = value;
                }

                /**
                 * Obtient la valeur de la propriété avissystemqualif.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISSYSTEMQUALIF() {
                    return avissystemqualif;
                }

                /**
                 * Définit la valeur de la propriété avissystemqualif.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISSYSTEMQUALIF(Object value) {
                    this.avissystemqualif = value;
                }

                /**
                 * Obtient la valeur de la propriété avisprofilacheteur.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISPROFILACHETEUR() {
                    return avisprofilacheteur;
                }

                /**
                 * Définit la valeur de la propriété avisprofilacheteur.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISPROFILACHETEUR(Object value) {
                    this.avisprofilacheteur = value;
                }

                /**
                 * Obtient la valeur de la propriété avisexantevolontaire.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISEXANTEVOLONTAIRE() {
                    return avisexantevolontaire;
                }

                /**
                 * Définit la valeur de la propriété avisexantevolontaire.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISEXANTEVOLONTAIRE(Object value) {
                    this.avisexantevolontaire = value;
                }

                /**
                 * Obtient la valeur de la propriété avismarche.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISMARCHE() {
                    return avismarche;
                }

                /**
                 * Définit la valeur de la propriété avismarche.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISMARCHE(Object value) {
                    this.avismarche = value;
                }

                /**
                 * Obtient la valeur de la propriété avissad.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISSAD() {
                    return avissad;
                }

                /**
                 * Définit la valeur de la propriété avissad.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISSAD(Object value) {
                    this.avissad = value;
                }

                /**
                 * Obtient la valeur de la propriété avisconcours.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISCONCOURS() {
                    return avisconcours;
                }

                /**
                 * Définit la valeur de la propriété avisconcours.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISCONCOURS(Object value) {
                    this.avisconcours = value;
                }

                /**
                 * Obtient la valeur de la propriété avisattribution.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAVISATTRIBUTION() {
                    return avisattribution;
                }

                /**
                 * Définit la valeur de la propriété avisattribution.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAVISATTRIBUTION(Object value) {
                    this.avisattribution = value;
                }

                /**
                 * Obtient la valeur de la propriété autrespublcationsanterieures.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAUTRESPUBLCATIONSANTERIEURES() {
                    return autrespublcationsanterieures;
                }

                /**
                 * Définit la valeur de la propriété autrespublcationsanterieures.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAUTRESPUBLCATIONSANTERIEURES(Object value) {
                    this.autrespublcationsanterieures = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="TYPE_EDITION"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="A"/&gt;
         *               &lt;enumeration value="B"/&gt;
         *               &lt;enumeration value="C"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="NUM_PARUTION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
            "typeedition",
            "numparution",
            "numannonce",
            "datepublication",
            "datefindiffusion"
        })
        public static class PUBLICATIONPAPIER {

            @XmlElement(name = "TYPE_EDITION", required = true)
            protected String typeedition;
            @XmlElement(name = "NUM_PARUTION", required = true)
            protected BigInteger numparution;
            @XmlElement(name = "NUM_ANNONCE", required = true)
            protected BigInteger numannonce;
            @XmlElement(name = "DATE_PUBLICATION", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datepublication;
            @XmlElement(name = "DATE_FIN_DIFFUSION", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datefindiffusion;

            /**
             * Obtient la valeur de la propriété typeedition.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTYPEEDITION() {
                return typeedition;
            }

            /**
             * Définit la valeur de la propriété typeedition.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTYPEEDITION(String value) {
                this.typeedition = value;
            }

            /**
             * Obtient la valeur de la propriété numparution.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMPARUTION() {
                return numparution;
            }

            /**
             * Définit la valeur de la propriété numparution.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMPARUTION(BigInteger value) {
                this.numparution = value;
            }

            /**
             * Obtient la valeur de la propriété numannonce.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNUMANNONCE() {
                return numannonce;
            }

            /**
             * Définit la valeur de la propriété numannonce.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNUMANNONCE(BigInteger value) {
                this.numannonce = value;
            }

            /**
             * Obtient la valeur de la propriété datepublication.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEPUBLICATION() {
                return datepublication;
            }

            /**
             * Définit la valeur de la propriété datepublication.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEPUBLICATION(XMLGregorianCalendar value) {
                this.datepublication = value;
            }

            /**
             * Obtient la valeur de la propriété datefindiffusion.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEFINDIFFUSION() {
                return datefindiffusion;
            }

            /**
             * Définit la valeur de la propriété datefindiffusion.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEFINDIFFUSION(XMLGregorianCalendar value) {
                this.datefindiffusion = value;
            }

        }

    }

}
