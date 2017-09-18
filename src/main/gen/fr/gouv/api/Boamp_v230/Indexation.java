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
 * <p>Classe Java pour Indexation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Indexation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DATE_LIMITE_REPONSE" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="CLASSES" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CLASSE" type="{}CodeLib" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DESCRIPTEURS" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DESCRIPTEUR" type="{}CodeLib" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CRITERES_SOCIAUX_ENV" type="{}EnumCritereSociauxEtEnvironementaux" minOccurs="0"/&gt;
 *         &lt;element name="DEP_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="9" minOccurs="0"/&gt;
 *         &lt;element name="DEP_PRESTATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RESUME_OBJET" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Indexation", propOrder = {
    "datepublication",
    "datelimitereponse",
    "datefindiffusion",
    "classes",
    "descripteurs",
    "criteressociauxenv",
    "deppublication",
    "depprestation",
    "resumeobjet"
})
public class Indexation {

    @XmlElement(name = "DATE_PUBLICATION", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datepublication;
    @XmlElement(name = "DATE_LIMITE_REPONSE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datelimitereponse;
    @XmlElement(name = "DATE_FIN_DIFFUSION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datefindiffusion;
    @XmlElement(name = "CLASSES")
    protected Indexation.CLASSES classes;
    @XmlElement(name = "DESCRIPTEURS")
    protected Indexation.DESCRIPTEURS descripteurs;
    @XmlElement(name = "CRITERES_SOCIAUX_ENV")
    protected EnumCritereSociauxEtEnvironementaux criteressociauxenv;
    @XmlElement(name = "DEP_PUBLICATION")
    protected List<String> deppublication;
    @XmlElement(name = "DEP_PRESTATION")
    protected String depprestation;
    @XmlElement(name = "RESUME_OBJET")
    protected String resumeobjet;

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
     * Obtient la valeur de la propriété datelimitereponse.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATELIMITEREPONSE() {
        return datelimitereponse;
    }

    /**
     * Définit la valeur de la propriété datelimitereponse.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATELIMITEREPONSE(XMLGregorianCalendar value) {
        this.datelimitereponse = value;
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

    /**
     * Obtient la valeur de la propriété classes.
     * 
     * @return
     *     possible object is
     *     {@link Indexation.CLASSES }
     *     
     */
    public Indexation.CLASSES getCLASSES() {
        return classes;
    }

    /**
     * Définit la valeur de la propriété classes.
     * 
     * @param value
     *     allowed object is
     *     {@link Indexation.CLASSES }
     *     
     */
    public void setCLASSES(Indexation.CLASSES value) {
        this.classes = value;
    }

    /**
     * Obtient la valeur de la propriété descripteurs.
     * 
     * @return
     *     possible object is
     *     {@link Indexation.DESCRIPTEURS }
     *     
     */
    public Indexation.DESCRIPTEURS getDESCRIPTEURS() {
        return descripteurs;
    }

    /**
     * Définit la valeur de la propriété descripteurs.
     * 
     * @param value
     *     allowed object is
     *     {@link Indexation.DESCRIPTEURS }
     *     
     */
    public void setDESCRIPTEURS(Indexation.DESCRIPTEURS value) {
        this.descripteurs = value;
    }

    /**
     * Obtient la valeur de la propriété criteressociauxenv.
     * 
     * @return
     *     possible object is
     *     {@link EnumCritereSociauxEtEnvironementaux }
     *     
     */
    public EnumCritereSociauxEtEnvironementaux getCRITERESSOCIAUXENV() {
        return criteressociauxenv;
    }

    /**
     * Définit la valeur de la propriété criteressociauxenv.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCritereSociauxEtEnvironementaux }
     *     
     */
    public void setCRITERESSOCIAUXENV(EnumCritereSociauxEtEnvironementaux value) {
        this.criteressociauxenv = value;
    }

    /**
     * Gets the value of the deppublication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deppublication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEPPUBLICATION().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDEPPUBLICATION() {
        if (deppublication == null) {
            deppublication = new ArrayList<String>();
        }
        return this.deppublication;
    }

    /**
     * Obtient la valeur de la propriété depprestation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPPRESTATION() {
        return depprestation;
    }

    /**
     * Définit la valeur de la propriété depprestation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPPRESTATION(String value) {
        this.depprestation = value;
    }

    /**
     * Obtient la valeur de la propriété resumeobjet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRESUMEOBJET() {
        return resumeobjet;
    }

    /**
     * Définit la valeur de la propriété resumeobjet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRESUMEOBJET(String value) {
        this.resumeobjet = value;
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
     *         &lt;element name="CLASSE" type="{}CodeLib" maxOccurs="unbounded"/&gt;
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
        "classe"
    })
    public static class CLASSES {

        @XmlElement(name = "CLASSE", required = true)
        protected List<CodeLib> classe;

        /**
         * Gets the value of the classe property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classe property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCLASSE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeLib }
         * 
         * 
         */
        public List<CodeLib> getCLASSE() {
            if (classe == null) {
                classe = new ArrayList<CodeLib>();
            }
            return this.classe;
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
     *         &lt;element name="DESCRIPTEUR" type="{}CodeLib" maxOccurs="unbounded"/&gt;
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
        "descripteur"
    })
    public static class DESCRIPTEURS {

        @XmlElement(name = "DESCRIPTEUR", required = true)
        protected List<CodeLib> descripteur;

        /**
         * Gets the value of the descripteur property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descripteur property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDESCRIPTEUR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeLib }
         * 
         * 
         */
        public List<CodeLib> getDESCRIPTEUR() {
            if (descripteur == null) {
                descripteur = new ArrayList<CodeLib>();
            }
            return this.descripteur;
        }

    }

}
