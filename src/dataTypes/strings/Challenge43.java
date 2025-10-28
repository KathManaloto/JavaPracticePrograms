/* 
    String-1 > endsLy
    Given a string, return true if it ends in "ly".

    endsLy("oddly") → true
    endsLy("y") → false
    endsLy("oddy") → false
*/

package dataTypes.strings;

public class Challenge43 {
    
    public boolean endsLy(String word){

        if(word.length() < 2){
            return false;
        }

        if(word.substring(word.length()-2, word.length()).equals("ly")){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){

        Challenge43 ch = new Challenge43();

        System.out.println(ch.endsLy("oddly"));
        System.out.println(ch.endsLy("y"));
        System.out.println(ch.endsLy("oddy"));
    }
       
}

