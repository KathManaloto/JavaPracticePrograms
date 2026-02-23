/*
    String-2 > xyzMiddle
    Given a string, does "xyz" appear in the middle of the string? 
    To define middle, we'll say that the number of chars to the left and right 
    of the "xyz" must differ by at most one. This problem is harder than it looks.

    xyzMiddle("AAxyzBB") → true
    xyzMiddle("AxyzBB") → true
    xyzMiddle("AxyzBBB") → false
*/
package dataTypes.strings;

public class Challenge73 {
    
    public boolean xyzMiddle(String str){
        
        int n = str.length();

        if(n<3) return false;

        for(int i = 0; i<=n-3 ; i++){
            if(str.substring(i,i+3).equals("xyz")){
                int left = i;
                int right = n - (i+3);

                if(left == right || left == right + 1 || left + 1 == right){
                    return true;
                }
            }
        }
        return false;    
    }

    public static void main(String[] args){

        Challenge73 ch = new Challenge73();

        System.out.println(ch.xyzMiddle("AAxyzBB"));
        System.out.println(ch.xyzMiddle("AxyzBB"));
        System.out.println(ch.xyzMiddle("AxyzBBB"));
    }
}
