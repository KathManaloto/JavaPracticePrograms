/* 
    Warmup-1 > nearHundred
    Given an int n, return true if it is within 10 of 100 or 200. 
    Note: Math.abs(num) computes the absolute value of a number.

    nearHundred(93) → true
    nearHundred(90) → true
    nearHundred(89) → false
*/

public class Challenge2{

    public boolean nearHundred(int n){

        if((Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {
        Challenge2 ch = new Challenge2();

        System.out.println(ch.nearHundred(93));
        System.out.println(ch.nearHundred(90));
        System.out.println(ch.nearHundred(89));

    }
}