/*
    String-1 > atFirst
    Given a string, return a string length 2 made of its first 2 chars. 
    If the string length is less than 2, use '@' for the missing chars.

    atFirst("hello") → "he"
    atFirst("hi") → "hi"
    atFirst("h") → "h@"
 */
package dataTypes.strings;

public class Challenge61 {
    
    public String atFirst(String word){

        // if(word.length() == 0){
        //     return "@@";
        // }

        // if(word.length() == 1){
        //     return word + "@";
        // }

        // return word.substring(0,2);

        //OR

        return (word + "@@").substring(0,2);
    }

    public static void main(String[] args){

        Challenge61 ch = new Challenge61();

        System.out.println(ch.atFirst("hello"));
        System.out.println(ch.atFirst("hi"));
        System.out.println(ch.atFirst("h"));
    }
}
