/*
    String-1 > hasBad
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. 
    Note: use .equals() to compare 2 strings.

    hasBad("badxx") → true
    hasBad("xbadxx") → true
    hasBad("xxbadxx") → false
 */

package dataTypes.strings;

public class Challenge47 {
    
    public boolean hasBad(String word){

        if(word.length() <= 3 && !word.equals("bad")){
            return false;
        }

        if((word.substring(0, 3).equals("bad") || 
            word.substring(1,4).equals("bad"))){
            return true;
        } else{
            return false;
        }

    }
}
