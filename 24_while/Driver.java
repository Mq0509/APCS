/***
Spicy Mangoes (Andrew Piatesky, May Qiu, Faiyaz Rafee) and Burnt Peanut
APCS
HW 24 -- Get It While You Can/Writing and testing class with loops/Filled in coin class methods and then tested it using Driver.java
and ran a loop to see what flipping a coin thousands of times results in
2021-10-25
Discoveries:
Equals is a built in method for each class seeing if objects are equivalent, however you can replace it by writing your own that 
has whatever functionality that you desire
Also this() method reruns constructor (can rerun overloaded ones if you add more args)
Questions: 
Why did the method assignValue in class Coin have args even though they are never used (works without it,but doesn't throw error when actually used)?
Mods: 
Changed every single method except reset() toString(). 
We re-wrote equals(), assignValue() and all the constructors to make them more efficient and cleaner but other than that functionality remained the same.
Additionally we had to write a new flip() method because previously we didn't know how to generate random values.
In all the functionality didn't change but we just cleaned up our code and made it easier to read and more efficient.
***/


public class Driver {

  public static void main( String[] args ) {

    


    //test default constructor
    /*===================TOP==========================
      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);
      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      ====================BOTTOM======================*/

      //Pre loop
      Coin yours = new Coin("quarter");
      Coin wayne = new Coin("penny", "tails");

      System.out.println("\nBefore flip loop\n");
      System.out.println("Yours:" + yours);
      System.out.println("\nWayne:" + wayne);

      //Looping System
      double numMatches = 0; //has to greater than 2005 * 33 because greater than 65536 matches and divisible by 2005 (birthyear)
      double totalFlips = 0; //to see if bias is actually working

      while (numMatches < (2005 * 33)) {
        yours.flip();
        wayne.flip();
        if ( yours.equals(wayne) ) {
          numMatches ++;
        }
        totalFlips ++;
      }

      //Post loop summary
      System.out.println("\nAfter flip loop\n");
      System.out.println("Yours:" + yours);
      System.out.println("\nWayne:" + wayne);

      System.out.print("\nPercentages/Stats\n");
      System.out.print("totalFlips: " + totalFlips);
      System.out.print(", numMatches: " + numMatches);
      System.out.println(", Percent match: " + numMatches / totalFlips);







      

  }//end main()

}//end class
