/*
    Given a string, s, and an integer, k, complete the function so that it finds
    the lexicographically smallest and largest substrings of length k.

    Function Description
    Complete the getSmallestAndLargest function in the editor below.

        getSmallestAndLargest has the following parameters:
            string s: a string
            int k: the length of the substrings to find

        Returns:
            string: the string ' + "\n" + ' where and are the two substrings

    Input Format:
        The first line contains a string denoting s.
        The second line contains an integer denoting k.

    Constraints:
        1 <= |s| <= 1000
        s consists of English alphabetic letters only (i.e., [a-zA-Z]).
 */
package dataTypes.strings;

import java.util.Scanner;

public class Challenge3 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);

        for(int i = 0; i <= s.length()-k ; i++){

            String substring = s.substring(i,i+k);

            if(substring.compareTo(smallest) < 0){
                smallest = substring;
            } if(substring.compareTo(largest) > 0){
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
