/*
    String-1 > makeOutWord
    Given an "out" string length 4, such as "<<>>", and a word, 
    return a new string where the word is in the middle of the out string, 
    e.g. "<<word>>". Note: use str.substring(i, j) to extract the 
    String starting at index i and going up to but not including index j.

    makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"
 */
package dataTypes.strings;

public class Challenge32 {
   
    public String makeOutWord(String out, String word){

        return out.substring(0,2) + word + out.substring(out.length()-2, out.length());
    }

    public static void main(String[] args){

        Challenge32 ch = new Challenge32();

        System.out.println(ch.makeOutWord("<<>>", "Yay")); 
        System.out.println(ch.makeOutWord("<<>>", "WooHoo"));
        System.out.println(ch.makeOutWord("[[]]", "word"));
    }
}
