/*
    Given a string, return a string where for every char in the original, there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"
 */
package dataTypes.strings;

public class Challenge66 {

    public String doubleChar(String word){
        String str = "";

        for(int i = 0; i<word.length(); i++){
            str += "" + word.charAt(i) + word.charAt(i);
        }

        return str;
    }

    public static void main(String[] args) {
        Challenge66 ch = new Challenge66();

        System.out.println(ch.doubleChar("The"));
        System.out.println(ch.doubleChar("AAbb"));
        System.out.println(ch.doubleChar("Hi-There"));
    }
}
