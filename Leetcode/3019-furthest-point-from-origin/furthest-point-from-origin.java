class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        char charArray[] = moves.toCharArray();
        int l=0;
        int r=0;
        int d=0;
        for(int i=0; i<charArray.length;i++){
            if(charArray[i]=='L') l++;
            else if(charArray[i]=='R') r++;
            else d++;
        }
        System.out.println(l);
        System.out.println(r);
        System.out.println(d);
        if(l>=r){ 
            int ans= l-r+d;
            if(ans<0) return ans * (-1);
            return ans;
        }
       else if(l<=r){
            int ans= r-l+d;
            if(ans<0) return ans * (-1);
            return ans;
        }
        return 0;
    }
}