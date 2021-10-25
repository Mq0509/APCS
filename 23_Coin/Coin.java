/***
 Spicy Mangoes: May Qiu, Andrew Piatetsky, Faiyaz Rafee
 Hw 23 // Randomness and Bias in methods
 2021-10-24
 DISCO

 We learned that putting Coin other into the input creates a new instance of class Coin
 
 QCC
  
 Why is it Coin other instead of a datatype other? 
 We do not know how to generate a random number in our flip function
 
***/

public class Coin {

  //attributes aka instance vars
  double value; //monetary value
  String name; //the name of the coin
  String upFace; //Shows if its heads or tails right now
  int flipCtr; //show how many times flipped
  int headsCtr; //how many times landed heads up
  int tailsCtr;// how many times landed tails up
  double bias; //likelihood landing heads up or tails (1.0 meaning always head)
  



  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
	flipCtr = 0;
	headsCtr = 0;
	tailsCtr = 0;
	upFace = "none";
	value = 1;
	name = "penny";
	bias = 0.5;
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
	name = s;
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
	name = s;
	upFace = nowFace;
  }


  // Accessors...
  // ----------------------------
  public String getUpFace() {
	return upFace;
  }

  public int getFlipCtr() {
  	return flipCtr;
  }

  public double getValue() {
  	return value;
  }

  public int getHeadsCtr() {
  	return headsCtr;
  }

  public int getTailsCtr() {
  	return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
private double assignValue( String s ) {
  	if ( s == "penny"){
      return 1;
    }
    if ( s == "nickel"){
      return 5;
    }
    if ( s == "dime"){
      return 10;
    }
    if ( s == "quarter"){
      return 25;
    }
    else {
      return 100;
    }
  }

  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    upFace = s;
    bias = d;
    flipCtr = 0;
	  headsCtr = 0;
	  tailsCtr = 0;
    value = 1;
	  name = "penny";
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
    
  public String flip() {
    double num;
    num = math.random(0.0 , 1.0)
    if (num <= bias){
      upFace = "heads";
    }
    else {
      upFace = "tails";
    } 
  	if (bias == 1.0){
      upface = "heads";
    }
    if (bias == 0.0){
      upface = "tails";
    }
    if (upFace == "heads") {
      headsCtr =+ 1;
    }
    else {
      tailsCtr =+ 1;
    }
    flipCtr =+ 1;
    return upFace;
  }



  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) { 
   if (upFace == other.upFace) {
      return true;
    
    }
    else {
      return false;
    }
  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
  	return upFace + " " name;
  }
}//end class
