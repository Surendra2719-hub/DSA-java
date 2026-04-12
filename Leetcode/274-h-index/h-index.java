class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        // for(int j=n; j>=0; j--){
        //     int count=0;
        //     for(int i=0; i<n; i++){
        //         if(citations[i]>=j) count++;
        //     }
        //     if(count>=j){
        //         return j;
        //     }
            
        // }
        // return 0;
     int i=0;
        int j=n;
        int ans=0;
        while(i<=j){
            int mid = i + (j-i)/2;
            int count=0;
            for(int k=0; k<n;k++){
                if(citations[k]>=mid){
                    count++;
                }
            }
            if(count>=mid){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;

    }
}