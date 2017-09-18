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
 * <p>Classe Java pour ReferencePublication complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReferencePublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PUBLICATION_PAPIER" type="{}PublicationPapier" maxOccurs="2"/&gt;
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
@XmlType(name = "ReferencePublication", propOrder = {
    "publicationpapier",
    "publicationelectronique",
    "publicationjoue"
})
public class ReferencePublication {

    @XmlElement(name = "PUBLICATION_PAPIER")
    protected List<PublicationPapier> publicationpapier;
    @XmlElement(name = "PUBLICATION_ELECTRONIQUE")
    protected ReferencePublication.PUBLICATIONELECTRONIQUE publicationelectronique;
    @XmlElement(name = "PUBLICATION_JOUE")
    protected ReferencePublication.PUBLICATIONJOUE publicationjoue;

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
     * {@link PublicationPapier }
     * 
     * 
     */
    public List<PublicationPapier> getPUBLICATIONPAPIER() {
        if (publicationpapier == null) {
            publicationpapier = new ArrayList<PublicationPapier>();
        }
        return this.publicationpapier;
    }

    /**
     * Obtient la valeur de la propriété publicationelectronique.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePublication.PUBLICATIONELECTRONIQUE }
     *     
     */
    public ReferencePublication.PUBLICATIONELECTRONIQUE getPUBLICATIONELECTRONIQUE() {
        return publicationelectronique;
    }

    /**
     * Définit la valeur de la propriété publicationelectronique.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePublication.PUBLICATIONELECTRONIQUE }
     *     
     */
    public void setPUBLICATIONELECTRONIQUE(ReferencePublication.PUBLICATIONELECTRONIQUE value) {
        this.publicationelectronique = value;
    }

    /**
     * Obtient la valeur de la propriété publicationjoue.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePublication.PUBLICATIONJOUE }
     *     
     */
    public ReferencePublication.PUBLICATIONJOUE getPUBLICATIONJOUE() {
        return publicationjoue;
    }

    /**
     * Définit la valeur de la propriété publicationjoue.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePublication.PUBLICATIONJOUE }
     *     
     */
    public void setPUBLICATIONJOUE(ReferencePublication.PUBLICATIONJOUE value) {
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
        "annee",
        "numparution",
        "numannonce",
        "datepublication"
    })
    public static class PUBLICATIONJOUE {

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

    }

}
