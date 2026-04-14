class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s1.length(); i++) {
            if(s1.charAt(i)<='z' && s1.charAt(i)>='a' || s1.charAt(i)>='0' && s1.charAt(i)<='9'){
            char c = s1.charAt(i);
            sb.append(c);
            }
        }

        int i = 0;
        int j = sb.length() - 1;
        while (i < j) {
            if (sb.charAt(i) != sb.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}