class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        // int max = Integer.MAX_VALUES;
        // int min = Integer.MIN_VALUES;
        // for(int i=0; i<n; i++){
        //     min = Math.min(min, citations[i]);
        //     max = Math.max(max, citations[i]);
        // }
        for(int j=n; j>=0; j--){
            int count=0;
            for(int i=0; i<n; i++){
                if(citations[i]>=j) count++;
            }
            if(count>=j){
                return j;
            }
            
        }
        return 0;
    }
}