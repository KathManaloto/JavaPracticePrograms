/*
    Array-1 > makeMiddle
    Given an array of ints of even length, return a new array length 2 containing 
    the middle two elements from the original array. The original array will be length 2 or more.

    makeMiddle([1, 2, 3, 4]) → [2, 3]
    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
    makeMiddle([1, 2]) → [1, 2]
 */

package arrays;

import java.util.Arrays;

public class Challenge25 {

    public int[] makeMiddle(int[] nums){

        int center = nums.length/2;

        return new int[]{nums[center-1], nums[center]};
    }

    public static void main(String[] args){

        Challenge25 ch = new Challenge25();

        System.out.println(Arrays.toString(ch.makeMiddle(new int[]{1, 2, 3, 4}))); 
        System.out.println(Arrays.toString(ch.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}))); 
        System.out.println(Arrays.toString(ch.makeMiddle(new int[]{1, 2}))); 

    }
    
}
