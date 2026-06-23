//To find longest subarray whose sum equals K

//First approach=to find each subarray and check =O(n^3)
/* 
public class Longest_Subarray_Sum_K {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,1,4,2,3};
        int k=4,sum=0,length=0;

        for(int i=0;i<arr.length;i++){
            
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int y=i;y<=j;y++){
                    sum=sum+arr[y];
                }
                if(sum==k ){
                    length=Math.max(length,j-i+1);
                }
                
                
            }
        }
        System.out.println(length);
    }
}

*/

//Second approach = O(n^2)


public class Longest_Subarray_Sum_K {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 4, sum = 0, length = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {

                sum = sum + arr[j];

                if (sum == k) {
                    length = Math.max(length, j - i + 1);
                }

            }
        }
        System.out.println(length);
    }
}



//Third Approach = Hashing

