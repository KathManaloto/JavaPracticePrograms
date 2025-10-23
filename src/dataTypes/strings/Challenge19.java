/*
    Warmup-1 > front22
    Given a string, take the first 2 chars and return the string with the 2 chars added 
    at both the front and back, so "kitten" yields"kikittenki". If the string length is
    less than 2, use whatever chars are there.

    front22("kitten") → "kikittenki"
    front22("Ha") → "HaHaHa"
    front22("abc") → "ababcab"
 */

package dataTypes.strings;

public class Challenge19 {
    
    public String front22(String word){

        if(word.length() <= 2){
            return word + word + word;
        }

        String stg = word.substring(0, 2);

        return stg + word +  stg;
    }

    public static void main(String[] args){

        Challenge19 ch = new Challenge19();

        System.out.println(ch.front22("kitten"));
        System.out.println(ch.front22("Ha"));
        System.out.println(ch.front22("abc"));

    }
}
