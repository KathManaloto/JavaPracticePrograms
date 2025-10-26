/*
    Warmup-2 > array667
    Given an array of ints, return the number of times that two 6's are next to each other in the array. 
    Also count instances where the second "6" is actually a 7.

    array667([6, 6, 2]) → 1
    array667([6, 6, 2, 6]) → 1
    array667([6, 7, 2, 6]) → 1
 */
package arrays;

public class Challenge4 {
    
    public int array667(int[] nums){

        int counter = 0;

        for(int i = 0; i < nums.length ; i++){

            if((i+1)<nums.length && ((nums[i] == 6 && nums[i+1] == 6) || (nums[i] == 6 && nums[i+1] == 7))){    
                counter += 1;
            }
        }

        return counter;
    }

    public static void main(String[] args){

        Challenge4 ch = new Challenge4();

        System.out.println(ch.array667(new int[]{6, 6, 2}));
        System.out.println(ch.array667(new int[]{6, 6, 2, 6}));
        System.out.println(ch.array667(new int[]{6, 7, 2, 6}));
    }
}
