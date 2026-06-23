public class Palindrome {
    public static void main(String[] args) {
        int num = 8706;
        int rev =0;
        while(num>0){
            rev = num%10 ;
            System.out.print(rev +" ");
            num = num /10;

        }
        if(rev == num){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a palindrome number");
        }
    }
}
