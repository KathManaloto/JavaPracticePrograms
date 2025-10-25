/*
    Warmup-2 > altPairs
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... 
    so "kittens" yields "kien".

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
 */

package dataTypes.strings;

public class Challenge29 {
    
    public String altPairs(String word){

        String stg = "";

        for(int i = 0; i < word.length(); i+=4){

            stg += word.charAt(i);

            if((i+1) < word.length()){
                stg += word.charAt(i+1);

            }
        }

        return stg;
    }

    public static void main(String[] args){
        Challenge29 ch = new Challenge29();

        System.out.println(ch.altPairs("kitten"));
        System.out.println(ch.altPairs("Chocolate"));
        System.out.println(ch.altPairs("CodingHorror"));
    }
}
