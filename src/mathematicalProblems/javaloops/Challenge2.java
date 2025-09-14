/*
We use the integers a, b, and n to create the following series:
   (a + ((2^0) * b)),(a + ((2^0) * b) +((2^1) * b)),...,(a + (2^0 * b) + ((2^1) * b) +...+ ((2^(n-1)) * b))
You are given q queries in the form of a, b, and n. For each query, print the series corresponding
to the given a, b, and n values as a single line of n space-separated integers.

Input Format:
The first line contains an integer, q, denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the
respective a, b, and n values for that query.

Constraints:
0 <= q <= 500
0 <= a,b <= 50
1 <= n <= 15

Output Format:
For each query, print the corresponding series on a new line.
Each series must be printed in order as a single line of n space-separated integers.
 */
package mathematicalProblems.javaloops;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter q value: ");
        int t = in.nextInt();

        // query
        for(int i=0 ; i<t ; i++) {

            System.out.print("Enter a: ");
            int a = in.nextInt();
            System.out.print("Enter b: ");
            int b = in.nextInt();
            System.out.print("Enter n: ");
            int n = in.nextInt();

            int sum = a;
            int[] numList = new int[n];
            for (int j = 0; j < n ; j++) {
                sum += (int)Math.pow(2,j)*b;
                numList[j]= sum;

            }
            for(int num : numList){
                System.out.print(num + " ");
            }
            System.out.println();

        }
        in.close();
    }
}


