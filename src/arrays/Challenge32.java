/*
    Array-1 > make2
    Given 2 int arrays, a and b, return a new array length 2 containing, 
    as much as will fit, the elements from a followed by the elements from b. 
    The arrays may be any length, including 0, but there will be 2 or more elements 
    available between the 2 arrays.

    make2([4, 5], [1, 2, 3]) → [4, 5]
    make2([4], [1, 2, 3]) → [4, 1]
    make2([], [1, 2]) → [1, 2]
 */

package arrays;

import java.util.Arrays;

public class Challenge32 {
    
    public int[] make2(int[] a, int[] b){

        // int[] result = new int[2];

        // if(a.length >= 2){
        //     result = new int[]{a[0], a[1]};
        // }

        // if(a.length == 1){
        //     if(b.length > 0){
        //         result = new int[]{a[0], b[0]};
        //     } else{
        //         result = new int[]{a[0]};
        //     }
        // }
        // if(a.length == 0){

        //     for(int i = 0; i < 2 ; i++){
        //         if(b.length > i){
        //             result[i] = b[i];
        //         }
        //     }
        // }
        // return result;

        // OR

        int[] result = new int[2];
        int index = 0;

        for(int i = 0; i < a.length &&  index < 2 ; i++){
            result[index++] = a[i];
        }

        for(int i = 0; i < b.length &&  index < 2 ; i++){
            result[index++] = b[i];
        }

        return result;
    }

    public static void main(String[] args){

        Challenge32 ch = new Challenge32();

        System.out.println(Arrays.toString(ch.make2(new int[]{4, 5}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ch.make2(new int[]{4}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(ch.make2(new int[]{}, new int[]{1, 2})));
    }
}

            

                
