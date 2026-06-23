
import java.util.Stack;

public class Stack2 {
  public static void main(String[] args) {
      Stack<String> stack = new Stack<>();
      stack.push("abcd#e##f");
      String str = stack.peek();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);
          if (c == '#') {
              if (sb.length() > 0) {
                  sb.deleteCharAt(sb.length() - 1);
              }
          } else {
              sb.append(c);
          }
      }
      System.out.println(sb.toString());
  }
}
