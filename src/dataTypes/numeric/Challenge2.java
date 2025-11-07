/*
    Logic-1 > sortaSum
    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, 
    are forbidden, so in that case just return 20.

    sortaSum(3, 4) → 7
    sortaSum(9, 4) → 20
    sortaSum(10, 11) → 21
 */
package dataTypes.numeric;

public class Challenge2 {
    
    public int sortaSum(int a, int b){

        if(((a+b) >= 10) && ((a+b) <= 19)){
            return 20;
        }

        return a + b;
    }

    public static void main(String[] args){

        Challenge2 ch = new Challenge2();

        System.out.println(ch.sortaSum(3, 4));
        System.out.println(ch.sortaSum(9, 4));
        System.out.println(ch.sortaSum(10, 11));
    }
}
