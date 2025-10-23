/*
    Warmup-1 > or35
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
    Use the % "mod" operator -- see Introduction to Mod

    or35(3) → true
    or35(10) → true
    or35(8) → false 
 */

package dataTypes.booleans;

public class Challenge9 {

    public boolean or35(int num){

        // if(num%3 == 0 || num%5 == 0){ 
        //     return true;
        // } else{
        //     return false;
        // }
         
        // OR

        return (num%3 == 0 || num%5 == 0);
    }

    public static void main(String[] args){

        Challenge9 ch = new Challenge9();

        System.out.println(ch.or35(3));
        System.out.println(ch.or35(10));
        System.out.println(ch.or35(8));
    }
    
}
