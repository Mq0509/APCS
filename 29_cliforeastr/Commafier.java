/*
Team Number int x: Orion Roven, Lawrence Joa, May Qiu
APCS
HW29 -- Which Way Do You Roll? // Iterative/Recursive Methods of commafyF
2021-11-1
time spent: 2.0 hours
DISCO
The args in the foreach loop is an array/list of the things we put after java <filename without .java>
We need to use Integer.parseInt(s) for explicitly calling in the main method, since commafyF and commafyR take ints.
We need to use Integer.toString(<var>) to convert ints to strings
QCC
There wasn't much difference between our iterative and recursive methods
*/


public class Commafier{
  public static String commafyF(int n){
   String ans="";
   String xyz=Integer.toString(n);
   int i = xyz.length();
   while(i>3){
     ans = "," + xyz.substring(i-3, i) + ans;
     i = i - 3;
   }
   ans = xyz.substring(0,i) + ans;
   return ans;
  }

  public static String commafyR(int n){
    String ans = "";
    String xyz=Integer.toString(n);
    if(xyz.length() > 3){
      ans = "," + xyz.substring(xyz.length()-3,xyz.length()) + ans;
      return commafyR(n / 1000) + ans;
    }
    if(xyz.length() <= 3){
      ans = xyz + ans;
    }
    return ans;

  }


  public static void main(String[] args){
    /*
    System.out.println(commafyF(1000));
    System.out.println(commafyF(12872178));
    System.out.println(commafyF(111111));
    System.out.println(commafyR(1000));
    System.out.println(commafyR(12872178));
    System.out.println(commafyR(111111));
    */
    for (String s : args) {
      System.out.println(commafyR(Integer.parseInt(s)));
    }
  }

}
