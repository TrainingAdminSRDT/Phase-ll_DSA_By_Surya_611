public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] a ={1,1,2,2,3,3,3,4,5,6,6,7};
        int k=0;
        for(int x:a){
             if(a[x]!=a[k]){
                 a[k+1] = a[x];
             }
             k++;
        }
        for(int i =0 ;i<a.length -1;i++) {
            System.out.println(a[i]);
        }
    }
}
