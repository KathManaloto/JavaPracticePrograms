/*
Warmup-1 > notString
Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged. 
Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
package dataTypes.strings;

public class Challenge16 {
    
    public String notString(String word){
        int count = word.length();

        if(count < 3){
            return "not " + word;
        }

        String checker = word.substring(0,3);

        if(checker.equals("not")){
            return word;
        } else{
            return "not " +  word;
        }
    }

    public static void main(String[] args){

        Challenge16 ch = new Challenge16();

        System.out.println(ch.notString("candy"));
        System.out.println(ch.notString("x"));
        System.out.println(ch.notString("not bad"));

    }
}
