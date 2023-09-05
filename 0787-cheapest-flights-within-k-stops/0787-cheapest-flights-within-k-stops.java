class Solution {
    public class Edge{
        int src;
        int des;
        int cost;
        
        public Edge(int s, int d, int c){
            this.src = s;
            this.des = d;
            this.cost = c;
        }
    }
    public class Info{
        int dest;
        int cost;
        int stops;
        
        public Info(int d, int c, int s){
            this.dest = d;
            this.cost = c;
            this.stops = s;
        }
    }
    public void createGraph(ArrayList<Edge>[] graph, int[][] flights){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<flights.length; i++){
            int s = flights[i][0];
            int d = flights[i][1];
            int c = flights[i][2];
            graph[s].add(new Edge(s, d, c));
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(graph, flights);
        
        int[] dist = new int[n];
        for(int i=0; i<n; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        
        Queue<Info> qu = new ArrayDeque<>();
        qu.add(new Info(src, 0, 0));
        
        while(!qu.isEmpty()){
            Info curr = qu.remove();
            if(curr.stops>k){
                break;
            }
            for(int i=0; i<graph[curr.dest].size(); i++){
                Edge e = graph[curr.dest].get(i);
                int u = e.src;
                int v = e.des;
                int wt = e.cost;
                
                if(curr.cost+wt<dist[v] && curr.stops<=k){
                    dist[v] = curr.cost+wt;
                    qu.add(new Info(v, dist[v], curr.stops+1));
                }
            }
        }
        
        if(dist[dst]==Integer.MAX_VALUE){
            return -1;
        }
        return dist[dst];
    }
}