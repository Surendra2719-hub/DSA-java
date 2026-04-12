class Solution {
    public int majorityElement(int[] nums) {

        // Map<Integer, Integer> mp = new HashMap<>();     
		// for (int i = 0; i < nums.length; i++) {
		// 	mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
		// }
        // for(Map.Entry<Integer, Integer> e:mp.entrySet()){
        //     if(e.getValue()>nums.length/2)
        //           return e.getKey();
        // }			
        // return 0;

        int count = 1;
        int candidate = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==candidate) count++;
            else count--;
            if(count==0){
                candidate = nums[i];
                count=1;
            }
        }
        return candidate;
    }
}