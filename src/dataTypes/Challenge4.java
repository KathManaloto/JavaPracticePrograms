/*
    Given two strings of lowercase English letters, A and B, perform the following operations:
        Sum the lengths of  A and b.
        Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
        Capitalize the first letter in A and B and print them on a single line, separated by a space.

    Input Format:
    The first line contains a string A.
    The second line contains another string B.
    The strings are comprised of only lowercase English letters.

    Output Format:

    There are three lines of output:
    For the first line, sum the lengths of A and B.
    For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
    For the third line, capitalize the first letter in both A and B and print them on a single line,
        separated by a space.
 */
package dataTypes;

import java.util.Scanner;

public class Challenge4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sum = A.length() + B.length();
        System.out.println(sum);

        if(A.compareTo(B) > 0) System.out.println("Yes");
        else System.out.println("No");

        System.out.println(A.toUpperCase().charAt(0) +  A.substring(1) + " " +
                           B.toUpperCase().charAt(0) + B.substring(1));
    }
}
