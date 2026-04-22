class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rarr[] = new int[n];
        int larr[] = new int[n];
        int arr[] = new int[n];

        int a = 1;
        for(int i=0; i<n; i++){
           larr[i] = a;
           a = a*nums[i];
        }
        a = 1;
        for(int i=n-1; i>=0; i--){
            rarr[i] = a;
            a = a*nums[i];
        }
        for(int i=0; i<n; i++){
            arr[i]=rarr[i]*larr[i];
        }

        return arr;
    }
}