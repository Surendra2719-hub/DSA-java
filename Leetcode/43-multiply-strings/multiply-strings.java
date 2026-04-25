class Solution {
    public String multiply(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        int []arr = new int[m+n];
     
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                int digit = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = arr[i+j+1]+digit;
                arr[i+j+1]=sum%10;
                arr[i+j]+=sum/10;
            }
        }
        String s ="";
        for(int i:arr){
            if(s.length()==0 && i==0){
            }
            else s+=i;
        } 
        if(s.length()==0) return "0";
        return s;   
    }
}