/*
    Given 2 int values, return true if they are both in the range 30..40 inclusive, or 
    they are both in the range 40..50 inclusive.

    in3050(30, 31) → true
    in3050(30, 41) → false
    in3050(40, 50) → true
*/

public class Challenge12{

    public boolean in3050(int x, int y){

        return (((x >= 30 && x <= 40) && (y >= 30 && y <= 40)) || 
                ((x >= 40 && x <= 50) && (y >= 40 && y <= 50)));
        
    }

    public static void main(String[] args){

        Challenge12 ch = new Challenge12();

        System.out.println(ch.in3050(30, 31));
        System.out.println(ch.in3050(30, 41));
        System.out.println(ch.in3050(40, 50));

    }
}