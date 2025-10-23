/*
    Warmup-1 > front3
    Given a string, we'll say that the front is the first 3 chars of the string. 
    If the string length is less than 3, the front is whatever is there. 
    Return a new string which is 3 copies of the front.

    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"
 */
package dataTypes.strings;

public class Challenge18 {
    
    public String front3(String word){

        if(word.length() < 3){
            return word + word + word;
        }

        String front = word.substring(0, 3);
        return front + front + front;
    }

    public static void main(String[] args){
        Challenge18 ch = new Challenge18();

        System.out.println(ch.front3("Java"));
        System.out.println(ch.front3("Chocolate"));
        System.out.println(ch.front3("abc"));

    }
}
