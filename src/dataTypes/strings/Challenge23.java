/*
    Warmup-2 > frontTimes
    Given a string and a non-negative int n, we'll say that the front of the 
    string is the first 3 chars, or whatever is there if the string is less than length 3. 
    Return n copies of the front;

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"
 */
package dataTypes.strings;

public class Challenge23 {
    
    public String frontTimes(String word, int n){
        String finalWord = "";
        
        for(int i = 1; i <= n ; i++){

            if(word.length() <= 3){
                finalWord = finalWord + word;
            } else{
                String front = word.substring(0, 3);
                finalWord = finalWord + front;
            }
        }

        return finalWord;
    }

    public static void main(String[] args){

        Challenge23 ch = new Challenge23();

        System.out.println(ch.frontTimes("Chocolate", 2));
        System.out.println(ch.frontTimes("Chocolate", 3));
        System.out.println(ch.frontTimes("Abc", 3));
    }   
}
