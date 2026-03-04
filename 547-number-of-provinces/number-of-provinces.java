class Solution {
    public int findCircleNum(int[][] isConnected) {
     Queue<Integer> q=new LinkedList<>();
        int rows=isConnected.length;
        boolean[] visited=new boolean[rows];
        int provinces=0;
       for(int i=0;i<rows;i++){
          if(visited[i]){
            continue;
          }
            q.offer(i);
            visited[i]=true;

        
            while (!q.isEmpty()) {
                int city = q.poll();

                for (int j = 0; j < rows; j++) {
                    if (isConnected[city][j] == 1 && !visited[j]) {
                        visited[j] = true;
                        q.offer(j);
                    }
                }
            }

            provinces++;
        }

        return provinces;
    }
}