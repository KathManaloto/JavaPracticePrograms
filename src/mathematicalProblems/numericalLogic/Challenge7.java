/*
    Warmup-2 > countXX
    Count the number of "xx" in the given string. 
    We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3
*/
package mathematicalProblems.numericalLogic;

public class Challenge7 {
    
    public int countXX(String word){
        
        int count = word.length();
        int sum = 0;
        for(int i = 0; i<count - 1 ; i++){
            if(word.substring(i, i+2).equals("xx")){
                sum = sum + 1;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Challenge7 ch = new Challenge7();

        System.out.println(ch.countXX("abcxx"));
        System.out.println(ch.countXX("xxx"));
        System.out.println(ch.countXX("xxxx"));
    }
}
