//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:40 AM CEST 
//


package fr.gouv.api.Boamp_v230;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumLangue.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumLangue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="da"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="el"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="fi"/&gt;
 *     &lt;enumeration value="sv"/&gt;
 *     &lt;enumeration value="cs"/&gt;
 *     &lt;enumeration value="et"/&gt;
 *     &lt;enumeration value="hu"/&gt;
 *     &lt;enumeration value="lv"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *     &lt;enumeration value="sk"/&gt;
 *     &lt;enumeration value="sl"/&gt;
 *     &lt;enumeration value="bg"/&gt;
 *     &lt;enumeration value="ga"/&gt;
 *     &lt;enumeration value="ro"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumLangue")
@XmlEnum
public enum EnumLangue {


    /**
     * espagnol
     * 
     */
    @XmlEnumValue("es")
    ES("es"),

    /**
     * français
     * 
     */
    @XmlEnumValue("fr")
    FR("fr"),

    /**
     * danois
     * 
     */
    @XmlEnumValue("da")
    DA("da"),

    /**
     * allemand
     * 
     */
    @XmlEnumValue("de")
    DE("de"),

    /**
     * grec
     * 
     */
    @XmlEnumValue("el")
    EL("el"),

    /**
     * anglais
     * 
     */
    @XmlEnumValue("en")
    EN("en"),

    /**
     * italien
     * 
     */
    @XmlEnumValue("it")
    IT("it"),

    /**
     * néerlandais
     * 
     */
    @XmlEnumValue("nl")
    NL("nl"),

    /**
     * portugais
     * 
     */
    @XmlEnumValue("pt")
    PT("pt"),

    /**
     * finnois
     * 
     */
    @XmlEnumValue("fi")
    FI("fi"),

    /**
     * suédois
     * 
     */
    @XmlEnumValue("sv")
    SV("sv"),

    /**
     * tchèque
     * 
     */
    @XmlEnumValue("cs")
    CS("cs"),

    /**
     * estonien
     * 
     */
    @XmlEnumValue("et")
    ET("et"),

    /**
     * hongrois
     * 
     */
    @XmlEnumValue("hu")
    HU("hu"),

    /**
     * letton
     * 
     */
    @XmlEnumValue("lv")
    LV("lv"),

    /**
     * lituanien
     * 
     */
    @XmlEnumValue("lt")
    LT("lt"),

    /**
     * maltais
     * 
     */
    @XmlEnumValue("mt")
    MT("mt"),

    /**
     * polonais
     * 
     */
    @XmlEnumValue("pl")
    PL("pl"),

    /**
     * slovaque
     * 
     */
    @XmlEnumValue("sk")
    SK("sk"),

    /**
     * slovène
     * 
     */
    @XmlEnumValue("sl")
    SL("sl"),

    /**
     * bulgare
     * 
     */
    @XmlEnumValue("bg")
    BG("bg"),

    /**
     * irlandais
     * 
     */
    @XmlEnumValue("ga")
    GA("ga"),

    /**
     * roumain
     * 
     */
    @XmlEnumValue("ro")
    RO("ro");
    private final String value;

    EnumLangue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumLangue fromValue(String v) {
        for (EnumLangue c: EnumLangue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
