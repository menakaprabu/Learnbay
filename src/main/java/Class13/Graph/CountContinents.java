package Class13.Graph;

public class CountContinents {

    int countIslands(int input[][])
    {

        int row = input[0].length;
        int col = input[1].length;
        boolean visited[][] = new boolean[row][col];

        int count = 0;
        for (int i = 0; i < row; ++i)
            for (int j = 0; j < col; ++j)
                if (input[i][j] == 1 && !visited[i][j]) // If a cell with
                {
                    dfs(input, i, j, visited);
                    ++count;
                }

        return count;
    }

    void dfs(int input[][], int row, int col, boolean visited[][])
    {
        int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
        int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

        // Mark this cell as visited
        visited[row][col] = true;

        // Recur for all connected neighbours
        for (int k = 0; k < 8; ++k){

        }
          //  if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited))
            //    DFS(M, row + rowNbr[k], col + colNbr[k], visited);
    }

    boolean isSafe(int M[][], int row, int col,
                   boolean visited[][])
    {
        return true;
       //  return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]);
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        int input[][] = new int[][] { { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 0, 1, 1 },
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 } };

    }
}
