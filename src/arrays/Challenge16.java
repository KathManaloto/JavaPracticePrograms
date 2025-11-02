/*
    Array-1 > middleWay
    Given 2 int arrays, a and b, each length 3, return a new array 
    length 2 containing their middle elements.

    middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
    middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
    middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

package arrays;

import java.util.Arrays;

public class Challenge16 {
    
    public int[] middleWay(int[] a, int[] b){

        int[] middle = {a[1], b[1]};
        
        return middle;
    }

    public static void main(String[] args){

        Challenge16 ch = new Challenge16();

        System.out.println(Arrays.toString(ch.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(ch.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0})));
        System.out.println(Arrays.toString(ch.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5})));
    }
}
