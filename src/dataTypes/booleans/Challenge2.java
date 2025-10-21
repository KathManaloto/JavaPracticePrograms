/*
    Warmup-1 > hasTeen
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.

    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true
 */

package dataTypes.booleans;

public class Challenge2 {

    public boolean hasTeen(int x, int y, int z){

        if((x >= 13 && x <=19) || (y >= 13 && y <=19) || (z >= 13 && z <=19)){
            return true;
        } else{
            return false;
        }
    }
    
    public static void main(String[] args){
        Challenge2 ch = new Challenge2();

        System.out.println(ch.hasTeen(13, 20, 10));
        System.out.println(ch.hasTeen(20, 19, 10));
        System.out.println(ch.hasTeen(20, 10, 13));
    }
}
