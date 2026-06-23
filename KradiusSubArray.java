public class KradiusSubArray {
    public static void main(String[] args) {
        int [] a ={7,4,3,9,1,8,5,2,6};
        int [] b ={-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int k =3;
        int d = (2*k) +1;
        int sum =0;
        for(int i=0;i<a.length;i++){
            if(i>k){
                b[i] =( sum + a[d])/d;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
