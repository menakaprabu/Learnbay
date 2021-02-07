package Class4.BinarySearch;

public class CountNegativeNumbers {

    //This is to skip the check for positive number in the matrix.
    private static int countNegatives(int[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        int row = m-1;
        int col = 0;
        while(row >= 0 && col < n){
            if(grid[row][col] < 0){
                count += n - col;
                row--;
            }else{
                col++;
            }
        }
        return count;
    }

    //This is Brute force method of checking all row,col values
    private static int countNegativeNumbersCountApp2(int[][] input){
        int count = 0;
        int noOfRows = input.length;
        int noOfCols = input[0].length;

        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j < noOfCols; j++) {
                int val = input[i][j];
                if(val < 0){
                    count = count+1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[][] input = new int[][]{{-1,3,4},
                                    {-2,-1,1},
                                    {-5,-2,-1}};

        int negativeCount = countNegatives(input);
        System.out.println("negativeCount = "+negativeCount);

        int negativeCountApp2 = countNegativeNumbersCountApp2(input);
        System.out.println("Approach II negativeCount = "+negativeCountApp2);
    }

}
