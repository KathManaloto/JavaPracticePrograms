/*
    In this challenge, you must read an integer, a double, and a String from stdin,
    then print the values according to the instructions in the Output Format section below.

    Input Format:
    The first line contains an integer.
    The second line contains a double.
    The third line contains a String.

    Output Format:
    On the first line, print String: followed by the unaltered String read from stdin.
    On the second line, print Double: followed by the unaltered double read from stdin.
    On the third line, print Int: followed by the unaltered integer read from stdin.
 */
package dataTypes;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Input integer: ");
        int i = scan.nextInt();

        System.out.print("Input double value: ");
        double d = scan.nextDouble();

        scan.nextLine();
        System.out.print("Input string: ");
        String s = scan.nextLine();

        System.out.println("\nResults: ");
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Integer: " + i);
    }

}
