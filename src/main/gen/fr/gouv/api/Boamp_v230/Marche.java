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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Marche complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Marche"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_MARCHE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ID_CONSULTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_CONSULTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ANNONCE_ANTERIEUR" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="REFERENCE"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{}Reference"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DATE_ENVOI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="REFERENCE_PUBLICATION" type="{}ReferencePublication" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Marche", propOrder = {
    "idmarche",
    "idconsultation",
    "urlconsultation",
    "annonceanterieur"
})
public class Marche {

    @XmlElement(name = "ID_MARCHE")
    protected String idmarche;
    @XmlElement(name = "ID_CONSULTATION")
    protected String idconsultation;
    @XmlElement(name = "URL_CONSULTATION")
    protected String urlconsultation;
    @XmlElement(name = "ANNONCE_ANTERIEUR")
    protected List<Marche.ANNONCEANTERIEUR> annonceanterieur;

    /**
     * Obtient la valeur de la propriété idmarche.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDMARCHE() {
        return idmarche;
    }

    /**
     * Définit la valeur de la propriété idmarche.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDMARCHE(String value) {
        this.idmarche = value;
    }

    /**
     * Obtient la valeur de la propriété idconsultation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDCONSULTATION() {
        return idconsultation;
    }

    /**
     * Définit la valeur de la propriété idconsultation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDCONSULTATION(String value) {
        this.idconsultation = value;
    }

    /**
     * Obtient la valeur de la propriété urlconsultation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLCONSULTATION() {
        return urlconsultation;
    }

    /**
     * Définit la valeur de la propriété urlconsultation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLCONSULTATION(String value) {
        this.urlconsultation = value;
    }

    /**
     * Gets the value of the annonceanterieur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annonceanterieur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANNONCEANTERIEUR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Marche.ANNONCEANTERIEUR }
     * 
     * 
     */
    public List<Marche.ANNONCEANTERIEUR> getANNONCEANTERIEUR() {
        if (annonceanterieur == null) {
            annonceanterieur = new ArrayList<Marche.ANNONCEANTERIEUR>();
        }
        return this.annonceanterieur;
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
     *         &lt;element name="REFERENCE"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{}Reference"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DATE_ENVOI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="REFERENCE_PUBLICATION" type="{}ReferencePublication" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "reference",
        "referencepublication"
    })
    public static class ANNONCEANTERIEUR {

        @XmlElement(name = "REFERENCE", required = true)
        protected Marche.ANNONCEANTERIEUR.REFERENCE reference;
        @XmlElement(name = "REFERENCE_PUBLICATION")
        protected List<ReferencePublication> referencepublication;

        /**
         * Obtient la valeur de la propriété reference.
         * 
         * @return
         *     possible object is
         *     {@link Marche.ANNONCEANTERIEUR.REFERENCE }
         *     
         */
        public Marche.ANNONCEANTERIEUR.REFERENCE getREFERENCE() {
            return reference;
        }

        /**
         * Définit la valeur de la propriété reference.
         * 
         * @param value
         *     allowed object is
         *     {@link Marche.ANNONCEANTERIEUR.REFERENCE }
         *     
         */
        public void setREFERENCE(Marche.ANNONCEANTERIEUR.REFERENCE value) {
            this.reference = value;
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
         * {@link ReferencePublication }
         * 
         * 
         */
        public List<ReferencePublication> getREFERENCEPUBLICATION() {
            if (referencepublication == null) {
                referencepublication = new ArrayList<ReferencePublication>();
            }
            return this.referencepublication;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{}Reference"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DATE_ENVOI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dateenvoi"
        })
        public static class REFERENCE
            extends Reference
        {

            @XmlElement(name = "DATE_ENVOI")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dateenvoi;

            /**
             * Obtient la valeur de la propriété dateenvoi.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDATEENVOI() {
                return dateenvoi;
            }

            /**
             * Définit la valeur de la propriété dateenvoi.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDATEENVOI(XMLGregorianCalendar value) {
                this.dateenvoi = value;
            }

        }

    }

}
