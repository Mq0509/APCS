/*
Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
APCS Pd 7
HW42 -- Be More Rational
2021-12-04
time spent:  hrs

DISCO:
-

QCC:
-
*/

public class Rational {
  protected int numerator;
  protected int denominator;

  public Rational() {
    numerator = 0;
    denominator = 1;
  }

  public Rational(int p,int q) {
    if (q == 0) {
        System.out.println("That's not a valid denominator!");
        numerator = 0;
        denominator = 1;
    }
    else {
        numerator = p;
        denominator = q;
    }
  }

  public String toString() {
    return numerator + "/" + denominator;
  }

  public double floatValue() {
      return (numerator * 0.1) / (denominator * 0.1);
  }

  public void multiply(Rational a) {
      this.numerator = this.numerator * a.numerator;
      this.denominator = this.denominator * a.denominator;
  }

  public void divide(Rational a) {
      if (a.numerator == 0) {
        System.out.println("You can't divide by 0!");
      }
      else {
        this.numerator = this.numerator * a.denominator;
        this.denominator = this.denominator * a.numerator;
      }
  }

  public static int lcm(int d1, int d2) {
    int lcm=0;
    if(gcd(d1,d2)==1){
      lcm=d1*d2;
    }
    else if (d1 >= d2) {
      for(int i=0; d2!=d1;i++){
        d2+=gcd(d1,d2);
        lcm=d2;
      }
    }
      else if (d2 >= d1) {
        for(int i=0; d1!=d2;i++){
          d1+=gcd(d1,d2);
          lcm=d1;
        }
      return lcm;
    }
    return lcm;
  }

  public void add(Rational a) {
    int lcm = lcm(this.denominator, a.denominator);
    this.numerator = this.numerator * lcm / this.denominator + a.numerator * lcm / a.denominator;
    this.denominator = this.denominator * lcm / this.denominator;
  }

  public void subtract(Rational a) {
    int lcm = lcm(this.denominator, a.denominator);
    this.numerator = this.numerator * lcm / this.denominator - a.numerator * lcm / a.denominator;
    this.denominator = this.denominator * lcm / this.denominator;
  }

  public static int gcd(int p, int q) {
    int value = 1;
    int answer = p;
    if (p > q) {
      while (value < q) {
        if (((p % value) == 0) && (q % value) == 0) {
          answer = value;
        }
        value ++;
      }
    }
    else if (p < q) {
      while (value < p) {
        if (((p % value) == 0) && (q % value) == 0) {
          answer = value;
      }
      value ++;
    }
  }
  return answer;
}

//   public int reduce() {
//     int value = gcd(numerator, denominator);
//     numerator = (numerator / value);
//     denominator = (denominator / value);
//   }
// /*
  public int compareTo(Rational a) {
    int mynum = this.numerator;
    int anum = a.numerator;
    if (this.denominator != a.denominator) {
      int lcm = lcm(this.denominator, a.denominator);
      mynum = this.numerator * lcm / this.denominator;
      anum = a.numerator * lcm / a.denominator;
    }
    if (mynum == anum) {
      return 0;
    }
    else if (mynum > anum) {
      return 1;
    }
    else {
      return -1;
    }
  }

  public static void main(String [] args){
    /*
    Rational q = new Rational(1,0);
    Rational r = new Rational(2,3);
    Rational s = new Rational(1,2);

    System.out.print("fractions: \n");
    System.out.println(q);
    System.out.println(r);
    System.out.println(s);

    System.out.print("as floating values: \n");
    System.out.println(q.floatValue());
    System.out.println(r.floatValue());
    System.out.println(s.floatValue());

    System.out.print("multiplying q & r: \n");
    q.multiply(r);
    System.out.println(q);
    System.out.println(r);

    System.out.print("multiplying r & s: \n");
    r.multiply(s);
    System.out.println(r);
    System.out.println(s);

    System.out.print("dividing q by r: \n");
    q.divide(r);
    System.out.println(q);
    System.out.println(r);

    System.out.print("dividing r by q: \n");
    r.divide(q);
    System.out.println(r);
    System.out.println(q);
    */

    Rational r = new Rational(2,3);
    Rational s = new Rational(1,2);
    Rational t = new Rational(4,18);

    // System.out.print("gcd test cases \n");
    // System.out.println("9 & 9: " + gcd(9, 9));
    // System.out.println("5 & 9: " + gcd(5, 9));
    // System.out.println("");

    System.out.println("LCM 6 & 18: " + lcm(6,18));
    System.out.println("LCM 1 & 5:" + lcm(1,5));
 }
}
