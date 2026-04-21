class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) {
            n = n / 4;
            System.out.println(n);
        }
        return n==1;   
    }
}