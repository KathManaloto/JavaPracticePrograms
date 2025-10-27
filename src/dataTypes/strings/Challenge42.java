/*
    String-1 > withouEnd2
    Given a string, return a version without both the first and last char of the string. 
    The string may be any length, including 0.

    withouEnd2("Hello") → "ell"
    withouEnd2("abc") → "b"
    withouEnd2("ab") → ""
*/
package dataTypes.strings;

public class Challenge42 {
    
    public String withouEnd2(String word){

        if(word.length() <= 2){
            return "";
        }

        return word.substring(1, word.length()-1);
    }

    public static void main(String[] args){

        Challenge42 ch = new Challenge42();

        System.out.println(ch.withouEnd2("Hello"));
        System.out.println(ch.withouEnd2("abc"));
        System.out.println(ch.withouEnd2("ab"));
    }
}
