/*
    Warmup-1 > frontBack
    Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
*/
package dataTypes.strings;

public class Challenge17{
    
    public String frontBack(String word){
     

        if(word.length()<2){
            return word;
        } 
        
        String first = word.substring(0,1);
        String last  = word.substring(word.length()-1);
        
        return last + word.substring(1, word.length()-1) + first;
        
    }

    public static void main(String[] args){
        Challenge17 ch = new Challenge17();

        System.out.println(ch.frontBack("code"));
        System.out.println(ch.frontBack("a"));
        System.out.println(ch.frontBack("ab"));

    }
}