/*
    Warmup-1 > lastDigit
    Given two non-negative int values, return true if they have the same last digit,
    such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
 */
package dataTypes.booleans;

public class Challenge4 {
    
    public boolean lastDigit(int x, int y){

        if(x%10 == y%10){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){

        Challenge4 ch = new Challenge4();

        System.out.println(ch.lastDigit(7,17));
        System.out.println(ch.lastDigit(6,17));
        System.out.println(ch.lastDigit(3,113));

    }
}
