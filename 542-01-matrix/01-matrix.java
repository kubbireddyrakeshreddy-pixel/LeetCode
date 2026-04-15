class Solution {
    public int[][] updateMatrix(int[][] mat) {
       Queue<int[]>q=new LinkedList<>(); 
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                  if(mat[i][j]==0){
                    q.add(new int[] {i,j});
                  }
                  else{
                   mat[i][j]=Integer.MAX_VALUE;
                  }
            }
        }
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] loc=q.poll();
            int r=loc[0];
            int c=loc[1];
             for (int[] d : dir) {
                int nr = r + d[0];
                int nc = c + d[1];

                if (nr >= 0 && nr < mat.length && nc >= 0 && nc < mat[0].length) {
                    if (mat[nr][nc] > mat[r][c] + 1) {
                        mat[nr][nc] = mat[r][c] + 1;
                        q.add(new int[]{nr, nc});
                    }
                }
            }
        }

        return mat;
    }
}
        
        
