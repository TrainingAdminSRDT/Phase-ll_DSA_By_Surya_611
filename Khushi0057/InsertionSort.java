import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={5,3,4,1,2};
        int b[]=Insert(arr);
        System.out.println(Arrays.toString(b));

    }

    public static int[] Insert(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                
                Swap(arr,0,j);
            }
        }
        return arr;
    }

    private static void Swap(int arr[],int start,int end){
        int t;
        for(int j=end;j>start;j--){
            if(arr[j]<arr[j-1]){
                t=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=t;
            }
            else{
                break;
            }
        }
    }
}
