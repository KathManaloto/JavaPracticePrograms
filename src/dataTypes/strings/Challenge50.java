/*
    String-1 > lastTwo
    Given a string of any length, return a new string where the last 2 chars, 
    if present, are swapped, so "coding" yields "codign".

    lastTwo("coding") → "codign"
    lastTwo("cat") → "cta"
    lastTwo("ab") → "ba"
 */
package dataTypes.strings;

public class Challenge50 {
    
    public String lastTwo(String word){

        int x = word.length();

        if(x > 2){
            return word.substring(0, x-2) + word.substring(x-1, x) + word.substring(x-2, x-1);
        } else if(x == 2){
            return word.substring(x-1, x) + word.substring(x-2, x-1);
        } else{
            return word;
        }
    }

    public static void main(String[] args){

        Challenge50 ch = new Challenge50();

        System.out.println(ch.lastTwo("coding"));
        System.out.println(ch.lastTwo("cat"));
        System.out.println(ch.lastTwo("ab"));
    }
}
