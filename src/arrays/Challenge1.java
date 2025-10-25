/*
    Warmup-2 > arrayCount9
    Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3
 */
package arrays;

public class Challenge1 {
    
    public int arrayCount9(int[] nums){

        int count = nums.length;
        int counter = 0;

        for(int i = 0 ; i < count ; i++){
            if(nums[i] == 9){
                counter += 1;
            }
        }
        
        return counter;
    }

    public static void main(String[] args){

        Challenge1 ch = new Challenge1();

        System.out.println(ch.arrayCount9(new int[]{1, 2, 9}));
        System.out.println(ch.arrayCount9(new int[]{1, 9, 9}));
        System.out.println(ch.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}
