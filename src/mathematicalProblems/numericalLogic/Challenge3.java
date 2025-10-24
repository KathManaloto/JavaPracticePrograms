/*
    Warmup-1 > close10
    Given 2 int values, return whichever value is nearest to the value 10, 
    or return 0 in the event of a tie. Note that Math.abs(n) returns the 
    absolute value of a number.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
*/
package mathematicalProblems.numericalLogic;

public class Challenge3{

    public int close10(int x, int y){
        if(Math.abs(10-x) < Math.abs(10-y)){
            return x;
        } else if(Math.abs(10-x) > Math.abs(10-y)){
            return y; 
        } else {
            return 0;
        }
    }

    public static void main(String[] args){
        Challenge3 ch = new Challenge3();

        System.out.println(ch.close10(8, 13));
        System.out.println(ch.close10(13, 8));
        System.out.println(ch.close10(13, 7));

    }
}
