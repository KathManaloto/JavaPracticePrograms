/*
    Warmup-1 > stringE
    Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false
 */

package dataTypes.strings;

public class Challenge13 {
    
    public boolean stringE(String word){
    
        int count = word.length();
        int sum = 0;

        for(int i = 0; i< count; i++){
            if(word.substring(i,i+1).equals("e")){
                sum += 1;
            }
        }
    
        if(sum >= 1 && sum <=3){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Challenge13 ch = new Challenge13();

        System.out.println(ch.stringE("Hello"));
        System.out.println(ch.stringE("Heelle"));
        System.out.println(ch.stringE("Heelele"));

    }
}
