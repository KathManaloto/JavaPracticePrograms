/*
    String-1 > right2
    Given a string, return a "rotated right 2" version where the last 2 chars 
    are moved to the start. The string length will be at least 2.

    right2("Hello") → "loHel"
    right2("java") → "vaja"
    right2("Hi") → "Hi"
*/
package dataTypes.strings;

public class Challenge40 {
    
    public String right2(String word){

        if(word.length() == 2){
            return word;
        }

        String first = word.substring(0, word.length() - 2);
        String last = word.substring(word.length() - 2);

        return last + first;
    }

    public static void main(String[] args){

        Challenge40 ch = new Challenge40();

        System.out.println(ch.right2("Hello"));
        System.out.println(ch.right2("java"));
        System.out.println(ch.right2("Hi"));
    }
}
