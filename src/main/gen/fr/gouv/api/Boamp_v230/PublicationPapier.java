//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour PublicationPapier complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PublicationPapier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TYPE_EDITION"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="A"/&gt;
 *               &lt;enumeration value="B"/&gt;
 *               &lt;enumeration value="C"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NUM_PARUTION" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="NUM_ANNONCE" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DATE_PUBLICATION" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DATE_FIN_DIFFUSION" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicationPapier", propOrder = {
    "typeedition",
    "numparution",
    "numannonce",
    "datepublication",
    "datefindiffusion"
})
public class PublicationPapier {

    @XmlElement(name = "TYPE_EDITION", required = true)
    protected String typeedition;
    @XmlElement(name = "NUM_PARUTION", required = true)
    protected BigInteger numparution;
    @XmlElement(name = "NUM_ANNONCE", required = true)
    protected BigInteger numannonce;
    @XmlElement(name = "DATE_PUBLICATION", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datepublication;
    @XmlElement(name = "DATE_FIN_DIFFUSION")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datefindiffusion;

    /**
     * Obtient la valeur de la propriété typeedition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTYPEEDITION() {
        return typeedition;
    }

    /**
     * Définit la valeur de la propriété typeedition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTYPEEDITION(String value) {
        this.typeedition = value;
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
