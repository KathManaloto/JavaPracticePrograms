/*
    Logic-1 > inOrderEqual
    Given three ints, a b c, return true if they are in strict increasing order, 
    such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception 
    that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.

    inOrderEqual(2, 5, 11, false) → true
    inOrderEqual(5, 7, 6, false) → false
    inOrderEqual(5, 5, 7, true) → true
 */
package dataTypes.booleans;

public class Challenge28 {
    
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk){

        if(equalOk){
            return (a <= b && b <= c);
        } else{
            return (a < b && b < c);
        }
    }

    public static void main(String[] args){

        Challenge28 ch = new Challenge28();

        System.out.println(ch.inOrderEqual(2, 5, 11, false));
        System.out.println(ch.inOrderEqual(5, 7, 6, false));
        System.out.println(ch.inOrderEqual(5, 5, 7, true));
    }
}
