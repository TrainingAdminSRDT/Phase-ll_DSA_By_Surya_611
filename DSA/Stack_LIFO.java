
import java.util.Stack;

// push(9),7 ;pop() ,push-11,13,17 ;pop() pop() ;push-32; pop() pop(); push(32); pop()
public class Stack_LIFO {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(9);
        s.push(7);
        s.pop();
        s.push(11);
        s.push(13);
        s.push(17);
        s.pop();
        s.pop();
        s.push(32);
        s.pop();
        s.pop();
        s.push(32);
        s.pop();

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
