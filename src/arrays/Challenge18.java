/*
    Array-1 > has23
    Given an int array length 2, return true if it contains a 2 or a 3.

    has23([2, 5]) → true
    has23([4, 3]) → true
    has23([4, 5]) → false
*/

package arrays;

public class Challenge18 {
    
    public boolean has23(int[] nums){

        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public static void main(String[] args){

        Challenge18 ch = new Challenge18();

        System.out.println(ch.has23(new int[]{2, 5}));
        System.out.println(ch.has23(new int[]{4, 3}));
        System.out.println(ch.has23(new int[]{4, 5}));
    }
    
}
