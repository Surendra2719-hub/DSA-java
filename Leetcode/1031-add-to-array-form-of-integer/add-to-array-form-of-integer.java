class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = num.length - 1;
        int i = 0;
        while (k>0 || n>=0 || i>0) {
            int sum = i;
            if (n>=0) {
                sum += num[n];
                n--;
            }
            sum = sum+k%10;
            k = k/10;
            list.addFirst(sum%10);
            i = sum / 10;
        }
        return list;
    }
}