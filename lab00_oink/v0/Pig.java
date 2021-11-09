/*
MYLE - May Qiu, Yuki Feng, Lindsay Phung
APCS
LAB 00
2021-11-08
time spent: 1.67 hrs

DISCO
- we spent a lot of time on making it so that "tsk" can be translated... we ended up taking out the '=' in hasAVowel
- "we are girlbosses," said by Yuki Feng
- "we are good communicators," said by Lindsay Phung
- "teletype is CoOoOOl," said by MaY Qiu
QCC
- we can translate more than 1 word, but there are issues when it comes to punctuation and capitilzation (phrasing can be solved via arrays(?))
*/

import java.util.Scanner;
import java.util.Array;

public class Pig {

    private static final String VOWELS = "aeiouy";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";

    public static boolean hasA (String w, String letter ) {
       return w.indexOf(letter) != -1;
    }

    public static boolean isAVowel(String letter) {
       return VOWELS.indexOf(letter) != -1;
    }

    public static int countVowels(String w) {
       return allVowels(w).length();
    }

    public static boolean hasAVowel(String w) {
       return (countVowels(w) > 0);
    }

    public static String allVowels(String w) {
       String ans = "";
       for (int i = 0; i < w.length(); i++) {
          if (isAVowel(w.substring(i,i+1)))
             ans += w.substring(i, i+1);
       } return ans;
    }

    public static String allConsonants(String w) {
      String ans = "";
      for (int i = 0; i < w.length(); i++) {
         if (!isAVowel(w.substring(i,i+1)))
            ans += w.substring(i, i+1);
      } return ans;
    }

    public static String firstVowel(String w) {
      String ans = "";
      if (hasAVowel(w)) {
        ans = allVowels(w).substring(0,1);
      } return ans;
    }

    public static boolean beginsWithVowel( String w ) {
      return isAVowel( w.substring(0,1) );
    }

    public static String engToPig (String w) {
     String ans = "";
     if (beginsWithVowel(w)) {
       ans = w + "way";
     }
     else if (!hasAVowel(w)) {
       return w;
     }
     else {
       int vPos = w.indexOf(firstVowel (w));
       ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
     }
     return ans;
   }

    /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
    public static boolean isPunc( String symbol ) {
      return PUNCS.indexOf( symbol ) != -1;
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
    public static boolean isUpperCase( String letter ) {
      return CAPS.indexOf(letter) != -1;
    }


    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc("cat.") -> true
            hasPunc("cat") -> false .,:;!?
      =====================================*/
    public static boolean hasPunc( String w ) {
      for(int i=0;i<w.length();i++) {
        return (isPunc(w.substring(i,i+1)));
        }
      return false;
    }


    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {
	     return isUpperCase(w.substring(0,1) );
    }

    public static void main(String[] args) {
    /* System.out.println("isAVowel: " + isAVowel("f") + isAVowel("a")); //expected result:false
    System.out.println("countVowels: " + countVowels("banana") ); //3 vowels
    System.out.println("hasAVowel: " + hasAVowel("aura")); // true
    System.out.println("allVowels: " + allVowels("eunoia")); // euoia
    System.out.println("allConsonants: " + allConsonants("rhythm")); // false
    System.out.println("firstVowel: " + firstVowel("sea")); // e
    System.out.println("beginsWithVowel: " + beginsWithVowel("apple")); //true
    System.out.println("engToPig: " + engToPig("may")); //aymay
    System.out.println("isPunc: " + isPunc(".")); // true
    System.out.println("isUpperCase: " + isUpperCase("H")); //true
    System.out.println("hasPunc: " + hasPunc("world")); //true
    System.out.println("beginsWithUpper: " + beginsWithUpper("Yoinks")); // true
    */
    for(String word: args) {
    System.out.println( "allVowels \t" + allVowels(word) );
    System.out.println( "allConsonants \t" + allConsonants(word) );
    System.out.println( "firstVowels \t" + firstVowel(word) );
    System.out.println( "countVowels \t" + countVowels(word) );
    System.out.println( "engToPig \t" + engToPig(word) );
    System.out.println( "---------------------" );
  }
  }
}
