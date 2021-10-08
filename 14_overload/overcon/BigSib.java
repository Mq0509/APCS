/*
May Qiu
APCS
HW14 -- Customize Your Creation/Overloading the constructor so that it could take any
2021-10-07

Discoveries
I did not know that entering the parameteres in the constructor is called overloading it. 
Additionally, I learned that overloading it allows the HelloMsg to update, while the 
default constructor has only one value.

Questions/Comments/Concerns
What does static mean exactly?
I have difficulty determining what is local, and how to type my code accordingily to that.
*/


  
  public class BigSib{                                  
  private String HelloMsg; /*Instance Variable*/
  public BigSib(String msg){              /* Constructor*/
    HelloMsg = msg ;
  }
  public static void main (String [] args){
  }
    public void setHelloMsg(String helloMsg){
       HelloMsg = helloMsg;
  }
  public String greet(String hi){
    return HelloMsg + hi;
  }
}
