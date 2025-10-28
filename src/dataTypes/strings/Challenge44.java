/*
    String-1 > nTwice
    Given a string and an int n, return a string made of the first and 
    last n chars from the string. The string length will be at least n.

    nTwice("Hello", 2) → "Helo"
    nTwice("Chocolate", 3) → "Choate"
    nTwice("Chocolate", 1) → "Ce"
 */
package dataTypes.strings;

public class Challenge44 {
    
    public String nTwice(String word, int n){

        
        String front = word.substring(0, n);
        String last = word.substring(word.length()-n, word.length());

        return front + last;
    }

    public static void main(String[] args){

        Challenge44 ch = new Challenge44();

        System.out.println(ch.nTwice("Hello", 2));
        System.out.println(ch.nTwice("Chocolate", 3));
        System.out.println(ch.nTwice("Chocolate", 1));
    }
}
