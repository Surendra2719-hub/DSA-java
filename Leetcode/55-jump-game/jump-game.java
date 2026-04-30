class Solution {
    public boolean canJump(int[] nums) {
        int finalp = nums.length-1;
        for(int i = nums.length-2; i>=0; i--){
            if(i+nums[i]>=finalp){
                finalp=i;
            }
        }
        return finalp==0;
    }
}