class Solution {
    public int[] twoSum(int[] nums, int target) {

        int ans[] =new int[2];

        HashMap<Integer, Integer> hs = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int find = target - nums[i];

            if(hs.containsKey(find)){
                ans[0] = hs.get(find);
                ans[1] = i;
                return ans;

            }
            hs.put(nums[i], i);
        }

        return ans; 
    }
}
   
 
    