/*
    Array-1 > start1
    Start with 2 int arrays, a and b, of any length. 
    Return how many of the arrays have 1 as their first element.

    start1([1, 2, 3], [1, 3]) → 2
    start1([7, 2, 3], [1]) → 1
    start1([1, 2], []) → 1
 */
package arrays;

public class Challenge23 {
   
    public int start1(int[] a, int[] b){

       int count = 0;

       if(a.length > 0 && a[0] == 1){
            count += 1;
       }

       if(b.length > 0 && b[0] == 1){
            count += 1;
       }

       return count;
    }

    public static void main(String[] args){

        Challenge23 ch = new Challenge23();

        System.out.println(ch.start1(new int[]{1, 2, 3}, new int[]{1,3}));
        System.out.println(ch.start1(new int[]{7, 2, 3}, new int[]{1}));
        System.out.println(ch.start1(new int[]{1, 2}, new int[]{}));
    }
}
