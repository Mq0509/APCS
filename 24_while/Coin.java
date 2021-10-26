/***
Spicy Mangoes (Andrew Piatesky, May Qiu, Faiyaz Rafee) and Burnt Peanut
APCS
HW 24 -- Get It While You Can/Writing and testing class with loops/Filled in coin class methods and then tested it using Driver.java
and ran a loop to see what flipping a coin thousands of times results in
2021-10-25
Discoveries:
Equals is a built in method for each class seeing if objects are equivalent, however you can replace it by writing your own that 
has whatever functionality that you desire
Also this() method reruns constructor (can rerun overloaded ones if you add more args)
Questions: 
Why did the method assignValue in class Coin have args even though they are never used (works without it,but doesn't throw error when actually used)?
Mods: 
Changed every single method except reset() toString(). 
We re-wrote equals(), assignValue() and all the constructors to make them more efficient and cleaner but other than that functionality remained the same.
Additionally we had to write a new flip() method because previously we didn't know how to generate random values.
In all the functionality didn't change but we just cleaned up our code and made it easier to read and more efficient.
***/



public class Coin {
  //Initializing instance variables
  private double value;
  private String upFace, name;
  public int flipCtr, headsCtr, tailsCtr;
  private double bias = 0.5;

  //Constructors (this() just calls the constructor with the same number/type of parameters as args giver)
  public Coin() {
    reset("heads",0.5);
  }

  public Coin(String s) {
    this();
    name = s;
    assignValue(/*s*/);
  }

  public Coin(String s, String nowFace) {
    this(s);
    upFace = nowFace;
  }


  //Assigns the value based on the name
  private double assignValue(/*String s*/) { //Don't need the input, but for some reason still have it?
    if (name.equals("penny"))         { value = 0.01; }
    else if (name.equals("nickel"))   { value = 0.05; }
    else if (name.equals("dime"))   { value = 0.1; }
    else if (name.equals("quarter"))   { value = 0.25; }
    else if (name.equals("half dollar"))   { value = 0.5; }
    else if (name.equals("dollar"))   { value = 1.0; }
    return value;
  }

  //Resets coin to original state
  public void reset(String s, double d) {
    flipCtr = 0;
    tailsCtr = 0;
    headsCtr = 0;
    upFace = s;
    bias = d;
  }

  //Flip the coin based on bias (Math.random() generates a value in the range [0.0,1.0) )
  public String flip() {
    double randNum = Math.random();
    if (randNum < bias) {
      upFace = "heads";
      headsCtr += 1;
    }
    else {
      upFace = "tails";
      tailsCtr += 1;
    }

    flipCtr += 1;
    return upFace;
  }

  //Replaces java's built in equals method for all classes of COIN, not other classes
  public boolean equals(Coin obj) { return upFace.equals(obj.upFace); } //Works because upFace and obj.upFace are both strings
  
  //Replaces java's toString method (More efficient method, but doesn't display enough information).
  //public String toString() { return "" + name + "--" + upFace; }

  //Replaces java's toString method (Less efficient but display all instance variables in an organized manner)
  public String toString() {
    String str;
    str = "\n==== " + "Coin name: " + name + " ====";
    str = str + "\nvalue: " + value;
    str = str + "\nupFace: " + upFace;
    str = str + "\nbias: " + bias;
    str = str + "\nheadsCtr: " + headsCtr;
    str = str + "\ntailsCtr: " + tailsCtr;
    str = str + "\nflipCtr: " + flipCtr;
    str = str + "\n=====================";
    return str;
  }
}
