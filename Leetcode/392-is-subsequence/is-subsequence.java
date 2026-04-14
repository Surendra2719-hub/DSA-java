class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n==0) return true;

        int i=0;
        
        for(int j=0; j<m; j++ ){
            if(i<n && s.charAt(i)==t.charAt(j)){
                i++;
            }
            if(i==n) return true;
        }
        return false;
        
    }
}