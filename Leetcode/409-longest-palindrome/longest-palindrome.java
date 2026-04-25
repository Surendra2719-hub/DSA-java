class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }
        int sum = 0;
        int count = 0;
        for(int i : mp.values()){
            if(i%2==0) sum+=i;
        }
        for(int i : mp.values()){
            if(i%2==1){ 
                sum+=i-1;
                count ++;
                }
        }
        if(count>0) return sum+1;
        return sum;
    }
}