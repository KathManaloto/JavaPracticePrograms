/* 
    Array-1 > sum2
    Given an array of ints, return the sum of the first 2 elements in the array. 
    If the array length is less than 2, just sum up the elements that exist, 
    returning 0 if the array is length 0.

    sum2([1, 2, 3]) → 3
    sum2([1, 1]) → 2
    sum2([1, 1, 1, 1]) → 2
*/

package arrays;

public class Challenge15 {
    
    public int sum2(int[] nums){

        if(nums.length == 0){ return 0; }
        if(nums.length == 1){ return nums[0];}

        return nums[0] + nums[1];
    }

    public static void main(String[] args){

        Challenge15 ch = new Challenge15();

            System.out.println(ch.sum2(new int[]{1, 2, 3}));
            System.out.println(ch.sum2(new int[]{1, 1}));
            System.out.println(ch.sum2(new int[]{1, 1, 1, 1}));
    }
}
