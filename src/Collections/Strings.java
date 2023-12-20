package Collections;
import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args){
        String greeting = "HelloWorld!";
        greeting = greeting + "Welcome to Java!";   //String is immutable, when updated, new memory is created
        System.out.println(greeting);

        //String Builder(Asynchronous)
        StringBuilder Builder = new StringBuilder("Hello, ");
        Builder.append("World");  //Appends to the existing greet Object(mutable)
        System.out.println(Builder);

        //String Buffer(Synchronous)
        StringBuffer Buffer = new StringBuffer("Hello, ");
        Buffer.append("World");  //Appends to the existing greet Object(mutable)
        System.out.println(Buffer); // implement one after another, SLower than Builder.

        //String Tokenizer
        StringTokenizer tokenizer = new StringTokenizer("Hello, World!, Welcome, to , Java", ",");
        StringTokenizer token = new StringTokenizer("Hello| World!| Welcome| to | Java",  "|");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken().trim());
        }
        System.out.println("----------------");
        while(token.hasMoreTokens()) {
            System.out.println(token.nextToken().trim());
        }
    }
}
