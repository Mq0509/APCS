/*
Black Sharpies: Jacc Chen, May Qiu, Samantha Hua
APCS
HW27: FOR the Love of Strings
2021-10-28
time spent: 1 hour

DISCO
- We tried to use final as a variable name but we realized that it's a key word in java with some pre-established value
- s.substring outputs the characters between the spaces in the inputs it is given. It views the space before the first character of the given String as 0.

QCC
- What does final mean? How can it be used?
*/

public class Rof {
  public static String fenceF(int posts) {
    String fence = "|";
    for (int i=1;i<posts;i++) {
      fence += "--|";
    }
    return fence;
  }

  public static String reverseF(String s) {
    String answer = "";
    for (int i = s.length(); answer.length()<s.length(); i--) {
      answer += s.substring(i-1,i);
    }
    return answer;
  }

  public static String reverseR(String s) {
    String answer = "";
    int sLength = s.length(); // so it's easier on the eyes
    if (answer.length() < sLength) {
      answer += s.substring(sLength - 1, sLength);
      return answer + reverseR(s.substring(0,sLength-1));
    }
    return answer;
  }

  public static void main(String[] args) {
    String s = "abcdefg";
    System.out.println(s.substring(6,7));
    System.out.println(fenceF(1));
    System.out.println(fenceF(2));
    System.out.println(fenceF(3));

    System.out.println(reverseF("stressed"));
    System.out.println(reverseF("tacocat"));

    System.out.println(reverseR("stressed"));
    System.out.println(reverseR("tacocat"));
  }
}
