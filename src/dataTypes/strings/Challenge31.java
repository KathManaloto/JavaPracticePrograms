/*
    String-1 > helloName
    Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
*/

package dataTypes.strings;

public class Challenge31 {
    
    public String helloName(String name){

        return "Hello " + name + "!";
    }

    public static void main(String[] args){

        Challenge31 ch = new Challenge31();

        System.out.println(ch.helloName("Bob"));
        System.out.println(ch.helloName("Alice"));
        System.out.println(ch.helloName("X"));
    }
}
