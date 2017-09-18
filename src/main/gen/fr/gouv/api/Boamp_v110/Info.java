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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Info complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Info"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="TRAVAUX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FOURNITURES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SERVICES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ETAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REGION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEPARTEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COMMUNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EPT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRE_ORIGINE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="INSTITUTION_EUROPEENNE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REFERENCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PUBLICATIONS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="PUBLICATION"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence maxOccurs="unbounded"&gt;
 *                             &lt;element name="PARUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EDITION" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ANNONCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="REF_JOUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECTIFICATIF" type="{}Rectificatif" minOccurs="0"/&gt;
 *         &lt;element name="CRITERES_D_ATTRIBUTION" type="{}CritereAttribution" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Info", propOrder = {
    "travauxAndFOURNITURESAndSERVICES"
})
public class Info {

    @XmlElementRefs({
        @XmlElementRef(name = "CRITERES_D_ATTRIBUTION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EPT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RECTIFICATIF", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PUBLICATIONS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "INSTITUTION_EUROPEENNE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "COMMUNE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FOURNITURES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "REGION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EPN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "REFERENCE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ETAT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TRAVAUX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SERVICES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRE_ORIGINE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DEPARTEMENT", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> travauxAndFOURNITURESAndSERVICES;

    /**
     * Gets the value of the travauxAndFOURNITURESAndSERVICES property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travauxAndFOURNITURESAndSERVICES property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTRAVAUXAndFOURNITURESAndSERVICES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link CritereAttribution }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Rectificatif }{@code >}
     * {@link JAXBElement }{@code <}{@link Info.PUBLICATIONS }{@code >}
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
    public List<JAXBElement<?>> getTRAVAUXAndFOURNITURESAndSERVICES() {
        if (travauxAndFOURNITURESAndSERVICES == null) {
            travauxAndFOURNITURESAndSERVICES = new ArrayList<JAXBElement<?>>();
        }
        return this.travauxAndFOURNITURESAndSERVICES;
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
     *         &lt;element name="PUBLICATION"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence maxOccurs="unbounded"&gt;
     *                   &lt;element name="PARUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EDITION" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ANNONCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="REF_JOUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "publication"
    })
    public static class PUBLICATIONS {

        @XmlElement(name = "PUBLICATION", required = true)
        protected List<Info.PUBLICATIONS.PUBLICATION> publication;

        /**
         * Gets the value of the publication property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the publication property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPUBLICATION().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Info.PUBLICATIONS.PUBLICATION }
         * 
         * 
         */
        public List<Info.PUBLICATIONS.PUBLICATION> getPUBLICATION() {
            if (publication == null) {
                publication = new ArrayList<Info.PUBLICATIONS.PUBLICATION>();
            }
            return this.publication;
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
         *         &lt;element name="PARUTION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EDITION" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ANNONCE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DATE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="REF_JOUE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "parutionAndEDITIONAndANNONCE"
        })
        public static class PUBLICATION {

            @XmlElementRefs({
                @XmlElementRef(name = "DATE", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "REF_JOUE", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "EDITION", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "ANNONCE", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "PARUTION", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<?>> parutionAndEDITIONAndANNONCE;

            /**
             * Gets the value of the parutionAndEDITIONAndANNONCE property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the parutionAndEDITIONAndANNONCE property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPARUTIONAndEDITIONAndANNONCE().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link Info.PUBLICATIONS.PUBLICATION.EDITION }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * 
             * 
             */
            public List<JAXBElement<?>> getPARUTIONAndEDITIONAndANNONCE() {
                if (parutionAndEDITIONAndANNONCE == null) {
                    parutionAndEDITIONAndANNONCE = new ArrayList<JAXBElement<?>>();
                }
                return this.parutionAndEDITIONAndANNONCE;
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
             *         &lt;element name="NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "num",
                "type"
            })
            public static class EDITION {

                @XmlElement(name = "NUM", required = true)
                protected String num;
                @XmlElement(name = "TYPE", required = true)
                protected String type;

                /**
                 * Obtient la valeur de la propriété num.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNUM() {
                    return num;
                }

                /**
                 * Définit la valeur de la propriété num.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNUM(String value) {
                    this.num = value;
                }

                /**
                 * Obtient la valeur de la propriété type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTYPE() {
                    return type;
                }

                /**
                 * Définit la valeur de la propriété type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTYPE(String value) {
                    this.type = value;
                }

            }

        }

    }

}
