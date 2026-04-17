class Solution {
    public boolean sum(int target, int length, int nums[]){
    int sum = 0;
    for(int i = 0; i < nums.length; i++){
        if(i < length) sum += nums[i];

        if(i == length - 1 && sum >= target) return true;

        else if(i >= length){
            sum -= nums[i - length];
            sum += nums[i];
            if(sum >= target) return true;
        }
    }
    return false;
}
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = n;
        int ans = 0;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(sum(target, mid, nums)){
                ans = mid;
                j = mid - 1; 
            }else i = mid + 1;
        }
        return ans;    
    }
}