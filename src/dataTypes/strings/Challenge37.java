/*
    String-1 > comboString
    Given 2 strings, a and b, return a string of the form short+long+short, 
    with the shorter string on the outside and the longer string on the inside. 
    The strings will not be the same length, but they may be empty (length 0).

    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"
*/

package dataTypes.strings;

public class Challenge37 {
 
    public String comboString(String a, String b){

        return a.length() > b.length() ? b+a+b : a+b+a;
    }

    public static void main(String[] args){

        Challenge37 ch = new Challenge37();

        System.out.println(ch.comboString("Hello", "hi"));
        System.out.println(ch.comboString("hi", "Hello"));
        System.out.println(ch.comboString("aaa", "b"));
    }
}
