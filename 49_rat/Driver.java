/*
Kleemex -- Lindsay Phung, May Qiu, Xinqing Lin
APCS Pd 7
HW49 -- Rational Standards Compliance
2021-12-22
time spent:  hr

DISCO:
-

QCC:
-

*/

public class Driver {

	public static void main(String[] args) {
		String s = "random";
		Rational r = new Rational( 4, 5 );
		Rational q = new Rational( 4, 5 );
		Rational w = new Rational( 1, 2 );
		System.out.println(r.compareTo(q));
		System.out.println(r.equals(q));
		System.out.println(r.compareTo(w));
		System.out.println(r.equals(w));
		System.out.println(r.compareTo(s));
	}

}
