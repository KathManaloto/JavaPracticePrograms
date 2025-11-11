/*
    Logic-1 > withoutDoubles
    Return the sum of two 6-sided dice rolls, each in the range 1..6. 
    However, if noDoubles is true, if the two dice show the same value, 
    increment one die to the next value, wrapping around to 1 if its value was 6.

    withoutDoubles(2, 3, true) → 5
    withoutDoubles(3, 3, true) → 7
    withoutDoubles(3, 3, false) → 6
 */
public class Challenge5 {
    
    public int withoutDoubles(int a, int b, boolean noDoubles){

        if(noDoubles){

            if(a == 6 && b ==6){
                return 6 + 1;
            } else if(a == b){
                b += 1;
                return a + b;
            }
    
        } 
            return a + b;
        
    }

    public static void main(String[] args){
        Challenge5 ch = new Challenge5();

        System.out.println(ch.withoutDoubles(2, 3, true));
        System.out.println(ch.withoutDoubles(3, 3, true));
        System.out.println(ch.withoutDoubles(3, 3, false));
    }
}
