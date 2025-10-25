/*
    Warmup-2 > arrayFront9
    Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false
 */
package arrays;

public class Challenge2 {

    public boolean arrayFront9(int[] nums){

        for(int i = 0 ; i < 4 ; i++){

            if(i >= nums.length){
                break;
            }

            if(nums[i] == 9){
                return true;
            }
        }
         
        return false;

    }

    public static void main(String[] args){

        Challenge2 ch = new Challenge2();

        System.out.println(ch.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(ch.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(ch.arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }
}
