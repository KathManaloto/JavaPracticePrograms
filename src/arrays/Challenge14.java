/*
    Array-1 > maxEnd3
    Given an array of ints length 3, figure out which is larger, the first or last element in the array, 
    and set all the other elements to be that value. Return the changed array.

    maxEnd3([1, 2, 3]) → [3, 3, 3]
    maxEnd3([11, 5, 9]) → [11, 11, 11]
    maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
package arrays;

import java.util.Arrays;

public class Challenge14 {
    
    public int[] maxEnd3(int[] nums){

        int largest = 0;

        if((nums[0] > nums[2])){            
            largest = nums[0];
             
        } else{
            largest = nums[2];
        }   

        int[] newNum = {largest, largest, largest};

        return newNum;
    }

    public static void main(String[] args){

        Challenge14 ch = new Challenge14();

        System.out.println(Arrays.toString(ch.maxEnd3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ch.maxEnd3(new int[]{11, 5, 9})));
        System.out.println(Arrays.toString(ch.maxEnd3(new int[]{2, 11, 3})));
    }
}




