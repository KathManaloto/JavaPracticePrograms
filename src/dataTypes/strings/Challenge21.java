/*
    Warmup-1 > delDel
    Given a string, if the string "del" appears starting at index 1, 
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.

    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
*/
package dataTypes.strings;

public class Challenge21 {
    
    public String delDel(String word){

        if((word.length() >= 4) && word.substring(1,4).equals("del")){
            return word.substring(0,1) + word.substring(4);
        } else{
            return word;
        }
    }

    public static void main(String[] args){

        Challenge21 ch = new Challenge21();

        System.out.println(ch.delDel("adelbc"));
        System.out.println(ch.delDel("adelHello"));
        System.out.println(ch.delDel("adedbc"));

    }
}
