/*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

    catDog("catdog") → true
    catDog("catcat") → false
    catDog("1cat1cadodog") → true
*/
package dataTypes.strings;

public class Challenge68 {
    
    public boolean catDog(String str){
        int cat_count = 0;
        int dog_count = 0;

        for(int i = 0; i < str.length()-2; i++){
            if(str.substring(i, i+3).equals("cat")){
                cat_count += 1;
            } 

            if(str.substring(i, i+3).equals("dog")){
                dog_count += 1;
            } 
        }

        return cat_count == dog_count;
    }

    public static void main(String[] args) {
        
        Challenge68 ch = new Challenge68();

        System.out.println(ch.catDog("catdog"));
        System.out.println(ch.catDog("catcat"));
        System.out.println(ch.catDog("1cat1cadodog"));

    }
}
