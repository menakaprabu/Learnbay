package class2.Recursion;

public class UniquePath {

    private static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        return numPaths(m - 1, n - 1);
    }

    private static int numPaths(int row, int column) {
        if (row == 0 || column == 0) {
            return 1;
        }

        return numPaths(row - 1, column) + numPaths(row, column - 1);
    }

    public static void main(String[] args){
        int noOfPaths = uniquePaths(3,2);
        System.out.println("no of paths = "+noOfPaths);
    }


}
