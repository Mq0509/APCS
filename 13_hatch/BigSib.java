public class BigSib{                                    /* Constructor*/
  private String HelloMsg; /*Instance Variable*/
  public BigSib(){
    helloMsg = "Word up";
  }
  public static void main (String[]arg){
  }
    public void setHelloMsg(String helloMsg){
       HelloMsg = helloMsg;
  }
  public String greet(String hi){
    return HelloMsg + hi;
  }
}
