/*
    String-1 > makeTags
    The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
package dataTypes.strings;

public class Challenge59 {
    
    public String makeTags(String tag, String word){

        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args){

        Challenge59 ch = new Challenge59();

        System.out.println(ch.makeTags("i", "Yay"));
        System.out.println(ch.makeTags("i", "Hello"));
        System.out.println(ch.makeTags("cite", "Yay"));
    }
}
