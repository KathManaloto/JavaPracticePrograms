/*
    String-1 > startWord
    Given a string and a second "word" string, we'll say that the word matches the string 
    if it appears at the front of the string, except its first char does not need to match
    exactly. On a match, return the front of the string, or otherwise return the empty string. 
    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". 
    The word will be at least length 1.

    startWord("hippo", "hi") → "hi"
    startWord("hippo", "xip") → "hip"
    startWord("hippo", "i") → "h"
*/
package dataTypes.strings;

public class Challenge56{

    public String startWord(String a, String b){
        
        if (a.length() < b.length()) {
            return "";
        }

        String aSub = a.substring(1, b.length());
        String bSub = b.substring(1);

        if(aSub.equals(bSub)){
            return a.substring(0, b.length());
        }

        return "";
    }

    public static void main(String[] args){

        Challenge56 ch = new Challenge56();

        System.out.println(ch.startWord("hippo", "hi"));
        System.out.println(ch.startWord("hippo", "xip"));
        System.out.println(ch.startWord("hippo", "i"));
    }
}