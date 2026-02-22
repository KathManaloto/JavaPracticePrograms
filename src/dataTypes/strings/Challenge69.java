/*
    String-2 > repeatEnd
    Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
    You may assume that n is between 0 and the length of the string, inclusive.

    repeatEnd("Hello", 3) → "llollollo"
    repeatEnd("Hello", 2) → "lolo"
    repeatEnd("Hello", 1) → "o"
*/
package dataTypes.strings;

public class Challenge69 {

    public String repeatEnd(String str, int n){

        String finalWord = "";

        if(n == 0){
            return finalWord;
        }

        for(int i = n; i > 0; i--){

            finalWord += str.substring(str.length() - n, str.length());
        }

        return finalWord;
    }

    public static void main(String[] args){

        Challenge69 ch = new Challenge69();

        System.out.println(ch.repeatEnd("Hello", 3));
        System.out.println(ch.repeatEnd("Hello", 2));
        System.out.println(ch.repeatEnd("Hello", 1));

    }
}
