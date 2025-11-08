/*
    Logic-1 > specialEleven
    We'll say a number is special if it is a multiple of 11 or if it is one more
    than a multiple of 11. Return true if the given non-negative number is special. 
    Use the % "mod" operator -- see Introduction to Mod

    specialEleven(22) → true
    specialEleven(23) → true
    specialEleven(24) → false
 */
package dataTypes.booleans;

public class Challenge20 {
    
    public boolean specialEleven(int num){
        return (num % 11 == 0 || num % 11 == 1);
    }

    public static void main(String[] args){

        Challenge20 ch = new Challenge20();

        System.out.println(ch.specialEleven(22));
        System.out.println(ch.specialEleven(23));
        System.out.println(ch.specialEleven(24));
    }
}
