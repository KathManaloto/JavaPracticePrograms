/*
    Warmup-2 > stringMatch
    Given 2 strings, a and b, return the number of the positions where they contain
    the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the 
    "xx", "aa", and "az" substrings appear in the same place in both strings.

    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0
 */
package dataTypes.strings;

public class Challenge27 {
    
    public int stringMatch(String a, String b){

        int count = Math.min(a.length(),b.length());
        int counter = 0;

        for(int i = 0 ; i < count-1 ; i++){
            if(a.substring(i, i+2).equals(b.substring(i, i+2))){
                counter += 1;
            }
        }

        return counter;
    }

    public static void main(String[] args){

        Challenge27 ch = new Challenge27();

        System.out.println(ch.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(ch.stringMatch("abc", "abc"));
        System.out.println(ch.stringMatch("abc", "axc"));
    }
}
