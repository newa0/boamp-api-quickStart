//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.09.18 � 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Gestion complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Gestion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NOJO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RAPPEL" type="{}Rappel" minOccurs="0"/&gt;
 *         &lt;element name="R2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="R3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TETIER_R3" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="R4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TETIER_R4" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="K1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DOUBLON" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="K9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NUM_ANN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NOM_HTML" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gestion", propOrder = {
    "nojo",
    "rappel",
    "r2",
    "r3",
    "tetierr3",
    "r4",
    "tetierr4",
    "k1",
    "doublon",
    "k9",
    "numann",
    "nomhtml"
})
public class Gestion {

    @XmlElement(name = "NOJO", required = true)
    protected String nojo;
    @XmlElement(name = "RAPPEL")
    protected Rappel rappel;
    @XmlElement(name = "R2", required = true)
    protected String r2;
    @XmlElement(name = "R3", required = true)
    protected String r3;
    @XmlElement(name = "TETIER_R3", required = true)
    protected String tetierr3;
    @XmlElement(name = "R4", required = true)
    protected String r4;
    @XmlElement(name = "TETIER_R4", required = true)
    protected String tetierr4;
    @XmlElement(name = "K1")
    protected String k1;
    @XmlElement(name = "DOUBLON")
    protected String doublon;
    @XmlElement(name = "K9")
    protected String k9;
    @XmlElement(name = "NUM_ANN", required = true)
    protected String numann;
    @XmlElement(name = "NOM_HTML", required = true)
    protected String nomhtml;

    /**
     * Obtient la valeur de la propri�t� nojo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOJO() {
        return nojo;
    }

    /**
     * D�finit la valeur de la propri�t� nojo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOJO(String value) {
        this.nojo = value;
    }

    /**
     * Obtient la valeur de la propri�t� rappel.
     * 
     * @return
     *     possible object is
     *     {@link Rappel }
     *     
     */
    public Rappel getRAPPEL() {
        return rappel;
    }

    /**
     * D�finit la valeur de la propri�t� rappel.
     * 
     * @param value
     *     allowed object is
     *     {@link Rappel }
     *     
     */
    public void setRAPPEL(Rappel value) {
        this.rappel = value;
    }

    /**
     * Obtient la valeur de la propri�t� r2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR2() {
        return r2;
    }

    /**
     * D�finit la valeur de la propri�t� r2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR2(String value) {
        this.r2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� r3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR3() {
        return r3;
    }

    /**
     * D�finit la valeur de la propri�t� r3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR3(String value) {
        this.r3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� tetierr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETIERR3() {
        return tetierr3;
    }

    /**
     * D�finit la valeur de la propri�t� tetierr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETIERR3(String value) {
        this.tetierr3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� r4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getR4() {
        return r4;
    }

    /**
     * D�finit la valeur de la propri�t� r4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setR4(String value) {
        this.r4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� tetierr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTETIERR4() {
        return tetierr4;
    }

    /**
     * D�finit la valeur de la propri�t� tetierr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTETIERR4(String value) {
        this.tetierr4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� k1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getK1() {
        return k1;
    }

    /**
     * D�finit la valeur de la propri�t� k1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setK1(String value) {
        this.k1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� doublon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOUBLON() {
        return doublon;
    }

    /**
     * D�finit la valeur de la propri�t� doublon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOUBLON(String value) {
        this.doublon = value;
    }

    /**
     * Obtient la valeur de la propri�t� k9.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getK9() {
        return k9;
    }

    /**
     * D�finit la valeur de la propri�t� k9.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setK9(String value) {
        this.k9 = value;
    }

    /**
     * Obtient la valeur de la propri�t� numann.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMANN() {
        return numann;
    }

    /**
     * D�finit la valeur de la propri�t� numann.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMANN(String value) {
        this.numann = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomhtml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMHTML() {
        return nomhtml;
    }

    /**
     * D�finit la valeur de la propri�t� nomhtml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMHTML(String value) {
        this.nomhtml = value;
    }

}
