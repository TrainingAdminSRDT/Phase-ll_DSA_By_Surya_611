//To reverse an array using parameterized recursion
import java.util.Arrays;
public class Recur_reverse {
    public static int[] swap(int arr[],int l,int r){
        
        if(l>=r){
            return arr;
        }
        int t=arr[l];
        arr[l]=arr[r];
        arr[r]=t;

        return swap(arr,l+1,r-1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int l=0,r=arr.length-1;
        System.out.println(Arrays.toString(swap(arr,l,r)));
    }
}
