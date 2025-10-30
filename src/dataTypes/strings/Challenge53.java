/*
    String-1 > extraFront
    Given a string, return a new string made of 3 copies of the first 2 chars of the original string. 
    The string may be any length. If there are fewer than 2 chars, use whatever is there.

    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"
 */
package dataTypes.strings;

public class Challenge53 {
    
    public String extraFront(String word){

        if(word.length() <= 2){
            return word + word + word;
        } else{
            String stg = word.substring(0, 2);
            return stg + stg + stg;
        } 
    }

    public static void main(String[] args){

        Challenge53 ch = new Challenge53();

        System.out.println(ch.extraFront("Hello"));
        System.out.println(ch.extraFront("ab"));
        System.out.println(ch.extraFront("H"));
    }
}