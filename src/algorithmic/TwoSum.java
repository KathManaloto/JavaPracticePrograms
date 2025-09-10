//This program finds two numbers in an array whose sum equals a specified target.
package algorithmic;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){

        for(int i = 0; i<nums.length; i++)
            for(int j=0; j<nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);

        if(result == null) System.out.println("No solution found!");
        else System.out.println("Indices: [" + result[0]  + ", " + result[1] + "]");
    }
}