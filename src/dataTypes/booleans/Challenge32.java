/*
    Logic-2 > makeBricks
    We want to make a row of bricks that is goal inches long. 
    We have a number of small bricks (1 inch each) and big bricks (5 inches each). 
    Return true if it is possible to make the goal by choosing from the given bricks. 
    This is a little harder than it looks and can be done without any loops. 
    See also: Introduction to MakeBricks

    makeBricks(3, 1, 8) → true
    makeBricks(3, 1, 9) → false
    makeBricks(3, 2, 10) → true
*/
package dataTypes.booleans;

public class Challenge32 {

    public boolean makeBricks(int small, int big, int goal) {

       int maxBigUsable = big * 5;
       int bigUsed = Math.min(big, maxBigUsable);
       int remaining = goal - bigUsed;

       return (small >= remaining);
    }
     
    public static void main(String[] args){

        Challenge32 ch = new Challenge32();

        System.out.println(ch.makeBricks(3, 1, 8));
        System.out.println(ch.makeBricks(3, 1, 9));
        System.out.println(ch.makeBricks(3, 2, 10));
    }
}
