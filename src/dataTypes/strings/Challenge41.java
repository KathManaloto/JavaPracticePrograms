/*
    String-1 > theEnd
    Given a string, return a string length 1 from its front, unless front is false, 
    in which case return a string length 1 from its back. The string will be non-empty.

    theEnd("Hello", true) → "H"
    theEnd("Hello", false) → "o"
    theEnd("oh", true) → "o"
*/
package dataTypes.strings;

public class Challenge41 {
    
    public String theEnd(String word, boolean front){

        if(front == true){
            return word.substring(0, 1);
        } else{
            return word.substring(word.length()-1);

        }
    }

    public static void main(String[] args){

        Challenge41 ch = new Challenge41();

        System.out.println(ch.theEnd("Hello", true));
        System.out.println(ch.theEnd("Hello", false));
        System.out.println(ch.theEnd("oh", true));
    }
}
