/*
    String-1 > middleThree
    Given a string of odd length, return the string length 3 from its middle, 
    so "Candy" yields "and". The string length will be at least 3.

    middleThree("Candy") → "and"
    middleThree("and") → "and"
    middleThree("solving") → "lvi"
 */
package dataTypes.strings;

public class Challenge46 {
    
    public String middleThree(String word){

        if(word.length() == 3){
            return word;
        }

        int x = word.length() / 2;
        return word.substring(x-1, x) + word.substring(x, x+2);
    }

    public static void main(String[] args){

        Challenge46 ch = new Challenge46();

        System.out.println(ch.middleThree("Candy"));
        System.out.println(ch.middleThree("and"));
        System.out.println(ch.middleThree("solving"));
    }
}


