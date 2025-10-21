/*
    Warmup-1 > sleepIn
    The parameter weekday is true if it is a weekday, and 
    the parameter vacation is true if we are on vacation. 
    We sleep in if it is not a weekday or we're on vacation. 
    Return true if we sleep in.

    sleepIn(false, false) → true
    sleepIn(true, false) → false
    sleepIn(false, true) → true
*/ 
package ifelsestatements.decisionmaking;

public class Challenge2{

    public boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday || vacation){
            return true;
        } else{
            return false;
        }
    }        

    public static void main(String[] args) {
        Challenge2 obj = new Challenge2();

        System.out.println(obj.sleepIn(false, false)); // true
        System.out.println(obj.sleepIn(true, false));  // false
        System.out.println(obj.sleepIn(false, true));  // true
    }
    
}