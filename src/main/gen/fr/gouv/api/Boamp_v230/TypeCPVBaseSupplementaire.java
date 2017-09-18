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
 * <p>Classe Java pour typeCPVBaseSupplementaire.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCPVBaseSupplementaire"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AA01"/&gt;
 *     &lt;enumeration value="AA02"/&gt;
 *     &lt;enumeration value="AA03"/&gt;
 *     &lt;enumeration value="AA04"/&gt;
 *     &lt;enumeration value="AA05"/&gt;
 *     &lt;enumeration value="AA06"/&gt;
 *     &lt;enumeration value="AA07"/&gt;
 *     &lt;enumeration value="AA08"/&gt;
 *     &lt;enumeration value="AA09"/&gt;
 *     &lt;enumeration value="AA10"/&gt;
 *     &lt;enumeration value="AA11"/&gt;
 *     &lt;enumeration value="AA12"/&gt;
 *     &lt;enumeration value="AA13"/&gt;
 *     &lt;enumeration value="AA14"/&gt;
 *     &lt;enumeration value="AA15"/&gt;
 *     &lt;enumeration value="AA16"/&gt;
 *     &lt;enumeration value="AA17"/&gt;
 *     &lt;enumeration value="AA18"/&gt;
 *     &lt;enumeration value="AA19"/&gt;
 *     &lt;enumeration value="AA20"/&gt;
 *     &lt;enumeration value="AA21"/&gt;
 *     &lt;enumeration value="AA22"/&gt;
 *     &lt;enumeration value="AA23"/&gt;
 *     &lt;enumeration value="AA24"/&gt;
 *     &lt;enumeration value="AA25"/&gt;
 *     &lt;enumeration value="AA26"/&gt;
 *     &lt;enumeration value="AA27"/&gt;
 *     &lt;enumeration value="AA28"/&gt;
 *     &lt;enumeration value="AA29"/&gt;
 *     &lt;enumeration value="AA30"/&gt;
 *     &lt;enumeration value="AA31"/&gt;
 *     &lt;enumeration value="AA32"/&gt;
 *     &lt;enumeration value="AA33"/&gt;
 *     &lt;enumeration value="AA34"/&gt;
 *     &lt;enumeration value="AA35"/&gt;
 *     &lt;enumeration value="AA36"/&gt;
 *     &lt;enumeration value="AA37"/&gt;
 *     &lt;enumeration value="AA38"/&gt;
 *     &lt;enumeration value="AA39"/&gt;
 *     &lt;enumeration value="AA40"/&gt;
 *     &lt;enumeration value="AA41"/&gt;
 *     &lt;enumeration value="AA42"/&gt;
 *     &lt;enumeration value="AA43"/&gt;
 *     &lt;enumeration value="AA44"/&gt;
 *     &lt;enumeration value="AA45"/&gt;
 *     &lt;enumeration value="AA46"/&gt;
 *     &lt;enumeration value="AA47"/&gt;
 *     &lt;enumeration value="AA48"/&gt;
 *     &lt;enumeration value="AB02"/&gt;
 *     &lt;enumeration value="AB03"/&gt;
 *     &lt;enumeration value="AB04"/&gt;
 *     &lt;enumeration value="AB05"/&gt;
 *     &lt;enumeration value="AB06"/&gt;
 *     &lt;enumeration value="AB07"/&gt;
 *     &lt;enumeration value="AB08"/&gt;
 *     &lt;enumeration value="AB09"/&gt;
 *     &lt;enumeration value="AB11"/&gt;
 *     &lt;enumeration value="AB12"/&gt;
 *     &lt;enumeration value="AB13"/&gt;
 *     &lt;enumeration value="AB14"/&gt;
 *     &lt;enumeration value="AB15"/&gt;
 *     &lt;enumeration value="AB16"/&gt;
 *     &lt;enumeration value="AB17"/&gt;
 *     &lt;enumeration value="AB18"/&gt;
 *     &lt;enumeration value="AB19"/&gt;
 *     &lt;enumeration value="AB20"/&gt;
 *     &lt;enumeration value="AB21"/&gt;
 *     &lt;enumeration value="AB22"/&gt;
 *     &lt;enumeration value="AB23"/&gt;
 *     &lt;enumeration value="AB24"/&gt;
 *     &lt;enumeration value="AB25"/&gt;
 *     &lt;enumeration value="AB26"/&gt;
 *     &lt;enumeration value="AB27"/&gt;
 *     &lt;enumeration value="AB28"/&gt;
 *     &lt;enumeration value="AB29"/&gt;
 *     &lt;enumeration value="AB30"/&gt;
 *     &lt;enumeration value="AB31"/&gt;
 *     &lt;enumeration value="AB32"/&gt;
 *     &lt;enumeration value="AB33"/&gt;
 *     &lt;enumeration value="AB34"/&gt;
 *     &lt;enumeration value="AB35"/&gt;
 *     &lt;enumeration value="AB36"/&gt;
 *     &lt;enumeration value="AB37"/&gt;
 *     &lt;enumeration value="BA01"/&gt;
 *     &lt;enumeration value="BA02"/&gt;
 *     &lt;enumeration value="BA03"/&gt;
 *     &lt;enumeration value="BA04"/&gt;
 *     &lt;enumeration value="BA05"/&gt;
 *     &lt;enumeration value="BA06"/&gt;
 *     &lt;enumeration value="BA07"/&gt;
 *     &lt;enumeration value="BA08"/&gt;
 *     &lt;enumeration value="BA09"/&gt;
 *     &lt;enumeration value="BA10"/&gt;
 *     &lt;enumeration value="BA11"/&gt;
 *     &lt;enumeration value="BA12"/&gt;
 *     &lt;enumeration value="BA13"/&gt;
 *     &lt;enumeration value="BA14"/&gt;
 *     &lt;enumeration value="BA15"/&gt;
 *     &lt;enumeration value="BA16"/&gt;
 *     &lt;enumeration value="BA17"/&gt;
 *     &lt;enumeration value="BA18"/&gt;
 *     &lt;enumeration value="BA19"/&gt;
 *     &lt;enumeration value="BA20"/&gt;
 *     &lt;enumeration value="BA22"/&gt;
 *     &lt;enumeration value="BA23"/&gt;
 *     &lt;enumeration value="BA24"/&gt;
 *     &lt;enumeration value="BA25"/&gt;
 *     &lt;enumeration value="BA26"/&gt;
 *     &lt;enumeration value="BA27"/&gt;
 *     &lt;enumeration value="BA28"/&gt;
 *     &lt;enumeration value="BA29"/&gt;
 *     &lt;enumeration value="BA30"/&gt;
 *     &lt;enumeration value="BA31"/&gt;
 *     &lt;enumeration value="BA32"/&gt;
 *     &lt;enumeration value="BA33"/&gt;
 *     &lt;enumeration value="BA34"/&gt;
 *     &lt;enumeration value="BA35"/&gt;
 *     &lt;enumeration value="BA36"/&gt;
 *     &lt;enumeration value="BA37"/&gt;
 *     &lt;enumeration value="BA38"/&gt;
 *     &lt;enumeration value="BA39"/&gt;
 *     &lt;enumeration value="BA40"/&gt;
 *     &lt;enumeration value="BA41"/&gt;
 *     &lt;enumeration value="BA42"/&gt;
 *     &lt;enumeration value="BA43"/&gt;
 *     &lt;enumeration value="BA44"/&gt;
 *     &lt;enumeration value="BA45"/&gt;
 *     &lt;enumeration value="BA46"/&gt;
 *     &lt;enumeration value="BA47"/&gt;
 *     &lt;enumeration value="BA48"/&gt;
 *     &lt;enumeration value="BA49"/&gt;
 *     &lt;enumeration value="BA50"/&gt;
 *     &lt;enumeration value="BA51"/&gt;
 *     &lt;enumeration value="BA52"/&gt;
 *     &lt;enumeration value="BA53"/&gt;
 *     &lt;enumeration value="BA54"/&gt;
 *     &lt;enumeration value="BB01"/&gt;
 *     &lt;enumeration value="BB02"/&gt;
 *     &lt;enumeration value="BB03"/&gt;
 *     &lt;enumeration value="BB04"/&gt;
 *     &lt;enumeration value="BB05"/&gt;
 *     &lt;enumeration value="BB06"/&gt;
 *     &lt;enumeration value="BB07"/&gt;
 *     &lt;enumeration value="BC01"/&gt;
 *     &lt;enumeration value="BC02"/&gt;
 *     &lt;enumeration value="BC03"/&gt;
 *     &lt;enumeration value="BC04"/&gt;
 *     &lt;enumeration value="BC05"/&gt;
 *     &lt;enumeration value="BC06"/&gt;
 *     &lt;enumeration value="BC07"/&gt;
 *     &lt;enumeration value="BC08"/&gt;
 *     &lt;enumeration value="BC09"/&gt;
 *     &lt;enumeration value="BC10"/&gt;
 *     &lt;enumeration value="BC11"/&gt;
 *     &lt;enumeration value="BC12"/&gt;
 *     &lt;enumeration value="BC13"/&gt;
 *     &lt;enumeration value="BC14"/&gt;
 *     &lt;enumeration value="BC15"/&gt;
 *     &lt;enumeration value="BC16"/&gt;
 *     &lt;enumeration value="BC17"/&gt;
 *     &lt;enumeration value="BC18"/&gt;
 *     &lt;enumeration value="BC19"/&gt;
 *     &lt;enumeration value="BC20"/&gt;
 *     &lt;enumeration value="BC21"/&gt;
 *     &lt;enumeration value="BC22"/&gt;
 *     &lt;enumeration value="BC23"/&gt;
 *     &lt;enumeration value="BC24"/&gt;
 *     &lt;enumeration value="BC25"/&gt;
 *     &lt;enumeration value="BC26"/&gt;
 *     &lt;enumeration value="BC27"/&gt;
 *     &lt;enumeration value="BC28"/&gt;
 *     &lt;enumeration value="BC29"/&gt;
 *     &lt;enumeration value="BC30"/&gt;
 *     &lt;enumeration value="BC31"/&gt;
 *     &lt;enumeration value="BC32"/&gt;
 *     &lt;enumeration value="BC33"/&gt;
 *     &lt;enumeration value="BC34"/&gt;
 *     &lt;enumeration value="BC35"/&gt;
 *     &lt;enumeration value="BC36"/&gt;
 *     &lt;enumeration value="BC37"/&gt;
 *     &lt;enumeration value="BC38"/&gt;
 *     &lt;enumeration value="BC39"/&gt;
 *     &lt;enumeration value="BC40"/&gt;
 *     &lt;enumeration value="BC41"/&gt;
 *     &lt;enumeration value="BC42"/&gt;
 *     &lt;enumeration value="BC43"/&gt;
 *     &lt;enumeration value="BC44"/&gt;
 *     &lt;enumeration value="BC45"/&gt;
 *     &lt;enumeration value="BC46"/&gt;
 *     &lt;enumeration value="BC48"/&gt;
 *     &lt;enumeration value="CA01"/&gt;
 *     &lt;enumeration value="CA02"/&gt;
 *     &lt;enumeration value="CA03"/&gt;
 *     &lt;enumeration value="CA04"/&gt;
 *     &lt;enumeration value="CA05"/&gt;
 *     &lt;enumeration value="CA06"/&gt;
 *     &lt;enumeration value="CA07"/&gt;
 *     &lt;enumeration value="CA08"/&gt;
 *     &lt;enumeration value="CA09"/&gt;
 *     &lt;enumeration value="CA10"/&gt;
 *     &lt;enumeration value="CA11"/&gt;
 *     &lt;enumeration value="CA12"/&gt;
 *     &lt;enumeration value="CA13"/&gt;
 *     &lt;enumeration value="CA14"/&gt;
 *     &lt;enumeration value="CA15"/&gt;
 *     &lt;enumeration value="CA16"/&gt;
 *     &lt;enumeration value="CA17"/&gt;
 *     &lt;enumeration value="CA18"/&gt;
 *     &lt;enumeration value="CA19"/&gt;
 *     &lt;enumeration value="CA20"/&gt;
 *     &lt;enumeration value="CA21"/&gt;
 *     &lt;enumeration value="CA22"/&gt;
 *     &lt;enumeration value="CA23"/&gt;
 *     &lt;enumeration value="CA24"/&gt;
 *     &lt;enumeration value="CA25"/&gt;
 *     &lt;enumeration value="CA26"/&gt;
 *     &lt;enumeration value="CA27"/&gt;
 *     &lt;enumeration value="CA28"/&gt;
 *     &lt;enumeration value="CA29"/&gt;
 *     &lt;enumeration value="CA30"/&gt;
 *     &lt;enumeration value="CA31"/&gt;
 *     &lt;enumeration value="CA32"/&gt;
 *     &lt;enumeration value="CA33"/&gt;
 *     &lt;enumeration value="CA34"/&gt;
 *     &lt;enumeration value="CA35"/&gt;
 *     &lt;enumeration value="CA36"/&gt;
 *     &lt;enumeration value="CA37"/&gt;
 *     &lt;enumeration value="CA38"/&gt;
 *     &lt;enumeration value="CA39"/&gt;
 *     &lt;enumeration value="CA40"/&gt;
 *     &lt;enumeration value="CA41"/&gt;
 *     &lt;enumeration value="CA42"/&gt;
 *     &lt;enumeration value="CA43"/&gt;
 *     &lt;enumeration value="CA44"/&gt;
 *     &lt;enumeration value="CA45"/&gt;
 *     &lt;enumeration value="CA46"/&gt;
 *     &lt;enumeration value="CA47"/&gt;
 *     &lt;enumeration value="CA48"/&gt;
 *     &lt;enumeration value="CA49"/&gt;
 *     &lt;enumeration value="CA50"/&gt;
 *     &lt;enumeration value="CA51"/&gt;
 *     &lt;enumeration value="CA52"/&gt;
 *     &lt;enumeration value="CA53"/&gt;
 *     &lt;enumeration value="CA54"/&gt;
 *     &lt;enumeration value="CA55"/&gt;
 *     &lt;enumeration value="CA56"/&gt;
 *     &lt;enumeration value="CA57"/&gt;
 *     &lt;enumeration value="CA58"/&gt;
 *     &lt;enumeration value="CA59"/&gt;
 *     &lt;enumeration value="CA60"/&gt;
 *     &lt;enumeration value="CA61"/&gt;
 *     &lt;enumeration value="CA62"/&gt;
 *     &lt;enumeration value="CA63"/&gt;
 *     &lt;enumeration value="CA64"/&gt;
 *     &lt;enumeration value="CA65"/&gt;
 *     &lt;enumeration value="CA66"/&gt;
 *     &lt;enumeration value="CA67"/&gt;
 *     &lt;enumeration value="CA68"/&gt;
 *     &lt;enumeration value="CA69"/&gt;
 *     &lt;enumeration value="CB01"/&gt;
 *     &lt;enumeration value="CB02"/&gt;
 *     &lt;enumeration value="CB03"/&gt;
 *     &lt;enumeration value="CB04"/&gt;
 *     &lt;enumeration value="CB05"/&gt;
 *     &lt;enumeration value="CB06"/&gt;
 *     &lt;enumeration value="CB07"/&gt;
 *     &lt;enumeration value="CB08"/&gt;
 *     &lt;enumeration value="CB09"/&gt;
 *     &lt;enumeration value="CB10"/&gt;
 *     &lt;enumeration value="CB11"/&gt;
 *     &lt;enumeration value="CB12"/&gt;
 *     &lt;enumeration value="CB13"/&gt;
 *     &lt;enumeration value="CB14"/&gt;
 *     &lt;enumeration value="CB15"/&gt;
 *     &lt;enumeration value="CB16"/&gt;
 *     &lt;enumeration value="CB17"/&gt;
 *     &lt;enumeration value="CB18"/&gt;
 *     &lt;enumeration value="CB19"/&gt;
 *     &lt;enumeration value="CB20"/&gt;
 *     &lt;enumeration value="CB21"/&gt;
 *     &lt;enumeration value="CB22"/&gt;
 *     &lt;enumeration value="CB23"/&gt;
 *     &lt;enumeration value="CB24"/&gt;
 *     &lt;enumeration value="CB25"/&gt;
 *     &lt;enumeration value="CB26"/&gt;
 *     &lt;enumeration value="CB27"/&gt;
 *     &lt;enumeration value="CB28"/&gt;
 *     &lt;enumeration value="CB29"/&gt;
 *     &lt;enumeration value="CB30"/&gt;
 *     &lt;enumeration value="CB31"/&gt;
 *     &lt;enumeration value="CB32"/&gt;
 *     &lt;enumeration value="CB33"/&gt;
 *     &lt;enumeration value="CB34"/&gt;
 *     &lt;enumeration value="CB35"/&gt;
 *     &lt;enumeration value="CB36"/&gt;
 *     &lt;enumeration value="CB37"/&gt;
 *     &lt;enumeration value="CB38"/&gt;
 *     &lt;enumeration value="CB39"/&gt;
 *     &lt;enumeration value="CB40"/&gt;
 *     &lt;enumeration value="CB41"/&gt;
 *     &lt;enumeration value="CB42"/&gt;
 *     &lt;enumeration value="CB43"/&gt;
 *     &lt;enumeration value="CB44"/&gt;
 *     &lt;enumeration value="CB45"/&gt;
 *     &lt;enumeration value="CB46"/&gt;
 *     &lt;enumeration value="CB47"/&gt;
 *     &lt;enumeration value="DA01"/&gt;
 *     &lt;enumeration value="DA02"/&gt;
 *     &lt;enumeration value="DA03"/&gt;
 *     &lt;enumeration value="DA04"/&gt;
 *     &lt;enumeration value="DA05"/&gt;
 *     &lt;enumeration value="DA06"/&gt;
 *     &lt;enumeration value="DA07"/&gt;
 *     &lt;enumeration value="DA08"/&gt;
 *     &lt;enumeration value="DA09"/&gt;
 *     &lt;enumeration value="DA10"/&gt;
 *     &lt;enumeration value="DA11"/&gt;
 *     &lt;enumeration value="DA12"/&gt;
 *     &lt;enumeration value="DA13"/&gt;
 *     &lt;enumeration value="DA14"/&gt;
 *     &lt;enumeration value="DA15"/&gt;
 *     &lt;enumeration value="DA16"/&gt;
 *     &lt;enumeration value="DA17"/&gt;
 *     &lt;enumeration value="DA18"/&gt;
 *     &lt;enumeration value="DA19"/&gt;
 *     &lt;enumeration value="DA20"/&gt;
 *     &lt;enumeration value="DA21"/&gt;
 *     &lt;enumeration value="DA22"/&gt;
 *     &lt;enumeration value="DA23"/&gt;
 *     &lt;enumeration value="DA24"/&gt;
 *     &lt;enumeration value="DA25"/&gt;
 *     &lt;enumeration value="DA26"/&gt;
 *     &lt;enumeration value="DA27"/&gt;
 *     &lt;enumeration value="DA28"/&gt;
 *     &lt;enumeration value="DA29"/&gt;
 *     &lt;enumeration value="DA30"/&gt;
 *     &lt;enumeration value="DA31"/&gt;
 *     &lt;enumeration value="DA32"/&gt;
 *     &lt;enumeration value="DA33"/&gt;
 *     &lt;enumeration value="DA34"/&gt;
 *     &lt;enumeration value="DA35"/&gt;
 *     &lt;enumeration value="DA36"/&gt;
 *     &lt;enumeration value="DA37"/&gt;
 *     &lt;enumeration value="DA38"/&gt;
 *     &lt;enumeration value="DA39"/&gt;
 *     &lt;enumeration value="DA40"/&gt;
 *     &lt;enumeration value="DA41"/&gt;
 *     &lt;enumeration value="DA42"/&gt;
 *     &lt;enumeration value="DA43"/&gt;
 *     &lt;enumeration value="DA44"/&gt;
 *     &lt;enumeration value="EA01"/&gt;
 *     &lt;enumeration value="EA02"/&gt;
 *     &lt;enumeration value="EA03"/&gt;
 *     &lt;enumeration value="EA04"/&gt;
 *     &lt;enumeration value="EA05"/&gt;
 *     &lt;enumeration value="EA06"/&gt;
 *     &lt;enumeration value="EA07"/&gt;
 *     &lt;enumeration value="EA08"/&gt;
 *     &lt;enumeration value="EA09"/&gt;
 *     &lt;enumeration value="EA10"/&gt;
 *     &lt;enumeration value="EA11"/&gt;
 *     &lt;enumeration value="EA12"/&gt;
 *     &lt;enumeration value="EA13"/&gt;
 *     &lt;enumeration value="EA14"/&gt;
 *     &lt;enumeration value="EA15"/&gt;
 *     &lt;enumeration value="EA16"/&gt;
 *     &lt;enumeration value="EA17"/&gt;
 *     &lt;enumeration value="EA18"/&gt;
 *     &lt;enumeration value="EA19"/&gt;
 *     &lt;enumeration value="EA20"/&gt;
 *     &lt;enumeration value="EA21"/&gt;
 *     &lt;enumeration value="EA22"/&gt;
 *     &lt;enumeration value="EA23"/&gt;
 *     &lt;enumeration value="EA24"/&gt;
 *     &lt;enumeration value="EA25"/&gt;
 *     &lt;enumeration value="EA26"/&gt;
 *     &lt;enumeration value="EA27"/&gt;
 *     &lt;enumeration value="EA28"/&gt;
 *     &lt;enumeration value="EA29"/&gt;
 *     &lt;enumeration value="EA30"/&gt;
 *     &lt;enumeration value="FA01"/&gt;
 *     &lt;enumeration value="FA02"/&gt;
 *     &lt;enumeration value="FA03"/&gt;
 *     &lt;enumeration value="FA04"/&gt;
 *     &lt;enumeration value="FB01"/&gt;
 *     &lt;enumeration value="FB02"/&gt;
 *     &lt;enumeration value="FB03"/&gt;
 *     &lt;enumeration value="FB04"/&gt;
 *     &lt;enumeration value="FB05"/&gt;
 *     &lt;enumeration value="FB06"/&gt;
 *     &lt;enumeration value="FB07"/&gt;
 *     &lt;enumeration value="FB08"/&gt;
 *     &lt;enumeration value="FB09"/&gt;
 *     &lt;enumeration value="FB10"/&gt;
 *     &lt;enumeration value="FB11"/&gt;
 *     &lt;enumeration value="FB12"/&gt;
 *     &lt;enumeration value="FB13"/&gt;
 *     &lt;enumeration value="FC01"/&gt;
 *     &lt;enumeration value="FC02"/&gt;
 *     &lt;enumeration value="FC03"/&gt;
 *     &lt;enumeration value="FD01"/&gt;
 *     &lt;enumeration value="FD02"/&gt;
 *     &lt;enumeration value="FD03"/&gt;
 *     &lt;enumeration value="FD04"/&gt;
 *     &lt;enumeration value="FD05"/&gt;
 *     &lt;enumeration value="FE01"/&gt;
 *     &lt;enumeration value="FE02"/&gt;
 *     &lt;enumeration value="FE03"/&gt;
 *     &lt;enumeration value="FF01"/&gt;
 *     &lt;enumeration value="FF02"/&gt;
 *     &lt;enumeration value="FG01"/&gt;
 *     &lt;enumeration value="FG02"/&gt;
 *     &lt;enumeration value="FG03"/&gt;
 *     &lt;enumeration value="FG04"/&gt;
 *     &lt;enumeration value="FG05"/&gt;
 *     &lt;enumeration value="FG06"/&gt;
 *     &lt;enumeration value="FG07"/&gt;
 *     &lt;enumeration value="FG08"/&gt;
 *     &lt;enumeration value="FG09"/&gt;
 *     &lt;enumeration value="FG10"/&gt;
 *     &lt;enumeration value="FG11"/&gt;
 *     &lt;enumeration value="FG12"/&gt;
 *     &lt;enumeration value="FG13"/&gt;
 *     &lt;enumeration value="FG14"/&gt;
 *     &lt;enumeration value="FG15"/&gt;
 *     &lt;enumeration value="FG16"/&gt;
 *     &lt;enumeration value="FG17"/&gt;
 *     &lt;enumeration value="FG18"/&gt;
 *     &lt;enumeration value="FG19"/&gt;
 *     &lt;enumeration value="FG20"/&gt;
 *     &lt;enumeration value="FG21"/&gt;
 *     &lt;enumeration value="FG22"/&gt;
 *     &lt;enumeration value="FG23"/&gt;
 *     &lt;enumeration value="FG24"/&gt;
 *     &lt;enumeration value="FG25"/&gt;
 *     &lt;enumeration value="GA01"/&gt;
 *     &lt;enumeration value="GA02"/&gt;
 *     &lt;enumeration value="GA03"/&gt;
 *     &lt;enumeration value="GA04"/&gt;
 *     &lt;enumeration value="GA05"/&gt;
 *     &lt;enumeration value="GA06"/&gt;
 *     &lt;enumeration value="GA07"/&gt;
 *     &lt;enumeration value="GA08"/&gt;
 *     &lt;enumeration value="GA09"/&gt;
 *     &lt;enumeration value="GA10"/&gt;
 *     &lt;enumeration value="GA11"/&gt;
 *     &lt;enumeration value="GA12"/&gt;
 *     &lt;enumeration value="GA13"/&gt;
 *     &lt;enumeration value="GA14"/&gt;
 *     &lt;enumeration value="GA15"/&gt;
 *     &lt;enumeration value="GA16"/&gt;
 *     &lt;enumeration value="GA17"/&gt;
 *     &lt;enumeration value="GA18"/&gt;
 *     &lt;enumeration value="GA19"/&gt;
 *     &lt;enumeration value="GA20"/&gt;
 *     &lt;enumeration value="GA21"/&gt;
 *     &lt;enumeration value="GA22"/&gt;
 *     &lt;enumeration value="GA32"/&gt;
 *     &lt;enumeration value="GA33"/&gt;
 *     &lt;enumeration value="GB01"/&gt;
 *     &lt;enumeration value="GB02"/&gt;
 *     &lt;enumeration value="GB03"/&gt;
 *     &lt;enumeration value="GB04"/&gt;
 *     &lt;enumeration value="GC01"/&gt;
 *     &lt;enumeration value="GC02"/&gt;
 *     &lt;enumeration value="GC03"/&gt;
 *     &lt;enumeration value="GC04"/&gt;
 *     &lt;enumeration value="GC05"/&gt;
 *     &lt;enumeration value="GC06"/&gt;
 *     &lt;enumeration value="GC07"/&gt;
 *     &lt;enumeration value="GC08"/&gt;
 *     &lt;enumeration value="GC09"/&gt;
 *     &lt;enumeration value="GC10"/&gt;
 *     &lt;enumeration value="GC11"/&gt;
 *     &lt;enumeration value="GC12"/&gt;
 *     &lt;enumeration value="GC13"/&gt;
 *     &lt;enumeration value="GC14"/&gt;
 *     &lt;enumeration value="GC15"/&gt;
 *     &lt;enumeration value="GC16"/&gt;
 *     &lt;enumeration value="GC17"/&gt;
 *     &lt;enumeration value="GC18"/&gt;
 *     &lt;enumeration value="GC19"/&gt;
 *     &lt;enumeration value="GC20"/&gt;
 *     &lt;enumeration value="GC21"/&gt;
 *     &lt;enumeration value="GC22"/&gt;
 *     &lt;enumeration value="GC23"/&gt;
 *     &lt;enumeration value="GC24"/&gt;
 *     &lt;enumeration value="GC25"/&gt;
 *     &lt;enumeration value="GC26"/&gt;
 *     &lt;enumeration value="GC27"/&gt;
 *     &lt;enumeration value="GC28"/&gt;
 *     &lt;enumeration value="GC29"/&gt;
 *     &lt;enumeration value="GC30"/&gt;
 *     &lt;enumeration value="GC31"/&gt;
 *     &lt;enumeration value="GC32"/&gt;
 *     &lt;enumeration value="GC33"/&gt;
 *     &lt;enumeration value="GC34"/&gt;
 *     &lt;enumeration value="HA01"/&gt;
 *     &lt;enumeration value="HA02"/&gt;
 *     &lt;enumeration value="HA03"/&gt;
 *     &lt;enumeration value="HA04"/&gt;
 *     &lt;enumeration value="HA05"/&gt;
 *     &lt;enumeration value="HA06"/&gt;
 *     &lt;enumeration value="HA07"/&gt;
 *     &lt;enumeration value="HA08"/&gt;
 *     &lt;enumeration value="HA09"/&gt;
 *     &lt;enumeration value="HA10"/&gt;
 *     &lt;enumeration value="HA11"/&gt;
 *     &lt;enumeration value="HA12"/&gt;
 *     &lt;enumeration value="HA13"/&gt;
 *     &lt;enumeration value="HA14"/&gt;
 *     &lt;enumeration value="HA15"/&gt;
 *     &lt;enumeration value="HA16"/&gt;
 *     &lt;enumeration value="HA17"/&gt;
 *     &lt;enumeration value="HA18"/&gt;
 *     &lt;enumeration value="HA19"/&gt;
 *     &lt;enumeration value="HA20"/&gt;
 *     &lt;enumeration value="HA21"/&gt;
 *     &lt;enumeration value="HA22"/&gt;
 *     &lt;enumeration value="HA23"/&gt;
 *     &lt;enumeration value="HA24"/&gt;
 *     &lt;enumeration value="HA25"/&gt;
 *     &lt;enumeration value="HA26"/&gt;
 *     &lt;enumeration value="HA27"/&gt;
 *     &lt;enumeration value="HA28"/&gt;
 *     &lt;enumeration value="HA29"/&gt;
 *     &lt;enumeration value="HA30"/&gt;
 *     &lt;enumeration value="HA31"/&gt;
 *     &lt;enumeration value="IA01"/&gt;
 *     &lt;enumeration value="IA02"/&gt;
 *     &lt;enumeration value="IA03"/&gt;
 *     &lt;enumeration value="IA04"/&gt;
 *     &lt;enumeration value="IA05"/&gt;
 *     &lt;enumeration value="IA06"/&gt;
 *     &lt;enumeration value="IA07"/&gt;
 *     &lt;enumeration value="IA08"/&gt;
 *     &lt;enumeration value="IA09"/&gt;
 *     &lt;enumeration value="IA10"/&gt;
 *     &lt;enumeration value="IA11"/&gt;
 *     &lt;enumeration value="IA13"/&gt;
 *     &lt;enumeration value="IA14"/&gt;
 *     &lt;enumeration value="IA15"/&gt;
 *     &lt;enumeration value="IA16"/&gt;
 *     &lt;enumeration value="IA17"/&gt;
 *     &lt;enumeration value="IA18"/&gt;
 *     &lt;enumeration value="IA19"/&gt;
 *     &lt;enumeration value="IA20"/&gt;
 *     &lt;enumeration value="IA21"/&gt;
 *     &lt;enumeration value="IA22"/&gt;
 *     &lt;enumeration value="IA23"/&gt;
 *     &lt;enumeration value="IA24"/&gt;
 *     &lt;enumeration value="IA25"/&gt;
 *     &lt;enumeration value="IA26"/&gt;
 *     &lt;enumeration value="IA27"/&gt;
 *     &lt;enumeration value="IA28"/&gt;
 *     &lt;enumeration value="IA29"/&gt;
 *     &lt;enumeration value="IA30"/&gt;
 *     &lt;enumeration value="IA31"/&gt;
 *     &lt;enumeration value="IA32"/&gt;
 *     &lt;enumeration value="IA33"/&gt;
 *     &lt;enumeration value="IA34"/&gt;
 *     &lt;enumeration value="IA35"/&gt;
 *     &lt;enumeration value="IA36"/&gt;
 *     &lt;enumeration value="IA37"/&gt;
 *     &lt;enumeration value="IA38"/&gt;
 *     &lt;enumeration value="IA39"/&gt;
 *     &lt;enumeration value="IA40"/&gt;
 *     &lt;enumeration value="IA41"/&gt;
 *     &lt;enumeration value="IA42"/&gt;
 *     &lt;enumeration value="JA01"/&gt;
 *     &lt;enumeration value="JA02"/&gt;
 *     &lt;enumeration value="JA03"/&gt;
 *     &lt;enumeration value="JA04"/&gt;
 *     &lt;enumeration value="JA05"/&gt;
 *     &lt;enumeration value="JA06"/&gt;
 *     &lt;enumeration value="JA07"/&gt;
 *     &lt;enumeration value="JA08"/&gt;
 *     &lt;enumeration value="JA09"/&gt;
 *     &lt;enumeration value="JA10"/&gt;
 *     &lt;enumeration value="JA11"/&gt;
 *     &lt;enumeration value="JA12"/&gt;
 *     &lt;enumeration value="JA13"/&gt;
 *     &lt;enumeration value="JA14"/&gt;
 *     &lt;enumeration value="JA15"/&gt;
 *     &lt;enumeration value="JA16"/&gt;
 *     &lt;enumeration value="JA17"/&gt;
 *     &lt;enumeration value="JA18"/&gt;
 *     &lt;enumeration value="JA19"/&gt;
 *     &lt;enumeration value="JA20"/&gt;
 *     &lt;enumeration value="JA21"/&gt;
 *     &lt;enumeration value="JA22"/&gt;
 *     &lt;enumeration value="JA23"/&gt;
 *     &lt;enumeration value="JA24"/&gt;
 *     &lt;enumeration value="KA01"/&gt;
 *     &lt;enumeration value="KA02"/&gt;
 *     &lt;enumeration value="KA03"/&gt;
 *     &lt;enumeration value="KA04"/&gt;
 *     &lt;enumeration value="KA05"/&gt;
 *     &lt;enumeration value="KA06"/&gt;
 *     &lt;enumeration value="KA07"/&gt;
 *     &lt;enumeration value="KA08"/&gt;
 *     &lt;enumeration value="KA09"/&gt;
 *     &lt;enumeration value="KA10"/&gt;
 *     &lt;enumeration value="KA11"/&gt;
 *     &lt;enumeration value="KA12"/&gt;
 *     &lt;enumeration value="KA13"/&gt;
 *     &lt;enumeration value="KA14"/&gt;
 *     &lt;enumeration value="KA15"/&gt;
 *     &lt;enumeration value="KA16"/&gt;
 *     &lt;enumeration value="LA01"/&gt;
 *     &lt;enumeration value="LA02"/&gt;
 *     &lt;enumeration value="LA03"/&gt;
 *     &lt;enumeration value="LA04"/&gt;
 *     &lt;enumeration value="LA05"/&gt;
 *     &lt;enumeration value="LA06"/&gt;
 *     &lt;enumeration value="LA07"/&gt;
 *     &lt;enumeration value="LA08"/&gt;
 *     &lt;enumeration value="LA09"/&gt;
 *     &lt;enumeration value="LA10"/&gt;
 *     &lt;enumeration value="LA11"/&gt;
 *     &lt;enumeration value="LA12"/&gt;
 *     &lt;enumeration value="LA13"/&gt;
 *     &lt;enumeration value="LA14"/&gt;
 *     &lt;enumeration value="LA15"/&gt;
 *     &lt;enumeration value="LA16"/&gt;
 *     &lt;enumeration value="LA17"/&gt;
 *     &lt;enumeration value="LA18"/&gt;
 *     &lt;enumeration value="LA19"/&gt;
 *     &lt;enumeration value="LA20"/&gt;
 *     &lt;enumeration value="LA21"/&gt;
 *     &lt;enumeration value="LA22"/&gt;
 *     &lt;enumeration value="LA23"/&gt;
 *     &lt;enumeration value="LA24"/&gt;
 *     &lt;enumeration value="LA25"/&gt;
 *     &lt;enumeration value="LA26"/&gt;
 *     &lt;enumeration value="LA27"/&gt;
 *     &lt;enumeration value="LA28"/&gt;
 *     &lt;enumeration value="LA29"/&gt;
 *     &lt;enumeration value="LA30"/&gt;
 *     &lt;enumeration value="LA31"/&gt;
 *     &lt;enumeration value="LA32"/&gt;
 *     &lt;enumeration value="LA33"/&gt;
 *     &lt;enumeration value="LA34"/&gt;
 *     &lt;enumeration value="LA35"/&gt;
 *     &lt;enumeration value="LA36"/&gt;
 *     &lt;enumeration value="LA37"/&gt;
 *     &lt;enumeration value="LA38"/&gt;
 *     &lt;enumeration value="LA39"/&gt;
 *     &lt;enumeration value="LA40"/&gt;
 *     &lt;enumeration value="LA41"/&gt;
 *     &lt;enumeration value="LA42"/&gt;
 *     &lt;enumeration value="LA43"/&gt;
 *     &lt;enumeration value="LA44"/&gt;
 *     &lt;enumeration value="LA45"/&gt;
 *     &lt;enumeration value="LA46"/&gt;
 *     &lt;enumeration value="LA47"/&gt;
 *     &lt;enumeration value="LA48"/&gt;
 *     &lt;enumeration value="LA49"/&gt;
 *     &lt;enumeration value="LA50"/&gt;
 *     &lt;enumeration value="LA51"/&gt;
 *     &lt;enumeration value="LA52"/&gt;
 *     &lt;enumeration value="LA53"/&gt;
 *     &lt;enumeration value="LA54"/&gt;
 *     &lt;enumeration value="LA55"/&gt;
 *     &lt;enumeration value="MA01"/&gt;
 *     &lt;enumeration value="MA02"/&gt;
 *     &lt;enumeration value="MA03"/&gt;
 *     &lt;enumeration value="MA04"/&gt;
 *     &lt;enumeration value="MA05"/&gt;
 *     &lt;enumeration value="MA06"/&gt;
 *     &lt;enumeration value="MA07"/&gt;
 *     &lt;enumeration value="MA08"/&gt;
 *     &lt;enumeration value="MA09"/&gt;
 *     &lt;enumeration value="MA10"/&gt;
 *     &lt;enumeration value="MA11"/&gt;
 *     &lt;enumeration value="MA12"/&gt;
 *     &lt;enumeration value="MA13"/&gt;
 *     &lt;enumeration value="MA14"/&gt;
 *     &lt;enumeration value="MB01"/&gt;
 *     &lt;enumeration value="MB02"/&gt;
 *     &lt;enumeration value="MB03"/&gt;
 *     &lt;enumeration value="MB04"/&gt;
 *     &lt;enumeration value="MD01"/&gt;
 *     &lt;enumeration value="MD02"/&gt;
 *     &lt;enumeration value="MD03"/&gt;
 *     &lt;enumeration value="MD04"/&gt;
 *     &lt;enumeration value="MD05"/&gt;
 *     &lt;enumeration value="MD06"/&gt;
 *     &lt;enumeration value="MD07"/&gt;
 *     &lt;enumeration value="ME01"/&gt;
 *     &lt;enumeration value="ME02"/&gt;
 *     &lt;enumeration value="ME03"/&gt;
 *     &lt;enumeration value="ME04"/&gt;
 *     &lt;enumeration value="ME05"/&gt;
 *     &lt;enumeration value="MF01"/&gt;
 *     &lt;enumeration value="MF02"/&gt;
 *     &lt;enumeration value="MF03"/&gt;
 *     &lt;enumeration value="MF04"/&gt;
 *     &lt;enumeration value="MF05"/&gt;
 *     &lt;enumeration value="MF06"/&gt;
 *     &lt;enumeration value="MF07"/&gt;
 *     &lt;enumeration value="MF08"/&gt;
 *     &lt;enumeration value="MF09"/&gt;
 *     &lt;enumeration value="MF10"/&gt;
 *     &lt;enumeration value="PA01"/&gt;
 *     &lt;enumeration value="PA02"/&gt;
 *     &lt;enumeration value="PA03"/&gt;
 *     &lt;enumeration value="PB01"/&gt;
 *     &lt;enumeration value="PB02"/&gt;
 *     &lt;enumeration value="PB03"/&gt;
 *     &lt;enumeration value="PB04"/&gt;
 *     &lt;enumeration value="PB05"/&gt;
 *     &lt;enumeration value="PB06"/&gt;
 *     &lt;enumeration value="QA01"/&gt;
 *     &lt;enumeration value="QA02"/&gt;
 *     &lt;enumeration value="QA03"/&gt;
 *     &lt;enumeration value="QA04"/&gt;
 *     &lt;enumeration value="QA05"/&gt;
 *     &lt;enumeration value="QA06"/&gt;
 *     &lt;enumeration value="QA07"/&gt;
 *     &lt;enumeration value="QA08"/&gt;
 *     &lt;enumeration value="QA09"/&gt;
 *     &lt;enumeration value="QA10"/&gt;
 *     &lt;enumeration value="QA11"/&gt;
 *     &lt;enumeration value="QA12"/&gt;
 *     &lt;enumeration value="QA13"/&gt;
 *     &lt;enumeration value="QB01"/&gt;
 *     &lt;enumeration value="QB02"/&gt;
 *     &lt;enumeration value="QB03"/&gt;
 *     &lt;enumeration value="QB04"/&gt;
 *     &lt;enumeration value="QB05"/&gt;
 *     &lt;enumeration value="QB06"/&gt;
 *     &lt;enumeration value="QB07"/&gt;
 *     &lt;enumeration value="QB08"/&gt;
 *     &lt;enumeration value="QB09"/&gt;
 *     &lt;enumeration value="QB10"/&gt;
 *     &lt;enumeration value="QB11"/&gt;
 *     &lt;enumeration value="QB12"/&gt;
 *     &lt;enumeration value="QB13"/&gt;
 *     &lt;enumeration value="QB14"/&gt;
 *     &lt;enumeration value="QB15"/&gt;
 *     &lt;enumeration value="QB16"/&gt;
 *     &lt;enumeration value="QB17"/&gt;
 *     &lt;enumeration value="QB18"/&gt;
 *     &lt;enumeration value="QB19"/&gt;
 *     &lt;enumeration value="QB20"/&gt;
 *     &lt;enumeration value="QB21"/&gt;
 *     &lt;enumeration value="QB23"/&gt;
 *     &lt;enumeration value="QB24"/&gt;
 *     &lt;enumeration value="QB25"/&gt;
 *     &lt;enumeration value="QB26"/&gt;
 *     &lt;enumeration value="QB27"/&gt;
 *     &lt;enumeration value="QB28"/&gt;
 *     &lt;enumeration value="QB29"/&gt;
 *     &lt;enumeration value="QB30"/&gt;
 *     &lt;enumeration value="QB31"/&gt;
 *     &lt;enumeration value="QB32"/&gt;
 *     &lt;enumeration value="QB33"/&gt;
 *     &lt;enumeration value="QB34"/&gt;
 *     &lt;enumeration value="QB35"/&gt;
 *     &lt;enumeration value="QB36"/&gt;
 *     &lt;enumeration value="QB37"/&gt;
 *     &lt;enumeration value="QB38"/&gt;
 *     &lt;enumeration value="QB39"/&gt;
 *     &lt;enumeration value="QB40"/&gt;
 *     &lt;enumeration value="QB41"/&gt;
 *     &lt;enumeration value="QB42"/&gt;
 *     &lt;enumeration value="QB43"/&gt;
 *     &lt;enumeration value="QB44"/&gt;
 *     &lt;enumeration value="QB45"/&gt;
 *     &lt;enumeration value="QB46"/&gt;
 *     &lt;enumeration value="QB47"/&gt;
 *     &lt;enumeration value="QB48"/&gt;
 *     &lt;enumeration value="QB49"/&gt;
 *     &lt;enumeration value="QB50"/&gt;
 *     &lt;enumeration value="QB51"/&gt;
 *     &lt;enumeration value="QB52"/&gt;
 *     &lt;enumeration value="QB53"/&gt;
 *     &lt;enumeration value="QB54"/&gt;
 *     &lt;enumeration value="QB55"/&gt;
 *     &lt;enumeration value="QB56"/&gt;
 *     &lt;enumeration value="QB57"/&gt;
 *     &lt;enumeration value="RA01"/&gt;
 *     &lt;enumeration value="RA02"/&gt;
 *     &lt;enumeration value="RA03"/&gt;
 *     &lt;enumeration value="RA04"/&gt;
 *     &lt;enumeration value="RA05"/&gt;
 *     &lt;enumeration value="RA06"/&gt;
 *     &lt;enumeration value="RA07"/&gt;
 *     &lt;enumeration value="RA08"/&gt;
 *     &lt;enumeration value="RA09"/&gt;
 *     &lt;enumeration value="RA10"/&gt;
 *     &lt;enumeration value="RA11"/&gt;
 *     &lt;enumeration value="RA12"/&gt;
 *     &lt;enumeration value="RA13"/&gt;
 *     &lt;enumeration value="RA14"/&gt;
 *     &lt;enumeration value="RA15"/&gt;
 *     &lt;enumeration value="RA16"/&gt;
 *     &lt;enumeration value="RB01"/&gt;
 *     &lt;enumeration value="RB02"/&gt;
 *     &lt;enumeration value="RB03"/&gt;
 *     &lt;enumeration value="RB04"/&gt;
 *     &lt;enumeration value="RB05"/&gt;
 *     &lt;enumeration value="RB06"/&gt;
 *     &lt;enumeration value="RB07"/&gt;
 *     &lt;enumeration value="RB08"/&gt;
 *     &lt;enumeration value="RB09"/&gt;
 *     &lt;enumeration value="RB10"/&gt;
 *     &lt;enumeration value="RB11"/&gt;
 *     &lt;enumeration value="RB12"/&gt;
 *     &lt;enumeration value="RB13"/&gt;
 *     &lt;enumeration value="RB14"/&gt;
 *     &lt;enumeration value="RB15"/&gt;
 *     &lt;enumeration value="RB16"/&gt;
 *     &lt;enumeration value="RB17"/&gt;
 *     &lt;enumeration value="RB18"/&gt;
 *     &lt;enumeration value="RB19"/&gt;
 *     &lt;enumeration value="RB20"/&gt;
 *     &lt;enumeration value="RB21"/&gt;
 *     &lt;enumeration value="RC01"/&gt;
 *     &lt;enumeration value="RC02"/&gt;
 *     &lt;enumeration value="RC03"/&gt;
 *     &lt;enumeration value="RC04"/&gt;
 *     &lt;enumeration value="RC05"/&gt;
 *     &lt;enumeration value="RC06"/&gt;
 *     &lt;enumeration value="RC07"/&gt;
 *     &lt;enumeration value="RC08"/&gt;
 *     &lt;enumeration value="RD01"/&gt;
 *     &lt;enumeration value="RD02"/&gt;
 *     &lt;enumeration value="RD03"/&gt;
 *     &lt;enumeration value="RD04"/&gt;
 *     &lt;enumeration value="RD05"/&gt;
 *     &lt;enumeration value="RD06"/&gt;
 *     &lt;enumeration value="RD07"/&gt;
 *     &lt;enumeration value="RD08"/&gt;
 *     &lt;enumeration value="RD09"/&gt;
 *     &lt;enumeration value="RD10"/&gt;
 *     &lt;enumeration value="RD11"/&gt;
 *     &lt;enumeration value="SA01"/&gt;
 *     &lt;enumeration value="SA02"/&gt;
 *     &lt;enumeration value="SA03"/&gt;
 *     &lt;enumeration value="SA04"/&gt;
 *     &lt;enumeration value="SB01"/&gt;
 *     &lt;enumeration value="SB02"/&gt;
 *     &lt;enumeration value="SC01"/&gt;
 *     &lt;enumeration value="TA01"/&gt;
 *     &lt;enumeration value="TA02"/&gt;
 *     &lt;enumeration value="TA03"/&gt;
 *     &lt;enumeration value="TA04"/&gt;
 *     &lt;enumeration value="TA05"/&gt;
 *     &lt;enumeration value="TA06"/&gt;
 *     &lt;enumeration value="TA07"/&gt;
 *     &lt;enumeration value="TA08"/&gt;
 *     &lt;enumeration value="TA09"/&gt;
 *     &lt;enumeration value="TA10"/&gt;
 *     &lt;enumeration value="TA11"/&gt;
 *     &lt;enumeration value="TA12"/&gt;
 *     &lt;enumeration value="TA13"/&gt;
 *     &lt;enumeration value="TA14"/&gt;
 *     &lt;enumeration value="TA15"/&gt;
 *     &lt;enumeration value="TA16"/&gt;
 *     &lt;enumeration value="TA17"/&gt;
 *     &lt;enumeration value="TA18"/&gt;
 *     &lt;enumeration value="TA19"/&gt;
 *     &lt;enumeration value="TA20"/&gt;
 *     &lt;enumeration value="TA21"/&gt;
 *     &lt;enumeration value="TA22"/&gt;
 *     &lt;enumeration value="TA23"/&gt;
 *     &lt;enumeration value="TA24"/&gt;
 *     &lt;enumeration value="TA25"/&gt;
 *     &lt;enumeration value="TA26"/&gt;
 *     &lt;enumeration value="TA27"/&gt;
 *     &lt;enumeration value="TA28"/&gt;
 *     &lt;enumeration value="TA29"/&gt;
 *     &lt;enumeration value="TA30"/&gt;
 *     &lt;enumeration value="TA31"/&gt;
 *     &lt;enumeration value="TA32"/&gt;
 *     &lt;enumeration value="TA33"/&gt;
 *     &lt;enumeration value="TA34"/&gt;
 *     &lt;enumeration value="TA35"/&gt;
 *     &lt;enumeration value="TA36"/&gt;
 *     &lt;enumeration value="TA37"/&gt;
 *     &lt;enumeration value="TA38"/&gt;
 *     &lt;enumeration value="TA39"/&gt;
 *     &lt;enumeration value="TA40"/&gt;
 *     &lt;enumeration value="TA41"/&gt;
 *     &lt;enumeration value="TA42"/&gt;
 *     &lt;enumeration value="TA43"/&gt;
 *     &lt;enumeration value="TA44"/&gt;
 *     &lt;enumeration value="TA45"/&gt;
 *     &lt;enumeration value="TA46"/&gt;
 *     &lt;enumeration value="TA47"/&gt;
 *     &lt;enumeration value="TA48"/&gt;
 *     &lt;enumeration value="UA01"/&gt;
 *     &lt;enumeration value="UA02"/&gt;
 *     &lt;enumeration value="UB01"/&gt;
 *     &lt;enumeration value="UB02"/&gt;
 *     &lt;enumeration value="UB03"/&gt;
 *     &lt;enumeration value="UB04"/&gt;
 *     &lt;enumeration value="UB05"/&gt;
 *     &lt;enumeration value="UB06"/&gt;
 *     &lt;enumeration value="UB07"/&gt;
 *     &lt;enumeration value="UB08"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeCPVBaseSupplementaire")
@XmlEnum
public enum TypeCPVBaseSupplementaire {

    @XmlEnumValue("AA01")
    AA_01("AA01"),
    @XmlEnumValue("AA02")
    AA_02("AA02"),
    @XmlEnumValue("AA03")
    AA_03("AA03"),
    @XmlEnumValue("AA04")
    AA_04("AA04"),
    @XmlEnumValue("AA05")
    AA_05("AA05"),
    @XmlEnumValue("AA06")
    AA_06("AA06"),
    @XmlEnumValue("AA07")
    AA_07("AA07"),
    @XmlEnumValue("AA08")
    AA_08("AA08"),
    @XmlEnumValue("AA09")
    AA_09("AA09"),
    @XmlEnumValue("AA10")
    AA_10("AA10"),
    @XmlEnumValue("AA11")
    AA_11("AA11"),
    @XmlEnumValue("AA12")
    AA_12("AA12"),
    @XmlEnumValue("AA13")
    AA_13("AA13"),
    @XmlEnumValue("AA14")
    AA_14("AA14"),
    @XmlEnumValue("AA15")
    AA_15("AA15"),
    @XmlEnumValue("AA16")
    AA_16("AA16"),
    @XmlEnumValue("AA17")
    AA_17("AA17"),
    @XmlEnumValue("AA18")
    AA_18("AA18"),
    @XmlEnumValue("AA19")
    AA_19("AA19"),
    @XmlEnumValue("AA20")
    AA_20("AA20"),
    @XmlEnumValue("AA21")
    AA_21("AA21"),
    @XmlEnumValue("AA22")
    AA_22("AA22"),
    @XmlEnumValue("AA23")
    AA_23("AA23"),
    @XmlEnumValue("AA24")
    AA_24("AA24"),
    @XmlEnumValue("AA25")
    AA_25("AA25"),
    @XmlEnumValue("AA26")
    AA_26("AA26"),
    @XmlEnumValue("AA27")
    AA_27("AA27"),
    @XmlEnumValue("AA28")
    AA_28("AA28"),
    @XmlEnumValue("AA29")
    AA_29("AA29"),
    @XmlEnumValue("AA30")
    AA_30("AA30"),
    @XmlEnumValue("AA31")
    AA_31("AA31"),
    @XmlEnumValue("AA32")
    AA_32("AA32"),
    @XmlEnumValue("AA33")
    AA_33("AA33"),
    @XmlEnumValue("AA34")
    AA_34("AA34"),
    @XmlEnumValue("AA35")
    AA_35("AA35"),
    @XmlEnumValue("AA36")
    AA_36("AA36"),
    @XmlEnumValue("AA37")
    AA_37("AA37"),
    @XmlEnumValue("AA38")
    AA_38("AA38"),
    @XmlEnumValue("AA39")
    AA_39("AA39"),
    @XmlEnumValue("AA40")
    AA_40("AA40"),
    @XmlEnumValue("AA41")
    AA_41("AA41"),
    @XmlEnumValue("AA42")
    AA_42("AA42"),
    @XmlEnumValue("AA43")
    AA_43("AA43"),
    @XmlEnumValue("AA44")
    AA_44("AA44"),
    @XmlEnumValue("AA45")
    AA_45("AA45"),
    @XmlEnumValue("AA46")
    AA_46("AA46"),
    @XmlEnumValue("AA47")
    AA_47("AA47"),
    @XmlEnumValue("AA48")
    AA_48("AA48"),
    @XmlEnumValue("AB02")
    AB_02("AB02"),
    @XmlEnumValue("AB03")
    AB_03("AB03"),
    @XmlEnumValue("AB04")
    AB_04("AB04"),
    @XmlEnumValue("AB05")
    AB_05("AB05"),
    @XmlEnumValue("AB06")
    AB_06("AB06"),
    @XmlEnumValue("AB07")
    AB_07("AB07"),
    @XmlEnumValue("AB08")
    AB_08("AB08"),
    @XmlEnumValue("AB09")
    AB_09("AB09"),
    @XmlEnumValue("AB11")
    AB_11("AB11"),
    @XmlEnumValue("AB12")
    AB_12("AB12"),
    @XmlEnumValue("AB13")
    AB_13("AB13"),
    @XmlEnumValue("AB14")
    AB_14("AB14"),
    @XmlEnumValue("AB15")
    AB_15("AB15"),
    @XmlEnumValue("AB16")
    AB_16("AB16"),
    @XmlEnumValue("AB17")
    AB_17("AB17"),
    @XmlEnumValue("AB18")
    AB_18("AB18"),
    @XmlEnumValue("AB19")
    AB_19("AB19"),
    @XmlEnumValue("AB20")
    AB_20("AB20"),
    @XmlEnumValue("AB21")
    AB_21("AB21"),
    @XmlEnumValue("AB22")
    AB_22("AB22"),
    @XmlEnumValue("AB23")
    AB_23("AB23"),
    @XmlEnumValue("AB24")
    AB_24("AB24"),
    @XmlEnumValue("AB25")
    AB_25("AB25"),
    @XmlEnumValue("AB26")
    AB_26("AB26"),
    @XmlEnumValue("AB27")
    AB_27("AB27"),
    @XmlEnumValue("AB28")
    AB_28("AB28"),
    @XmlEnumValue("AB29")
    AB_29("AB29"),
    @XmlEnumValue("AB30")
    AB_30("AB30"),
    @XmlEnumValue("AB31")
    AB_31("AB31"),
    @XmlEnumValue("AB32")
    AB_32("AB32"),
    @XmlEnumValue("AB33")
    AB_33("AB33"),
    @XmlEnumValue("AB34")
    AB_34("AB34"),
    @XmlEnumValue("AB35")
    AB_35("AB35"),
    @XmlEnumValue("AB36")
    AB_36("AB36"),
    @XmlEnumValue("AB37")
    AB_37("AB37"),
    @XmlEnumValue("BA01")
    BA_01("BA01"),
    @XmlEnumValue("BA02")
    BA_02("BA02"),
    @XmlEnumValue("BA03")
    BA_03("BA03"),
    @XmlEnumValue("BA04")
    BA_04("BA04"),
    @XmlEnumValue("BA05")
    BA_05("BA05"),
    @XmlEnumValue("BA06")
    BA_06("BA06"),
    @XmlEnumValue("BA07")
    BA_07("BA07"),
    @XmlEnumValue("BA08")
    BA_08("BA08"),
    @XmlEnumValue("BA09")
    BA_09("BA09"),
    @XmlEnumValue("BA10")
    BA_10("BA10"),
    @XmlEnumValue("BA11")
    BA_11("BA11"),
    @XmlEnumValue("BA12")
    BA_12("BA12"),
    @XmlEnumValue("BA13")
    BA_13("BA13"),
    @XmlEnumValue("BA14")
    BA_14("BA14"),
    @XmlEnumValue("BA15")
    BA_15("BA15"),
    @XmlEnumValue("BA16")
    BA_16("BA16"),
    @XmlEnumValue("BA17")
    BA_17("BA17"),
    @XmlEnumValue("BA18")
    BA_18("BA18"),
    @XmlEnumValue("BA19")
    BA_19("BA19"),
    @XmlEnumValue("BA20")
    BA_20("BA20"),
    @XmlEnumValue("BA22")
    BA_22("BA22"),
    @XmlEnumValue("BA23")
    BA_23("BA23"),
    @XmlEnumValue("BA24")
    BA_24("BA24"),
    @XmlEnumValue("BA25")
    BA_25("BA25"),
    @XmlEnumValue("BA26")
    BA_26("BA26"),
    @XmlEnumValue("BA27")
    BA_27("BA27"),
    @XmlEnumValue("BA28")
    BA_28("BA28"),
    @XmlEnumValue("BA29")
    BA_29("BA29"),
    @XmlEnumValue("BA30")
    BA_30("BA30"),
    @XmlEnumValue("BA31")
    BA_31("BA31"),
    @XmlEnumValue("BA32")
    BA_32("BA32"),
    @XmlEnumValue("BA33")
    BA_33("BA33"),
    @XmlEnumValue("BA34")
    BA_34("BA34"),
    @XmlEnumValue("BA35")
    BA_35("BA35"),
    @XmlEnumValue("BA36")
    BA_36("BA36"),
    @XmlEnumValue("BA37")
    BA_37("BA37"),
    @XmlEnumValue("BA38")
    BA_38("BA38"),
    @XmlEnumValue("BA39")
    BA_39("BA39"),
    @XmlEnumValue("BA40")
    BA_40("BA40"),
    @XmlEnumValue("BA41")
    BA_41("BA41"),
    @XmlEnumValue("BA42")
    BA_42("BA42"),
    @XmlEnumValue("BA43")
    BA_43("BA43"),
    @XmlEnumValue("BA44")
    BA_44("BA44"),
    @XmlEnumValue("BA45")
    BA_45("BA45"),
    @XmlEnumValue("BA46")
    BA_46("BA46"),
    @XmlEnumValue("BA47")
    BA_47("BA47"),
    @XmlEnumValue("BA48")
    BA_48("BA48"),
    @XmlEnumValue("BA49")
    BA_49("BA49"),
    @XmlEnumValue("BA50")
    BA_50("BA50"),
    @XmlEnumValue("BA51")
    BA_51("BA51"),
    @XmlEnumValue("BA52")
    BA_52("BA52"),
    @XmlEnumValue("BA53")
    BA_53("BA53"),
    @XmlEnumValue("BA54")
    BA_54("BA54"),
    @XmlEnumValue("BB01")
    BB_01("BB01"),
    @XmlEnumValue("BB02")
    BB_02("BB02"),
    @XmlEnumValue("BB03")
    BB_03("BB03"),
    @XmlEnumValue("BB04")
    BB_04("BB04"),
    @XmlEnumValue("BB05")
    BB_05("BB05"),
    @XmlEnumValue("BB06")
    BB_06("BB06"),
    @XmlEnumValue("BB07")
    BB_07("BB07"),
    @XmlEnumValue("BC01")
    BC_01("BC01"),
    @XmlEnumValue("BC02")
    BC_02("BC02"),
    @XmlEnumValue("BC03")
    BC_03("BC03"),
    @XmlEnumValue("BC04")
    BC_04("BC04"),
    @XmlEnumValue("BC05")
    BC_05("BC05"),
    @XmlEnumValue("BC06")
    BC_06("BC06"),
    @XmlEnumValue("BC07")
    BC_07("BC07"),
    @XmlEnumValue("BC08")
    BC_08("BC08"),
    @XmlEnumValue("BC09")
    BC_09("BC09"),
    @XmlEnumValue("BC10")
    BC_10("BC10"),
    @XmlEnumValue("BC11")
    BC_11("BC11"),
    @XmlEnumValue("BC12")
    BC_12("BC12"),
    @XmlEnumValue("BC13")
    BC_13("BC13"),
    @XmlEnumValue("BC14")
    BC_14("BC14"),
    @XmlEnumValue("BC15")
    BC_15("BC15"),
    @XmlEnumValue("BC16")
    BC_16("BC16"),
    @XmlEnumValue("BC17")
    BC_17("BC17"),
    @XmlEnumValue("BC18")
    BC_18("BC18"),
    @XmlEnumValue("BC19")
    BC_19("BC19"),
    @XmlEnumValue("BC20")
    BC_20("BC20"),
    @XmlEnumValue("BC21")
    BC_21("BC21"),
    @XmlEnumValue("BC22")
    BC_22("BC22"),
    @XmlEnumValue("BC23")
    BC_23("BC23"),
    @XmlEnumValue("BC24")
    BC_24("BC24"),
    @XmlEnumValue("BC25")
    BC_25("BC25"),
    @XmlEnumValue("BC26")
    BC_26("BC26"),
    @XmlEnumValue("BC27")
    BC_27("BC27"),
    @XmlEnumValue("BC28")
    BC_28("BC28"),
    @XmlEnumValue("BC29")
    BC_29("BC29"),
    @XmlEnumValue("BC30")
    BC_30("BC30"),
    @XmlEnumValue("BC31")
    BC_31("BC31"),
    @XmlEnumValue("BC32")
    BC_32("BC32"),
    @XmlEnumValue("BC33")
    BC_33("BC33"),
    @XmlEnumValue("BC34")
    BC_34("BC34"),
    @XmlEnumValue("BC35")
    BC_35("BC35"),
    @XmlEnumValue("BC36")
    BC_36("BC36"),
    @XmlEnumValue("BC37")
    BC_37("BC37"),
    @XmlEnumValue("BC38")
    BC_38("BC38"),
    @XmlEnumValue("BC39")
    BC_39("BC39"),
    @XmlEnumValue("BC40")
    BC_40("BC40"),
    @XmlEnumValue("BC41")
    BC_41("BC41"),
    @XmlEnumValue("BC42")
    BC_42("BC42"),
    @XmlEnumValue("BC43")
    BC_43("BC43"),
    @XmlEnumValue("BC44")
    BC_44("BC44"),
    @XmlEnumValue("BC45")
    BC_45("BC45"),
    @XmlEnumValue("BC46")
    BC_46("BC46"),
    @XmlEnumValue("BC48")
    BC_48("BC48"),
    @XmlEnumValue("CA01")
    CA_01("CA01"),
    @XmlEnumValue("CA02")
    CA_02("CA02"),
    @XmlEnumValue("CA03")
    CA_03("CA03"),
    @XmlEnumValue("CA04")
    CA_04("CA04"),
    @XmlEnumValue("CA05")
    CA_05("CA05"),
    @XmlEnumValue("CA06")
    CA_06("CA06"),
    @XmlEnumValue("CA07")
    CA_07("CA07"),
    @XmlEnumValue("CA08")
    CA_08("CA08"),
    @XmlEnumValue("CA09")
    CA_09("CA09"),
    @XmlEnumValue("CA10")
    CA_10("CA10"),
    @XmlEnumValue("CA11")
    CA_11("CA11"),
    @XmlEnumValue("CA12")
    CA_12("CA12"),
    @XmlEnumValue("CA13")
    CA_13("CA13"),
    @XmlEnumValue("CA14")
    CA_14("CA14"),
    @XmlEnumValue("CA15")
    CA_15("CA15"),
    @XmlEnumValue("CA16")
    CA_16("CA16"),
    @XmlEnumValue("CA17")
    CA_17("CA17"),
    @XmlEnumValue("CA18")
    CA_18("CA18"),
    @XmlEnumValue("CA19")
    CA_19("CA19"),
    @XmlEnumValue("CA20")
    CA_20("CA20"),
    @XmlEnumValue("CA21")
    CA_21("CA21"),
    @XmlEnumValue("CA22")
    CA_22("CA22"),
    @XmlEnumValue("CA23")
    CA_23("CA23"),
    @XmlEnumValue("CA24")
    CA_24("CA24"),
    @XmlEnumValue("CA25")
    CA_25("CA25"),
    @XmlEnumValue("CA26")
    CA_26("CA26"),
    @XmlEnumValue("CA27")
    CA_27("CA27"),
    @XmlEnumValue("CA28")
    CA_28("CA28"),
    @XmlEnumValue("CA29")
    CA_29("CA29"),
    @XmlEnumValue("CA30")
    CA_30("CA30"),
    @XmlEnumValue("CA31")
    CA_31("CA31"),
    @XmlEnumValue("CA32")
    CA_32("CA32"),
    @XmlEnumValue("CA33")
    CA_33("CA33"),
    @XmlEnumValue("CA34")
    CA_34("CA34"),
    @XmlEnumValue("CA35")
    CA_35("CA35"),
    @XmlEnumValue("CA36")
    CA_36("CA36"),
    @XmlEnumValue("CA37")
    CA_37("CA37"),
    @XmlEnumValue("CA38")
    CA_38("CA38"),
    @XmlEnumValue("CA39")
    CA_39("CA39"),
    @XmlEnumValue("CA40")
    CA_40("CA40"),
    @XmlEnumValue("CA41")
    CA_41("CA41"),
    @XmlEnumValue("CA42")
    CA_42("CA42"),
    @XmlEnumValue("CA43")
    CA_43("CA43"),
    @XmlEnumValue("CA44")
    CA_44("CA44"),
    @XmlEnumValue("CA45")
    CA_45("CA45"),
    @XmlEnumValue("CA46")
    CA_46("CA46"),
    @XmlEnumValue("CA47")
    CA_47("CA47"),
    @XmlEnumValue("CA48")
    CA_48("CA48"),
    @XmlEnumValue("CA49")
    CA_49("CA49"),
    @XmlEnumValue("CA50")
    CA_50("CA50"),
    @XmlEnumValue("CA51")
    CA_51("CA51"),
    @XmlEnumValue("CA52")
    CA_52("CA52"),
    @XmlEnumValue("CA53")
    CA_53("CA53"),
    @XmlEnumValue("CA54")
    CA_54("CA54"),
    @XmlEnumValue("CA55")
    CA_55("CA55"),
    @XmlEnumValue("CA56")
    CA_56("CA56"),
    @XmlEnumValue("CA57")
    CA_57("CA57"),
    @XmlEnumValue("CA58")
    CA_58("CA58"),
    @XmlEnumValue("CA59")
    CA_59("CA59"),
    @XmlEnumValue("CA60")
    CA_60("CA60"),
    @XmlEnumValue("CA61")
    CA_61("CA61"),
    @XmlEnumValue("CA62")
    CA_62("CA62"),
    @XmlEnumValue("CA63")
    CA_63("CA63"),
    @XmlEnumValue("CA64")
    CA_64("CA64"),
    @XmlEnumValue("CA65")
    CA_65("CA65"),
    @XmlEnumValue("CA66")
    CA_66("CA66"),
    @XmlEnumValue("CA67")
    CA_67("CA67"),
    @XmlEnumValue("CA68")
    CA_68("CA68"),
    @XmlEnumValue("CA69")
    CA_69("CA69"),
    @XmlEnumValue("CB01")
    CB_01("CB01"),
    @XmlEnumValue("CB02")
    CB_02("CB02"),
    @XmlEnumValue("CB03")
    CB_03("CB03"),
    @XmlEnumValue("CB04")
    CB_04("CB04"),
    @XmlEnumValue("CB05")
    CB_05("CB05"),
    @XmlEnumValue("CB06")
    CB_06("CB06"),
    @XmlEnumValue("CB07")
    CB_07("CB07"),
    @XmlEnumValue("CB08")
    CB_08("CB08"),
    @XmlEnumValue("CB09")
    CB_09("CB09"),
    @XmlEnumValue("CB10")
    CB_10("CB10"),
    @XmlEnumValue("CB11")
    CB_11("CB11"),
    @XmlEnumValue("CB12")
    CB_12("CB12"),
    @XmlEnumValue("CB13")
    CB_13("CB13"),
    @XmlEnumValue("CB14")
    CB_14("CB14"),
    @XmlEnumValue("CB15")
    CB_15("CB15"),
    @XmlEnumValue("CB16")
    CB_16("CB16"),
    @XmlEnumValue("CB17")
    CB_17("CB17"),
    @XmlEnumValue("CB18")
    CB_18("CB18"),
    @XmlEnumValue("CB19")
    CB_19("CB19"),
    @XmlEnumValue("CB20")
    CB_20("CB20"),
    @XmlEnumValue("CB21")
    CB_21("CB21"),
    @XmlEnumValue("CB22")
    CB_22("CB22"),
    @XmlEnumValue("CB23")
    CB_23("CB23"),
    @XmlEnumValue("CB24")
    CB_24("CB24"),
    @XmlEnumValue("CB25")
    CB_25("CB25"),
    @XmlEnumValue("CB26")
    CB_26("CB26"),
    @XmlEnumValue("CB27")
    CB_27("CB27"),
    @XmlEnumValue("CB28")
    CB_28("CB28"),
    @XmlEnumValue("CB29")
    CB_29("CB29"),
    @XmlEnumValue("CB30")
    CB_30("CB30"),
    @XmlEnumValue("CB31")
    CB_31("CB31"),
    @XmlEnumValue("CB32")
    CB_32("CB32"),
    @XmlEnumValue("CB33")
    CB_33("CB33"),
    @XmlEnumValue("CB34")
    CB_34("CB34"),
    @XmlEnumValue("CB35")
    CB_35("CB35"),
    @XmlEnumValue("CB36")
    CB_36("CB36"),
    @XmlEnumValue("CB37")
    CB_37("CB37"),
    @XmlEnumValue("CB38")
    CB_38("CB38"),
    @XmlEnumValue("CB39")
    CB_39("CB39"),
    @XmlEnumValue("CB40")
    CB_40("CB40"),
    @XmlEnumValue("CB41")
    CB_41("CB41"),
    @XmlEnumValue("CB42")
    CB_42("CB42"),
    @XmlEnumValue("CB43")
    CB_43("CB43"),
    @XmlEnumValue("CB44")
    CB_44("CB44"),
    @XmlEnumValue("CB45")
    CB_45("CB45"),
    @XmlEnumValue("CB46")
    CB_46("CB46"),
    @XmlEnumValue("CB47")
    CB_47("CB47"),
    @XmlEnumValue("DA01")
    DA_01("DA01"),
    @XmlEnumValue("DA02")
    DA_02("DA02"),
    @XmlEnumValue("DA03")
    DA_03("DA03"),
    @XmlEnumValue("DA04")
    DA_04("DA04"),
    @XmlEnumValue("DA05")
    DA_05("DA05"),
    @XmlEnumValue("DA06")
    DA_06("DA06"),
    @XmlEnumValue("DA07")
    DA_07("DA07"),
    @XmlEnumValue("DA08")
    DA_08("DA08"),
    @XmlEnumValue("DA09")
    DA_09("DA09"),
    @XmlEnumValue("DA10")
    DA_10("DA10"),
    @XmlEnumValue("DA11")
    DA_11("DA11"),
    @XmlEnumValue("DA12")
    DA_12("DA12"),
    @XmlEnumValue("DA13")
    DA_13("DA13"),
    @XmlEnumValue("DA14")
    DA_14("DA14"),
    @XmlEnumValue("DA15")
    DA_15("DA15"),
    @XmlEnumValue("DA16")
    DA_16("DA16"),
    @XmlEnumValue("DA17")
    DA_17("DA17"),
    @XmlEnumValue("DA18")
    DA_18("DA18"),
    @XmlEnumValue("DA19")
    DA_19("DA19"),
    @XmlEnumValue("DA20")
    DA_20("DA20"),
    @XmlEnumValue("DA21")
    DA_21("DA21"),
    @XmlEnumValue("DA22")
    DA_22("DA22"),
    @XmlEnumValue("DA23")
    DA_23("DA23"),
    @XmlEnumValue("DA24")
    DA_24("DA24"),
    @XmlEnumValue("DA25")
    DA_25("DA25"),
    @XmlEnumValue("DA26")
    DA_26("DA26"),
    @XmlEnumValue("DA27")
    DA_27("DA27"),
    @XmlEnumValue("DA28")
    DA_28("DA28"),
    @XmlEnumValue("DA29")
    DA_29("DA29"),
    @XmlEnumValue("DA30")
    DA_30("DA30"),
    @XmlEnumValue("DA31")
    DA_31("DA31"),
    @XmlEnumValue("DA32")
    DA_32("DA32"),
    @XmlEnumValue("DA33")
    DA_33("DA33"),
    @XmlEnumValue("DA34")
    DA_34("DA34"),
    @XmlEnumValue("DA35")
    DA_35("DA35"),
    @XmlEnumValue("DA36")
    DA_36("DA36"),
    @XmlEnumValue("DA37")
    DA_37("DA37"),
    @XmlEnumValue("DA38")
    DA_38("DA38"),
    @XmlEnumValue("DA39")
    DA_39("DA39"),
    @XmlEnumValue("DA40")
    DA_40("DA40"),
    @XmlEnumValue("DA41")
    DA_41("DA41"),
    @XmlEnumValue("DA42")
    DA_42("DA42"),
    @XmlEnumValue("DA43")
    DA_43("DA43"),
    @XmlEnumValue("DA44")
    DA_44("DA44"),
    @XmlEnumValue("EA01")
    EA_01("EA01"),
    @XmlEnumValue("EA02")
    EA_02("EA02"),
    @XmlEnumValue("EA03")
    EA_03("EA03"),
    @XmlEnumValue("EA04")
    EA_04("EA04"),
    @XmlEnumValue("EA05")
    EA_05("EA05"),
    @XmlEnumValue("EA06")
    EA_06("EA06"),
    @XmlEnumValue("EA07")
    EA_07("EA07"),
    @XmlEnumValue("EA08")
    EA_08("EA08"),
    @XmlEnumValue("EA09")
    EA_09("EA09"),
    @XmlEnumValue("EA10")
    EA_10("EA10"),
    @XmlEnumValue("EA11")
    EA_11("EA11"),
    @XmlEnumValue("EA12")
    EA_12("EA12"),
    @XmlEnumValue("EA13")
    EA_13("EA13"),
    @XmlEnumValue("EA14")
    EA_14("EA14"),
    @XmlEnumValue("EA15")
    EA_15("EA15"),
    @XmlEnumValue("EA16")
    EA_16("EA16"),
    @XmlEnumValue("EA17")
    EA_17("EA17"),
    @XmlEnumValue("EA18")
    EA_18("EA18"),
    @XmlEnumValue("EA19")
    EA_19("EA19"),
    @XmlEnumValue("EA20")
    EA_20("EA20"),
    @XmlEnumValue("EA21")
    EA_21("EA21"),
    @XmlEnumValue("EA22")
    EA_22("EA22"),
    @XmlEnumValue("EA23")
    EA_23("EA23"),
    @XmlEnumValue("EA24")
    EA_24("EA24"),
    @XmlEnumValue("EA25")
    EA_25("EA25"),
    @XmlEnumValue("EA26")
    EA_26("EA26"),
    @XmlEnumValue("EA27")
    EA_27("EA27"),
    @XmlEnumValue("EA28")
    EA_28("EA28"),
    @XmlEnumValue("EA29")
    EA_29("EA29"),
    @XmlEnumValue("EA30")
    EA_30("EA30"),
    @XmlEnumValue("FA01")
    FA_01("FA01"),
    @XmlEnumValue("FA02")
    FA_02("FA02"),
    @XmlEnumValue("FA03")
    FA_03("FA03"),
    @XmlEnumValue("FA04")
    FA_04("FA04"),
    @XmlEnumValue("FB01")
    FB_01("FB01"),
    @XmlEnumValue("FB02")
    FB_02("FB02"),
    @XmlEnumValue("FB03")
    FB_03("FB03"),
    @XmlEnumValue("FB04")
    FB_04("FB04"),
    @XmlEnumValue("FB05")
    FB_05("FB05"),
    @XmlEnumValue("FB06")
    FB_06("FB06"),
    @XmlEnumValue("FB07")
    FB_07("FB07"),
    @XmlEnumValue("FB08")
    FB_08("FB08"),
    @XmlEnumValue("FB09")
    FB_09("FB09"),
    @XmlEnumValue("FB10")
    FB_10("FB10"),
    @XmlEnumValue("FB11")
    FB_11("FB11"),
    @XmlEnumValue("FB12")
    FB_12("FB12"),
    @XmlEnumValue("FB13")
    FB_13("FB13"),
    @XmlEnumValue("FC01")
    FC_01("FC01"),
    @XmlEnumValue("FC02")
    FC_02("FC02"),
    @XmlEnumValue("FC03")
    FC_03("FC03"),
    @XmlEnumValue("FD01")
    FD_01("FD01"),
    @XmlEnumValue("FD02")
    FD_02("FD02"),
    @XmlEnumValue("FD03")
    FD_03("FD03"),
    @XmlEnumValue("FD04")
    FD_04("FD04"),
    @XmlEnumValue("FD05")
    FD_05("FD05"),
    @XmlEnumValue("FE01")
    FE_01("FE01"),
    @XmlEnumValue("FE02")
    FE_02("FE02"),
    @XmlEnumValue("FE03")
    FE_03("FE03"),
    @XmlEnumValue("FF01")
    FF_01("FF01"),
    @XmlEnumValue("FF02")
    FF_02("FF02"),
    @XmlEnumValue("FG01")
    FG_01("FG01"),
    @XmlEnumValue("FG02")
    FG_02("FG02"),
    @XmlEnumValue("FG03")
    FG_03("FG03"),
    @XmlEnumValue("FG04")
    FG_04("FG04"),
    @XmlEnumValue("FG05")
    FG_05("FG05"),
    @XmlEnumValue("FG06")
    FG_06("FG06"),
    @XmlEnumValue("FG07")
    FG_07("FG07"),
    @XmlEnumValue("FG08")
    FG_08("FG08"),
    @XmlEnumValue("FG09")
    FG_09("FG09"),
    @XmlEnumValue("FG10")
    FG_10("FG10"),
    @XmlEnumValue("FG11")
    FG_11("FG11"),
    @XmlEnumValue("FG12")
    FG_12("FG12"),
    @XmlEnumValue("FG13")
    FG_13("FG13"),
    @XmlEnumValue("FG14")
    FG_14("FG14"),
    @XmlEnumValue("FG15")
    FG_15("FG15"),
    @XmlEnumValue("FG16")
    FG_16("FG16"),
    @XmlEnumValue("FG17")
    FG_17("FG17"),
    @XmlEnumValue("FG18")
    FG_18("FG18"),
    @XmlEnumValue("FG19")
    FG_19("FG19"),
    @XmlEnumValue("FG20")
    FG_20("FG20"),
    @XmlEnumValue("FG21")
    FG_21("FG21"),
    @XmlEnumValue("FG22")
    FG_22("FG22"),
    @XmlEnumValue("FG23")
    FG_23("FG23"),
    @XmlEnumValue("FG24")
    FG_24("FG24"),
    @XmlEnumValue("FG25")
    FG_25("FG25"),
    @XmlEnumValue("GA01")
    GA_01("GA01"),
    @XmlEnumValue("GA02")
    GA_02("GA02"),
    @XmlEnumValue("GA03")
    GA_03("GA03"),
    @XmlEnumValue("GA04")
    GA_04("GA04"),
    @XmlEnumValue("GA05")
    GA_05("GA05"),
    @XmlEnumValue("GA06")
    GA_06("GA06"),
    @XmlEnumValue("GA07")
    GA_07("GA07"),
    @XmlEnumValue("GA08")
    GA_08("GA08"),
    @XmlEnumValue("GA09")
    GA_09("GA09"),
    @XmlEnumValue("GA10")
    GA_10("GA10"),
    @XmlEnumValue("GA11")
    GA_11("GA11"),
    @XmlEnumValue("GA12")
    GA_12("GA12"),
    @XmlEnumValue("GA13")
    GA_13("GA13"),
    @XmlEnumValue("GA14")
    GA_14("GA14"),
    @XmlEnumValue("GA15")
    GA_15("GA15"),
    @XmlEnumValue("GA16")
    GA_16("GA16"),
    @XmlEnumValue("GA17")
    GA_17("GA17"),
    @XmlEnumValue("GA18")
    GA_18("GA18"),
    @XmlEnumValue("GA19")
    GA_19("GA19"),
    @XmlEnumValue("GA20")
    GA_20("GA20"),
    @XmlEnumValue("GA21")
    GA_21("GA21"),
    @XmlEnumValue("GA22")
    GA_22("GA22"),
    @XmlEnumValue("GA32")
    GA_32("GA32"),
    @XmlEnumValue("GA33")
    GA_33("GA33"),
    @XmlEnumValue("GB01")
    GB_01("GB01"),
    @XmlEnumValue("GB02")
    GB_02("GB02"),
    @XmlEnumValue("GB03")
    GB_03("GB03"),
    @XmlEnumValue("GB04")
    GB_04("GB04"),
    @XmlEnumValue("GC01")
    GC_01("GC01"),
    @XmlEnumValue("GC02")
    GC_02("GC02"),
    @XmlEnumValue("GC03")
    GC_03("GC03"),
    @XmlEnumValue("GC04")
    GC_04("GC04"),
    @XmlEnumValue("GC05")
    GC_05("GC05"),
    @XmlEnumValue("GC06")
    GC_06("GC06"),
    @XmlEnumValue("GC07")
    GC_07("GC07"),
    @XmlEnumValue("GC08")
    GC_08("GC08"),
    @XmlEnumValue("GC09")
    GC_09("GC09"),
    @XmlEnumValue("GC10")
    GC_10("GC10"),
    @XmlEnumValue("GC11")
    GC_11("GC11"),
    @XmlEnumValue("GC12")
    GC_12("GC12"),
    @XmlEnumValue("GC13")
    GC_13("GC13"),
    @XmlEnumValue("GC14")
    GC_14("GC14"),
    @XmlEnumValue("GC15")
    GC_15("GC15"),
    @XmlEnumValue("GC16")
    GC_16("GC16"),
    @XmlEnumValue("GC17")
    GC_17("GC17"),
    @XmlEnumValue("GC18")
    GC_18("GC18"),
    @XmlEnumValue("GC19")
    GC_19("GC19"),
    @XmlEnumValue("GC20")
    GC_20("GC20"),
    @XmlEnumValue("GC21")
    GC_21("GC21"),
    @XmlEnumValue("GC22")
    GC_22("GC22"),
    @XmlEnumValue("GC23")
    GC_23("GC23"),
    @XmlEnumValue("GC24")
    GC_24("GC24"),
    @XmlEnumValue("GC25")
    GC_25("GC25"),
    @XmlEnumValue("GC26")
    GC_26("GC26"),
    @XmlEnumValue("GC27")
    GC_27("GC27"),
    @XmlEnumValue("GC28")
    GC_28("GC28"),
    @XmlEnumValue("GC29")
    GC_29("GC29"),
    @XmlEnumValue("GC30")
    GC_30("GC30"),
    @XmlEnumValue("GC31")
    GC_31("GC31"),
    @XmlEnumValue("GC32")
    GC_32("GC32"),
    @XmlEnumValue("GC33")
    GC_33("GC33"),
    @XmlEnumValue("GC34")
    GC_34("GC34"),
    @XmlEnumValue("HA01")
    HA_01("HA01"),
    @XmlEnumValue("HA02")
    HA_02("HA02"),
    @XmlEnumValue("HA03")
    HA_03("HA03"),
    @XmlEnumValue("HA04")
    HA_04("HA04"),
    @XmlEnumValue("HA05")
    HA_05("HA05"),
    @XmlEnumValue("HA06")
    HA_06("HA06"),
    @XmlEnumValue("HA07")
    HA_07("HA07"),
    @XmlEnumValue("HA08")
    HA_08("HA08"),
    @XmlEnumValue("HA09")
    HA_09("HA09"),
    @XmlEnumValue("HA10")
    HA_10("HA10"),
    @XmlEnumValue("HA11")
    HA_11("HA11"),
    @XmlEnumValue("HA12")
    HA_12("HA12"),
    @XmlEnumValue("HA13")
    HA_13("HA13"),
    @XmlEnumValue("HA14")
    HA_14("HA14"),
    @XmlEnumValue("HA15")
    HA_15("HA15"),
    @XmlEnumValue("HA16")
    HA_16("HA16"),
    @XmlEnumValue("HA17")
    HA_17("HA17"),
    @XmlEnumValue("HA18")
    HA_18("HA18"),
    @XmlEnumValue("HA19")
    HA_19("HA19"),
    @XmlEnumValue("HA20")
    HA_20("HA20"),
    @XmlEnumValue("HA21")
    HA_21("HA21"),
    @XmlEnumValue("HA22")
    HA_22("HA22"),
    @XmlEnumValue("HA23")
    HA_23("HA23"),
    @XmlEnumValue("HA24")
    HA_24("HA24"),
    @XmlEnumValue("HA25")
    HA_25("HA25"),
    @XmlEnumValue("HA26")
    HA_26("HA26"),
    @XmlEnumValue("HA27")
    HA_27("HA27"),
    @XmlEnumValue("HA28")
    HA_28("HA28"),
    @XmlEnumValue("HA29")
    HA_29("HA29"),
    @XmlEnumValue("HA30")
    HA_30("HA30"),
    @XmlEnumValue("HA31")
    HA_31("HA31"),
    @XmlEnumValue("IA01")
    IA_01("IA01"),
    @XmlEnumValue("IA02")
    IA_02("IA02"),
    @XmlEnumValue("IA03")
    IA_03("IA03"),
    @XmlEnumValue("IA04")
    IA_04("IA04"),
    @XmlEnumValue("IA05")
    IA_05("IA05"),
    @XmlEnumValue("IA06")
    IA_06("IA06"),
    @XmlEnumValue("IA07")
    IA_07("IA07"),
    @XmlEnumValue("IA08")
    IA_08("IA08"),
    @XmlEnumValue("IA09")
    IA_09("IA09"),
    @XmlEnumValue("IA10")
    IA_10("IA10"),
    @XmlEnumValue("IA11")
    IA_11("IA11"),
    @XmlEnumValue("IA13")
    IA_13("IA13"),
    @XmlEnumValue("IA14")
    IA_14("IA14"),
    @XmlEnumValue("IA15")
    IA_15("IA15"),
    @XmlEnumValue("IA16")
    IA_16("IA16"),
    @XmlEnumValue("IA17")
    IA_17("IA17"),
    @XmlEnumValue("IA18")
    IA_18("IA18"),
    @XmlEnumValue("IA19")
    IA_19("IA19"),
    @XmlEnumValue("IA20")
    IA_20("IA20"),
    @XmlEnumValue("IA21")
    IA_21("IA21"),
    @XmlEnumValue("IA22")
    IA_22("IA22"),
    @XmlEnumValue("IA23")
    IA_23("IA23"),
    @XmlEnumValue("IA24")
    IA_24("IA24"),
    @XmlEnumValue("IA25")
    IA_25("IA25"),
    @XmlEnumValue("IA26")
    IA_26("IA26"),
    @XmlEnumValue("IA27")
    IA_27("IA27"),
    @XmlEnumValue("IA28")
    IA_28("IA28"),
    @XmlEnumValue("IA29")
    IA_29("IA29"),
    @XmlEnumValue("IA30")
    IA_30("IA30"),
    @XmlEnumValue("IA31")
    IA_31("IA31"),
    @XmlEnumValue("IA32")
    IA_32("IA32"),
    @XmlEnumValue("IA33")
    IA_33("IA33"),
    @XmlEnumValue("IA34")
    IA_34("IA34"),
    @XmlEnumValue("IA35")
    IA_35("IA35"),
    @XmlEnumValue("IA36")
    IA_36("IA36"),
    @XmlEnumValue("IA37")
    IA_37("IA37"),
    @XmlEnumValue("IA38")
    IA_38("IA38"),
    @XmlEnumValue("IA39")
    IA_39("IA39"),
    @XmlEnumValue("IA40")
    IA_40("IA40"),
    @XmlEnumValue("IA41")
    IA_41("IA41"),
    @XmlEnumValue("IA42")
    IA_42("IA42"),
    @XmlEnumValue("JA01")
    JA_01("JA01"),
    @XmlEnumValue("JA02")
    JA_02("JA02"),
    @XmlEnumValue("JA03")
    JA_03("JA03"),
    @XmlEnumValue("JA04")
    JA_04("JA04"),
    @XmlEnumValue("JA05")
    JA_05("JA05"),
    @XmlEnumValue("JA06")
    JA_06("JA06"),
    @XmlEnumValue("JA07")
    JA_07("JA07"),
    @XmlEnumValue("JA08")
    JA_08("JA08"),
    @XmlEnumValue("JA09")
    JA_09("JA09"),
    @XmlEnumValue("JA10")
    JA_10("JA10"),
    @XmlEnumValue("JA11")
    JA_11("JA11"),
    @XmlEnumValue("JA12")
    JA_12("JA12"),
    @XmlEnumValue("JA13")
    JA_13("JA13"),
    @XmlEnumValue("JA14")
    JA_14("JA14"),
    @XmlEnumValue("JA15")
    JA_15("JA15"),
    @XmlEnumValue("JA16")
    JA_16("JA16"),
    @XmlEnumValue("JA17")
    JA_17("JA17"),
    @XmlEnumValue("JA18")
    JA_18("JA18"),
    @XmlEnumValue("JA19")
    JA_19("JA19"),
    @XmlEnumValue("JA20")
    JA_20("JA20"),
    @XmlEnumValue("JA21")
    JA_21("JA21"),
    @XmlEnumValue("JA22")
    JA_22("JA22"),
    @XmlEnumValue("JA23")
    JA_23("JA23"),
    @XmlEnumValue("JA24")
    JA_24("JA24"),
    @XmlEnumValue("KA01")
    KA_01("KA01"),
    @XmlEnumValue("KA02")
    KA_02("KA02"),
    @XmlEnumValue("KA03")
    KA_03("KA03"),
    @XmlEnumValue("KA04")
    KA_04("KA04"),
    @XmlEnumValue("KA05")
    KA_05("KA05"),
    @XmlEnumValue("KA06")
    KA_06("KA06"),
    @XmlEnumValue("KA07")
    KA_07("KA07"),
    @XmlEnumValue("KA08")
    KA_08("KA08"),
    @XmlEnumValue("KA09")
    KA_09("KA09"),
    @XmlEnumValue("KA10")
    KA_10("KA10"),
    @XmlEnumValue("KA11")
    KA_11("KA11"),
    @XmlEnumValue("KA12")
    KA_12("KA12"),
    @XmlEnumValue("KA13")
    KA_13("KA13"),
    @XmlEnumValue("KA14")
    KA_14("KA14"),
    @XmlEnumValue("KA15")
    KA_15("KA15"),
    @XmlEnumValue("KA16")
    KA_16("KA16"),
    @XmlEnumValue("LA01")
    LA_01("LA01"),
    @XmlEnumValue("LA02")
    LA_02("LA02"),
    @XmlEnumValue("LA03")
    LA_03("LA03"),
    @XmlEnumValue("LA04")
    LA_04("LA04"),
    @XmlEnumValue("LA05")
    LA_05("LA05"),
    @XmlEnumValue("LA06")
    LA_06("LA06"),
    @XmlEnumValue("LA07")
    LA_07("LA07"),
    @XmlEnumValue("LA08")
    LA_08("LA08"),
    @XmlEnumValue("LA09")
    LA_09("LA09"),
    @XmlEnumValue("LA10")
    LA_10("LA10"),
    @XmlEnumValue("LA11")
    LA_11("LA11"),
    @XmlEnumValue("LA12")
    LA_12("LA12"),
    @XmlEnumValue("LA13")
    LA_13("LA13"),
    @XmlEnumValue("LA14")
    LA_14("LA14"),
    @XmlEnumValue("LA15")
    LA_15("LA15"),
    @XmlEnumValue("LA16")
    LA_16("LA16"),
    @XmlEnumValue("LA17")
    LA_17("LA17"),
    @XmlEnumValue("LA18")
    LA_18("LA18"),
    @XmlEnumValue("LA19")
    LA_19("LA19"),
    @XmlEnumValue("LA20")
    LA_20("LA20"),
    @XmlEnumValue("LA21")
    LA_21("LA21"),
    @XmlEnumValue("LA22")
    LA_22("LA22"),
    @XmlEnumValue("LA23")
    LA_23("LA23"),
    @XmlEnumValue("LA24")
    LA_24("LA24"),
    @XmlEnumValue("LA25")
    LA_25("LA25"),
    @XmlEnumValue("LA26")
    LA_26("LA26"),
    @XmlEnumValue("LA27")
    LA_27("LA27"),
    @XmlEnumValue("LA28")
    LA_28("LA28"),
    @XmlEnumValue("LA29")
    LA_29("LA29"),
    @XmlEnumValue("LA30")
    LA_30("LA30"),
    @XmlEnumValue("LA31")
    LA_31("LA31"),
    @XmlEnumValue("LA32")
    LA_32("LA32"),
    @XmlEnumValue("LA33")
    LA_33("LA33"),
    @XmlEnumValue("LA34")
    LA_34("LA34"),
    @XmlEnumValue("LA35")
    LA_35("LA35"),
    @XmlEnumValue("LA36")
    LA_36("LA36"),
    @XmlEnumValue("LA37")
    LA_37("LA37"),
    @XmlEnumValue("LA38")
    LA_38("LA38"),
    @XmlEnumValue("LA39")
    LA_39("LA39"),
    @XmlEnumValue("LA40")
    LA_40("LA40"),
    @XmlEnumValue("LA41")
    LA_41("LA41"),
    @XmlEnumValue("LA42")
    LA_42("LA42"),
    @XmlEnumValue("LA43")
    LA_43("LA43"),
    @XmlEnumValue("LA44")
    LA_44("LA44"),
    @XmlEnumValue("LA45")
    LA_45("LA45"),
    @XmlEnumValue("LA46")
    LA_46("LA46"),
    @XmlEnumValue("LA47")
    LA_47("LA47"),
    @XmlEnumValue("LA48")
    LA_48("LA48"),
    @XmlEnumValue("LA49")
    LA_49("LA49"),
    @XmlEnumValue("LA50")
    LA_50("LA50"),
    @XmlEnumValue("LA51")
    LA_51("LA51"),
    @XmlEnumValue("LA52")
    LA_52("LA52"),
    @XmlEnumValue("LA53")
    LA_53("LA53"),
    @XmlEnumValue("LA54")
    LA_54("LA54"),
    @XmlEnumValue("LA55")
    LA_55("LA55"),
    @XmlEnumValue("MA01")
    MA_01("MA01"),
    @XmlEnumValue("MA02")
    MA_02("MA02"),
    @XmlEnumValue("MA03")
    MA_03("MA03"),
    @XmlEnumValue("MA04")
    MA_04("MA04"),
    @XmlEnumValue("MA05")
    MA_05("MA05"),
    @XmlEnumValue("MA06")
    MA_06("MA06"),
    @XmlEnumValue("MA07")
    MA_07("MA07"),
    @XmlEnumValue("MA08")
    MA_08("MA08"),
    @XmlEnumValue("MA09")
    MA_09("MA09"),
    @XmlEnumValue("MA10")
    MA_10("MA10"),
    @XmlEnumValue("MA11")
    MA_11("MA11"),
    @XmlEnumValue("MA12")
    MA_12("MA12"),
    @XmlEnumValue("MA13")
    MA_13("MA13"),
    @XmlEnumValue("MA14")
    MA_14("MA14"),
    @XmlEnumValue("MB01")
    MB_01("MB01"),
    @XmlEnumValue("MB02")
    MB_02("MB02"),
    @XmlEnumValue("MB03")
    MB_03("MB03"),
    @XmlEnumValue("MB04")
    MB_04("MB04"),
    @XmlEnumValue("MD01")
    MD_01("MD01"),
    @XmlEnumValue("MD02")
    MD_02("MD02"),
    @XmlEnumValue("MD03")
    MD_03("MD03"),
    @XmlEnumValue("MD04")
    MD_04("MD04"),
    @XmlEnumValue("MD05")
    MD_05("MD05"),
    @XmlEnumValue("MD06")
    MD_06("MD06"),
    @XmlEnumValue("MD07")
    MD_07("MD07"),
    @XmlEnumValue("ME01")
    ME_01("ME01"),
    @XmlEnumValue("ME02")
    ME_02("ME02"),
    @XmlEnumValue("ME03")
    ME_03("ME03"),
    @XmlEnumValue("ME04")
    ME_04("ME04"),
    @XmlEnumValue("ME05")
    ME_05("ME05"),
    @XmlEnumValue("MF01")
    MF_01("MF01"),
    @XmlEnumValue("MF02")
    MF_02("MF02"),
    @XmlEnumValue("MF03")
    MF_03("MF03"),
    @XmlEnumValue("MF04")
    MF_04("MF04"),
    @XmlEnumValue("MF05")
    MF_05("MF05"),
    @XmlEnumValue("MF06")
    MF_06("MF06"),
    @XmlEnumValue("MF07")
    MF_07("MF07"),
    @XmlEnumValue("MF08")
    MF_08("MF08"),
    @XmlEnumValue("MF09")
    MF_09("MF09"),
    @XmlEnumValue("MF10")
    MF_10("MF10"),
    @XmlEnumValue("PA01")
    PA_01("PA01"),
    @XmlEnumValue("PA02")
    PA_02("PA02"),
    @XmlEnumValue("PA03")
    PA_03("PA03"),
    @XmlEnumValue("PB01")
    PB_01("PB01"),
    @XmlEnumValue("PB02")
    PB_02("PB02"),
    @XmlEnumValue("PB03")
    PB_03("PB03"),
    @XmlEnumValue("PB04")
    PB_04("PB04"),
    @XmlEnumValue("PB05")
    PB_05("PB05"),
    @XmlEnumValue("PB06")
    PB_06("PB06"),
    @XmlEnumValue("QA01")
    QA_01("QA01"),
    @XmlEnumValue("QA02")
    QA_02("QA02"),
    @XmlEnumValue("QA03")
    QA_03("QA03"),
    @XmlEnumValue("QA04")
    QA_04("QA04"),
    @XmlEnumValue("QA05")
    QA_05("QA05"),
    @XmlEnumValue("QA06")
    QA_06("QA06"),
    @XmlEnumValue("QA07")
    QA_07("QA07"),
    @XmlEnumValue("QA08")
    QA_08("QA08"),
    @XmlEnumValue("QA09")
    QA_09("QA09"),
    @XmlEnumValue("QA10")
    QA_10("QA10"),
    @XmlEnumValue("QA11")
    QA_11("QA11"),
    @XmlEnumValue("QA12")
    QA_12("QA12"),
    @XmlEnumValue("QA13")
    QA_13("QA13"),
    @XmlEnumValue("QB01")
    QB_01("QB01"),
    @XmlEnumValue("QB02")
    QB_02("QB02"),
    @XmlEnumValue("QB03")
    QB_03("QB03"),
    @XmlEnumValue("QB04")
    QB_04("QB04"),
    @XmlEnumValue("QB05")
    QB_05("QB05"),
    @XmlEnumValue("QB06")
    QB_06("QB06"),
    @XmlEnumValue("QB07")
    QB_07("QB07"),
    @XmlEnumValue("QB08")
    QB_08("QB08"),
    @XmlEnumValue("QB09")
    QB_09("QB09"),
    @XmlEnumValue("QB10")
    QB_10("QB10"),
    @XmlEnumValue("QB11")
    QB_11("QB11"),
    @XmlEnumValue("QB12")
    QB_12("QB12"),
    @XmlEnumValue("QB13")
    QB_13("QB13"),
    @XmlEnumValue("QB14")
    QB_14("QB14"),
    @XmlEnumValue("QB15")
    QB_15("QB15"),
    @XmlEnumValue("QB16")
    QB_16("QB16"),
    @XmlEnumValue("QB17")
    QB_17("QB17"),
    @XmlEnumValue("QB18")
    QB_18("QB18"),
    @XmlEnumValue("QB19")
    QB_19("QB19"),
    @XmlEnumValue("QB20")
    QB_20("QB20"),
    @XmlEnumValue("QB21")
    QB_21("QB21"),
    @XmlEnumValue("QB23")
    QB_23("QB23"),
    @XmlEnumValue("QB24")
    QB_24("QB24"),
    @XmlEnumValue("QB25")
    QB_25("QB25"),
    @XmlEnumValue("QB26")
    QB_26("QB26"),
    @XmlEnumValue("QB27")
    QB_27("QB27"),
    @XmlEnumValue("QB28")
    QB_28("QB28"),
    @XmlEnumValue("QB29")
    QB_29("QB29"),
    @XmlEnumValue("QB30")
    QB_30("QB30"),
    @XmlEnumValue("QB31")
    QB_31("QB31"),
    @XmlEnumValue("QB32")
    QB_32("QB32"),
    @XmlEnumValue("QB33")
    QB_33("QB33"),
    @XmlEnumValue("QB34")
    QB_34("QB34"),
    @XmlEnumValue("QB35")
    QB_35("QB35"),
    @XmlEnumValue("QB36")
    QB_36("QB36"),
    @XmlEnumValue("QB37")
    QB_37("QB37"),
    @XmlEnumValue("QB38")
    QB_38("QB38"),
    @XmlEnumValue("QB39")
    QB_39("QB39"),
    @XmlEnumValue("QB40")
    QB_40("QB40"),
    @XmlEnumValue("QB41")
    QB_41("QB41"),
    @XmlEnumValue("QB42")
    QB_42("QB42"),
    @XmlEnumValue("QB43")
    QB_43("QB43"),
    @XmlEnumValue("QB44")
    QB_44("QB44"),
    @XmlEnumValue("QB45")
    QB_45("QB45"),
    @XmlEnumValue("QB46")
    QB_46("QB46"),
    @XmlEnumValue("QB47")
    QB_47("QB47"),
    @XmlEnumValue("QB48")
    QB_48("QB48"),
    @XmlEnumValue("QB49")
    QB_49("QB49"),
    @XmlEnumValue("QB50")
    QB_50("QB50"),
    @XmlEnumValue("QB51")
    QB_51("QB51"),
    @XmlEnumValue("QB52")
    QB_52("QB52"),
    @XmlEnumValue("QB53")
    QB_53("QB53"),
    @XmlEnumValue("QB54")
    QB_54("QB54"),
    @XmlEnumValue("QB55")
    QB_55("QB55"),
    @XmlEnumValue("QB56")
    QB_56("QB56"),
    @XmlEnumValue("QB57")
    QB_57("QB57"),
    @XmlEnumValue("RA01")
    RA_01("RA01"),
    @XmlEnumValue("RA02")
    RA_02("RA02"),
    @XmlEnumValue("RA03")
    RA_03("RA03"),
    @XmlEnumValue("RA04")
    RA_04("RA04"),
    @XmlEnumValue("RA05")
    RA_05("RA05"),
    @XmlEnumValue("RA06")
    RA_06("RA06"),
    @XmlEnumValue("RA07")
    RA_07("RA07"),
    @XmlEnumValue("RA08")
    RA_08("RA08"),
    @XmlEnumValue("RA09")
    RA_09("RA09"),
    @XmlEnumValue("RA10")
    RA_10("RA10"),
    @XmlEnumValue("RA11")
    RA_11("RA11"),
    @XmlEnumValue("RA12")
    RA_12("RA12"),
    @XmlEnumValue("RA13")
    RA_13("RA13"),
    @XmlEnumValue("RA14")
    RA_14("RA14"),
    @XmlEnumValue("RA15")
    RA_15("RA15"),
    @XmlEnumValue("RA16")
    RA_16("RA16"),
    @XmlEnumValue("RB01")
    RB_01("RB01"),
    @XmlEnumValue("RB02")
    RB_02("RB02"),
    @XmlEnumValue("RB03")
    RB_03("RB03"),
    @XmlEnumValue("RB04")
    RB_04("RB04"),
    @XmlEnumValue("RB05")
    RB_05("RB05"),
    @XmlEnumValue("RB06")
    RB_06("RB06"),
    @XmlEnumValue("RB07")
    RB_07("RB07"),
    @XmlEnumValue("RB08")
    RB_08("RB08"),
    @XmlEnumValue("RB09")
    RB_09("RB09"),
    @XmlEnumValue("RB10")
    RB_10("RB10"),
    @XmlEnumValue("RB11")
    RB_11("RB11"),
    @XmlEnumValue("RB12")
    RB_12("RB12"),
    @XmlEnumValue("RB13")
    RB_13("RB13"),
    @XmlEnumValue("RB14")
    RB_14("RB14"),
    @XmlEnumValue("RB15")
    RB_15("RB15"),
    @XmlEnumValue("RB16")
    RB_16("RB16"),
    @XmlEnumValue("RB17")
    RB_17("RB17"),
    @XmlEnumValue("RB18")
    RB_18("RB18"),
    @XmlEnumValue("RB19")
    RB_19("RB19"),
    @XmlEnumValue("RB20")
    RB_20("RB20"),
    @XmlEnumValue("RB21")
    RB_21("RB21"),
    @XmlEnumValue("RC01")
    RC_01("RC01"),
    @XmlEnumValue("RC02")
    RC_02("RC02"),
    @XmlEnumValue("RC03")
    RC_03("RC03"),
    @XmlEnumValue("RC04")
    RC_04("RC04"),
    @XmlEnumValue("RC05")
    RC_05("RC05"),
    @XmlEnumValue("RC06")
    RC_06("RC06"),
    @XmlEnumValue("RC07")
    RC_07("RC07"),
    @XmlEnumValue("RC08")
    RC_08("RC08"),
    @XmlEnumValue("RD01")
    RD_01("RD01"),
    @XmlEnumValue("RD02")
    RD_02("RD02"),
    @XmlEnumValue("RD03")
    RD_03("RD03"),
    @XmlEnumValue("RD04")
    RD_04("RD04"),
    @XmlEnumValue("RD05")
    RD_05("RD05"),
    @XmlEnumValue("RD06")
    RD_06("RD06"),
    @XmlEnumValue("RD07")
    RD_07("RD07"),
    @XmlEnumValue("RD08")
    RD_08("RD08"),
    @XmlEnumValue("RD09")
    RD_09("RD09"),
    @XmlEnumValue("RD10")
    RD_10("RD10"),
    @XmlEnumValue("RD11")
    RD_11("RD11"),
    @XmlEnumValue("SA01")
    SA_01("SA01"),
    @XmlEnumValue("SA02")
    SA_02("SA02"),
    @XmlEnumValue("SA03")
    SA_03("SA03"),
    @XmlEnumValue("SA04")
    SA_04("SA04"),
    @XmlEnumValue("SB01")
    SB_01("SB01"),
    @XmlEnumValue("SB02")
    SB_02("SB02"),
    @XmlEnumValue("SC01")
    SC_01("SC01"),
    @XmlEnumValue("TA01")
    TA_01("TA01"),
    @XmlEnumValue("TA02")
    TA_02("TA02"),
    @XmlEnumValue("TA03")
    TA_03("TA03"),
    @XmlEnumValue("TA04")
    TA_04("TA04"),
    @XmlEnumValue("TA05")
    TA_05("TA05"),
    @XmlEnumValue("TA06")
    TA_06("TA06"),
    @XmlEnumValue("TA07")
    TA_07("TA07"),
    @XmlEnumValue("TA08")
    TA_08("TA08"),
    @XmlEnumValue("TA09")
    TA_09("TA09"),
    @XmlEnumValue("TA10")
    TA_10("TA10"),
    @XmlEnumValue("TA11")
    TA_11("TA11"),
    @XmlEnumValue("TA12")
    TA_12("TA12"),
    @XmlEnumValue("TA13")
    TA_13("TA13"),
    @XmlEnumValue("TA14")
    TA_14("TA14"),
    @XmlEnumValue("TA15")
    TA_15("TA15"),
    @XmlEnumValue("TA16")
    TA_16("TA16"),
    @XmlEnumValue("TA17")
    TA_17("TA17"),
    @XmlEnumValue("TA18")
    TA_18("TA18"),
    @XmlEnumValue("TA19")
    TA_19("TA19"),
    @XmlEnumValue("TA20")
    TA_20("TA20"),
    @XmlEnumValue("TA21")
    TA_21("TA21"),
    @XmlEnumValue("TA22")
    TA_22("TA22"),
    @XmlEnumValue("TA23")
    TA_23("TA23"),
    @XmlEnumValue("TA24")
    TA_24("TA24"),
    @XmlEnumValue("TA25")
    TA_25("TA25"),
    @XmlEnumValue("TA26")
    TA_26("TA26"),
    @XmlEnumValue("TA27")
    TA_27("TA27"),
    @XmlEnumValue("TA28")
    TA_28("TA28"),
    @XmlEnumValue("TA29")
    TA_29("TA29"),
    @XmlEnumValue("TA30")
    TA_30("TA30"),
    @XmlEnumValue("TA31")
    TA_31("TA31"),
    @XmlEnumValue("TA32")
    TA_32("TA32"),
    @XmlEnumValue("TA33")
    TA_33("TA33"),
    @XmlEnumValue("TA34")
    TA_34("TA34"),
    @XmlEnumValue("TA35")
    TA_35("TA35"),
    @XmlEnumValue("TA36")
    TA_36("TA36"),
    @XmlEnumValue("TA37")
    TA_37("TA37"),
    @XmlEnumValue("TA38")
    TA_38("TA38"),
    @XmlEnumValue("TA39")
    TA_39("TA39"),
    @XmlEnumValue("TA40")
    TA_40("TA40"),
    @XmlEnumValue("TA41")
    TA_41("TA41"),
    @XmlEnumValue("TA42")
    TA_42("TA42"),
    @XmlEnumValue("TA43")
    TA_43("TA43"),
    @XmlEnumValue("TA44")
    TA_44("TA44"),
    @XmlEnumValue("TA45")
    TA_45("TA45"),
    @XmlEnumValue("TA46")
    TA_46("TA46"),
    @XmlEnumValue("TA47")
    TA_47("TA47"),
    @XmlEnumValue("TA48")
    TA_48("TA48"),
    @XmlEnumValue("UA01")
    UA_01("UA01"),
    @XmlEnumValue("UA02")
    UA_02("UA02"),
    @XmlEnumValue("UB01")
    UB_01("UB01"),
    @XmlEnumValue("UB02")
    UB_02("UB02"),
    @XmlEnumValue("UB03")
    UB_03("UB03"),
    @XmlEnumValue("UB04")
    UB_04("UB04"),
    @XmlEnumValue("UB05")
    UB_05("UB05"),
    @XmlEnumValue("UB06")
    UB_06("UB06"),
    @XmlEnumValue("UB07")
    UB_07("UB07"),
    @XmlEnumValue("UB08")
    UB_08("UB08");
    private final String value;

    TypeCPVBaseSupplementaire(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCPVBaseSupplementaire fromValue(String v) {
        for (TypeCPVBaseSupplementaire c: TypeCPVBaseSupplementaire.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
