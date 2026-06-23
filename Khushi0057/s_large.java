class Solution {
    public int secondLargestElement(int[] nums) {

        if(nums.length<2){
            return -1;
        }
    
    int large=nums[0];
    for (int i=0;i<nums.length;i++){
        if(nums[i]>large){
            large=nums[i];
        }
    }
    int s_large=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>s_large && nums[i]!=large){
            s_large=nums[i];
        }
    }
    if(s_large==Integer.MIN_VALUE && large==Integer.MIN_VALUE){
        return -1;
    }

    if(s_large==Integer.MIN_VALUE)
    {
        return -1;
    }
    else{
        return s_large;
    }
    }
}

public static void main(String[]args)throws IOException
{
    
}