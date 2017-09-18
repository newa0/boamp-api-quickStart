//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DetailContact complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DetailContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Contact"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="URL_PROFIL_ACHETEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_INFORMATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_PARTICIPATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_DOCUMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL_OUTIL_LOGICIEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="AGIT_POUR_AUTRE_COMPTE_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="AGIT_POUR_AUTRE_COMPTE_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="LOI_COMPTE_AUTRE_PAYS" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="ORGANISME_ACHETEUR_CENTRAL_OUI" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *           &lt;element name="ORGANISME_ACHETEUR_CENTRAL_NON" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailContact", propOrder = {
    "urlprofilacheteur",
    "urlinformation",
    "urlparticipation",
    "urldocument",
    "urloutillogiciel",
    "agitpourautrecompteoui",
    "agitpourautrecomptenon",
    "loicompteautrepays",
    "organismeacheteurcentraloui",
    "organismeacheteurcentralnon"
})
public class DetailContact
    extends Contact
{

    @XmlElement(name = "URL_PROFIL_ACHETEUR")
    protected String urlprofilacheteur;
    @XmlElement(name = "URL_INFORMATION")
    protected String urlinformation;
    @XmlElement(name = "URL_PARTICIPATION")
    protected String urlparticipation;
    @XmlElement(name = "URL_DOCUMENT")
    protected String urldocument;
    @XmlElement(name = "URL_OUTIL_LOGICIEL")
    protected String urloutillogiciel;
    @XmlElement(name = "AGIT_POUR_AUTRE_COMPTE_OUI")
    protected Object agitpourautrecompteoui;
    @XmlElement(name = "AGIT_POUR_AUTRE_COMPTE_NON")
    protected Object agitpourautrecomptenon;
    @XmlElement(name = "LOI_COMPTE_AUTRE_PAYS")
    protected Object loicompteautrepays;
    @XmlElement(name = "ORGANISME_ACHETEUR_CENTRAL_OUI")
    protected Object organismeacheteurcentraloui;
    @XmlElement(name = "ORGANISME_ACHETEUR_CENTRAL_NON")
    protected Object organismeacheteurcentralnon;

    /**
     * Obtient la valeur de la propriété urlprofilacheteur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPROFILACHETEUR() {
        return urlprofilacheteur;
    }

    /**
     * Définit la valeur de la propriété urlprofilacheteur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPROFILACHETEUR(String value) {
        this.urlprofilacheteur = value;
    }

    /**
     * Obtient la valeur de la propriété urlinformation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLINFORMATION() {
        return urlinformation;
    }

    /**
     * Définit la valeur de la propriété urlinformation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLINFORMATION(String value) {
        this.urlinformation = value;
    }

    /**
     * Obtient la valeur de la propriété urlparticipation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPARTICIPATION() {
        return urlparticipation;
    }

    /**
     * Définit la valeur de la propriété urlparticipation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPARTICIPATION(String value) {
        this.urlparticipation = value;
    }

    /**
     * Obtient la valeur de la propriété urldocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLDOCUMENT() {
        return urldocument;
    }

    /**
     * Définit la valeur de la propriété urldocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLDOCUMENT(String value) {
        this.urldocument = value;
    }

    /**
     * Obtient la valeur de la propriété urloutillogiciel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLOUTILLOGICIEL() {
        return urloutillogiciel;
    }

    /**
     * Définit la valeur de la propriété urloutillogiciel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLOUTILLOGICIEL(String value) {
        this.urloutillogiciel = value;
    }

    /**
     * Obtient la valeur de la propriété agitpourautrecompteoui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAGITPOURAUTRECOMPTEOUI() {
        return agitpourautrecompteoui;
    }

    /**
     * Définit la valeur de la propriété agitpourautrecompteoui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAGITPOURAUTRECOMPTEOUI(Object value) {
        this.agitpourautrecompteoui = value;
    }

    /**
     * Obtient la valeur de la propriété agitpourautrecomptenon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAGITPOURAUTRECOMPTENON() {
        return agitpourautrecomptenon;
    }

    /**
     * Définit la valeur de la propriété agitpourautrecomptenon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAGITPOURAUTRECOMPTENON(Object value) {
        this.agitpourautrecomptenon = value;
    }

    /**
     * Obtient la valeur de la propriété loicompteautrepays.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLOICOMPTEAUTREPAYS() {
        return loicompteautrepays;
    }

    /**
     * Définit la valeur de la propriété loicompteautrepays.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLOICOMPTEAUTREPAYS(Object value) {
        this.loicompteautrepays = value;
    }

    /**
     * Obtient la valeur de la propriété organismeacheteurcentraloui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getORGANISMEACHETEURCENTRALOUI() {
        return organismeacheteurcentraloui;
    }

    /**
     * Définit la valeur de la propriété organismeacheteurcentraloui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setORGANISMEACHETEURCENTRALOUI(Object value) {
        this.organismeacheteurcentraloui = value;
    }

    /**
     * Obtient la valeur de la propriété organismeacheteurcentralnon.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getORGANISMEACHETEURCENTRALNON() {
        return organismeacheteurcentralnon;
    }

    /**
     * Définit la valeur de la propriété organismeacheteurcentralnon.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setORGANISMEACHETEURCENTRALNON(Object value) {
        this.organismeacheteurcentralnon = value;
    }

}
