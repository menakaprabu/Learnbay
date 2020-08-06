package PMP;

import java.util.List;
import java.util.LinkedList;

public class SpiralMatrix {

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0) return res;
        int row = matrix.length, col = matrix[0].length;
        int up = 0,  down = row - 1;
        int left = 0, right = col - 1;
        while (res.size() < row * col) {
            for (int j = left; j <= right && res.size() < row * col; j++)
                res.add(matrix[up][j]);

            for (int i = up + 1; i <= down - 1 && res.size() < row * col; i++)
                res.add(matrix[i][right]);

            for (int j = right; j >= left && res.size() < row * col; j--)
                res.add(matrix[down][j]);

            for (int i = down - 1; i >= up + 1 && res.size() < row * col; i--)
                res.add(matrix[i][left]);

            left++; right--; up++; down--;
        }
        return res;
    }

    private static List<Integer> mySpiralCopy(int[][] matrix){
        List<Integer> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0) return res;

        int row = matrix.length, col = matrix[0].length;
        int up = 0, down = row - 1;
        int left = 0, right = col - 1;

        while (res.size() < row * col){
            for(int j=left;j<=right && res.size() < row * col;j++){
                res.add(matrix[up][j]);
            }

            for(int j=up+1;j<=down-1 && res.size() < row * col;j++){
                res.add(matrix[j][right]);
            }

            for(int j=right;j>=left && res.size() < row * col;j--){
                res.add(matrix[down][j]);
            }

            for(int j=down-1;j>=up+1 && res.size() < row * col;j--){
                res.add(matrix[j][left]);
            }
            up++; left++;down--; right--;
        }
        return res;
    }

    public static void main(String[] args){
        int[][] input = {
                { 1, 2, 3, 4},
                { 5, 6, 7, 8},
                { 9, 10,11,12}
        };

        List<Integer> output = mySpiralCopy(input);
        for (int i=0;i<output.size();i++){
            System.out.println("Output = "+output.get(i));
        }
    }
}
