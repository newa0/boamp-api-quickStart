//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Classe Java pour CritereAttribution complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CritereAttribution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CRITERES_CCTP" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CRITERES_PRIX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="CRITERES_PRIORITES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CRITERE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="ORDRE" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRITERES_PONDERES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CRITERE" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="POIDS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRITERES_LIBRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CritereAttribution", propOrder = {
    "criterescctp",
    "criteresprix",
    "criterespriorites",
    "criteresponderes",
    "critereslibre"
})
public class CritereAttribution {

    @XmlElement(name = "CRITERES_CCTP")
    protected Object criterescctp;
    @XmlElement(name = "CRITERES_PRIX")
    protected Object criteresprix;
    @XmlElement(name = "CRITERES_PRIORITES")
    protected CritereAttribution.CRITERESPRIORITES criterespriorites;
    @XmlElement(name = "CRITERES_PONDERES")
    protected CritereAttribution.CRITERESPONDERES criteresponderes;
    @XmlElement(name = "CRITERES_LIBRE")
    protected String critereslibre;

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
     * Obtient la valeur de la propriété criteresprix.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCRITERESPRIX() {
        return criteresprix;
    }

    /**
     * Définit la valeur de la propriété criteresprix.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCRITERESPRIX(Object value) {
        this.criteresprix = value;
    }

    /**
     * Obtient la valeur de la propriété criterespriorites.
     * 
     * @return
     *     possible object is
     *     {@link CritereAttribution.CRITERESPRIORITES }
     *     
     */
    public CritereAttribution.CRITERESPRIORITES getCRITERESPRIORITES() {
        return criterespriorites;
    }

    /**
     * Définit la valeur de la propriété criterespriorites.
     * 
     * @param value
     *     allowed object is
     *     {@link CritereAttribution.CRITERESPRIORITES }
     *     
     */
    public void setCRITERESPRIORITES(CritereAttribution.CRITERESPRIORITES value) {
        this.criterespriorites = value;
    }

    /**
     * Obtient la valeur de la propriété criteresponderes.
     * 
     * @return
     *     possible object is
     *     {@link CritereAttribution.CRITERESPONDERES }
     *     
     */
    public CritereAttribution.CRITERESPONDERES getCRITERESPONDERES() {
        return criteresponderes;
    }

    /**
     * Définit la valeur de la propriété criteresponderes.
     * 
     * @param value
     *     allowed object is
     *     {@link CritereAttribution.CRITERESPONDERES }
     *     
     */
    public void setCRITERESPONDERES(CritereAttribution.CRITERESPONDERES value) {
        this.criteresponderes = value;
    }

    /**
     * Obtient la valeur de la propriété critereslibre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRITERESLIBRE() {
        return critereslibre;
    }

    /**
     * Définit la valeur de la propriété critereslibre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRITERESLIBRE(String value) {
        this.critereslibre = value;
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
     *                 &lt;attribute name="POIDS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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
    public static class CRITERESPONDERES {

        @XmlElement(name = "CRITERE", required = true)
        protected List<CritereAttribution.CRITERESPONDERES.CRITERE> critere;

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
         * {@link CritereAttribution.CRITERESPONDERES.CRITERE }
         * 
         * 
         */
        public List<CritereAttribution.CRITERESPONDERES.CRITERE> getCRITERE() {
            if (critere == null) {
                critere = new ArrayList<CritereAttribution.CRITERESPONDERES.CRITERE>();
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
         *       &lt;attribute name="POIDS" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
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
            protected BigDecimal poids;

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
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPOIDS() {
                return poids;
            }

            /**
             * Définit la valeur de la propriété poids.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPOIDS(BigDecimal value) {
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
     *         &lt;element name="CRITERE" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="ORDRE" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
    public static class CRITERESPRIORITES {

        @XmlElement(name = "CRITERE", required = true)
        protected List<CritereAttribution.CRITERESPRIORITES.CRITERE> critere;

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
         * {@link CritereAttribution.CRITERESPRIORITES.CRITERE }
         * 
         * 
         */
        public List<CritereAttribution.CRITERESPRIORITES.CRITERE> getCRITERE() {
            if (critere == null) {
                critere = new ArrayList<CritereAttribution.CRITERESPRIORITES.CRITERE>();
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
         *       &lt;attribute name="ORDRE" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
            @XmlAttribute(name = "ORDRE", required = true)
            protected BigInteger ordre;

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
             * Obtient la valeur de la propriété ordre.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getORDRE() {
                return ordre;
            }

            /**
             * Définit la valeur de la propriété ordre.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setORDRE(BigInteger value) {
                this.ordre = value;
            }

        }

    }

}
