/*
    Warmup-1 > in1020
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false
 */

package dataTypes.booleans;

public class Challenge10 {
    
    public boolean in1020(int x, int y){
        return ((x >= 10 && x <= 20) || (y >= 10 && y <= 20));
    }

    public static void main(String[] args){

        Challenge10 ch = new Challenge10();

        System.out.println(ch.in1020(12, 99));
        System.out.println(ch.in1020(21, 12));
        System.out.println(ch.in1020(8, 99));

    }
}
