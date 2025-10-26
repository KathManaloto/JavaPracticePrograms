/*
    Warmup-2 > has271
    Given an array of ints, return true if it contains a 2, 7, 1 
    pattern: a value, followed by the value plus 5, followed by the value minus 1. 
    Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

    has271([1, 2, 7, 1]) → true
    has271([1, 2, 8, 1]) → false
    has271([2, 7, 1]) → true
 */

package arrays;

public class Challenge6 {
    
    public boolean has271(int[] nums){

        for(int i = 0; i < nums.length; i++){

            if(((i + 2) < nums.length) && 
               ((nums[i+1] - nums[i]) == 5) && 
               (((nums[i+2] - nums[i]) <= 1) && ((nums[i] - nums[i+2]) <= 3))){

                return true;
               }
         
        }

        return false;

    }

    public static void main(String[] args){

        Challenge6 ch = new Challenge6();
        
        System.out.println(ch.has271(new int[]{1, 2, 7, 1}));
        System.out.println(ch.has271(new int[]{1, 2, 8, 1}));
        System.out.println(ch.has271(new int[]{2, 7, 1}));
    }
}
