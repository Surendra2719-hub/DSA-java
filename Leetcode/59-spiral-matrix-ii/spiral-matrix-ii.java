class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][] = new int[n][n];
        int count = 1;
        int sr = 0, er = n - 1;
        int sc = 0, ec = n - 1;

         while (sr<=er && sc<=ec){
            for(int j=sc; j<=ec; j++){
                arr[sr][j] = count;
                count++;
            }
            for (int i=sr+1; i<=er; i++) {
                arr[i][ec]=count;
                count++;
            }
            if(sr<er){
                for (int j=ec-1; j>=sc; j--) {
                    arr[er][j]=count;
                    count++;
                }
            }
            if(sc<ec){
                for (int i=er-1; i>sr; i--) {
                    arr[i][sc]=count;
                    count++;
                }
            }

            sr++;
            er--;
            sc++;
            ec--;
         }
         return arr;
        
    }
}