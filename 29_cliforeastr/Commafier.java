public class Commafier{
  public static String commafyF(int n){
   int ctr=0;
   String ans="";
     String xyz=Integer.toString(n);
    for(int i=xyz.length()-1;i>=0;i--){
      ans=xyz.substring(i,i+1)+ans;
      ctr++;
      if (ctr%3==0){
        ans=","+ans;
      }
    }
    return ans;
  }
  public static void main(String [] args){
    System.out.println(commafyF(1000));
  }
}
