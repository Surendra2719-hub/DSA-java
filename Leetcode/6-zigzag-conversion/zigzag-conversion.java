class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(numRows<=1)
            return s;
        String res[] = new String[numRows];
        for(int i=0;i<numRows;i++)
            res[i]="";
        int dir=-1;
        int steps=0;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(steps==numRows-1 || steps==0)
                dir*=-1;
            res[steps]+=c;
            if(dir==1)
                steps++;
            else
                steps--;
        }
        String ans="";
        for(int i=0;i<numRows;i++)
            ans+=res[i];
        return ans;
    }
}