/*
    Objective: In this challenge, we're going to use loops to help us do some simple math.

    Task: Given an integer,N, print its first 10 multiples.
    Each multiple N x i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

    Input Format: A single integer, N.
    Constraints: 2<=N<=20
    Output Format:
    Print 10 lines of output; each line i (where 1<=i<=10) contains the result of N x i in the form:
    N x i = result
 */
package mathematicalProblems.javaloops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challenge1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter an integer from 2 - 20: ");
        int N = Integer.parseInt(reader.readLine().trim());

        for(int i = 1; i<=10; i++){
            System.out.println(N + " x " + i + " = " + (N * i));
        }
        reader.close();
    }
}
