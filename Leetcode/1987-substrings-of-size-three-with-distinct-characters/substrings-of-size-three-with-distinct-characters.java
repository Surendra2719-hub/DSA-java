class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int r=0, l=0, count = 0;
        
        while(r<s.length()){
            if(r-l+1==3){
                char ch1 = s.charAt(l);
                char ch2 = s.charAt(l+1);
                char ch3 = s.charAt(l+2);

                if(ch1!=ch2 && ch2!=ch3 && ch1!=ch3){
                    count++;
                } 
                l++;
            }
            r++;
        }
        return count;
    }
}