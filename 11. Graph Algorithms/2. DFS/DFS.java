public class DFS{
    // SC - O(N)
    // TC - O(N) + O(2*E)
    public static void main(String[] args){

    }

    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        vis[node] = true;
        ls.add(node);
        for(Integer it: adj.get(node)){
            if(vis[it]==false)
                dfs(it,vis,adj,ls);
        }
    }
    public static ArrayList<Integer> mainDFS(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        dfs(0,vis,adj,ls);
        return ls;
    }
}