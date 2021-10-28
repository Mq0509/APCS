/*
Trio Number int x (Orion Roven, May Qiu, Lawrence Joa)
APCS
HW26 gcd
10/27/21
time spent: .8 hours
DISCO:
We can use the same procedure of changing the a and b using Math.min in both the recursive and iterative methods
QCC:
Can all recursive methods be translated into iterative while loops?
What exactly does iterative mean?
ALGO:
The GCD of 2 numbers is calculated by repeatedly replacing the larger number with the differnce between the 2 numbers until the 2 numbers are the same.
*/
public class Stats {
  public static int gcd( int a, int b ){
    int counter = 1;
    int answer = 0;
    while (counter<=Math.min(a,b)){
      if (a%counter==0 && b%counter==0){
        answer=counter;
      }
      counter++;
    }
    return answer;
  }

  public static int gcdER( int a, int b ){
    if (a!=b){
      a=Math.max(a,b)-Math.min(a,b);
      b=Math.min(a,b);
      return gcdER(a,b);
    }
    return a;
  }

  public static int gcdEW( int a, int b ){
    while (a!=b){
      a=Math.max(a,b)-Math.min(a,b);
      b=Math.min(a,b);
    }
    return a;
  }

  public static void main(String[] args){
    System.out.println(gcd(10,20));
    System.out.println(gcdER(30,12));
    System.out.println(gcdEW(27,9));
  }
}
