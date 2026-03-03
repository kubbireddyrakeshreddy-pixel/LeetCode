class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int count=0;
        int fresh=0;
        int row=grid.length;
        int column=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        fresh++;
                    }
                    if(grid[i][j]==2){
                        q.offer(new int[]{i,j});
                    }
            }
        }
        
        int[][] directions={{1,0},{0,1},{0,-1},{-1,0}};
        while(!q.isEmpty()){
            boolean rotten=false;
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] current=q.poll();
                for(int[] dir : directions){
                    int newrow=current[0]+dir[0];
                    int newcolumn=current[1]+dir[1];
                    if(newrow>=0 && newrow<row && newcolumn>=0 && newcolumn<column && grid[newrow][newcolumn]==1){
                        q.offer(new int[]{newrow,newcolumn});
                        fresh--;
                        rotten=true;
                        grid[newrow][newcolumn]=2;

                    }

                }
            }
            if(rotten){
                count++;
            }

        }

      return fresh==0?count:-1;  
    }
}