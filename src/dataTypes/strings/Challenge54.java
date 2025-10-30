/*
    String-1 > without2
    Given a string, if a length 2 substring appears at both its beginning and end, 
    return a string without the substring at the beginning, so "HelloHe" yields "lloHe". 
    The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""
 */
package dataTypes.strings;

public class Challenge54 {
    
    public String without2(String word){

        if(word.length() == 2){
            return "";
        } else if (word.length() < 2){
            return word;
        } else{

            String first = word.substring(0, 2);
            String last = word.substring(word.length()-2 , word.length());

            if(first.equals(last)){
                return word.substring(2);
            } else{
                return word;
            }
        }
    }

    public static void main(String[] args){

        Challenge54 ch = new Challenge54();

        System.out.println(ch.without2("HelloHe"));
        System.out.println(ch.without2("HelloHi"));
        System.out.println(ch.without2("Hi"));
    }
}
