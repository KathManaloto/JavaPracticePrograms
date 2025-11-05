/*
    Array-1 > midThree
    Given an array of ints of odd length, return a new array length 3 containing the elements 
    from the middle of the array. The array length will be at least 3.

    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
    midThree([1, 2, 3]) → [1, 2, 3]
 */

package arrays;

import java.util.Arrays;

public class Challenge28 {
    
    public int[] midThree(int[] nums){

        int center = nums.length/2;

        return new int[]{nums[center - 1], nums[center], nums[center + 1]};
    }

    public static void main(String[] args){

        Challenge28 ch = new Challenge28();

        System.out.println(Arrays.toString(ch.midThree(new int[]{1, 2, 3, 4, 5}))); 
        System.out.println(Arrays.toString(ch.midThree(new int[]{8, 6, 7, 5, 3, 0, 9}))); 
        System.out.println(Arrays.toString(ch.midThree(new int[]{1, 2, 3}))); 
    }
}
