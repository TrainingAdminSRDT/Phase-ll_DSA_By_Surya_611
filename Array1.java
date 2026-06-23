public class Array1 {
    public static void main(String[] args) {
        int a[] = {1,2,3,0,56,15,95,7};
        int max = a[0];
        int min = a[0];
        for (int i= 1 ;i<a.length ;i++){
            if(a[i] < min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Max Element : "+max);
        System.out.println("Min Element : "+min);
    }
}
