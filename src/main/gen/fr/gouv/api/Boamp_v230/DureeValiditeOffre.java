//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour DureeValiditeOffre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DureeValiditeOffre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="JUSQUAU" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="DUREE_MOIS" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *           &lt;element name="DUREE_JOUR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DureeValiditeOffre", propOrder = {
    "jusquau",
    "dureemois",
    "dureejour"
})
public class DureeValiditeOffre {

    @XmlElement(name = "JUSQUAU")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jusquau;
    @XmlElement(name = "DUREE_MOIS")
    protected BigInteger dureemois;
    @XmlElement(name = "DUREE_JOUR")
    protected BigDecimal dureejour;

    /**
     * Obtient la valeur de la propriété jusquau.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJUSQUAU() {
        return jusquau;
    }

    /**
     * Définit la valeur de la propriété jusquau.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJUSQUAU(XMLGregorianCalendar value) {
        this.jusquau = value;
    }

    /**
     * Obtient la valeur de la propriété dureemois.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDUREEMOIS() {
        return dureemois;
    }

    /**
     * Définit la valeur de la propriété dureemois.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDUREEMOIS(BigInteger value) {
        this.dureemois = value;
    }

    /**
     * Obtient la valeur de la propriété dureejour.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDUREEJOUR() {
        return dureejour;
    }

    /**
     * Définit la valeur de la propriété dureejour.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDUREEJOUR(BigDecimal value) {
        this.dureejour = value;
    }

}
