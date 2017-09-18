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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumCritereSociauxEtEnvironementaux complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumCritereSociauxEtEnvironementaux"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SOCIAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="ENVIRONNEMENTAUX" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumCritereSociauxEtEnvironementaux", propOrder = {
    "sociaux",
    "environnementaux"
})
public class EnumCritereSociauxEtEnvironementaux {

    @XmlElement(name = "SOCIAUX")
    protected Object sociaux;
    @XmlElement(name = "ENVIRONNEMENTAUX")
    protected Object environnementaux;

    /**
     * Obtient la valeur de la propriété sociaux.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSOCIAUX() {
        return sociaux;
    }

    /**
     * Définit la valeur de la propriété sociaux.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSOCIAUX(Object value) {
        this.sociaux = value;
    }

    /**
     * Obtient la valeur de la propriété environnementaux.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getENVIRONNEMENTAUX() {
        return environnementaux;
    }

    /**
     * Définit la valeur de la propriété environnementaux.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setENVIRONNEMENTAUX(Object value) {
        this.environnementaux = value;
    }

}
