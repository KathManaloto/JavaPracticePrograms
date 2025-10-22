/*
    Warmup-1 > makes10
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true
 */
package dataTypes.booleans;

public class Challenge7 {
    
    public boolean makes10(int a, int b){
        if((a+b)==10 || a == 10 || b == 10){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Challenge7 ch = new Challenge7();

        System.out.println(ch.makes10(9, 10));
        System.out.println(ch.makes10(9, 9));
        System.out.println(ch.makes10(1, 9));
    }
}
