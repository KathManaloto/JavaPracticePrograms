/*
    Array-1 > reverse3
    Given an array of ints length 3, return a new array with the elements in reverse order, 
    so {1, 2, 3} becomes {3, 2, 1}.

    reverse3([1, 2, 3]) → [3, 2, 1]
    reverse3([5, 11, 9]) → [9, 11, 5]
    reverse3([7, 0, 0]) → [0, 0, 7]
 */

package arrays;

import java.util.Arrays;

public class Challenge13 {
    
    public int[] reverse3(int[] nums){

        int[] reverseNums = {nums[2], nums[1], nums[0]};

        return reverseNums;
    }

    public static void main(String[] args){

        Challenge13 ch = new Challenge13();

        System.out.println(Arrays.toString(ch.reverse3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ch.reverse3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(ch.reverse3(new int[]{7, 0, 0})));

    }
}
