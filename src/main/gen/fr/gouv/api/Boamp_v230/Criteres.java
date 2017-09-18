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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour Criteres complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Criteres"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CRITERES_CCTP" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="CRITERES_QUALITE" minOccurs="0"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="CRITERE" maxOccurs="unbounded"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                             &lt;attribute name="POIDS" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;choice minOccurs="0"&gt;
 *             &lt;element name="CRITERES_COUT"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="CRITERE" maxOccurs="unbounded"&gt;
 *                         &lt;complexType&gt;
 *                           &lt;simpleContent&gt;
 *                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                               &lt;attribute name="POIDS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                             &lt;/extension&gt;
 *                           &lt;/simpleContent&gt;
 *                         &lt;/complexType&gt;
 *                       &lt;/element&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="CRITERES_PRIX"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="POIDS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criteres", propOrder = {
    "criterescctp",
    "criteresqualite",
    "criterescout",
    "criteresprix"
})
public class Criteres {

    @XmlElement(name = "CRITERES_CCTP")
    protected Object criterescctp;
    @XmlElement(name = "CRITERES_QUALITE")
    protected Criteres.CRITERESQUALITE criteresqualite;
    @XmlElement(name = "CRITERES_COUT")
    protected Criteres.CRITERESCOUT criterescout;
    @XmlElement(name = "CRITERES_PRIX")
    protected Criteres.CRITERESPRIX criteresprix;

    /**
     * Obtient la valeur de la propriété criterescctp.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCRITERESCCTP() {
        return criterescctp;
    }

    /**
     * Définit la valeur de la propriété criterescctp.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCRITERESCCTP(Object value) {
        this.criterescctp = value;
    }

    /**
     * Obtient la valeur de la propriété criteresqualite.
     * 
     * @return
     *     possible object is
     *     {@link Criteres.CRITERESQUALITE }
     *     
     */
    public Criteres.CRITERESQUALITE getCRITERESQUALITE() {
        return criteresqualite;
    }

    /**
     * Définit la valeur de la propriété criteresqualite.
     * 
     * @param value
     *     allowed object is
     *     {@link Criteres.CRITERESQUALITE }
     *     
     */
    public void setCRITERESQUALITE(Criteres.CRITERESQUALITE value) {
        this.criteresqualite = value;
    }

    /**
     * Obtient la valeur de la propriété criterescout.
     * 
     * @return
     *     possible object is
     *     {@link Criteres.CRITERESCOUT }
     *     
     */
    public Criteres.CRITERESCOUT getCRITERESCOUT() {
        return criterescout;
    }

    /**
     * Définit la valeur de la propriété criterescout.
     * 
     * @param value
     *     allowed object is
     *     {@link Criteres.CRITERESCOUT }
     *     
     */
    public void setCRITERESCOUT(Criteres.CRITERESCOUT value) {
        this.criterescout = value;
    }

    /**
     * Obtient la valeur de la propriété criteresprix.
     * 
     * @return
     *     possible object is
     *     {@link Criteres.CRITERESPRIX }
     *     
     */
    public Criteres.CRITERESPRIX getCRITERESPRIX() {
        return criteresprix;
    }

    /**
     * Définit la valeur de la propriété criteresprix.
     * 
     * @param value
     *     allowed object is
     *     {@link Criteres.CRITERESPRIX }
     *     
     */
    public void setCRITERESPRIX(Criteres.CRITERESPRIX value) {
        this.criteresprix = value;
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
     *         &lt;element name="CRITERE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="POIDS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "critere"
    })
    public static class CRITERESCOUT {

        @XmlElement(name = "CRITERE", required = true)
        protected List<Criteres.CRITERESCOUT.CRITERE> critere;

        /**
         * Gets the value of the critere property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the critere property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCRITERE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Criteres.CRITERESCOUT.CRITERE }
         * 
         * 
         */
        public List<Criteres.CRITERESCOUT.CRITERE> getCRITERE() {
            if (critere == null) {
                critere = new ArrayList<Criteres.CRITERESCOUT.CRITERE>();
            }
            return this.critere;
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
         *       &lt;attribute name="POIDS" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class CRITERE {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "POIDS")
            protected String poids;

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
             * Obtient la valeur de la propriété poids.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOIDS() {
                return poids;
            }

            /**
             * Définit la valeur de la propriété poids.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOIDS(String value) {
                this.poids = value;
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
     *         &lt;element name="POIDS" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "poids"
    })
    public static class CRITERESPRIX {

        @XmlElement(name = "POIDS")
        protected List<String> poids;

        /**
         * Gets the value of the poids property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the poids property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPOIDS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPOIDS() {
            if (poids == null) {
                poids = new ArrayList<String>();
            }
            return this.poids;
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
     *         &lt;element name="CRITERE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="POIDS" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "critere"
    })
    public static class CRITERESQUALITE {

        @XmlElement(name = "CRITERE", required = true)
        protected List<Criteres.CRITERESQUALITE.CRITERE> critere;

        /**
         * Gets the value of the critere property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the critere property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCRITERE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Criteres.CRITERESQUALITE.CRITERE }
         * 
         * 
         */
        public List<Criteres.CRITERESQUALITE.CRITERE> getCRITERE() {
            if (critere == null) {
                critere = new ArrayList<Criteres.CRITERESQUALITE.CRITERE>();
            }
            return this.critere;
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
         *       &lt;attribute name="POIDS" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class CRITERE {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "POIDS", required = true)
            protected String poids;

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
             * Obtient la valeur de la propriété poids.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPOIDS() {
                return poids;
            }

            /**
             * Définit la valeur de la propriété poids.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPOIDS(String value) {
                this.poids = value;
            }

        }

    }

}
