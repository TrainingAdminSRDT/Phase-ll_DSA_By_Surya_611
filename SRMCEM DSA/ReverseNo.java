public class ReverseNo {
    public static void main(String[] args) {
        int num = 8706;
        int rev =0;
        while(num>0){
            rev = num%10 ;
            System.out.print(rev +" ");
            num = num /10;

        }

    }
}
