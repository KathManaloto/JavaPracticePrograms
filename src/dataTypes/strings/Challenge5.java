/*
    Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
    We define a token to be one or more consecutive English alphabetic letters.

    Then, print the number of tokens, followed by each token on a new line.

    Input Format: A single string, s.

    Constraints:
       - 1 <= length of s <= 4*10^5
       - s is composed of the following: English alphabetic letters, blank spaces,
        exclamation points (!), commas (,), question marks (?), periods (.), underscores (_),
        apostrophes ('), and at symbols (@).

    Output Format:
    On the first line, print an integer, n, denoting the number of tokens in string s
    (they do not need to be unique).Next, print each of the n tokens on a new line in the
    same order as they appear in input string s.
 */
package dataTypes.strings;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] tokens = s.trim().split("[^a-zA-Z]+");

        if (tokens.length == 1 && tokens[0].isEmpty()) System.out.println(0);
        else {
            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}