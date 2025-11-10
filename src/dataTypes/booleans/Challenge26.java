/*
    Logic-1 > twoAsOne
    Given three ints, a b c, return true if it is possible to add two 
    of the ints to get the third.

    twoAsOne(1, 2, 3) → true
    twoAsOne(3, 1, 2) → true
    twoAsOne(3, 2, 2) → false
 */
package dataTypes.booleans;

public class Challenge26 {
 
    public boolean twoAsOne(int a, int b, int c){

        return ((a+b == c) || (a+c == b) || (b+c == a));
    }

    public static void main(String[] args){

        Challenge26 ch = new Challenge26();

        System.out.println(ch.twoAsOne(1, 2, 3));
        System.out.println(ch.twoAsOne(3, 1, 2));
        System.out.println(ch.twoAsOne(3, 2, 2));
    }
}
