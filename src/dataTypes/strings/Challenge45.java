/*
    String-1 > twoChar
    Given a string and an index, return a string length 2 starting at the given index. 
    If the index is too big or too small to define a string length 2, use the first 2 chars. 
    The string length will be at least 2.

    twoChar("java", 0) → "ja"
    twoChar("java", 2) → "va"
    twoChar("java", 3) → "ja"
 */
package dataTypes.strings;

public class Challenge45 {
    
    public String twoChar(String word, int n){

        if(((word.length() - n) < 2) || n > word.length() || n < 0){
            return word.substring(0, 2);
        } else{

            return word.substring(n, n+2);
        }
    }

    public static void main(String[] args){

        Challenge45 ch = new Challenge45();

        System.out.println(ch.twoChar("java", 0));
        System.out.println(ch.twoChar("java", 2));
        System.out.println(ch.twoChar("java", 3));
    }
}
