/*
    Warmup-1 > loneTeen
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 2 int values, return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
 */
package dataTypes.booleans;

 public class Challenge11{

    public boolean loneTeen(int x, int y){
        
        return ((x >= 13 && x <= 19) && (y < 13 || y > 19)) || 
               ((y >= 13 && y <= 19) && (x < 13 || x > 19)) ;
    }

    public static void main(String[] args){

        Challenge11 ch = new Challenge11();

        System.out.println(ch.loneTeen(13,99));
        System.out.println(ch.loneTeen(21, 19));
        System.out.println(ch.loneTeen(13,13));

    }
 }