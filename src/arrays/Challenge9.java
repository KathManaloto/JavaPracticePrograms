/*
    Array-1 > makePi
    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

    makePi() → [3, 1, 4]
*/
package arrays;

import java.util.Arrays;

public class Challenge9 {
    
    public int[] makePi(){

        int[] piValue = {3, 1, 4};
        
        return piValue;
    }

    public static void main(String[] args){

        Challenge9 ch = new Challenge9();

        System.out.println(Arrays.toString(ch.makePi()));
    }
}
