/*
    Array-1 > frontPiece
    Given an int array of any length, return a new array of its first 2 elements. 
    If the array is smaller than length 2, use whatever elements are present.

    frontPiece([1, 2, 3]) → [1, 2]
    frontPiece([1, 2]) → [1, 2]
    frontPiece([1]) → [1]
 */

package arrays;

import java.util.Arrays;

public class Challenge30 {
    
    public int[] frontPiece(int[] nums){

        if(nums.length < 2){
            return nums;
        }

        return new int[]{nums[0], nums[1]};
    }

    public static void main(String[] args){

        Challenge30 ch = new Challenge30();

        System.out.println(Arrays.toString(ch.frontPiece(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ch.frontPiece(new int[]{1, 2})));
        System.out.println(Arrays.toString(ch.frontPiece(new int[]{1})));
    }
}

