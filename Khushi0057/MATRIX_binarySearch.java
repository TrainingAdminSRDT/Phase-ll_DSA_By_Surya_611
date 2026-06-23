//Binary Search METHOD for 2d array
/*Given Condition
matrix is sorted
 

*/

public class MATRIX_binarySearch{
    public static int Binary(int[][] arr,int target){
        int i=0;
        int j=0;
        int start=0;
        int end=arr[0].length-1;
        

        if(arr[0][0] < arr[arr.length-1][arr.length-1] ){
            while(start<=end){
                int mid=(start+end)/2;

                if(target==arr[mid][mid]){
                    return 1;
                }
                else if(target<arr[mid][mid]){
                    end
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,7,11},
                 {2,5,8,12},
                 {3,6,9,16}};
        int target=777;
        
        int n=Binary(arr,target);
        if(n==1){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target not found");
        }

                
    }
}