/*
You are given an integer n, you have to convert it into a string.
Please complete the partially completed code in the editor.
If your code successfully converts n into a string s the code will print "Good job".
Otherwise, it will print "Wrong answer".

n can range between -100 to 100 inclusive.
 */
package dataTypes;

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String s = Integer.toString(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
