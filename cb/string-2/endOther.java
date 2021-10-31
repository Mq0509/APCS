/* Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences
(in other words, the computation should not be "case sensitive"). 
Note: str.toLowerCase() returns the lowercase version of a string. */

public class endOther{
public static boolean endOther(String a, String b) {

  String one= a.toLowerCase();
  String two= b.toLowerCase();
  
  if (one.length()>two.length()){
    return one.substring(one.length()-two.length(),one.length()).equals(two);
  }
  else {
    return two.substring(two.length()-one.length(),two.length()).equals(one);
  }
}
public static void main(String [] args){
  System.out.println(endOther("Hiabc", "abc")); /* → true */
  System.out.println(endOther("AbC", "HiaBc")); /* → true */
  System.out.println(endOther("abc", "abXabc")); /* → true */
}
}
