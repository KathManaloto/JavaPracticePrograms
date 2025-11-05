/*
    Array-1 > swapEnds
    Given an array of ints, swap the first and last elements in the array. 
    Return the modified array. The array length will be at least 1.

    swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    swapEnds([1, 2, 3]) → [3, 2, 1]
    swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

package arrays;

import java.util.Arrays;

public class Challenge27 {
    
    public int[] swapEnds(int[] nums){

        int firstNum = nums[nums.length - 1];
        int endNum = nums[0];

        nums[0] = firstNum;
        nums[nums.length - 1] = endNum;

        return nums;
    }

    public static void main(String[] args){

        Challenge27 ch = new Challenge27();

        System.out.println(Arrays.toString(ch.swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(ch.swapEnds(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ch.swapEnds(new int[]{8, 6, 7, 9, 5})));
    }
}
