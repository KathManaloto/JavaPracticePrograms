/*
    String-2 > repeatSeparator
    Given two strings, word and a separator sep, return a big string 
    made of count occurrences of the word, separated by the separator string.

    repeatSeparator("Word", "X", 3) → "WordXWordXWord"
    repeatSeparator("This", "And", 2) → "ThisAndThis"
    repeatSeparator("This", "And", 1) → "This"
*/
package dataTypes.strings;

public class Challenge71 {
    
    public String repeatSeparator(String word, String sep, int count){

        if(count == 0){
            return "";
        }

        if(count == 1){
            return word;
        }

        String addWord = "";

        for(int i = count; i > 1; i--){
            addWord += sep + word;
        }

        return word+addWord;
    }

    public static void main(String[] args) {
        Challenge71 ch = new Challenge71();

        System.out.println(ch.repeatSeparator("Word", "X", 3));
        System.out.println(ch.repeatSeparator("This", "And", 2));
        System.out.println(ch.repeatSeparator("This", "And", 1));
    }
}
