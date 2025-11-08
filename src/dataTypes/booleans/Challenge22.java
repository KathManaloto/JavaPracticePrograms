/*
    Logic-1 > old35
    Return true if the given non-negative number is a multiple of 3 or 5, but not both. 
    Use the % "mod" operator -- see Introduction to Mod

    old35(3) → true
    old35(10) → true
    old35(15) → false
 */
package dataTypes.booleans;

public class Challenge22 {
    
    public boolean old35(int num){

        return ((num % 3 == 0 || num % 5 == 0) && !(num % 3 == 0 && num % 5 == 0));

    }

    public static void main(String[] args){

        Challenge22 ch = new Challenge22();

        System.out.println(ch.old35(3));
        System.out.println(ch.old35(10));
        System.out.println(ch.old35(15));
    }
}
