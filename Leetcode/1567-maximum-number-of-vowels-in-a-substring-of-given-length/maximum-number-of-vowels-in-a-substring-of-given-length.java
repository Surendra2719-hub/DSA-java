class Solution {
    public static boolean checkVowel(char ch){
       if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
        return true;
       }
       return false;
    }
    public int maxVowels(String s, int k) {

        int count = 0;
        int l=0, r=0;
        while (r<k) {
            if(checkVowel(s.charAt(r))){
                count++;
            }
            r++;
        }
        int maxCount= count;

        while(r<s.length()){
            if(checkVowel(s.charAt(r))){
                count++;
            }
            if(checkVowel(s.charAt(l))){
                count--;
            }

            maxCount = Math.max(maxCount, count);
            r++;
            l++;

        }
        return maxCount;
        
    }
}
