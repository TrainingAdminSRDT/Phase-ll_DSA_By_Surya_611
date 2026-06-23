public class MissingNumber {
    public static void main(String[] args) {
       int[] nums = {3,0,7,6,9,1};
       for(int i =1 ; i<nums.length -1;i++){
          if(nums[i]>nums[i+1]){
              int temp = nums[i+1];
              nums[i+1] = nums[i];
              nums[i]= temp;
          }
       }
       for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
