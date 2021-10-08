/*May Qiu
APCS
HW13 -- Where do BigSibs Come From?/Using Constructors in Replacement with Word Up(HW12)
2021-10-06
    
Disco
- If dataType is included in dataType varName = newValue, then the computer sees that as initializing the variable, but if dataType is not included, the computer simply assigns a new value to the variable.
- We ran into several errors about helloMsg, and we realized that they resulted from us attempting to create the variable helloMsg twice: the first time was “String helloMsg” as an instance variable, and the second time was “String helloMsg = ...” in the constructor. We had to delete String from the constructor because we realized that the class had created two variables, both named helloMsg.
- With our original mistakes, our output was 
“null freshman
Salutations Dr. Spaceman
Hey ya Kong Fooey
Sup mom”
and this is how we identified that the helloMsg instance variable and helloMsg in the constructor were not linked.

QCC (paraphrased with May’s)
- We were able to accomplish the task by first creating the private instance variable helloMsg and then assigning it the value “Word up” in the constructor. However, when we experimented with not including the instance variable and trying to initialize helloMsg in the constructor, we ran into errors, particularly “cannot find symbol helloMsg.”
- We followed our notes from class about keeping instance variables private, but we are uncertain about what specific effect setting this permission has.
*/



  
  public class BigSib{                                  
  private String HelloMsg; /*Instance Variable*/
  public BigSib(){              /* Constructor*/
    HelloMsg = "Word up";
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
