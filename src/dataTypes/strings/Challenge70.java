/*
    String-2 > repeatFront
    Given a string and an int n, return a string made of the first n characters of the string, 
    followed by the first n-1 characters of the string, and so on. 
    You may assume that n is between 0 and the length of the string, 
    inclusive (i.e. n >= 0 and n <= str.length()).

    repeatFront("Chocolate", 4) → "ChocChoChC"
    repeatFront("Chocolate", 3) → "ChoChC"
    repeatFront("Ice Cream", 2) → "IcI"
*/

package dataTypes.strings;

public class Challenge70 {

    public String repeatFront(String str, int n){

        String finalWord = "";

        if(n == 0){
            return finalWord;
        }    

        for(int i = n; i > 0; i--){
            finalWord += str.substring(0, n);
            n--;
        }

        return finalWord;
    }

    public static void main(String[] args){

        Challenge70 ch = new Challenge70();

        System.out.println(ch.repeatFront("Chocolate", 4));
        System.out.println(ch.repeatFront("Chocolate", 3));
        System.out.println(ch.repeatFront("Chocolate", 2));

    }
}
