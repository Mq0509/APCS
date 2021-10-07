public class BigSib{
public BigSib(){                                          /* Constructor*/
  String helloMsg = "Word up";
}
  public static void main (String[]arg){
  }
  private String HelloMsg;                               /*Instance Variable*/
    public static void setHelloMsg(String helloMsg){
       HelloMsg = helloMsg;
  }
  public static String greet(String hi){
    return HelloMsg + hi;
  }
}
