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
 * <p>Classe Java pour Caracteristiques complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Caracteristiques"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRINCIPALES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QUANTITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR_TOTALE" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR_MIN" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;element name="VALEUR_MAX" type="{}Valeur" minOccurs="0"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="TITRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="TABLE"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence maxOccurs="unbounded"&gt;
 *                     &lt;element name="TR"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence maxOccurs="unbounded"&gt;
 *                               &lt;element name="TD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="OPTIONS" type="{}Option" minOccurs="0"/&gt;
 *         &lt;element name="RECONDUCTIONS" type="{}Reconduction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Caracteristiques", propOrder = {
    "principales",
    "quantite",
    "valeurtotale",
    "valeur",
    "valeurmin",
    "valeurmax",
    "titre",
    "table",
    "options",
    "reconductions"
})
public class Caracteristiques {

    @XmlElement(name = "PRINCIPALES")
    protected String principales;
    @XmlElement(name = "QUANTITE")
    protected String quantite;
    @XmlElement(name = "VALEUR_TOTALE")
    protected Valeur valeurtotale;
    @XmlElement(name = "VALEUR")
    protected Valeur valeur;
    @XmlElement(name = "VALEUR_MIN")
    protected Valeur valeurmin;
    @XmlElement(name = "VALEUR_MAX")
    protected Valeur valeurmax;
    @XmlElement(name = "TITRE")
    protected String titre;
    @XmlElement(name = "TABLE")
    protected Caracteristiques.TABLE table;
    @XmlElement(name = "OPTIONS")
    protected Option options;
    @XmlElement(name = "RECONDUCTIONS")
    protected Reconduction reconductions;

    /**
     * Obtient la valeur de la propriété principales.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINCIPALES() {
        return principales;
    }

    /**
     * Définit la valeur de la propriété principales.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINCIPALES(String value) {
        this.principales = value;
    }

    /**
     * Obtient la valeur de la propriété quantite.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQUANTITE() {
        return quantite;
    }

    /**
     * Définit la valeur de la propriété quantite.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQUANTITE(String value) {
        this.quantite = value;
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
     * Obtient la valeur de la propriété valeur.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEUR() {
        return valeur;
    }

    /**
     * Définit la valeur de la propriété valeur.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEUR(Valeur value) {
        this.valeur = value;
    }

    /**
     * Obtient la valeur de la propriété valeurmin.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEURMIN() {
        return valeurmin;
    }

    /**
     * Définit la valeur de la propriété valeurmin.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEURMIN(Valeur value) {
        this.valeurmin = value;
    }

    /**
     * Obtient la valeur de la propriété valeurmax.
     * 
     * @return
     *     possible object is
     *     {@link Valeur }
     *     
     */
    public Valeur getVALEURMAX() {
        return valeurmax;
    }

    /**
     * Définit la valeur de la propriété valeurmax.
     * 
     * @param value
     *     allowed object is
     *     {@link Valeur }
     *     
     */
    public void setVALEURMAX(Valeur value) {
        this.valeurmax = value;
    }

    /**
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITRE() {
        return titre;
    }

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITRE(String value) {
        this.titre = value;
    }

    /**
     * Obtient la valeur de la propriété table.
     * 
     * @return
     *     possible object is
     *     {@link Caracteristiques.TABLE }
     *     
     */
    public Caracteristiques.TABLE getTABLE() {
        return table;
    }

    /**
     * Définit la valeur de la propriété table.
     * 
     * @param value
     *     allowed object is
     *     {@link Caracteristiques.TABLE }
     *     
     */
    public void setTABLE(Caracteristiques.TABLE value) {
        this.table = value;
    }

    /**
     * Obtient la valeur de la propriété options.
     * 
     * @return
     *     possible object is
     *     {@link Option }
     *     
     */
    public Option getOPTIONS() {
        return options;
    }

    /**
     * Définit la valeur de la propriété options.
     * 
     * @param value
     *     allowed object is
     *     {@link Option }
     *     
     */
    public void setOPTIONS(Option value) {
        this.options = value;
    }

    /**
     * Obtient la valeur de la propriété reconductions.
     * 
     * @return
     *     possible object is
     *     {@link Reconduction }
     *     
     */
    public Reconduction getRECONDUCTIONS() {
        return reconductions;
    }

    /**
     * Définit la valeur de la propriété reconductions.
     * 
     * @param value
     *     allowed object is
     *     {@link Reconduction }
     *     
     */
    public void setRECONDUCTIONS(Reconduction value) {
        this.reconductions = value;
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
     *         &lt;element name="TR"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence maxOccurs="unbounded"&gt;
     *                   &lt;element name="TD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "tr"
    })
    public static class TABLE {

        @XmlElement(name = "TR", required = true)
        protected List<Caracteristiques.TABLE.TR> tr;

        /**
         * Gets the value of the tr property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tr property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Caracteristiques.TABLE.TR }
         * 
         * 
         */
        public List<Caracteristiques.TABLE.TR> getTR() {
            if (tr == null) {
                tr = new ArrayList<Caracteristiques.TABLE.TR>();
            }
            return this.tr;
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
         *         &lt;element name="TD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "td"
        })
        public static class TR {

            @XmlElement(name = "TD", required = true)
            protected List<String> td;

            /**
             * Gets the value of the td property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the td property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTD().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTD() {
                if (td == null) {
                    td = new ArrayList<String>();
                }
                return this.td;
            }

        }

    }

}
