/*
    Warmup-1 > backAround
    Given a string, take the last char and return a new string with the last char 
    added at the front and back, so "cat" yields "tcatt". 
    The original string will be length 1 or more.

    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"
 */

package dataTypes.strings;

public class Challenge11 {
    
    public String backAround(String word){
        String lastChar = word.substring(word.length()-1);

        return lastChar + word +  lastChar;
    }

    public static void main(String[] args){
        Challenge11 ch = new Challenge11();

        System.out.println(ch.backAround("cat"));
        System.out.println(ch.backAround("Hello"));
        System.out.println(ch.backAround("a"));
    }
}
