//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java pour Cpv complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Cpv"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PRINCIPAL" type="{}typeCPVBasePrincipale"/&gt;
 *         &lt;element name="SUPPLEMENTAIRE" type="{}typeCPVBaseSupplementaire" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cpv", propOrder = {
    "principal",
    "supplementaire"
})
public class Cpv {

    @XmlElement(name = "PRINCIPAL", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String principal;
    @XmlElement(name = "SUPPLEMENTAIRE")
    @XmlSchemaType(name = "token")
    protected List<TypeCPVBaseSupplementaire> supplementaire;

    /**
     * Obtient la valeur de la propriété principal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRINCIPAL() {
        return principal;
    }

    /**
     * Définit la valeur de la propriété principal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRINCIPAL(String value) {
        this.principal = value;
    }

    /**
     * Gets the value of the supplementaire property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementaire property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSUPPLEMENTAIRE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeCPVBaseSupplementaire }
     * 
     * 
     */
    public List<TypeCPVBaseSupplementaire> getSUPPLEMENTAIRE() {
        if (supplementaire == null) {
            supplementaire = new ArrayList<TypeCPVBaseSupplementaire>();
        }
        return this.supplementaire;
    }

}
