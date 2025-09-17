/*
    Given a string A, print Yes if it is a palindrome, print No otherwise.
    Constraints: A will consist at most 50 lower case english letters.
 */
package dataTypes.strings;

import java.util.Scanner;

public class Challenge6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        String reverse = sb.reverse().toString();

        if(A.equals(reverse)) System.out.println("Yes");
        else System.out.println("No");
    }
}