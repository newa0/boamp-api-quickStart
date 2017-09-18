//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Gestion complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
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
     * Obtient la valeur de la propriété nojo.
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
     * Définit la valeur de la propriété nojo.
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
     * Obtient la valeur de la propriété rappel.
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
     * Définit la valeur de la propriété rappel.
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
     * Obtient la valeur de la propriété r2.
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
     * Définit la valeur de la propriété r2.
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
     * Obtient la valeur de la propriété r3.
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
     * Définit la valeur de la propriété r3.
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
     * Obtient la valeur de la propriété tetierr3.
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
     * Définit la valeur de la propriété tetierr3.
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
     * Obtient la valeur de la propriété r4.
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
     * Définit la valeur de la propriété r4.
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
     * Obtient la valeur de la propriété tetierr4.
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
     * Définit la valeur de la propriété tetierr4.
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
     * Obtient la valeur de la propriété k1.
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
     * Définit la valeur de la propriété k1.
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
     * Obtient la valeur de la propriété doublon.
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
     * Définit la valeur de la propriété doublon.
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
     * Obtient la valeur de la propriété k9.
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
     * Définit la valeur de la propriété k9.
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
     * Obtient la valeur de la propriété numann.
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
     * Définit la valeur de la propriété numann.
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
     * Obtient la valeur de la propriété nomhtml.
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
     * Définit la valeur de la propriété nomhtml.
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
