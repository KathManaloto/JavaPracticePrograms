/*
    Warmup-2 > stringTimes
    Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
*/

package dataTypes.strings;

public class Challenge22 {
    
    public String stringTimes(String word, int n){

        String largeString = "";

        for(int i = 1 ; i<=n ; i++){
            
            largeString = word + largeString;
        }

        return largeString;

    }          

    public static void main(String[] args){

        Challenge22 ch = new Challenge22();
         
        System.out.println(ch.stringTimes("Hi", 2));
        System.out.println(ch.stringTimes("Hi", 3)); 
        System.out.println(ch.stringTimes("Hi", 1)); 
    }
}
