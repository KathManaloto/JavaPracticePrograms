/*
    Array-1 > maxTriple
    Given an array of ints of odd length, look at the first, last, 
    and middle values in the array and return the largest. The array length will be a least 1.

    maxTriple([1, 2, 3]) → 3
    maxTriple([1, 5, 3]) → 5
    maxTriple([5, 2, 3]) → 5
 */

package arrays;

public class Challenge29 {
  
    public int maxTriple(int[] nums){

        if(nums.length == 1){
            return nums[0];
        }

        int largest = 0;

        if((nums[0] > nums[nums.length/2]) && (nums[0] > nums[nums.length-1])){
            largest = nums[0];
        } else if((nums[nums.length/2] > nums[0]) && (nums[nums.length/2] > nums[nums.length-1])){
            largest = nums[nums.length/2];
        } else{
            largest = nums[nums.length-1];
        }

        return largest;
    }

    public static void main(String[] args){

        Challenge29 ch = new Challenge29();

        System.out.println(ch.maxTriple(new int[]{1, 2, 3}));
        System.out.println(ch.maxTriple(new int[]{1, 5, 3}));
        System.out.println(ch.maxTriple(new int[]{5, 2, 3}));
    }
}
