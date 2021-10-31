/* Return true if the string "cat" and "dog" appear the same number of times in the given string. */

public class catDog{
public static boolean catDog1(String str) {
     int cats=0;
     int dogs=0;
   for (int i=0;i < str.length()-2;i ++){
     if (str.substring(i,i+3).equals("cat")){
       cats ++;
      }
    }
    for (int i=0;i < str.length()-2;i ++){
     if (str.substring(i,i+3).equals("dog")){
       dogs ++;
      }
    }
    if (dogs==cats){
      return true;
    }
    else{
      return false;
    }
}
public static void main(String [] args){
  System.out.println(catDog1("catdog")); /* → true */
  System.out.println(catDog1("catcat")); /* → false */
  System.out.println(catDog1("1cat1cadodog")); /* → true */
}
}
