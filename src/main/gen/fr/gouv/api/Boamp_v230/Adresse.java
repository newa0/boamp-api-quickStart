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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Adresse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Adresse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE" type="{}EnumNatureAdresse"/&gt;
 *         &lt;element name="DENOMINATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODE_IDENT_NATIONAL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CORRESPONDANT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTACT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADRESSE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VILLE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PAYS" type="{}EnumCodePays" minOccurs="0"/&gt;
 *         &lt;element name="CODE_NUTS" type="{}typeNUTS" minOccurs="0"/&gt;
 *         &lt;element name="TEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="POSTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MEL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adresse", propOrder = {
    "type",
    "denomination",
    "codeidentnational",
    "correspondant",
    "contact",
    "adresse",
    "cp",
    "ville",
    "pays",
    "codenuts",
    "tel",
    "poste",
    "fax",
    "mel",
    "url"
})
public class Adresse {

    @XmlElement(name = "TYPE", required = true)
    protected EnumNatureAdresse type;
    @XmlElement(name = "DENOMINATION")
    protected String denomination;
    @XmlElement(name = "CODE_IDENT_NATIONAL")
    protected String codeidentnational;
    @XmlElement(name = "CORRESPONDANT")
    protected String correspondant;
    @XmlElement(name = "CONTACT")
    protected String contact;
    @XmlElement(name = "ADRESSE")
    protected String adresse;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "VILLE")
    protected String ville;
    @XmlElement(name = "PAYS")
    @XmlSchemaType(name = "token")
    protected EnumCodePays pays;
    @XmlElement(name = "CODE_NUTS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codenuts;
    @XmlElement(name = "TEL")
    protected String tel;
    @XmlElement(name = "POSTE")
    protected String poste;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "MEL")
    protected String mel;
    @XmlElement(name = "URL")
    protected String url;

    /**
     * Obtient la valeur de la propriété type.
     * 
     * @return
     *     possible object is
     *     {@link EnumNatureAdresse }
     *     
     */
    public EnumNatureAdresse getTYPE() {
        return type;
    }

    /**
     * Définit la valeur de la propriété type.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumNatureAdresse }
     *     
     */
    public void setTYPE(EnumNatureAdresse value) {
        this.type = value;
    }

    /**
     * Obtient la valeur de la propriété denomination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOMINATION() {
        return denomination;
    }

    /**
     * Définit la valeur de la propriété denomination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOMINATION(String value) {
        this.denomination = value;
    }

    /**
     * Obtient la valeur de la propriété codeidentnational.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODEIDENTNATIONAL() {
        return codeidentnational;
    }

    /**
     * Définit la valeur de la propriété codeidentnational.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODEIDENTNATIONAL(String value) {
        this.codeidentnational = value;
    }

    /**
     * Obtient la valeur de la propriété correspondant.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCORRESPONDANT() {
        return correspondant;
    }

    /**
     * Définit la valeur de la propriété correspondant.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCORRESPONDANT(String value) {
        this.correspondant = value;
    }

    /**
     * Obtient la valeur de la propriété contact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCONTACT() {
        return contact;
    }

    /**
     * Définit la valeur de la propriété contact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCONTACT(String value) {
        this.contact = value;
    }

    /**
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRESSE() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRESSE(String value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propriété cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * Définit la valeur de la propriété cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Obtient la valeur de la propriété ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVILLE() {
        return ville;
    }

    /**
     * Définit la valeur de la propriété ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVILLE(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propriété pays.
     * 
     * @return
     *     possible object is
     *     {@link EnumCodePays }
     *     
     */
    public EnumCodePays getPAYS() {
        return pays;
    }

    /**
     * Définit la valeur de la propriété pays.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumCodePays }
     *     
     */
    public void setPAYS(EnumCodePays value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propriété codenuts.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODENUTS() {
        return codenuts;
    }

    /**
     * Définit la valeur de la propriété codenuts.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODENUTS(String value) {
        this.codenuts = value;
    }

    /**
     * Obtient la valeur de la propriété tel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEL() {
        return tel;
    }

    /**
     * Définit la valeur de la propriété tel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEL(String value) {
        this.tel = value;
    }

    /**
     * Obtient la valeur de la propriété poste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSTE() {
        return poste;
    }

    /**
     * Définit la valeur de la propriété poste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSTE(String value) {
        this.poste = value;
    }

    /**
     * Obtient la valeur de la propriété fax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Définit la valeur de la propriété fax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Obtient la valeur de la propriété mel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEL() {
        return mel;
    }

    /**
     * Définit la valeur de la propriété mel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEL(String value) {
        this.mel = value;
    }

    /**
     * Obtient la valeur de la propriété url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Définit la valeur de la propriété url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

}
