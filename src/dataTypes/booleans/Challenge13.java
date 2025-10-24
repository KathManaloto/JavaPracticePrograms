/*
    Warmup-2 > doubleX
    Given a string, return true if the first instance of "x" in the string is 
    immediately followed by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true
 */
package dataTypes.booleans;

public class Challenge13 {
    
    public boolean doubleX(String word){

        int i = word.indexOf("x");

        if(i == -1){ 
            return false;
        }

        if(i + 1 >= word.length()){
            return false;
        }

        return word.substring(i+1, i+2).equals("x");
    
    }

    public static void main(String[] args){

        Challenge13 ch = new Challenge13();

        System.out.println(ch.doubleX("axxbb"));
        System.out.println(ch.doubleX("axaxax"));
        System.out.println(ch.doubleX("xxxxx"));
    }
}
