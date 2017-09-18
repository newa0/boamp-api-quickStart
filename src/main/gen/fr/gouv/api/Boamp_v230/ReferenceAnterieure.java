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
 * <p>Classe Java pour ReferenceAnterieure complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ReferenceAnterieure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}Reference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DATE_ENVOI" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceAnterieure", propOrder = {
    "dateenvoi"
})
public class ReferenceAnterieure
    extends Reference
{

    @XmlElement(name = "DATE_ENVOI")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateenvoi;

    /**
     * Obtient la valeur de la propriété dateenvoi.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEENVOI() {
        return dateenvoi;
    }

    /**
     * Définit la valeur de la propriété dateenvoi.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEENVOI(XMLGregorianCalendar value) {
        this.dateenvoi = value;
    }

}
