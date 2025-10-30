/*
    String-1 > withoutX
    Given a string, if the first or last chars are 'x', return the string without 
    those 'x' chars, and otherwise return the string unchanged.

    withoutX("xHix") → "Hi"
    withoutX("xHi") → "Hi"
    withoutX("Hxix") → "Hxi"
 */
package dataTypes.strings;

public class Challenge57 {
    
    public String withoutX(String word){
        String first = "";
        String middle = "";
        String last = "";
            
        if(word.length() > 0 && !word.substring(0, 1).equals("x")){
            first = word.substring(0,1);
        }

        if(word.length() > 1 && !word.substring(word.length()-1, word.length()).equals("x")){
            last = word.substring(word.length()-1, word.length());
        }

        if(word.length()>2){
            middle = word.substring(1, word.length()-1);
        }

        return first + middle + last;
    }

    public static void main(String[] args){

        Challenge57 ch = new Challenge57();

        System.out.println(ch.withoutX("xHix"));
        System.out.println(ch.withoutX("xHi"));
        System.out.println(ch.withoutX("Hxix"));
    }
}
