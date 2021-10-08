  public class BigSib{                                  
  private String HelloMsg; /*Instance Variable*/
  public BigSib(){
    HelloMsg = "Hi, I had trouble with this defcon. How about you? ";
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
