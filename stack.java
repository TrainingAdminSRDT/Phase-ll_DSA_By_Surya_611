
import java.util.Stack;

public class stack {
  public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    stack.push(9);
    stack.push(7);
    stack.pop();
    stack.push(11);
    stack.push(13);
    stack.push(17);
    stack.pop();
    stack.pop();
    stack.push(32);
    stack.pop();
    stack.pop();
    stack.push(30);
    stack.pop();
    System.out.println(stack.peek());

  }
}
