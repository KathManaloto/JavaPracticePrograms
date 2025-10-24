/*
    Warmup-2 > stringBits
    Given a string, return a new string made of every other char starting with the first, 
    so "Hello" yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"
 */
package dataTypes.strings;

public class Challenge24 {

    public String stringBits(String word){

        int count = word.length();
        String finalWord = "";

        for(int i = 0; i<count ; i++){
            finalWord = finalWord + word.substring(i, i+1);
            i += 1;
        }
        
        return finalWord;
    }

    public static void main(String[] args){

        Challenge24 ch = new Challenge24();

        System.out.println(ch.stringBits("Hello"));
        System.out.println(ch.stringBits("Hi"));
        System.out.println(ch.stringBits("Heeololeo"));
    }
}
