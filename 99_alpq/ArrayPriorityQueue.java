import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue{
  private ArrayList<Integer> line;
  public ArrayPriorityQueue(){
    line = new ArrayList<Integer>();
  }

  public static void add(int x){
    if (line.size() == 0){
      line.add(x);
    }
    for (int i = 0; i < line.size(); i++){
      if(x >= line.get(i)){
        line.add(i, x);
      }
    }
    if (x < line.get(line.size() - 1)){
      line.add(x);
    }
  }

  public static boolean isEmpty(){
    return line.size() == 0;
  }

  public static int peekMin(){
    return line.get(line.size() - 1);
  }

  public static int removeMin(){
    line.remove(line.size() - 1);
  }

}
