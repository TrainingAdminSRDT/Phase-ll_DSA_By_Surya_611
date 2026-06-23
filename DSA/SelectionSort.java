import java.util.Arrays;

public class SelectionSort {
    public static int[] Select(int arr[]){
        int n=arr.length;
        

        for(int i=0;i<n;i++){
            int last=arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
        
        return arr;
    }

    private static int getMaxIndex(int arr[],int start,int end){
        int t=start;
        for(int i=start;i<=end;i++){
            
            if(arr[t]<arr[i]){
                t=i;
            
            }
            
        }
        return t;
    }

    //will make its return type void becoz Your swap() method only exchanges elements inside the array.It does not need to return anything.
    private static void swap(int arr[],int first,int second){
        int t=arr[first];
        arr[first]=arr[second];
        arr[second]=t;
    }

    public static void main(String[] args) {
        int arr[]={4,6,2,8,1};
        int b[]=Select(arr);
        System.out.println(Arrays.toString(b));

    }
}
