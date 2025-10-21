/*
    Warmup-1 > startHi
    Given a string, return true if the string starts with "hi" and false otherwise.

    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
 */
package dataTypes.strings;

public class Challenge12 {
    
    public boolean startHi(String word){
        
        if(word.length() < 2){
            return false;
        }
        
        if(word.substring(0,2).equals("hi")){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Challenge12 ch = new Challenge12();

        System.out.println(ch.startHi("hi, there"));
        System.out.println(ch.startHi("hi"));
        System.out.println(ch.startHi("hello hi"));
    }
}
