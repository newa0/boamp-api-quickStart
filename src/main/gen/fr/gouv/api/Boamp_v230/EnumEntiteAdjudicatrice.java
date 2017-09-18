//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumEntiteAdjudicatrice complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumEntiteAdjudicatrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="PROD_TRANS_DISTRIB_GAZ" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ELECTRICITE" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="PROSP_EXTRACT_PETROLE_GAZ" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="PROSP_EXTRACT_CHARBON_COMB" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="EAU" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="SER_POST" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="SER_CHEMIN_FER" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="SER_CHEMIN_FER_TRAM_BUS" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ACT_PORT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="ACT_AEROPORT" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="AUTRE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumEntiteAdjudicatrice", propOrder = {
    "prodtransdistribgazOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ"
})
public class EnumEntiteAdjudicatrice {

    @XmlElementRefs({
        @XmlElementRef(name = "PROSP_EXTRACT_CHARBON_COMB", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EAU", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SER_CHEMIN_FER_TRAM_BUS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACT_PORT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACT_AEROPORT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROD_TRANS_DISTRIB_GAZ", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROSP_EXTRACT_PETROLE_GAZ", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SER_POST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ELECTRICITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SER_CHEMIN_FER", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> prodtransdistribgazOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ;

    /**
     * Gets the value of the prodtransdistribgazOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prodtransdistribgazOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRODTRANSDISTRIBGAZOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getPRODTRANSDISTRIBGAZOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ() {
        if (prodtransdistribgazOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ == null) {
            prodtransdistribgazOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ = new ArrayList<JAXBElement<?>>();
        }
        return this.prodtransdistribgazOrELECTRICITEOrPROSPEXTRACTPETROLEGAZ;
    }

}
