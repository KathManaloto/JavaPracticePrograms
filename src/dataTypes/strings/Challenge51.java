/*
    String-1 > seeColor
    Given a string, if the string begins with "red" or "blue" 
    return that color string, otherwise return the empty string.

    seeColor("redxx") → "red"
    seeColor("xxred") → ""
    seeColor("blueTimes") → "blue"
 */
package dataTypes.strings;

public class Challenge51 {
    
    public String seeColor(String word){

        if(word.length() >= 3 && word.substring(0,3).equals("red")){
            return "red";
        } else if(word.length() >= 4 && word.substring(0,4).equals("blue")){
            return "blue";
        } else{
            return "";
        }
    }
    
    public static void main(String[] args){

        Challenge51 ch = new Challenge51();
        
        System.out.println(ch.seeColor("redxx"));
        System.out.println(ch.seeColor("xxred"));
        System.out.println(ch.seeColor("blueTimes"));
    }
}
