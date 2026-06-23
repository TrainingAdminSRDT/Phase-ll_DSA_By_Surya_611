//Print names N times using recursion
public class Recursion1 {
    public static void name(String title,int n){
        if(n==0){
            return;
        }
        System.out.println(title);
        n--;
        name(title,n);
    }

    public static void main(String[] args) {
        String title="Khushi";
        int n=5;
        name(title,n);
    }
    
}
