/*
    String-1 > nonStart
    Given 2 strings, return their concatenation, except omit the first char of each. 
    The strings will be at least length 1.

    nonStart("Hello", "There") → "ellohere"
    nonStart("java", "code") → "avaode"
    nonStart("shotl", "java") → "hotlava"
*/

package dataTypes.strings;

public class Challenge38 {
    
    public String nonStart(String a, String b){
        
        String first = "";
        String second = "";
    
        if(a.length() > 1){
            first = a.substring(1, a.length());
        } 


        if(b.length() > 1){
            second = b.substring(1, b.length());
        }

        return first + second;
    }

    public static void main(String[] args){

        Challenge38 ch = new Challenge38();

        System.out.println(ch.nonStart("Hello", "There"));
        System.out.println(ch.nonStart("java", "code"));
        System.out.println(ch.nonStart("shotl", "java"));
    }

}
