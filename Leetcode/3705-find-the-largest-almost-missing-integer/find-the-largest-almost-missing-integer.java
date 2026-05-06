class Solution {
    private boolean check(int[] nums, int k, int e){
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<=n-k;i++){
            for(int j=i;j<i+k;j++){
                if(nums[j]==e){
                    cnt++;
                    break;
                }
            }
        }
        return cnt==1;
    }
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
            mp.put(nums[i],i);
        int ans=-1;
        for(Map.Entry<Integer,Integer> m:mp.entrySet()){
            int e=m.getKey();
            if(check(nums,k,e))
                ans=Math.max(ans,e);
        }
        return ans;
    }
}