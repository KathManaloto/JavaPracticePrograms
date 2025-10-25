/*
    Warmup-2 > array123
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
 */
package arrays;

public class Challenge3 {

    public boolean array123(int[] nums){

        int count = nums.length;

        for(int i = 0; i < count-2; i++){

            if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3){
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args){

        Challenge3 ch = new Challenge3();

        System.out.println(ch.array123(new int[]{1, 1, 2, 3, 1}));
        System.out.println(ch.array123(new int[]{1, 1, 2, 4, 1}));
        System.out.println(ch.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }
    
}
