/*
    Warmup-2 > stringSplosion
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
*/
package dataTypes.strings;

public class Challenge25 {

    public String stringSplosion(String word){

        int count = word.length();
        String finalWord = "";

        for(int i = 1 ; i < count ; i++){
            finalWord =  finalWord + word.substring(0, i);
        }

        return finalWord + word;
    }

    public static void main(String[] args){

        Challenge25 ch = new Challenge25();

        System.out.println(ch.stringSplosion("Code"));
        System.out.println(ch.stringSplosion("abc"));
        System.out.println(ch.stringSplosion("ab"));
    }
}