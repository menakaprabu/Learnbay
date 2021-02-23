package Class13.Graph;

public class NoOfIslands {

    public static int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;

        int noOfIslandCount = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if(!visited[i][j] && grid[i][j] != '0'){
                    noOfIslandCount++;
                    dfs(visited,grid,i,j);
                }
            }
        }

        return noOfIslandCount;
    }

    private static void dfs(boolean[][] visited,char[][] grid,int i,int j){

        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length){
            return;
        }
        if(visited[i][j] == true){
            return;
        }
        visited[i][j] = true;

        if(grid[i][j] != '0'){
            dfs(visited,grid,i+1,j);
            dfs(visited,grid,i-1,j);
            dfs(visited,grid,i,j+1);
            dfs(visited,grid,i,j-1);
        }
    }

    public static void main(String[] args) {
        char[][] input = {
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};

                int noOfIslands = numIslands(input);
                System.out.println("No of islands = "+noOfIslands);

    }
}
