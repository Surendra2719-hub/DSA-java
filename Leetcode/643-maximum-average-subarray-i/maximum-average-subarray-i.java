class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        int l = 0, r = 0;
        while (r<k) {
            sum += nums[r];
            r++;
        }

        int maxSum = sum;
        while (r<nums.length) {
            sum = sum + nums[r] - nums[l];
            maxSum = Math.max(maxSum, sum);
            r++;
            l++;
        }

        return (double)maxSum/k;
    }
}