public class FindMin{
    public static int Min(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] a={11,3,6,2,4,5};
        int mini=Min(a);
        System.out.println(mini);
    }
}
