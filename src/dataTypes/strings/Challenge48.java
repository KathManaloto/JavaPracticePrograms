/*
    String-1 > lastChars
    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, 
    so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

    lastChars("last", "chars") → "ls"
    lastChars("yo", "java") → "ya"
    lastChars("hi", "") → "h@"
 */

package dataTypes.strings;

public class Challenge48 {
    
    public String lastChars(String a, String b){

        String first = "";
        String last = "";

        if(a.length() == 0){
            first = "@";
        } else{
            first = a.substring(0, 1);
        }

        if(b.length() == 0){
            last = "@";
        } else{
            last = b.substring(b.length()-1, b.length());
        }

        return first + last;
    }

    public static void main(String[] args){

        Challenge48 ch = new Challenge48();

        System.out.println(ch.lastChars("last", "chars"));
        System.out.println(ch.lastChars("yo", "java"));
        System.out.println(ch.lastChars("hi", ""));
    }
}
