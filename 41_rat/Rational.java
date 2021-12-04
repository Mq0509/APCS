public class Rational{
  protected int numerator;
  protected int denominator;
  public Rational(){
    numerator=0;
    denominator=1;
  }
  public Rational(int p,int q){
    numerator=p;
    denominator=q;
  }
  public static void toString(int p, int q){
    System.out.println(p+"/"+q);
  }
 public static void main(String [] args){
   System.out.println(Rational(5,6));
   System.out.println()
 }
}
