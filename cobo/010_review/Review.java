/* 
IDK (Paul Serbanescu, May Qiu, Jeffery Tang)
APCS
L06 -- Reviews
2022-02-13
time spent: 4 hrs
*/


import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();


  private static final String SPACE = " ";

  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }


  //read in the positive adjectives in postiveAdjectives.txt
     try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        System.out.println(temp);
        posAdjectives.add(temp.toLowerCase());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }

  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim().toLowerCase());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }
  }

  /**
   * returns a string containing all of the text in fileName (including punctuation),
   * with words separated by a single space
   */
  public static String textToString( String fileName )
  {
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));

      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();

    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }

  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment)
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }

  public static void sentimentValTester( String a, String b, String c){
    System.out.println(sentimentVal(a));
    System.out.println(sentimentVal(b));
    System.out.println(sentimentVal(c));
  }

  public static double totalSentiment(String fileName){
    String review = textToString(fileName);
    String[] reviewArray = review.split(" ");
    double answer = 0.0;
    for(int i = 0; i < reviewArray.length; i++){
      answer += sentimentVal(reviewArray[i]);
    }
    return answer;
  }

  public static int starRating(String fileName){
    if(totalSentiment(fileName) > 30) {
      return 4;
    }
    else if(totalSentiment(fileName) > 20){
      return 3;
    }
    else if(totalSentiment(fileName) > 10){
      return 2;
    }
    else if(totalSentiment(fileName) > 0){
      return 1;
    }
    else{
      return 0;
    }
  }
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none
   */
  public static String getPunctuation( String word )
  {
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }

    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }

    return word;
  }

  /**
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }

  /**
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
  }

  /**
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }

  public static String fakeReview(String fileName) {
    String review = textToString(fileName);
    String[] words = review.split(" ");
    String ans = "";
    for (int i = 0; i < words.length; i++) {
      if (words[i].charAt(0) == '*') {
        while (sentimentVal(words[i]) > -.5 && sentimentVal(words[i]) < .5) {
          words[i] = randomAdjective();
        }
      }
      ans += words[i] + " ";
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println("Testing sentimentValTester: ");
    sentimentValTester("accidental", "account", "acceptable");
    System.out.println("Testing totalSentiment: " + totalSentiment("SimpleReview.txt"));
    System.out.println("Testing starRating: " + starRating("cleanSentiment.csv"));

    System.out.println("Testing fakeReview: " + fakeReview("SimpleReview.txt"));
  }
}
