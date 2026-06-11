class Solution {
    public boolean find(int[] nums, int s, long val){
        int l = nums.length-1;
        while(s<=l){
            int mid = s+(l-s)/2;
            if(nums[mid]==val) return true;
            else if(nums[mid]>val) l=mid-1;
            else s=mid+1;
        }
        return false;
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        HashSet<List<Integer>> hs = new HashSet<>();
        int n = nums.length;
        
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                for(int k=j+1; k<n-1; k++){
                    long val = (long)target-((long)nums[i]+nums[j]+nums[k]);
                    boolean r = find(nums, k+1, val);
                    if(r){
                        hs.add(Arrays.asList(nums[i], nums[j], nums[k], (int)val));
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        hs.forEach(i -> list.add(i));

        return list;
    }
}