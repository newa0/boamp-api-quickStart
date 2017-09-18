//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Rappel complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Rappel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="DEP_ORIGIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DEP" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rappel", propOrder = {
    "deporigin",
    "dep"
})
public class Rappel {

    @XmlElement(name = "DEP_ORIGIN")
    protected String deporigin;
    @XmlElement(name = "DEP")
    protected List<String> dep;

    /**
     * Obtient la valeur de la propriété deporigin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDEPORIGIN() {
        return deporigin;
    }

    /**
     * Définit la valeur de la propriété deporigin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDEPORIGIN(String value) {
        this.deporigin = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDEP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDEP() {
        if (dep == null) {
            dep = new ArrayList<String>();
        }
        return this.dep;
    }

}
