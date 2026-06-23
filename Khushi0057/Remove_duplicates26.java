//Dry run on last page
class Remove_duplicates26{
    public int removeDuplicates(int[] nums) {
        
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[k] != nums[i]){
                nums[++k]=nums[i];
            }
            
        }
        k++;
        return k;
    
    }
}
