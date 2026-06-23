//Greatest element in array less than or equal to the target

public  class FloorOfGivenNumber{

    public static int Search(int arr[],int target){
        int start=0,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            
            if(target<arr[mid]){
               end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target==arr[mid]){
                return arr[mid];
            }
        }
    

        if (start<0){
            return arr[arr.length-1];
        }
        else{
            return arr[end];
        }
        
    }

    public static void main(String[] args) {
        int arr[]={1,2,8,9,11};
        int target=0;
        int n=Search(arr,target);
        System.out.println("Found "+n);
    }
}