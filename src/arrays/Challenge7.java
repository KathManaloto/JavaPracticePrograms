/*
    Array-1 > firstLast6
    Given an array of ints, return true if 6 appears as either the first or last element in the array. 
    The array will be length 1 or more.

    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
*/

package arrays;

public class Challenge7 {
    
    public boolean firstLast6(int[] nums){

        return (nums[0] == 6 || nums[nums.length-1] == 6);
    }

    public static void main(String[] args){

        Challenge7 ch = new Challenge7();

        System.out.println(ch.firstLast6(new int[]{1, 2, 6}));
        System.out.println(ch.firstLast6(new int[]{6, 1, 2, 3}));;
        System.out.println(ch.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
}
