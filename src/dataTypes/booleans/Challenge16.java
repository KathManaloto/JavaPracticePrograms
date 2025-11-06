/*
    Logic-1 > squirrelPlay
    The squirrels in Palo Alto spend most of the day playing. 
    In particular, they play if the temperature is between 60 and 90 (inclusive). 
    Unless it is summer, then the upper limit is 100 instead of 90. Given an int 
    temperature and a boolean isSummer, return true if the squirrels play and false otherwise.

    squirrelPlay(70, false) → true
    squirrelPlay(95, false) → false
    squirrelPlay(95, true) → true
 */

package dataTypes.booleans;

public class Challenge16 {

    public boolean squirrelPlay(int temperature, boolean isSummer){

        if(isSummer){
            return (temperature >= 60 && temperature <= 100);
        } else{
            return (temperature >= 60 && temperature <= 90);
        }
    }

    public static void main(String[] args){
        Challenge16 ch  = new Challenge16();
        
        System.out.println(ch.squirrelPlay(70, false));
        System.out.println(ch.squirrelPlay(95, false));
        System.out.println(ch.squirrelPlay(95, true));
    }
    
}
