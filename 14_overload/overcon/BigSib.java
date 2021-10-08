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
