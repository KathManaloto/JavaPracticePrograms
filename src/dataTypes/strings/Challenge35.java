/*
String-1 > firstHalf
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
*/
package dataTypes.strings;

public class Challenge35{

    public String firstHalf(String word){

        return word.substring(0, (word.length()/2));

    }

    public static void main(String[] args){

        Challenge35 ch = new Challenge35();

        System.out.println(ch.firstHalf("WooHoo"));
        System.out.println(ch.firstHalf("HelloThere"));
        System.out.println(ch.firstHalf("abcdef"));
    }
}