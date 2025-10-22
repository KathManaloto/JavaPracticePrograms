/*
    Warmup-1 > posNeg
    Given 2 int values, return true if one is negative and one is positive. 
    Except if the parameter "negative" is true, then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
 */

package dataTypes.booleans;

public class Challenge8{

    public boolean posNeg(int a, int b, boolean negative){
        if(a>0 && b<0 && !negative){
            return true;
        } else if(a<0 && b>0 && !negative){
            return true;
        } else if(a<0 && b<0 && negative){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Challenge8 ch = new Challenge8();

        System.out.println(ch.posNeg(1, -1, false));
        System.out.println(ch.posNeg(-1, 1, false));
        System.out.println(ch.posNeg(-4, -5, true));
    }
}