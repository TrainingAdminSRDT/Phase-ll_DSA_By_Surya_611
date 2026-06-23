public class SingleNumber {
    public static void main(String[] args) {
        int a[] ={4,2,1,2,1};
        int ans = 0;
        for(int x : a){
         ans = ans ^ x;
        }
        System.out.println(ans);
    }
}
