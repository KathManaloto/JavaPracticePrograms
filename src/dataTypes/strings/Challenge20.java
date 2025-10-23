/*
    Warmup-1 > startOz
    Given a string, return a string made of the first 2 chars (if present), 
    however include first char only if it is 'o' and include the second only 
    if it is 'z', so "ozymandias" yields "oz".

    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"
 */
package dataTypes.strings;

public class Challenge20 {

    public String startOz(String word){

        // if((word.length() == 1) && word.equals("o")){
        //     return word;
        //}
        // if(word.isEmpty()){
        //   return "";
        // }
        // String first = word.substring(0,1);
        // String second = word.substring(1,2);

        // if(first.equals("o") && !second.equals("z")){
        //     return first;
        // } else if(!first.equals("o") && second.equals("z")){
        //     return second;
        // } else if(first.equals("o") && second.equals("z")){
        //     return first + second;
        // } else{
        //     return "";
        // }

        // OR

        String result = "";

        if(word.length() >= 1 && word.charAt(0 ) == 'o'){
            result = result + word.charAt(0);
        }

        if(word.length() >= 2 && word.charAt(1) == 'z'){
            result = result + word.charAt(1);
        }
        
        return result;
    }

    public static void main(String[] args){

        Challenge20 ch = new Challenge20();

        System.out.println(ch.startOz("ozymandias"));
        System.out.println(ch.startOz("bzoo"));
        System.out.println(ch.startOz("oxx"));

    }

}
