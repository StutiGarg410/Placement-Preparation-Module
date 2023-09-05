class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> qu = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];
        
        visited[0] = true;
        for(int i : rooms.get(0)){
            qu.add(i);
            visited[i] = true;
        }
        
        while(!qu.isEmpty()){
            int curr = qu.remove();
            for(int i : rooms.get(curr)){
                if(!visited[i]){
                    qu.add(i);
                    visited[i] = true;
                }
            }
        }
        for(int i=0; i<visited.length; i++){
            if(visited[i] == false){
                return false;
            }
        }
        return true;
        
    }
}