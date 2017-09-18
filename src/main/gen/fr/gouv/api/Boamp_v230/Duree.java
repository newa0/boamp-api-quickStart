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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Duree complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Duree"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="DATE_DEBUT" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *           &lt;element name="DATE_FIN" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="DUREE_INDETERMINEE" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Duree", propOrder = {
    "datedebut",
    "datefin",
    "dureeindeterminee"
})
public class Duree {

    @XmlElement(name = "DATE_DEBUT")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datedebut;
    @XmlElement(name = "DATE_FIN")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datefin;
    @XmlElement(name = "DUREE_INDETERMINEE")
    protected Object dureeindeterminee;

    /**
     * Obtient la valeur de la propriété datedebut.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEDEBUT() {
        return datedebut;
    }

    /**
     * Définit la valeur de la propriété datedebut.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEDEBUT(XMLGregorianCalendar value) {
        this.datedebut = value;
    }

    /**
     * Obtient la valeur de la propriété datefin.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEFIN() {
        return datefin;
    }

    /**
     * Définit la valeur de la propriété datefin.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEFIN(XMLGregorianCalendar value) {
        this.datefin = value;
    }

    /**
     * Obtient la valeur de la propriété dureeindeterminee.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDUREEINDETERMINEE() {
        return dureeindeterminee;
    }

    /**
     * Définit la valeur de la propriété dureeindeterminee.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDUREEINDETERMINEE(Object value) {
        this.dureeindeterminee = value;
    }

}
