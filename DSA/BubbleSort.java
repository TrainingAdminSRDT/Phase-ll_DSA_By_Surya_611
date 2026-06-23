import java.util.Arrays;
public class BubbleSort {
    public static int[] Bubble(int arr[]){
        boolean swapped;
        int n=arr.length;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    swapped=true;
                }
            }
            //if not swapped any element in the pass then we can simply break as that means array is sorted
            if(swapped!=true){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,6,3,7,2};

        int b[]=Bubble(arr);
        System.out.println("Sorted array"+Arrays.toString(Bubble(arr)));
    }
}
