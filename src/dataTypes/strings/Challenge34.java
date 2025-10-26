/*
    String-1 > firstTwo
    Given a string, return the string made of its first two chars, 
    so the String "Hello" yields "He". If the string is shorter than length 2, 
    return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
    Note that str.length() returns the length of a string.

    firstTwo("Hello") → "He"
    firstTwo("abcdefg") → "ab"
    firstTwo("ab") → "ab"
 */
package dataTypes.strings;

public class Challenge34 {
    
    public String firstTwo(String word){

        if(word.length()<=2){
            return word;
        }

        String stg = word.substring(0, 2);
        return stg;
    }

    public static void main(String[] args){

        Challenge34 ch = new Challenge34();
        
        System.out.println(ch.firstTwo("Hello"));
        System.out.println(ch.firstTwo("abcdefg"));
        System.out.println(ch.firstTwo("ab"));
    }
}
