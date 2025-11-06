/*
    Logic-1 > cigarParty
    When squirrels get together for a party, they like to have cigars. 
    A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. 
    Unless it is the weekend, in which case there is no upper bound on the number of cigars. 
    Return true if the party with the given values is successful, or false otherwise.

    cigarParty(30, false) → false
    cigarParty(50, false) → true
    cigarParty(70, true) → true
 */

package dataTypes.booleans;

public class Challenge14 {

    public boolean cigarParty(int num, boolean weekend){

        if(weekend){
            return (num >= 40);
        } else{
            return (num >= 40 && num <= 60);
        }
    }

    public static void main(String[] args){

        Challenge14 ch = new Challenge14();

        System.out.println(ch.cigarParty(30, false));
        System.out.println(ch.cigarParty(50, false));
        System.out.println(ch.cigarParty(70, true));
    }
    
}
