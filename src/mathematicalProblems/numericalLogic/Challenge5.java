/*
    Warmup-1 > sumDouble
    Given two int values, return their sum. Unless the two values are the same, 
    then return double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
*/

public class Challenge5{

    public int sumDouble(int x, int y){
    
        if(x == y){
            return 2 * (x + y);
        }

        return x + y;
    }

    public static void main(String[] args){

        Challenge5 ch =  new Challenge5();

            System.out.println(ch.sumDouble(1, 2));
            System.out.println(ch.sumDouble(3, 2));
            System.out.println(ch.sumDouble(2, 2));
    }
}