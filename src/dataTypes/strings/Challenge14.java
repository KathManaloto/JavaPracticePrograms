/*
    Warmup-1 > endUp
    Given a string, return a new string where the last 3 chars are now in upper case. 
    If the string has less than 3 chars, uppercase whatever is there. 
    Note that str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"
 */

package dataTypes.strings; 

public class Challenge14 {
    
    public String endUp(String word){
        int count = word.length();

        if(count<3){
            return word.toUpperCase();
        }
        
        String lastString = word.substring(count-3, count).toUpperCase();
        return word.substring(0,count-3) + lastString;
    }

    public static void main(String[] args){
        Challenge14 ch = new Challenge14();

        System.out.println(ch.endUp("Hello"));
        System.out.println(ch.endUp("hi there"));
        System.out.println(ch.endUp("hi"));

    }
}
