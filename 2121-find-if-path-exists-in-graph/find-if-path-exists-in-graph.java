class Solution {
    ArrayList<ArrayList<Integer>> graph;
    boolean[] visited;

    public boolean dfs(int src, int des){
        if(src == des) return true;

        visited[src] = true;

        ArrayList<Integer> nbr = graph.get(src);
        for(int i=0;i<nbr.size();i++){
            int node = nbr.get(i);
            if(visited[node] == false && dfs(node,des) == true) return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        // create a adjacency list
        graph =  new ArrayList<>();
        visited = new boolean[n];        

        // add all nodes
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        // populate the undirected graph edges
        for(int i=0 ; i < edges.length ; i++){
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // iterate through source to dest
        return dfs(source,destination);

    }
}