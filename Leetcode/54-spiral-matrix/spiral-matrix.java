class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> l = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int sr = 0, er = m - 1;
        int sc = 0, ec = n - 1;

        while (sr<=er && sc<=ec) {
            for (int j=sc; j<=ec; j++) {
                l.add(matrix[sr][j]);
            }

            for (int i=sr+1; i<=er; i++) {
                l.add(matrix[i][ec]);
            }
            if(sr<er){
                for (int j=ec-1; j>=sc; j--) {
                    l.add(matrix[er][j]);
                }
            }
            if(sc<ec){
                for (int i=er-1; i>sr; i--) {
                    l.add(matrix[i][sc]);
                }
            }

            sr++;
            er--;
            sc++;
            ec--;
        }
        return l;
    }
}