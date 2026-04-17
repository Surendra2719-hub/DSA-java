class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int total=m*n;
        int count =0;
        List<Integer> l = new ArrayList<>();
        
        int sr = 0, er = m - 1;
        int sc = 0, ec = n - 1;
        while(count<total){
            for(int i = sc; i <= ec && count<total; i++){
                l.add(matrix[sr][i]);
                count++;
            }
            sr++;
            for(int i = sr; i <= er && count<total; i++){
                l.add(matrix[i][ec]);
                count++;
            }
            ec--;
            for(int i = ec; i >= sc && count<total; i--){
                l.add(matrix[er][i]);
                count++;
            }
            er--;
            for(int i = er; i >= sr && count<total; i--){
                l.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }    
        System.out.println(l);
        return l;
    }
}