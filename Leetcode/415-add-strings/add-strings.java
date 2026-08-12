class Solution {
    public String addStrings(String num1, String num2) {

        int m = num1.length();
        int n = num2.length();

        int c = 0;
        int i = m-1, j=n-1;
        String ans = "";
        while(i>=0 || j>=0 || c>0){
            int val1 =0, val2=0;
            if(i>=0){
                val1 = num1.charAt(i)-'0';
            }
            if(j>=0){
                val2 = num2.charAt(j)-'0';
            }

            int add = val1+val2+c;
            int rem = add%10;
            c=add/10;

            ans= (char)(rem+'0')+ans;
 
            i--; j--;

        }
        return ans;
        
    }
}