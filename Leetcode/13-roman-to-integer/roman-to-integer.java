class Solution {
    private int totalSum(char c) {
        if(c == 'I') return 1;
        if(c == 'V') return 5;
        if(c == 'X') return 10;
        if(c == 'L') return 50;
        if(c == 'C') return 100;
        if(c == 'D') return 500;
        if(c == 'M') return 1000;
        return 0;
    }
    public int romanToInt(String s) {
        int n = s.length();
        int sum=0;
        for(int i=0; i<n; i++){
            int cChar = totalSum(s.charAt(i));
            if(i<n-1 && cChar < totalSum(s.charAt(i+1))) sum -= cChar;
            else sum += cChar;
        }
        return sum;
    }
}