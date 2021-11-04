/***
 * Trio number int x (Orion Roven, May Qiu, Lawrence Joa)
 * APCS
 * HW31 -- Igpay Atinlay
 * 2021-11-03
 * time spent: .5hrs
 *DISCO:
 *Instead of checking if each character a,e,i,o, or u, for hasAVowel, we can just say (if countVowels(w, VOWELS)>1), return true;
 *When declaring an instance variable, final means that it cannot be changed.
 *QCC:
 *When indexing, is it cooler to use recursion, while loops, or for loops?
 *Why use final if we can remember not to change the instance variable?
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/
public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";

  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) {
    int i=0;
    while (i<w.length()) {
      if (w.substring(i,i+1).equals(letter)) {
        return true;
      }
      i++;
    }
    return false;
  }//end hasA()

  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    if (hasA(VOWELS, letter)) {
      return true;
    }
    return false;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int i=0;
    int ctr=0;
    while (i<w.length()) {
      if (isAVowel(w.substring(i,i+1))) {
        ctr++;
      }
      i++;
    }
    return ctr;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    if (countVowels(w)>0) {
      return true;
    }
    return false;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    int i=0;
    String ans="";
    while (i<w.length()) {
      if (isAVowel(w.substring(i,i+1))) {
        ans+=w.substring(i,i+1);
      }
      i++;
    }
    return ans;
  }


  public static void main( String[] args )
  {
    System.out.println(hasA("cat", "p"));
    System.out.println(isAVowel("b"));
    System.out.println(countVowels("banana"));
    System.out.println(hasAVowel("fly"));
    System.out.println(allVowels("chocolate"));

  }//end main()

}//end class Pigs
