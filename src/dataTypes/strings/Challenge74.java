/*
    A sandwich is two pieces of bread with something in between. 
    Return the string that is between the first and last appearance of "bread" 
    in the given string, or return the empty string "" if there are not two pieces of bread.

    getSandwich("breadjambread") → "jam"
    getSandwich("xxbreadjambreadyy") → "jam"
    getSandwich("xxbreadyy") → ""
*/
package dataTypes.strings;

public class Challenge74 {
    
    public String getSandwich(String str){

        String word = "bread";

        int first = str.indexOf(word);
        int last = str.lastIndexOf(word);

        if(first == -1 || first == last){
            return "";
        }

        return str.substring(first + word.length(), last);
    }

    public static void main(String[] args){

        Challenge74 ch = new Challenge74();

        System.out.println(ch.getSandwich("breadjambread"));
        System.out.println(ch.getSandwich("xxbreadjambreadyy"));
        System.out.println(ch.getSandwich("xxbreadyy"));
    }
}
