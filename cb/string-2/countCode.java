/* Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.*/

public class countCode{
public static int countCode1(String str) {
   int ans=0;
   for (int i=0;i < str.length()-3;i ++){
     if (str.substring(i,i+2).equals("co") && str.substring(i+3,i+4).equals("e")){
       ans ++;
      }
    }
     return ans;
}
public static void main(String [] args){
  System.out.println(countCode1("aaacodebbb")); /* → 1 */
  System.out.println(countCode1("codexxcode")); /* → 2 */
  System.out.println(countCode1("cozexxcope")); /* → 2 */
}
}

