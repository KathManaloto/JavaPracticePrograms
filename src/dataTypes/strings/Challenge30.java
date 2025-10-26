/*
 *     Warmup-2 > stringYak
     Suppose the string "yak" is unlucky. Given a string, return a version 
         where all the "yak" are removed, but the "a" can be any char. 
             The "yak" strings will not overlap.

    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"
 */
package dataTypes.strings;

public class Challenge30 {

    public String stringYak(String word){

        String finalWord = "";

        for(int i = 0; i < word.length(); i++){

            if((i+2) < word.length() && word.charAt(i) == 'y' && word.charAt(i+2) == 'k'){
                i+=2;
            } else{

            finalWord += word.charAt(i);
            }
        }

        return finalWord;
    }
        
    public static void main(String[] args){

        Challenge30 ch = new Challenge30();

        System.out.println(ch.stringYak("yakpak"));
        System.out.println(ch.stringYak("pakyak"));
        System.out.println(ch.stringYak("yak123ya"));

    }
    
}
