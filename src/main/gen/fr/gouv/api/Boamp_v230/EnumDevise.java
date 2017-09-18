//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumDevise.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumDevise"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="DKK"/&gt;
 *     &lt;enumeration value="SEK"/&gt;
 *     &lt;enumeration value="CHF"/&gt;
 *     &lt;enumeration value="JPY"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="ISK"/&gt;
 *     &lt;enumeration value="NOK"/&gt;
 *     &lt;enumeration value="CYP"/&gt;
 *     &lt;enumeration value="CZK"/&gt;
 *     &lt;enumeration value="EEK"/&gt;
 *     &lt;enumeration value="HUF"/&gt;
 *     &lt;enumeration value="LVL"/&gt;
 *     &lt;enumeration value="LTL"/&gt;
 *     &lt;enumeration value="MTL"/&gt;
 *     &lt;enumeration value="PLN"/&gt;
 *     &lt;enumeration value="SKK"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumDevise")
@XmlEnum
public enum EnumDevise {


    /**
     * pounds (Grande Bretagne)
     * 
     */
    GBP,

    /**
     * euros (Euros)
     * 
     */
    EUR,

    /**
     * kroner (Danemark)
     * 
     */
    DKK,

    /**
     * kronor (Suède)
     * 
     */
    SEK,

    /**
     * francs suisses (Suisse)
     * 
     */
    CHF,

    /**
     * yen (Japon)
     * 
     */
    JPY,

    /**
     * dollars US (Dollars Américains)
     * 					
     * 
     */
    USD,

    /**
     * kronur (Islande)
     * 
     */
    ISK,

    /**
     * krone (Norvège)
     * 
     */
    NOK,

    /**
     * pounds (Chypre )
     * 
     */
    CYP,

    /**
     * koruny (République Tchèque)
     * 
     */
    CZK,

    /**
     * krooni (Estonie)
     * 
     */
    EEK,

    /**
     * forint (Hongrie)
     * 
     */
    HUF,

    /**
     * lati (Latvia)
     * 
     */
    LVL,

    /**
     * litai (Lithuanie)
     * 
     */
    LTL,

    /**
     * liri (Malte)
     * 
     */
    MTL,

    /**
     * zlotych (Pologne)
     * 
     */
    PLN,

    /**
     * koruny (Slovaquie)
     * 
     */
    SKK,

    /**
     * tolars (Slovénie)
     * 
     */
    SIT;

    public String value() {
        return name();
    }

    public static EnumDevise fromValue(String v) {
        return valueOf(v);
    }

}
