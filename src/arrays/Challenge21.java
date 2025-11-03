/*
    Array-1 > double23
    Given an int array, return true if the array contains 2 twice, or 3 twice. 
    The array will be length 0, 1, or 2.

    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false
*/

package arrays;

public class Challenge21 {
    
    public boolean double23(int[] nums){

        int count2 = 0;
        int count3 = 0;

        for(int i = 0; i < nums.length ; i++){

            if(i < nums.length && nums[i] == 2){
                count2 += 1;
            }

            if(i < nums.length && nums[i] == 3){
                count3 += 1;
            }
        }

        return (count2 == 2 || count3 ==2);

    }

    public static void main(String[] args){

        Challenge21 ch = new Challenge21();

        System.out.println(ch.double23(new int[]{2, 2}));
        System.out.println(ch.double23(new int[]{3, 3}));
        System.out.println(ch.double23(new int[]{2, 3}));
    }
}
