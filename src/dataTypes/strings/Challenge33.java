/*
    String-1 > extraEnd
    Given a string, return a new string made of 3 copies of the last 2 chars of the original string. 
    The string length will be at least 2.

    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
 */

package dataTypes.strings;

public class Challenge33 {
    
    public String extraEnd(String word){

        String stg = word.substring(word.length()-2, word.length());
        return stg + stg + stg;
    }

    public static void main(String[] args){
        Challenge33 ch = new Challenge33();

        System.out.println(ch.extraEnd("Hello"));
        System.out.println(ch.extraEnd("ab"));
        System.out.println(ch.extraEnd("Hi"));
    }
}
