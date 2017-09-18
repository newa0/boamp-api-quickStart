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
 * <p>Classe Java pour EnumActiviteOrganisationnelle complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnumActiviteOrganisationnelle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="POUVOIR_ADJUDICATEUR" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENTITE_ADJUDICATRICE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACT_SERV_ADM_PUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DEF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ORDRE_SEC_PUB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ENVIRONNEMENT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AFF_ECO_FIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SANTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOG_DEV_COL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROTECTION_SOCIALE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LOIS_CULT_REL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EDUCATION" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AUTRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROD_TRANS_DISTRIB_GAZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ELECTRICITE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROSP_EXTRACT_PETROLE_GAZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PROSP_EXTRACT_CHARBON_COMB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EAU" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SER_POST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SER_CHEMIN_FER" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SER_CHEMIN_FER_TRAM_BUS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACT_PORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ACT_AEROPORT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumActiviteOrganisationnelle", propOrder = {
    "pouvoiradjudicateurAndENTITEADJUDICATRICEAndACTSERVADMPUB"
})
public class EnumActiviteOrganisationnelle {

    @XmlElementRefs({
        @XmlElementRef(name = "SANTE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACT_AEROPORT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SER_POST", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ELECTRICITE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROSP_EXTRACT_CHARBON_COMB", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EDUCATION", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AUTRE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACT_PORT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROTECTION_SOCIALE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROD_TRANS_DISTRIB_GAZ", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "POUVOIR_ADJUDICATEUR", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOG_DEV_COL", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ORDRE_SEC_PUB", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PROSP_EXTRACT_PETROLE_GAZ", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ENVIRONNEMENT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SER_CHEMIN_FER", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "EAU", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AFF_ECO_FIN", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SER_CHEMIN_FER_TRAM_BUS", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ENTITE_ADJUDICATRICE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ACT_SERV_ADM_PUB", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DEF", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LOIS_CULT_REL", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> pouvoiradjudicateurAndENTITEADJUDICATRICEAndACTSERVADMPUB;

    /**
     * Gets the value of the pouvoiradjudicateurAndENTITEADJUDICATRICEAndACTSERVADMPUB property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pouvoiradjudicateurAndENTITEADJUDICATRICEAndACTSERVADMPUB property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOUVOIRADJUDICATEURAndENTITEADJUDICATRICEAndACTSERVADMPUB().add(newItem);
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
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
    public List<JAXBElement<String>> getPOUVOIRADJUDICATEURAndENTITEADJUDICATRICEAndACTSERVADMPUB() {
        if (pouvoiradjudicateurAndENTITEADJUDICATRICEAndACTSERVADMPUB == null) {
            pouvoiradjudicateurAndENTITEADJUDICATRICEAndACTSERVADMPUB = new ArrayList<JAXBElement<String>>();
        }
        return this.pouvoiradjudicateurAndENTITEADJUDICATRICEAndACTSERVADMPUB;
    }

}
