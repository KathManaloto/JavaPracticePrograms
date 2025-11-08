/*
    Logic-1 > nearTen
    Given a non-negative number "num", return true if num is within 2 of a multiple of 10. 
    Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. 
    See also: Introduction to Mod

    nearTen(12) → true
    nearTen(17) → false
    nearTen(19) → true
 */
package dataTypes.booleans;

public class Challenge24 {
    
    public boolean nearTen(int num){

        return (num % 10 <= 2 || num % 10 == 8 || num % 10 == 9); 
    }

    public static void main(String[] args){

        Challenge24 ch = new Challenge24();

        System.out.println(ch.nearTen(12));
        System.out.println(ch.nearTen(17));
        System.out.println(ch.nearTen(19));
    }
}
