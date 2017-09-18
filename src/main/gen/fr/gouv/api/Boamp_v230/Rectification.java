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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Rectification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Rectification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RUB_INIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="APRES_MENTION" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="TXT_INIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AJOUTER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SUPPRIMER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TEXTE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPV" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INIT" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="PRINCIPAL" type="{}typeCPVBasePrincipale"/&gt;
 *                               &lt;element name="SUPPLEMENTAIRE" type="{}typeCPVBaseSupplementaire" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="LIRE" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="PRINCIPAL" type="{}typeCPVBasePrincipale"/&gt;
 *                               &lt;element name="SUPPLEMENTAIRE" type="{}typeCPVBaseSupplementaire" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DATE" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="INIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="LIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
@XmlType(name = "Rectification", propOrder = {
    "rubinit",
    "lot",
    "apresmention",
    "txtinit",
    "lire",
    "ajouter",
    "supprimer",
    "texte",
    "cpv",
    "date"
})
public class Rectification {

    @XmlElement(name = "RUB_INIT")
    protected String rubinit;
    @XmlElement(name = "LOT")
    protected Object lot;
    @XmlElement(name = "APRES_MENTION")
    protected Object apresmention;
    @XmlElement(name = "TXT_INIT")
    protected String txtinit;
    @XmlElement(name = "LIRE")
    protected String lire;
    @XmlElement(name = "AJOUTER")
    protected String ajouter;
    @XmlElement(name = "SUPPRIMER")
    protected String supprimer;
    @XmlElement(name = "TEXTE")
    protected Rectification.TEXTE texte;
    @XmlElement(name = "CPV")
    protected Rectification.CPV cpv;
    @XmlElement(name = "DATE")
    protected Rectification.DATE date;

    /**
     * Obtient la valeur de la propriété rubinit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRUBINIT() {
        return rubinit;
    }

    /**
     * Définit la valeur de la propriété rubinit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRUBINIT(String value) {
        this.rubinit = value;
    }

    /**
     * Obtient la valeur de la propriété lot.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLOT() {
        return lot;
    }

    /**
     * Définit la valeur de la propriété lot.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLOT(Object value) {
        this.lot = value;
    }

    /**
     * Obtient la valeur de la propriété apresmention.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAPRESMENTION() {
        return apresmention;
    }

    /**
     * Définit la valeur de la propriété apresmention.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAPRESMENTION(Object value) {
        this.apresmention = value;
    }

    /**
     * Obtient la valeur de la propriété txtinit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTXTINIT() {
        return txtinit;
    }

    /**
     * Définit la valeur de la propriété txtinit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTXTINIT(String value) {
        this.txtinit = value;
    }

    /**
     * Obtient la valeur de la propriété lire.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIRE() {
        return lire;
    }

    /**
     * Définit la valeur de la propriété lire.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIRE(String value) {
        this.lire = value;
    }

    /**
     * Obtient la valeur de la propriété ajouter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAJOUTER() {
        return ajouter;
    }

    /**
     * Définit la valeur de la propriété ajouter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAJOUTER(String value) {
        this.ajouter = value;
    }

    /**
     * Obtient la valeur de la propriété supprimer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPRIMER() {
        return supprimer;
    }

    /**
     * Définit la valeur de la propriété supprimer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPRIMER(String value) {
        this.supprimer = value;
    }

    /**
     * Obtient la valeur de la propriété texte.
     * 
     * @return
     *     possible object is
     *     {@link Rectification.TEXTE }
     *     
     */
    public Rectification.TEXTE getTEXTE() {
        return texte;
    }

    /**
     * Définit la valeur de la propriété texte.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectification.TEXTE }
     *     
     */
    public void setTEXTE(Rectification.TEXTE value) {
        this.texte = value;
    }

    /**
     * Obtient la valeur de la propriété cpv.
     * 
     * @return
     *     possible object is
     *     {@link Rectification.CPV }
     *     
     */
    public Rectification.CPV getCPV() {
        return cpv;
    }

    /**
     * Définit la valeur de la propriété cpv.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectification.CPV }
     *     
     */
    public void setCPV(Rectification.CPV value) {
        this.cpv = value;
    }

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link Rectification.DATE }
     *     
     */
    public Rectification.DATE getDATE() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link Rectification.DATE }
     *     
     */
    public void setDATE(Rectification.DATE value) {
        this.date = value;
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
     *         &lt;element name="INIT" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="PRINCIPAL" type="{}typeCPVBasePrincipale"/&gt;
     *                     &lt;element name="SUPPLEMENTAIRE" type="{}typeCPVBaseSupplementaire" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="LIRE" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="PRINCIPAL" type="{}typeCPVBasePrincipale"/&gt;
     *                     &lt;element name="SUPPLEMENTAIRE" type="{}typeCPVBaseSupplementaire" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "init",
        "lire"
    })
    public static class CPV {

        @XmlElement(name = "INIT")
        protected Rectification.CPV.INIT init;
        @XmlElement(name = "LIRE")
        protected Rectification.CPV.LIRE lire;

        /**
         * Obtient la valeur de la propriété init.
         * 
         * @return
         *     possible object is
         *     {@link Rectification.CPV.INIT }
         *     
         */
        public Rectification.CPV.INIT getINIT() {
            return init;
        }

        /**
         * Définit la valeur de la propriété init.
         * 
         * @param value
         *     allowed object is
         *     {@link Rectification.CPV.INIT }
         *     
         */
        public void setINIT(Rectification.CPV.INIT value) {
            this.init = value;
        }

        /**
         * Obtient la valeur de la propriété lire.
         * 
         * @return
         *     possible object is
         *     {@link Rectification.CPV.LIRE }
         *     
         */
        public Rectification.CPV.LIRE getLIRE() {
            return lire;
        }

        /**
         * Définit la valeur de la propriété lire.
         * 
         * @param value
         *     allowed object is
         *     {@link Rectification.CPV.LIRE }
         *     
         */
        public void setLIRE(Rectification.CPV.LIRE value) {
            this.lire = value;
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
         *         &lt;sequence&gt;
         *           &lt;element name="PRINCIPAL" type="{}typeCPVBasePrincipale"/&gt;
         *           &lt;element name="SUPPLEMENTAIRE" type="{}typeCPVBaseSupplementaire" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "principal",
            "supplementaire"
        })
        public static class INIT {

            @XmlElement(name = "PRINCIPAL", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String principal;
            @XmlElement(name = "SUPPLEMENTAIRE")
            @XmlSchemaType(name = "token")
            protected List<TypeCPVBaseSupplementaire> supplementaire;

            /**
             * Obtient la valeur de la propriété principal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRINCIPAL() {
                return principal;
            }

            /**
             * Définit la valeur de la propriété principal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRINCIPAL(String value) {
                this.principal = value;
            }

            /**
             * Gets the value of the supplementaire property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the supplementaire property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSUPPLEMENTAIRE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeCPVBaseSupplementaire }
             * 
             * 
             */
            public List<TypeCPVBaseSupplementaire> getSUPPLEMENTAIRE() {
                if (supplementaire == null) {
                    supplementaire = new ArrayList<TypeCPVBaseSupplementaire>();
                }
                return this.supplementaire;
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
         *         &lt;sequence&gt;
         *           &lt;element name="PRINCIPAL" type="{}typeCPVBasePrincipale"/&gt;
         *           &lt;element name="SUPPLEMENTAIRE" type="{}typeCPVBaseSupplementaire" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "principal",
            "supplementaire"
        })
        public static class LIRE {

            @XmlElement(name = "PRINCIPAL", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String principal;
            @XmlElement(name = "SUPPLEMENTAIRE")
            @XmlSchemaType(name = "token")
            protected List<TypeCPVBaseSupplementaire> supplementaire;

            /**
             * Obtient la valeur de la propriété principal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPRINCIPAL() {
                return principal;
            }

            /**
             * Définit la valeur de la propriété principal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPRINCIPAL(String value) {
                this.principal = value;
            }

            /**
             * Gets the value of the supplementaire property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the supplementaire property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSUPPLEMENTAIRE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TypeCPVBaseSupplementaire }
             * 
             * 
             */
            public List<TypeCPVBaseSupplementaire> getSUPPLEMENTAIRE() {
                if (supplementaire == null) {
                    supplementaire = new ArrayList<TypeCPVBaseSupplementaire>();
                }
                return this.supplementaire;
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
     *         &lt;element name="INIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "init",
        "lire"
    })
    public static class DATE {

        @XmlElement(name = "INIT")
        protected Object init;
        @XmlElement(name = "LIRE")
        protected Object lire;

        /**
         * Obtient la valeur de la propriété init.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINIT() {
            return init;
        }

        /**
         * Définit la valeur de la propriété init.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINIT(Object value) {
            this.init = value;
        }

        /**
         * Obtient la valeur de la propriété lire.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLIRE() {
            return lire;
        }

        /**
         * Définit la valeur de la propriété lire.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLIRE(Object value) {
            this.lire = value;
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
     *         &lt;element name="INIT" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="LIRE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "init",
        "lire"
    })
    public static class TEXTE {

        @XmlElement(name = "INIT")
        protected Object init;
        @XmlElement(name = "LIRE")
        protected Object lire;

        /**
         * Obtient la valeur de la propriété init.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getINIT() {
            return init;
        }

        /**
         * Définit la valeur de la propriété init.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setINIT(Object value) {
            this.init = value;
        }

        /**
         * Obtient la valeur de la propriété lire.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLIRE() {
            return lire;
        }

        /**
         * Définit la valeur de la propriété lire.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLIRE(Object value) {
            this.lire = value;
        }

    }

}
