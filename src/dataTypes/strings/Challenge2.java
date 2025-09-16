/*
    Given a string, s, and two indices, start and end, print a substring consisting of all
    characters in the inclusive range from start to end - 1.

    Input Format:
    The first line contains a single string denoting s.
    The second line contains two space-separated integers denoting the respective values of start and end.

    Constraints:
    1 <= |s| <= 100
    0 <= start < end <= n
    String s consist of English alphabetic letters (i.e., [a - zA - Z]) only.

    Output Format:
    Print the substring in the inclusive range from start to end -1 .

 */
package dataTypes.strings;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start,end));
    }
}
