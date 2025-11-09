/*
    Logic-1 > answerCell
    Your cell phone rings. Return true if you should answer it. 
    Normally you answer, except in the morning you only answer if it is your mom calling. 
    In all cases, if you are asleep, you do not answer.

    answerCell(false, false, false) → true
    answerCell(false, false, true) → false
    answerCell(true, false, false) → false
 */

package dataTypes.booleans;

public class Challenge25 {

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
        if(isAsleep){
            return false;
        }

        if(isMorning && !isMom){
            return false;
        }

        return true;

    }

    public static void main(String[] args){

        Challenge25 ch = new Challenge25();

        System.out.println(ch.answerCell(false, false, false));
        System.out.println(ch.answerCell(false, false, true));
        System.out.println(ch.answerCell(true, false, false));
    }
}
