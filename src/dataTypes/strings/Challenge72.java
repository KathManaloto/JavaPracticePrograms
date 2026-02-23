/*
    String-2 > prefixAgain
    Given a string, consider the prefix string made of the first N chars of the string. 
    Does that prefix string appear somewhere else in the string? Assume that the string 
    is not empty and that N is in the range 1..str.length().

    prefixAgain("abXYabc", 1) → true
    prefixAgain("abXYabc", 2) → true
    prefixAgain("abXYabc", 3) → false
*/
package dataTypes.strings;

public class Challenge72 {
    
    public boolean prefixAgain(String str, int n){

        String prefix = str.substring(0,n);

        for(int i = 1; i <= str.length() - n; i++){
            if(str.substring(i,i+n).equals(prefix)) return true;
        }

        return false;
    }

    public static void main(String[] args){

        Challenge72 ch = new Challenge72();

        System.out.println(ch.prefixAgain("abXYabc", 1));
        System.out.println(ch.prefixAgain("abXYabc", 2));
        System.out.println(ch.prefixAgain("abXYabc", 3));
    }
}
