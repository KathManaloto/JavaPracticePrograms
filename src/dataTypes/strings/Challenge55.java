/*
    String-1 > deFront
    Given a string, return a version without the first 2 chars. 
    Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    The string may be any length. Harder than it looks.

    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"
 */
package dataTypes.strings;

public class Challenge55 {
 
    public String deFront(String word){

        String finalWord = "";

        if(word.length() >= 1 && word.substring(0, 1).equals("a")){
            finalWord = "a";
        } 
        
        if(word.length() >= 1 && word.substring(1,2).equals("b")){
            finalWord += "b";
        }

        if(word.length() > 2){
            return finalWord + word.substring(2);
        } else{
            return finalWord;
        }
    }
    
    public static void main(String[] args){

        Challenge55 ch = new Challenge55();

        System.out.println(ch.deFront("Hello"));
        System.out.println(ch.deFront("java"));
        System.out.println(ch.deFront("away"));
    }
}
