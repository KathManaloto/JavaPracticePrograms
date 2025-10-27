/*
    String-1 > left2
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 
    The string length will be at least 2.

    left2("Hello") → "lloHe"
    left2("java") → "vaja"
    left2("Hi") → "Hi"
*/

package dataTypes.strings;

public class Challenge39 {
    
    public String left2(String word){

        if(word.length() == 2){
            return word;
        }

        String first = word.substring(0, 2);
        String last = word.substring(2);

        return last + first;
    }

    public static void main(String[] args){

        Challenge39 ch = new Challenge39();

        System.out.println(ch.left2("Hello"));
        System.out.println(ch.left2("java"));
        System.out.println(ch.left2("Hi"));
    }
}
