/*
    Warmup-1 > icyHot
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
 */
package dataTypes.booleans;

public class Challenge1 {
    public boolean icyHot(int temp1, int temp2){
        if(temp1 < 0 && temp2 > 100){
            return true;
        }
        if(temp2 < 0 && temp1 > 100){
            return true;
        }
        else{
            return false;
        }
    }
     public static void main(String[] args) {
        Challenge1 ch = new Challenge1();
        
        System.out.println(ch.icyHot(120, -1));
        System.out.println(ch.icyHot(-1, 120));
        System.out.println(ch.icyHot(2, 120));
     }
}
