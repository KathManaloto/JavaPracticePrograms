 /*
    String-1 > withoutX2
    Given a string, if one or both of the first 2 chars is 'x', 
    return the string without those 'x' chars, and otherwise return the string unchanged. 
    This is a little harder than it looks.

    withoutX2("xHi") → "Hi"
    withoutX2("Hxi") → "Hi"
    withoutX2("Hi") → "Hi"
 */
package dataTypes.strings;

public class Challenge63 {
    
    public String withoutX2(String word){

        String first = "";
        String second = "";
        String last = "";

        if(word.length() >= 2){

            if(!word.substring(0,1).equals("x")){
                first = word.substring(0,1);
            }

            if(!word.substring(1,2).equals("x")){
                second = word.substring(1,2);
            }

            if(word.length() > 2){
                last = word.substring(2);
            }

            return first + second + last;
        }

        if(word.equals("x") || word.isEmpty()){
            return "";
        } else{
            return word;
        }

    }

    public static void main(String[] args){

        Challenge63 ch = new Challenge63();

        System.out.println(ch.withoutX2("xHi"));
        System.out.println(ch.withoutX2("Hxi"));
        System.out.println(ch.withoutX2("Hi"));
    }
}
