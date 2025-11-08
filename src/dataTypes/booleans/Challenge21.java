/*
    Logic-1 > more20
    Return true if the given non-negative number is 1 or 2 more than a multiple of 20. 
    See also: Introduction to Mod

    more20(20) → false
    more20(21) → true
    more20(22) → true
 */
package dataTypes.booleans;

public class Challenge21 {
    
    public boolean more20(int num){

        return (num % 20 == 1 || num % 20 == 2);
    }

    public static void main(String[] args){

        Challenge21 ch = new Challenge21();

        System.out.println(ch.more20(20));
        System.out.println(ch.more20(21));
        System.out.println(ch.more20(22));
    }
}
