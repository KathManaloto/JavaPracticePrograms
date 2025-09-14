/*
    The challenge here is to read n lines of input until you reach EOF,
    then number and print all n lines of content.

    Hint: Java's Scanner.hasNext() method is helpful for this problem.

    Input Format: Read some unknown n lines of input from stdin(System.in)
    until you reach EOF; each line of input contains a non-empty String.

    Output Format: For each line, print the line number, followed by a single space,
    and then the line content received as input.
 */
package inputOutputFormatting;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(sc.hasNext()) {
            System.out.println(i++ + " " +  sc.nextLine());
        }
        sc.close();
    }
}
