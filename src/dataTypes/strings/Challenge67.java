/*
    Return the number of times that the string "hi" appears anywhere in the given string.

    countHi("abc hi ho") → 1
    countHi("ABChi hi") → 2
    countHi("hihi") → 2
*/
package dataTypes.strings;

public class Challenge67 {

    public int countHi(String str){
        int count = 0;

        for(int x = 0; x < str.length()-1; x++){
            if(str.substring(x,x+2).equals("hi")){
                count += 1;
            } 
        }

        return count;
    }

    public static void main(String[] args){
        Challenge67 ch = new Challenge67();
        
        System.out.println(ch.countHi("abc hi ho"));
        System.out.println(ch.countHi("ABChi hi"));
        System.out.println(ch.countHi("hihi"));
    }
}
