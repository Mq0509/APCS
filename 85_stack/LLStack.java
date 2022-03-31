import java.util.LinkedList;
public class LLStack<PANCAKE> implements Stack<PANCAKE>{

    private LinkedList<PANCAKE> foo;

    public LLStack(){
      foo = new LinkedList<PANCAKE>();
    }

    public boolean isEmpty(){
      return (foo.size() == 0);
    }

    public PANCAKE peekTop(){
      if(isEmpty()) return null;
      return foo.getLast();
    }

    public PANCAKE pop(){
      if(isEmpty()) return null;
      return foo.removeLast();
    }

    public void push( PANCAKE x ){
      foo.addLast(x);
    }
    public static void main(String[] args) {
    }
  }
