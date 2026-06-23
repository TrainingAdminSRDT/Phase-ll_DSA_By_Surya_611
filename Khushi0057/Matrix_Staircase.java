//STAIRCASE METHOD
/*Given Condition
Each row is sorted (left → right)
Each column is sorted (top → bottom)
 
Start from top-right corner:

If current == target → found
If target < current → move left
If target > current → move down
*/

public class Matrix_Staircase{
    public static int Stair(int[][] arr,int target){
        int i=0;
        int j=arr[0].length -1;

        while(i<arr.length && j>=0){
            if (target==arr[i][j]){
                return 1;
            }
            else if(target<arr[i][j]){
                j--;
            }
            else{
                i++;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[][]={{1,4,7,11},
                 {2,5,8,12},
                 {3,6,9,16}};
        int target=777;
        
        int n=Stair(arr,target);
        if(n==1){
            System.out.println("Target Found");
        }
        else{
            System.out.println("Target not found");
        }

                
    }
}