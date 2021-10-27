/*
Team number int x (Orion Roven, May Qiu, Lawrence Joa)
APCS
HW_25 - Do I Repeat Myself?
10/26/21
Time: .5 hrs
Discoveries
Lawrence is the fastest typer.
When printing a new line, we can use +'\n'+ or +"\n"+
instead of System.out.println.

QCC
We did not bump into any issues or questions.

*/
public class Repeater{
  public static String fenceW(int numPosts){
    String x="|";
    while (numPosts > 1){
      numPosts --;
      x += "--|" ;
    }
    return x;
  }
public static String fenceR(int numPosts){
  if (numPosts==1){
    return "|";
  }
  else {
    return (fenceR(numPosts-1)+"--|");
  }
}

  public static void main(String[] args){
    System.out.println("fenceW:" + '\n' +fenceW(1) + '\n' + fenceW(2) + '\n' + fenceW(3));
    System.out.println("fenceR:" + '\n' +fenceR(1) + '\n' + fenceR(2) + '\n' + fenceR(3));
  }
}
