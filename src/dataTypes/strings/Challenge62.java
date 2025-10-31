/*
    String-1 > minCat
    Given two strings, append them together (known as "concatenation") and return the result. 
    However, if the strings are different lengths, omit chars from the longer string so it 
    is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". 
    The strings may be any length.

    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"
 */
package dataTypes.strings;

public class Challenge62 {
    
    public String minCat(String a, String b){

        if(a.length() > b.length()){
            return a.substring(a.length() - b.length())+ b;
        } else{
            return a + b.substring(b.length() - a.length());

        }
    }

    public static void main(String[] args){

        Challenge62 ch = new Challenge62();

        System.out.println(ch.minCat("Hello", "Hi"));
        System.out.println(ch.minCat("Hello", "java"));
        System.out.println(ch.minCat("java", "Hello"));
    }
}
