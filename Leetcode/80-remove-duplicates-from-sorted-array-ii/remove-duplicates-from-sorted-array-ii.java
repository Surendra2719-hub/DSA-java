class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=2;
      
        for(int k=2; k<n;k++ ){
            if(nums[k]!=nums[i-2]){
               nums[i]=nums[k];
               i++;
            }
        }
        return i;
    }
}