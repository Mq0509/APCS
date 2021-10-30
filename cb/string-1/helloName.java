/*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".*/

public class helloName{
public String helloName(String name) {
  return "Hello " + name + "!";
}
  public static void main(){
    System.out.println (helloName("Bob")); /* → "Hello Bob!" */
    System.out.println (helloName("Alice")); /*  → "Hello Alice!" */
    System.out.println (helloName("X")); /* → "Hello X!" */
}
}
