//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2017.09.18 � 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Parution complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Parution"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ANNONCE" type="{}Annonce"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="nompublication" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dateparution" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="numparution" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parution", propOrder = {
    "annonce"
})
public class Parution {

    @XmlElement(name = "ANNONCE", required = true)
    protected Annonce annonce;
    @XmlAttribute(name = "nompublication", required = true)
    protected String nompublication;
    @XmlAttribute(name = "dateparution", required = true)
    protected String dateparution;
    @XmlAttribute(name = "numparution", required = true)
    protected String numparution;

    /**
     * Obtient la valeur de la propri�t� annonce.
     * 
     * @return
     *     possible object is
     *     {@link Annonce }
     *     
     */
    public Annonce getANNONCE() {
        return annonce;
    }

    /**
     * D�finit la valeur de la propri�t� annonce.
     * 
     * @param value
     *     allowed object is
     *     {@link Annonce }
     *     
     */
    public void setANNONCE(Annonce value) {
        this.annonce = value;
    }

    /**
     * Obtient la valeur de la propri�t� nompublication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNompublication() {
        return nompublication;
    }

    /**
     * D�finit la valeur de la propri�t� nompublication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNompublication(String value) {
        this.nompublication = value;
    }

    /**
     * Obtient la valeur de la propri�t� dateparution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateparution() {
        return dateparution;
    }

    /**
     * D�finit la valeur de la propri�t� dateparution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateparution(String value) {
        this.dateparution = value;
    }

    /**
     * Obtient la valeur de la propri�t� numparution.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumparution() {
        return numparution;
    }

    /**
     * D�finit la valeur de la propri�t� numparution.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumparution(String value) {
        this.numparution = value;
    }

}
