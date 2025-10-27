/*
    String-1 > withoutEnd
    Given a string, return a version without the first and last char, 
    so "Hello" yields "ell". The string length will be at least 2.

    withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"
*/

package dataTypes.strings;

public class Challenge36 {
    
    public String withoutEnd(String word){

        if(word.length() == 2){
            return "";
        } 

        return word.substring(1, word.length()-1);

    }

    public static void main(String[] args){

        Challenge36 ch = new Challenge36();

        System.out.println(ch.withoutEnd("Hello"));
        System.out.println(ch.withoutEnd("java"));
        System.out.println(ch.withoutEnd("coding"));
    }
}
