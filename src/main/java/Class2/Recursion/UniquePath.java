package class2.Recursion;

//This will find the unique path. Given the matrix m X n
//Leetcode problem: https://leetcode.com/problems/unique-paths/
public class UniquePath {

    private static int uniquePaths(int m, int n) {
        //Base condition if the given matix is 0,0 then retunr 0
        if (m == 0 || n == 0) {
            return 0;
        }
        //calculate the number of paths using recursion.
        return numPaths(m - 1, n - 1);
    }

    private static int numPaths(int row, int column) {
        if (row == 0 || column == 0) {
            return 1;
        }
        //This will add the total paths.
        return numPaths(row - 1, column) + numPaths(row, column - 1);
    }

    public static void main(String[] args){
        int noOfPaths = uniquePaths(3,2);
        System.out.println("no of paths = "+noOfPaths);
    }

}
