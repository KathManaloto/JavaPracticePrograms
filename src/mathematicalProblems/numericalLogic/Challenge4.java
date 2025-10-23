/*
    Warmup-1 > intMax
    Given three int values, a b c, return the largest.

    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
 */

package mathematicalProblems.numericalLogic;

public class Challenge4 {
    
    public int intMax(int x, int y, int z){

        if(x > y && x > z){
            return x;
        }
        else if(y > x && y > z){
            return y;
        } else{
            return z;
        }
    }

    public static void main(String[] args){

        Challenge4 ch = new Challenge4();
        System.out.println(ch.intMax(1, 2, 3));
        System.out.println(ch.intMax(1, 3, 2));
        System.out.println(ch.intMax(3, 2, 1));

    }
}
