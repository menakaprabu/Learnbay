package Class2.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*There is a n*m grid containing gold coins. A person can choose to stand on any of the
cells present in the first row. Person can either move in diagonally downward, diagonally rightward
or downward direction from the current cell. You need to print the maximum coins a person can collect
following the condition given, and also return the number of paths from which you will get max coins.*/
public class MaxGoldCoins {

    private static Map<Integer, Integer> pathMap = new HashMap<>();

    private static void findMaxCoins(int[][] input, int row, int col){
       int maxCoinsSoFar = 0;
       int indexCol = -1;
        for(int i=0;i<col;i++){

           int coins = recursionHelper(input, row, col, 0, i, i);

           if(coins >= maxCoinsSoFar ) {
               maxCoinsSoFar = coins;
               indexCol = i;
           }
        }
       System.out.println("Index where the person stand to collect the coin = "+indexCol);
       System.out.println("Max coins = "+maxCoinsSoFar);
       System.out.println("Number of paths which has max coins = "+pathMap.get(maxCoinsSoFar));
    }

    private static int recursionHelper(int[][] input, int row, int col, int x, int y, int key){

        if(x == row || y == col || y < 0 )
            return 0;

        int coinsFromDiagonallyRight = recursionHelper(input, row, col, x+1, y+1, key);
        int coinsFromDiagonallyLeft = recursionHelper(input, row, col, x+1, y-1, key);
        int coinsFromDiagonallyDown = recursionHelper(input, row, col, x+1, y, key);

        //add input[x][y] is to add the coin where he is standing currently.
        int maxCoins = input[x][y] +
                Math.max(Math.max(coinsFromDiagonallyLeft, coinsFromDiagonallyRight),coinsFromDiagonallyDown);

        if (pathMap.containsKey(coinsFromDiagonallyDown+input[x][y])){
            pathMap.put(coinsFromDiagonallyDown+input[x][y], pathMap.get(coinsFromDiagonallyDown+input[x][y])+1);
        }else{
            pathMap.put(coinsFromDiagonallyDown+input[x][y], 1);
        }
        if (pathMap.containsKey(coinsFromDiagonallyRight+input[x][y])){
            pathMap.put(coinsFromDiagonallyRight+input[x][y], pathMap.get(coinsFromDiagonallyRight+input[x][y])+1);
        }else{
            pathMap.put(coinsFromDiagonallyRight+input[x][y], 1);
        }
        if (pathMap.containsKey(coinsFromDiagonallyLeft+input[x][y])){
            pathMap.put(coinsFromDiagonallyLeft+input[x][y], pathMap.get(coinsFromDiagonallyLeft+input[x][y])+1);
        }else{
            pathMap.put(coinsFromDiagonallyLeft+input[x][y], 1);
        }
        return maxCoins;
    }


    public static void main(String[] args) {
        int[][] input = new int[][]{
                {10, 20, 30, 40, 50, 60},
                {40,  3, 4,  5,  6,  7},
                {13, 2,  3,  4,  5,  6}
        };
      //  findMaxCoins(input, input.length, input[0].length);

        int[][] input2 = new int[][]{
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        findMaxCoins(input2,input2.length,input2[0].length);
    }
}
