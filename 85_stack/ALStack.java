import java.util.ArrayList;
public class ALStack<PANCAKE> implements Stack<PANCAKE> {

  private ArrayList<PANCAKE> foo;

  public ALStack(){
    foo = new ArrayList<PANCAKE>();
  }

  public boolean isEmpty(){
    return (foo.size() == 0);
  }

  public PANCAKE peekTop(){
    if(isEmpty()) return null;
    return (foo.get(foo.size()-1));
  }

  public PANCAKE pop(){
    if(isEmpty()) return null;
    PANCAKE ans = foo.get(foo.size()-1);
    foo.remove(foo.size()-1);
    return ans;
  }

  public void push( PANCAKE x ){
    foo.add(x);
  }
  public static void main(String[] args) {
  }
}


//ALStack<PANCAKE>
