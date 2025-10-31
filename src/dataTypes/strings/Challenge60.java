/*
    String-1 > middleTwo
    Given a string of even length, return a string made of the middle two chars, 
    so the string "string" yields "ri". The string length will be at least 2.

    middleTwo("string") → "ri"
    middleTwo("code") → "od"
    middleTwo("Practice") → "ct"
 */
package dataTypes.strings;

public class Challenge60 {
    
    public String middleTwo(String word){

        int center = word.length() / 2;
        return word.substring(center-1, center+1);
    }

    public static void main(String[] args){

        Challenge60 ch = new Challenge60();

        System.out.println(ch.middleTwo("string"));
        System.out.println(ch.middleTwo("code"));
        System.out.println(ch.middleTwo("Practice"));
    }
}