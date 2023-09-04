class Solution {
    class Edge implements Comparable<Edge>{
        int ver;
        int cost;
        
        public Edge(int v, int c){
            this.ver = v;
            this.cost = c;
        }
        
        public int compareTo(Edge e2){
            return this.cost-e2.cost;
        }
    }
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean[] vis = new boolean[points.length];
        
        int totCost = 0;
        pq.add(new Edge(0, 0));
        while(!pq.isEmpty()){
            Edge curr = pq.remove();
            if(!vis[curr.ver]){
                vis[curr.ver] = true;
                totCost += curr.cost;
                for(int i=0; i<points.length; i++){
                    if(i!=curr.ver){
                        int dis = Math.abs(points[curr.ver][0]-points[i][0])+Math.abs(points[curr.ver][1]-points[i][1]);
                        pq.add(new Edge(i, dis));
                    }
                }
            }
        }
        return totCost;
    }
}