/*
MYLE - May Qiu, Yuki Feng, Lindsay Phung
APCS
LAB 00
2021-11-09
time spent: 2 hrs
DISCO
-
QCC
- Yellow and any other word starting with Y can be translated (i.e. Ellowyay), but yellow and any other word starting with y can't be translated... (i.e. yellowway)
HOW WE UTILIZED SCANNER DEMO
- test program via inutting test cases (found in words.in) in terminal
WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO
- when there is no user input
NEW IN v2
- we included the methods for punctuation and for phrases (including spaces) + some code for special y
*/

import java.util.Scanner;
import java.util.Arrays;

public class Pig {

    private static final String VOWELS = "aeiouy";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";
    private static final String space = " ";

    public static boolean hasA (String w, String letter) {
      return w.indexOf(letter) != -1;
    }

    public static boolean isAVowel(String letter) {
      return VOWELS.indexOf(letter) != -1;
    }

    public static boolean isAY(String letter) {
      return VOWELS.indexOf(letter) == 5;
    }

    public static boolean isASpace(String w) {
      return space.indexOf(w) != -1;
    }

    public static int countVowels(String w) {
      return allVowels(w).length();
    }

    public static int countSpaces(String w) {
      String ans = "";
      for (int i = 0; i < w.length(); i++) {
        if (isASpace(w.substring(i,i+1)))
        ans += w.substring(i, i+1);
      } return ans.length();
    }

    public static boolean hasASpace(String w) {
      return (countSpaces(w) > 0);
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
      return isAVowel( w.substring(0,1));
    }

    public static boolean beginsWithY(String w) {
      return isAY(w.toLowerCase().substring(0, 1));
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
      for(int i=0;i<w.length();i++){
        if(isPunc(w.substring(i,i+1))){
          return true;
        }
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

    public static String engToPigHelper(String w) {
      String ans = "";
      //begins with vowel
      if (beginsWithVowel(w) && !beginsWithY(w)) {
        ans = w + "way";
      }
      //begins w y
      else if (beginsWithY(w)) {
        int vPos = w.indexOf(firstVowel (w.substring(1)));
        ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
      }

      //only consonants
      if (!hasAVowel(w)) {
        ans = w;
      }

      //begins w consonant
      if (!beginsWithVowel(w)){
        int vPos = w.indexOf(firstVowel (w));
        ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
      }

      //first letter capital
      if (beginsWithUpper(w)) {
        ans = ans.toLowerCase();
        String firstLetter = ans.substring(0,1);
        ans = firstLetter.toUpperCase() + ans.substring(1);
        }
        return ans;
    }

     public static String engToPig(String w){
       w = engToPigHelper(w);
       String puncs = "";
       String letters = "";
       for(int i=0;i<w.length();i++){
         if (hasPunc(w.substring(i,i+1))){
         puncs += w.substring(i,i+1);
         }
         else{
           letters += w.substring(i,i+1);
         }
       }
       return letters + puncs;
     }



    public static void main(String[] args) {
      String ans="";
      for(String word: args) {
      ans += engToPig(word)+" ";
      }
      //System.out.println( "allVowels \t" + allVowels(word) );
      //System.out.println( "allConsonants \t" + allConsonants(word) );
      //System.out.println( "firstVowels \t" + firstVowel(word) );
      //System.out.println( "countVowels \t" + countVowels(word) );
      System.out.println( "engToPig \t" + ans  );
      //System.out.println( "hasPunc \t" + hasPunc(word));
      //System.out.println( "engToPigHelper" + engToPigHelper(word));
      System.out.println( "---------------------" );
      }
}
