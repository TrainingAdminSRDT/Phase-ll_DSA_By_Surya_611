public class SearchIn2D {

    public static int[] Search(int arr[][],int target){

        for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)         //arr[0].length → columns in row 0
                {
                    if(arr[i][j]==target){
                        return new int[]{i,j};
                    }
                }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={
            {23,4,1},
            {18,5,7,12},
            {4,9,0},
            {8,3,13}
        };
        int res[]=Search(arr,10);
        
            System.out.println(Arrays.toString(res));
        

    }

}
