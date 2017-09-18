//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Choix oui ou non
 * 
 * <p>Classe Java pour typeOuiNon complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="typeOuiNon"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="oui" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="non" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeOuiNon", propOrder = {
    "oui",
    "non"
})
public class TypeOuiNon {

    protected Object oui;
    protected Object non;

    /**
     * Obtient la valeur de la propriété oui.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOui() {
        return oui;
    }

    /**
     * Définit la valeur de la propriété oui.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOui(Object value) {
        this.oui = value;
    }

    /**
     * Obtient la valeur de la propriété non.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNon() {
        return non;
    }

    /**
     * Définit la valeur de la propriété non.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNon(Object value) {
        this.non = value;
    }

}
