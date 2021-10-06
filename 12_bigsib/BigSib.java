May Qiu, Raven
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz/Greetings with more variables/Created a new function that updated the value of 
setHelloMsg so that the greeting is more unique for each greeting
2021-10-05

DISCO
Since everything is local, I would need to make a function updating the variable by creating a variable outside of the methods.
QCC
none

public class BigSib{
  public static void main (String[]arg){
  }
  static String HelloMsg;
    public static void setHelloMsg(String helloMsg){
       HelloMsg = helloMsg;
  }
  public static String greet(String hi){
    return HelloMsg + hi;
  }
}
