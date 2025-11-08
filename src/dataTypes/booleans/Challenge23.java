/*
    Logic-1 > less20
    Return true if the given non-negative number is 1 or 2 less than a multiple of 20. 
    So for example 38 and 39 return true, but 40 returns false. See also: Introduction to Mod

    less20(18) → true
    less20(19) → true
    less20(20) → false
 */
package dataTypes.booleans;

public class Challenge23 {
    
    public boolean less20(int num){

       return (num % 20 == 18 || num % 20 == 19);
      
    }

    public static void main(String[] args){

        Challenge23 ch = new Challenge23();
        
        System.out.println(ch.less20(18));
        System.out.println(ch.less20(19));
        System.out.println(ch.less20(20));
    }
}
