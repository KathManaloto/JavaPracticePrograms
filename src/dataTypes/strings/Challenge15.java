/*
    Warmup-1 > everyNth
    Given a non-empty string and an int N, return the string made starting with char 0, 
    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"
*/
package dataTypes.strings;

public class Challenge15 {
    
    public String everyNth(String word, int N){
        int count = word.length();
        int x = 0;
        String newWord = "";

        while(x<count){

            String letter = word.substring(x,x+1);
            newWord += letter;

            x+=N;
        }

        return newWord;
    }

    public static void main(String[] args){
        Challenge15 ch = new Challenge15();

        System.out.println(ch.everyNth("Miracle", 2));
        System.out.println(ch.everyNth("abcdefg", 2));
        System.out.println(ch.everyNth("abcdefg", 3));
    }
}
