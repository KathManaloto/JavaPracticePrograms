/*
    Function Description

    Complete the isAnagram function in the editor.

    isAnagram has the following parameters:
        string a: the first string
        string b: the second string

    Returns:
        boolean: If a and b are case-insensitive anagrams, return true. Otherwise, return false.

    Input Format:
        The first line contains a string a.
        The second line contains a string b.

    Constraints:
        1 <= length(a), length(b) <= 50
        Strings a and b consist of English alphabetic characters.
        The comparison should NOT be case-sensitive.
 */

package dataTypes.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge4 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] x = a.toLowerCase().toCharArray();
        char[] y = b.toLowerCase().toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
