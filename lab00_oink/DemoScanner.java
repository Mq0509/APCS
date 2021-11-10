/**
   MYLE - May Qiu, Yuki Feng, Lindsay Phung
   APCS
   LAB 00
   2021-11-09
   time spent: 2 hrs
   DEMO -- Use Scanner class to read from standard input
   USAGE:
   1. Read for understanding.
   2. Record predictions.
   3.
   $ javac <thisclass>.java
   $ java <thisclass>
   ...
   4. enter text, followed by ENTER to send
   ...
   5. Reconcile predictions with observations.
   ( CTRL-C to exit )
**/

import java.util.Scanner;  //Scanner is not part of java's std lib
import Pig.java;

public class DemoScanner {

  public static void main( String[] args ) {
    //instantiate a Scanner with STDIN as its bytestream
    Scanner sc = new Scanner( System.in );
    while( sc.hasNext() ) {
      engToPig(sc.nextLine());
      System.out.println(sc.nextLine().engToPig(sc.hasNext()));
    }

  }//end main()

}//end class DemoScanner
