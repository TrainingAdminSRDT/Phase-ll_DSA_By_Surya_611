class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int c=1;
        double currmax=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(c<=k){
                sum=sum+nums[i];
                max=Math.max(sum,max);
                ++c;

            }

        }
        double max_avg=max/k;
        return max_avg;
    }
}