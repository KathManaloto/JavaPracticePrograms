/*
    String-1 > frontAgain
    Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
    such as with "edited".

    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true
 */

package dataTypes.strings;

public class Challenge52 {
    
    public boolean frontAgain(String word){

        if(word.length() >= 2 && 
           word.substring(0,2).equals(word.substring(word.length()-2, word.length()))){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){

        Challenge52 ch = new Challenge52();       

        System.out.println(ch.frontAgain("edited"));
        System.out.println(ch.frontAgain("edit"));
        System.out.println(ch.frontAgain("ed"));
    }
}
