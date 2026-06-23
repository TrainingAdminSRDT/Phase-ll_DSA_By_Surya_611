//i/p:"abcd#e##f" o/p:abf , here whenever hash will occur it will backspace one character
import java.util.Stack;
public class Stack2 {
    public static void main(String[] args) {
        String str="abcd#e##f";
        Stack<Character> stack=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(ch);
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            ans=stack.pop() + ans;
        }
        System.out.println(ans);

    }
}
