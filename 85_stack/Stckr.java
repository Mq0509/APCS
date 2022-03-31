/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    //Stack<String> cakes = new ALStack<String>();
    Stack<String> cakes = new LLStack<String>();
    System.out.println(cakes.isEmpty());
    System.out.println(cakes.pop());
    cakes.push("IM DYING AHAHHAHA");
    System.out.println(cakes.peekTop());
    cakes.push("MR. K ");
    System.out.println(cakes.pop());
    //...

  }//end main

}//end class
