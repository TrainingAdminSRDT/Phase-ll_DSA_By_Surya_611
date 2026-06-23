public class ArraySum {
    public static void main(String[] args) {
        int a[] = {5,9,3,2};
        int sum=0;
        for(int i =0 ; i<a.length;i++){
          sum = sum + a[i];
        }
        System.out.println("Sum of Array Elements is : "+sum);
    }
}
