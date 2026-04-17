class Solution {
    public boolean find(int nums[], int s, int val){
        int i = s;
        int j = nums.length - 1;
        while(i <= j){
            int mid = (i + j) / 2;
            if(nums[mid] == val) return true;
            else if(nums[mid] < val) i = mid + 1;
            else j = mid - 1;
        }
        return false;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int val = -(nums[i] + nums[j]);

                boolean res = find(nums, j+1, val);
                if(res){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(val); 
                    set.add(l);
                }
            }
        }
        return new ArrayList<>(set);
    }
}