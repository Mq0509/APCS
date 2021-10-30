/*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".*/

public class HelloName{
public String helloName(String name) {
  return "Hello " + name + "!";
}
  public static void main(String [] args){
    System.out.println (helloName("Bob")); /* → "Hello Bob!" */
    System.out.println (helloName("Alice")); /*  → "Hello Alice!" */
    System.out.println (helloName("X")); /* → "Hello X!" */
}
}
