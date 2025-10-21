/*
    Warmup-1 > mixStart
    Return true if the given string begins with "mix", except the 'm' can be anything, 
    so "pix", "9ix" .. all count.

    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false
*/
package dataTypes.booleans;

public class Challenge3 {
    
    public boolean mixStart(String word){
        
        if(word.length() < 3){
            return false;
        }
        
        String stg = word.substring(1,3);

        if(stg.equals("ix")){
            return true;
        } else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Challenge3 ch = new Challenge3();

        System.out.println(ch.mixStart("mix snacks"));
        System.out.println(ch.mixStart("pix snacks"));
        System.out.println(ch.mixStart("piz snacks"));
        System.out.println(ch.mixStart("p"));

    }
}
