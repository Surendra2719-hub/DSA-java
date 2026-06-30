class Solution {
    public static boolean check(String s, int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            else{
                l++;
                r--;
            }
          
        }
        return true;

    }
    public boolean validPalindrome(String s) {
        int i =0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return check(s, i+1, j) || check(s, i, j-1);
            }
        }
        return true;

    }
}