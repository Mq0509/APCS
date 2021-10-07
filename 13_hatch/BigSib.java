public class BigSib{                                    /* Constructor*/
  String helloMsg = "Word up";
  public static void main (String[]arg){
  }
  private String HelloMsg;                               /*Instance Variable*/
    public void setHelloMsg(String helloMsg){
       HelloMsg = helloMsg;
  }
  public String greet(String hi){
    return HelloMsg + hi;
  }
}
