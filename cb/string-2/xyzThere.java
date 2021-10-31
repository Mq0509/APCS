public class xyzThere{
public static boolean xyzThere(String str) {
  str = " " + str;
  for (int i = 1; i < str.length()-2; i++){
    if (str.substring(i,i+3).equals("xyz")){
     if (!(str.substring(i-1,i+3).equals(".xyz"))){
       return true;
     }
  } 
  }
    return false;
}
public static void main(String [] args){
  System.out.println(xyzThere("abcxyz")) /*→ true*/
  System.out.println(xyzThere("abc.xyz")) /*→ false*/
  System.out.println(xyzThere("xyz.abc")) /*→ true*/

}
}
