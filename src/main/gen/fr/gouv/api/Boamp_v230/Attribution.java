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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Attribution complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Attribution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{}EnumTypeAttribution" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR_TOTALE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_BASSE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="OFFRE_ELEVEE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="DATE_DECISION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="DECISION" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;group ref="{}EnumNatureDecision" minOccurs="0"/&gt;
 *                   &lt;element name="NUM_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NUM_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="INTITULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AUTRES_INFORMATIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PUBLICATION_JOUE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ANNEE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;sequence maxOccurs="unbounded"&gt;
 *                     &lt;element name="TITULAIRE" type="{}Titulaire" minOccurs="0"/&gt;
 *                     &lt;element name="RENSEIGNEMENT" type="{}Renseignement" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="JUSTIFICATION_PAS_CONCURRENCE" minOccurs="0"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Attribution", propOrder = {
    "totalementinfructueux",
    "sanssuite",
    "attribuecomportelotinfructueux",
    "attribueparlotsmarches",
    "valeurtotale",
    "offrebasse",
    "offreelevee",
    "datedecision",
    "decision",
    "justificationpasconcurrence"
})
public class Attribution {

    @XmlElement(name = "TOTALEMENT_INFRUCTUEUX")
    protected Object totalementinfructueux;
    @XmlElement(name = "SANS_SUITE")
    protected Object sanssuite;
    @XmlElement(name = "ATTRIBUE_COMPORTE_LOT_INFRUCTUEUX")
    protected Object attribuecomportelotinfructueux;
    @XmlElement(name = "ATTRIBUE_PAR_LOTS_MARCHES")
    protected Object attribueparlotsmarches;
    @XmlElement(name = "VALEUR_TOTALE")
    protected Valeur valeurtotale;
    @XmlElement(name = "OFFRE_BASSE")
    protected Valeur offrebasse;
    @XmlElement(name = "OFFRE_ELEVEE")
    protected Valeur offreelevee;
    @XmlElement(name = "DATE_DECISION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datedecision;
    @XmlElement(name = "DECISION")
    protected List<Attribution.DECISION> decision;
    @XmlElement(name = "JUSTIFICATION_PAS_CONCURRENCE")
    protected Attribution.JUSTIFICATIONPASCONCURRENCE justificationpasconcurrence;

    /**
     * Obtient la valeur de la propriété totalementinfructueux.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTOTALEMENTINFRUCTUEUX() {
        return totalementinfructueux;
    }

    /**
     * Définit la valeur de la propriété totalementinfructueux.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTOTALEMENTINFRUCTUEUX(Object value) {
        this.totalementinfructueux = value;
    }

    /**
     * Obtient la valeur de la propriété sanssuite.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSANSSUITE() {
        return sanssuite;
    }

    /**
     * Définit la valeur de la propriété sanssuite.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSANSSUITE(Object value) {
        this.sanssuite = value;
    }

    /**
     * Obtient la valeur de la propriété attribuecomportelotinfructueux.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getATTRIBUECOMPORTELOTINFRUCTUEUX() {
        return attribuecomportelotinfructueux;
    }

    /**
     * Définit la valeur de la propriété attribuecomportelotinfructueux.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setATTRIBUECOMPORTELOTINFRUCTUEUX(Object value) {
        this.attribuecomportelotinfructueux = value;
    }

    /**
     * Obtient la valeur de la propriété attribueparlotsmarches.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getATTRIBUEPARLOTSMARCHES() {
        return attribueparlotsmarches;
    }

    /**
     * Définit la valeur de la propriété attribueparlotsmarches.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setATTRIBUEPARLOTSMARCHES(Object value) {
        this.attribueparlotsmarches = value;
    }

    /**
     * Obtient la valeur de la propriété valeurtotale.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEURTOTALE() {
        return valeurtotale;
    }

    /**
     * Définit la valeur de la propriété valeurtotale.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEURTOTALE(Valeur value) {
        this.valeurtotale = value;
    }

    /**
     * Obtient la valeur de la propriété offrebasse.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getOFFREBASSE() {
        return offrebasse;
    }

    /**
     * Définit la valeur de la propriété offrebasse.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setOFFREBASSE(Valeur value) {
        this.offrebasse = value;
    }

    /**
     * Obtient la valeur de la propriété offreelevee.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getOFFREELEVEE() {
        return offreelevee;
    }

    /**
     * Définit la valeur de la propriété offreelevee.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setOFFREELEVEE(Valeur value) {
        this.offreelevee = value;
    }

    /**
     * Obtient la valeur de la propriété datedecision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEDECISION() {
        return datedecision;
    }

    /**
     * Définit la valeur de la propriété datedecision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEDECISION(XMLGregorianCalendar value) {
        this.datedecision = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDECISION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribution.DECISION }
     * 
     * 
     */
    public List<Attribution.DECISION> getDECISION() {
        if (decision == null) {
            decision = new ArrayList<Attribution.DECISION>();
        }
        return this.decision;
    }

    /**
     * Obtient la valeur de la propriété justificationpasconcurrence.
     * 
     * @return
     *     possible object is
     *     {@link Attribution.JUSTIFICATIONPASCONCURRENCE }
     *     
     */
    public Attribution.JUSTIFICATIONPASCONCURRENCE getJUSTIFICATIONPASCONCURRENCE() {
        return justificationpasconcurrence;
    }

    /**
     * Définit la valeur de la propriété justificationpasconcurrence.
     * 
     * @param value
     *     allowed object is
     *     {@link Attribution.JUSTIFICATIONPASCONCURRENCE }
     *     
     */
    public void setJUSTIFICATIONPASCONCURRENCE(Attribution.JUSTIFICATIONPASCONCURRENCE value) {
        this.justificationpasconcurrence = value;
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
     *         &lt;group ref="{}EnumNatureDecision" minOccurs="0"/&gt;
     *         &lt;element name="NUM_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NUM_LOT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="INTITULE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AUTRES_INFORMATIONS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PUBLICATION_JOUE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ANNEE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;sequence maxOccurs="unbounded"&gt;
     *           &lt;element name="TITULAIRE" type="{}Titulaire" minOccurs="0"/&gt;
     *           &lt;element name="RENSEIGNEMENT" type="{}Renseignement" minOccurs="0"/&gt;
     *         &lt;/sequence&gt;
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
        "attribue",
        "infructueux",
        "sanssuite",
        "nummarche",
        "numlot",
        "intitule",
        "description",
        "autresinformations",
        "publicationjoue",
        "titulaireAndRENSEIGNEMENT"
    })
    public static class DECISION {

        @XmlElement(name = "ATTRIBUE")
        protected Object attribue;
        @XmlElement(name = "INFRUCTUEUX")
        protected Object infructueux;
        @XmlElement(name = "SANS_SUITE")
        protected Object sanssuite;
        @XmlElement(name = "NUM_MARCHE")
        protected String nummarche;
        @XmlElement(name = "NUM_LOT")
        protected String numlot;
        @XmlElement(name = "INTITULE")
        protected String intitule;
        @XmlElement(name = "DESCRIPTION")
        protected String description;
        @XmlElement(name = "AUTRES_INFORMATIONS")
        protected String autresinformations;
        @XmlElement(name = "PUBLICATION_JOUE")
        protected Attribution.DECISION.PUBLICATIONJOUE publicationjoue;
        @XmlElements({
            @XmlElement(name = "TITULAIRE", type = Titulaire.class),
            @XmlElement(name = "RENSEIGNEMENT", type = Renseignement.class)
        })
        protected List<Object> titulaireAndRENSEIGNEMENT;

        /**
         * Obtient la valeur de la propriété attribue.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getATTRIBUE() {
            return attribue;
        }

        /**
         * Définit la valeur de la propriété attribue.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setATTRIBUE(Object value) {
            this.attribue = value;
        }

        /**
         * Obtient la valeur de la propriété infructueux.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINFRUCTUEUX() {
            return infructueux;
        }

        /**
         * Définit la valeur de la propriété infructueux.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINFRUCTUEUX(Object value) {
            this.infructueux = value;
        }

        /**
         * Obtient la valeur de la propriété sanssuite.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getSANSSUITE() {
            return sanssuite;
        }

        /**
         * Définit la valeur de la propriété sanssuite.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setSANSSUITE(Object value) {
            this.sanssuite = value;
        }

        /**
         * Obtient la valeur de la propriété nummarche.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMMARCHE() {
            return nummarche;
        }

        /**
         * Définit la valeur de la propriété nummarche.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMMARCHE(String value) {
            this.nummarche = value;
        }

        /**
         * Obtient la valeur de la propriété numlot.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNUMLOT() {
            return numlot;
        }

        /**
         * Définit la valeur de la propriété numlot.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNUMLOT(String value) {
            this.numlot = value;
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
         * Obtient la valeur de la propriété autresinformations.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAUTRESINFORMATIONS() {
            return autresinformations;
        }

        /**
         * Définit la valeur de la propriété autresinformations.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAUTRESINFORMATIONS(String value) {
            this.autresinformations = value;
        }

        /**
         * Obtient la valeur de la propriété publicationjoue.
         * 
         * @return
         *     possible object is
         *     {@link Attribution.DECISION.PUBLICATIONJOUE }
         *     
         */
        public Attribution.DECISION.PUBLICATIONJOUE getPUBLICATIONJOUE() {
            return publicationjoue;
        }

        /**
         * Définit la valeur de la propriété publicationjoue.
         * 
         * @param value
         *     allowed object is
         *     {@link Attribution.DECISION.PUBLICATIONJOUE }
         *     
         */
        public void setPUBLICATIONJOUE(Attribution.DECISION.PUBLICATIONJOUE value) {
            this.publicationjoue = value;
        }

        /**
         * Gets the value of the titulaireAndRENSEIGNEMENT property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the titulaireAndRENSEIGNEMENT property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTITULAIREAndRENSEIGNEMENT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Titulaire }
         * {@link Renseignement }
         * 
         * 
         */
        public List<Object> getTITULAIREAndRENSEIGNEMENT() {
            if (titulaireAndRENSEIGNEMENT == null) {
                titulaireAndRENSEIGNEMENT = new ArrayList<Object>();
            }
            return this.titulaireAndRENSEIGNEMENT;
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
         *         &lt;element name="ANNEE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
            "annee",
            "numannonce",
            "datepublication"
        })
        public static class PUBLICATIONJOUE {

            @XmlElement(name = "ANNEE", required = true)
            protected BigInteger annee;
            @XmlElement(name = "NUM_ANNONCE", required = true)
            protected BigInteger numannonce;
            @XmlElement(name = "DATE_PUBLICATION", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datepublication;

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
    public static class JUSTIFICATIONPASCONCURRENCE {

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

}
