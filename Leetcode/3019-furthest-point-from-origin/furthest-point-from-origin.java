class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char charArray[] = moves.toCharArray();
        int l=0, r=0, d=0;
        int ans = 0;
        for(int i=0; i<charArray.length;i++){
            if(charArray[i]=='L') l++;
            else if(charArray[i]=='R') r++;
            else d++;
        }
        if(l>=r){ 
            ans= l-r+d;
            if(ans<0) ans=ans*(-1);
        }
       else if(l<=r){
            ans=r-l+d;
            if(ans<0) ans=ans*(-1);
        }
        return ans;
    }
}