//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2017.09.18 à 11:31:37 AM CEST 
//


package fr.gouv.api.Boamp_v110;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EnumTypeProcedure.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumTypeProcedure"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="procedure_adaptee"/&gt;
 *     &lt;enumeration value="marche_negocie"/&gt;
 *     &lt;enumeration value="mo_avec_concours"/&gt;
 *     &lt;enumeration value="mo_sans_concours"/&gt;
 *     &lt;enumeration value="negocie_apres_infru"/&gt;
 *     &lt;enumeration value="dialogue_compe"/&gt;
 *     &lt;enumeration value="restreint"/&gt;
 *     &lt;enumeration value="concours_ouvert"/&gt;
 *     &lt;enumeration value="concours_restreint"/&gt;
 *     &lt;enumeration value="ouvert"/&gt;
 *     &lt;enumeration value="autre_negocie"/&gt;
 *     &lt;enumeration value="autre_proc"/&gt;
 *     &lt;enumeration value="autre_procedure"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumTypeProcedure")
@XmlEnum
public enum EnumTypeProcedure {

    @XmlEnumValue("procedure_adaptee")
    PROCEDURE_ADAPTEE("procedure_adaptee"),
    @XmlEnumValue("marche_negocie")
    MARCHE_NEGOCIE("marche_negocie"),
    @XmlEnumValue("mo_avec_concours")
    MO_AVEC_CONCOURS("mo_avec_concours"),
    @XmlEnumValue("mo_sans_concours")
    MO_SANS_CONCOURS("mo_sans_concours"),
    @XmlEnumValue("negocie_apres_infru")
    NEGOCIE_APRES_INFRU("negocie_apres_infru"),
    @XmlEnumValue("dialogue_compe")
    DIALOGUE_COMPE("dialogue_compe"),
    @XmlEnumValue("restreint")
    RESTREINT("restreint"),
    @XmlEnumValue("concours_ouvert")
    CONCOURS_OUVERT("concours_ouvert"),
    @XmlEnumValue("concours_restreint")
    CONCOURS_RESTREINT("concours_restreint"),
    @XmlEnumValue("ouvert")
    OUVERT("ouvert"),
    @XmlEnumValue("autre_negocie")
    AUTRE_NEGOCIE("autre_negocie"),
    @XmlEnumValue("autre_proc")
    AUTRE_PROC("autre_proc"),
    @XmlEnumValue("autre_procedure")
    AUTRE_PROCEDURE("autre_procedure");
    private final String value;

    EnumTypeProcedure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTypeProcedure fromValue(String v) {
        for (EnumTypeProcedure c: EnumTypeProcedure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
