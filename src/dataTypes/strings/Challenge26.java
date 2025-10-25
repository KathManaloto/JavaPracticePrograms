/*
    Warmup-2 > last2
    Given a string, return the count of the number of times that a substring length 2 
    appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 
    (we won't count the end substring).

    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2
 */
package dataTypes.strings;

public class Challenge26 {
    
    public int last2(String word){

        int count = word.length();

        if(count<=2){
            return 0;
        }

        String checkWord = word.substring(count-2, count);
        int counter = 0;

        for(int i = 0; i < count - 2; i++){
            if(word.substring(i, i+2).equals(checkWord)){
                counter += 1;
            }
        }
        
        return counter;
    }

    public static void main(String[] args){

        Challenge26 ch = new Challenge26();

        System.out.println(ch.last2("hixxhi"));
        System.out.println(ch.last2("xaxxaxaxx"));
        System.out.println(ch.last2("axxxaaxx"));
    }
}
