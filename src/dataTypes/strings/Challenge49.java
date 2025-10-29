/*
    String-1 > conCat
    Given two strings, append them together (known as "concatenation") and 
    return the result. However, if the concatenation creates a double-char, 
    then omit one of the chars, so "abc" and "cat" yields "abcat".

    conCat("abc", "cat") → "abcat"
    conCat("dog", "cat") → "dogcat"
    conCat("abc", "") → "abc"
 */

package dataTypes.strings;

public class Challenge49 {
    
    public String conCat(String a, String b){

        if(a.length() > 0 && b.length() > 0 && 
          (a.substring(a.length()-1, a.length()).equals(b.substring(0,1)))){

                if(a.length() > b.length()){
                    return a.substring(0, a.length()-1) + b;
                } else{
                    return a + b.substring(1);
                }
        }

        return a + b;
    }

    public static void main(String[] args){

        Challenge49 ch = new Challenge49();

        System.out.println(ch.conCat("abc", "cat"));
        System.out.println(ch.conCat("dog", "cat"));
        System.out.println(ch.conCat("abc", ""));
    }
}
