/*
    Warmup-2 > stringX
    Given a string, return a version where all the "x" have been removed. 
    Except an "x" at the very start or end should not be removed.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx"
 */
package dataTypes.strings;

public class Challenge28 {
    
    public String stringX(String word){

        int count = word.length();
        String stg = "";

        if(count <=2){
            return word;
        }

        for(int i = 1 ; i < count - 1; i++){

            if(!word.substring(i,i+1).equals("x")){
                stg += word.substring(i,i+1);
            }
        }

        return word.substring(0, 1) + stg + word.substring(count-1, count);

    }

    public static void main(String[] args){

        Challenge28 ch = new Challenge28();

        System.out.println(ch.stringX("xxHxix"));
        System.out.println(ch.stringX("abxxxcd"));
        System.out.println(ch.stringX("xabxxxcdx"));
    }

}

