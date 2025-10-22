/*
    Warmup-1 > monkeyTrouble
    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. 
    We are in trouble if they are both smiling or if neither of them is smiling. 
    Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
 */
package dataTypes.booleans;

public class Challenge5{
    
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile){

        if((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Challenge5 ch = new Challenge5();

        System.out.println(ch.monkeyTrouble(true, true));
        System.out.println(ch.monkeyTrouble(false, false));
        System.out.println(ch.monkeyTrouble(true, false));
    }
}
