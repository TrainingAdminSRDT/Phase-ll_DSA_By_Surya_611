import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(11);
        stack.push(15);
        stack.push(99);

        System.out.println(stack); // [11,15,99]]

         System.out.println(stack.pop());  // 11 nikal jayega
         System.out.println(stack);
         stack.push(77); //77
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
       System.out.println(stack); // stack me bas 11 bachega


           

    }
}