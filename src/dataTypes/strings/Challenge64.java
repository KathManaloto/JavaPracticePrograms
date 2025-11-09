/*
    Logic-1 > fizzString
    Given a string str, if the string starts with "f" return "Fizz". 
    If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, 
    return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)

    fizzString("fig") → "Fizz"
    fizzString("dib") → "Buzz"
    fizzString("fib") → "FizzBuzz"
 */
package dataTypes.strings;

public class Challenge64 {
    
    public String fizzString(String str){

        if(str.length() >= 1 && str.substring(0,1).equals("f") && str.substring(str.length() - 1).equals("b")){
            return "FizzBuzz";
        } else if(str.length() >= 1 && str.substring(0,1).equals("f")){
            return "Fizz";
        } else if(str.substring(str.length() - 1).equals("b")){
            return "Buzz";
        } else{
            return str;
        }
    }
    
    public static void main(String[] args){

        Challenge64 ch = new Challenge64();

        System.out.println(ch.fizzString("fig"));
        System.out.println(ch.fizzString("dib"));
        System.out.println(ch.fizzString("fib"));
    }
}
