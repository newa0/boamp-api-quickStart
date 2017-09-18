//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Delai complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Delai"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="RECEPT_CANDIDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RECEPT_OFFRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LIMIT_ENVOI_INVIT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="REMISE_CANDIDAT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VALIDITE_OFFRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SOUMISSION_OFFRES_INDICATIVES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRES" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Delai", propOrder = {
    "receptcandidatAndRECEPTOFFRESAndLIMITENVOIINVIT"
})
public class Delai {

    @XmlElementRefs({
        @XmlElementRef(name = "RECEPT_OFFRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "REMISE_CANDIDAT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RECEPT_CANDIDAT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "VALIDITE_OFFRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRES", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LIMIT_ENVOI_INVIT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SOUMISSION_OFFRES_INDICATIVES", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> receptcandidatAndRECEPTOFFRESAndLIMITENVOIINVIT;

    /**
     * Gets the value of the receptcandidatAndRECEPTOFFRESAndLIMITENVOIINVIT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receptcandidatAndRECEPTOFFRESAndLIMITENVOIINVIT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRECEPTCANDIDATAndRECEPTOFFRESAndLIMITENVOIINVIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getRECEPTCANDIDATAndRECEPTOFFRESAndLIMITENVOIINVIT() {
        if (receptcandidatAndRECEPTOFFRESAndLIMITENVOIINVIT == null) {
            receptcandidatAndRECEPTOFFRESAndLIMITENVOIINVIT = new ArrayList<JAXBElement<String>>();
        }
        return this.receptcandidatAndRECEPTOFFRESAndLIMITENVOIINVIT;
    }

}
