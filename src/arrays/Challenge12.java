/*
    Array-1 > rotateLeft3
    Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} 
    yields {2, 3, 1}.

    rotateLeft3([1, 2, 3]) → [2, 3, 1]
    rotateLeft3([5, 11, 9]) → [11, 9, 5]
    rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

package arrays;

import java.util.Arrays;

public class Challenge12 {
    
    public int[] rotateLeft3(int[] nums){
        int[] reverse = {nums[1], nums[2], nums[0]};

        return reverse;
    }

    public static void main(String[] args){

        Challenge12 ch = new Challenge12();

        System.out.println(Arrays.toString(ch.rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ch.rotateLeft3(new int[]{5, 11, 9})));
        System.out.println(Arrays.toString(ch.rotateLeft3(new int[]{7, 0, 0})));
    }
}
