/*
 * Task: Given an integer,n, perform the following conditional actions:
 *
 * If n is odd, print Weird
 * If n is even and in the inclusive range of 2 to 5, print Not Weird
 * If n is even and in the inclusive range of 6 to 20, print Weird
 * If n is even and greater than 20, print Not Weird
 *
 * Complete the stub code provided in your editor to print whether n is weird.
 * Input Format: A single line containing a positive integer, n.
 * Constraints: 1 <= n <= 100
 * Output Format: Print Weird if the number is weird; otherwise, print Not Weird.
 */
package ifelsestatements.decisionmaking;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input an integer: ");
        int n = input.nextInt();

        input.close();
        if(n<1 || n>100){
            System.out.println("Input integers within 1 - 100 only.");
        } else{
            if(n % 2 != 0) System.out.println("Weird");
            else if(n>= 2 && n<=5 ) System.out.println("Not Weird");
            else if(n>=6 && n<=20) System.out.println("Weird");
            else System.out.println("Not Weird");
        }
    }
}
