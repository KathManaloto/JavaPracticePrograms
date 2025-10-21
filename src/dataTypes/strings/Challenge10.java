/*
    Warmup-1 > missingChar
    Given a non-empty string and an int n, 
    return a new string where the char at index n has been removed. 
    The value of n will be a valid index of a char in the original string 
    (i.e. n will be in the range 0..str.length()-1 inclusive).

    missingChar("kitten", 1) → "ktten"
    missingChar("kitten", 0) → "itten"
    missingChar("kitten", 4) → "kittn"
 */
package dataTypes.strings;

public class Challenge10 {
    
    public String missingChar(String word, int n){
        String front = word.substring(0,n);
        String back = word.substring(n+1, word.length());

        return front + back;
    }

    public static void main(String[] args){
        Challenge10 ch = new Challenge10();
        System.out.println(ch.missingChar("kitten", 1));
        System.out.println(ch.missingChar("kitten", 0));
        System.out.println(ch.missingChar("kitten", 4));
    }
}
