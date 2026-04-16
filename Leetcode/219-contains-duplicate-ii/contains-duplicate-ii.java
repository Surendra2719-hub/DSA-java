class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(mp.containsKey(nums[i])){
                int s= mp.get(nums[i]);
                int ans = Math.abs(s-i);
                if(ans<=k){
                    return true;
                }
                else{
                    mp.put(nums[i], i);
                }

            }
            else{
                mp.put(nums[i], i);
            }
        }
        return false;
    }
}