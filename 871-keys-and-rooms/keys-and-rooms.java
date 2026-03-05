class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()];
        dfs(0,visited,rooms);
        for(boolean v:visited){
            if(!v){
                return false;
            }
        }
        return true;        
    }
    public void dfs(int room,boolean[] visited,List<List<Integer>> rooms){
        if(visited[room]){
            return ;
        }
        visited[room]=true;
    for(int key:rooms.get(room)){
        dfs(key,visited,rooms);
    }

    }
}