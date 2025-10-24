/*
    Warmup-1 > max1020
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, 
    or return 0 if neither is in that range.

    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
 */
package mathematicalProblems.numericalLogic;

public class Challenge6{

    public int max1020(int x, int y){

        boolean xIn = x >= 10 && x <= 20;
        boolean yIn = y >= 10 && y <= 20;
      
        if(xIn && yIn){

            if(x > y){
                return x;
            } else{
                return y;
            }
        
        } else if(xIn && !yIn){
            return x;
        
        } else if(yIn && !xIn){
            return y;

        } else{
            return 0;

        }
    }
    
    public static void main(String[] args){

        Challenge6 ch = new Challenge6();

        System.out.println(ch.max1020(11, 19));
        System.out.println(ch.max1020(19, 11));
        System.out.println(ch.max1020(11, 9));
    }
 }