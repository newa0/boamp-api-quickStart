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
 * <p>Classe Java pour EnumFamille complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumFamille"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="MAPA" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FNS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="JOUE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DSP" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="DIVERS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumFamille", propOrder = {
    "mapa",
    "fns",
    "joue",
    "dsp",
    "divers"
})
public class EnumFamille {

    @XmlElement(name = "MAPA")
    protected Object mapa;
    @XmlElement(name = "FNS")
    protected Object fns;
    @XmlElement(name = "JOUE")
    protected Object joue;
    @XmlElement(name = "DSP")
    protected Object dsp;
    @XmlElement(name = "DIVERS")
    protected Object divers;

    /**
     * Obtient la valeur de la propriété mapa.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMAPA() {
        return mapa;
    }

    /**
     * Définit la valeur de la propriété mapa.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMAPA(Object value) {
        this.mapa = value;
    }

    /**
     * Obtient la valeur de la propriété fns.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFNS() {
        return fns;
    }

    /**
     * Définit la valeur de la propriété fns.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFNS(Object value) {
        this.fns = value;
    }

    /**
     * Obtient la valeur de la propriété joue.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getJOUE() {
        return joue;
    }

    /**
     * Définit la valeur de la propriété joue.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setJOUE(Object value) {
        this.joue = value;
    }

    /**
     * Obtient la valeur de la propriété dsp.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDSP() {
        return dsp;
    }

    /**
     * Définit la valeur de la propriété dsp.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDSP(Object value) {
        this.dsp = value;
    }

    /**
     * Obtient la valeur de la propriété divers.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDIVERS() {
        return divers;
    }

    /**
     * Définit la valeur de la propriété divers.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDIVERS(Object value) {
        this.divers = value;
    }

}
