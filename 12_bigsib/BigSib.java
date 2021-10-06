public class BigSib{
  public static void main (String[]arg){
  }
  static String helloMsg;
    public static void SetHelloMsg(String HelloMsg){
       HelloMsg = helloMsg;
  }
  public static String greet(String hi){
    return SetHelloMsg + hi;
  }
}
