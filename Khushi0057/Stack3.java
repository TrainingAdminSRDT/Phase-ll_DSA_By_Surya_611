import java.util.Stack;
public class Stack3 {
    public static void main(String[] args) {
        String str="abcd#e##f";;
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='#'){
                if(!s.isEmpty()){
                    s.pop();
                }
                
            }
            else{
                s.push(ch);
            }
        }
        String ans="";
        while(!s.isEmpty()){
            ans=s.pop()+ans;
        }
        System.out.println(ans);
    }
}
