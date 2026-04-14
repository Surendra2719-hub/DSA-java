class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(strs == null ||n==0) return "";

        String ans = strs[0];
        for(int i=0; i<ans.length(); i++){
            char ch = ans.charAt(i);

            for(int j = 1; j < strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return ans.substring(0, i);
                }
            }
        }
        return ans;
    }
}