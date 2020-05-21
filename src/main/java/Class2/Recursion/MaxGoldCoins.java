package Class2.Recursion;

import java.util.HashMap;
import java.util.Map;

/*There is a n*m grid containing gold coins. A person can choose to stand on any of the
cells present in the first row. Person can either move in diagonally downward, diagonally rightward
or downward direction from the current cell. You need to print the maximum coins a person can collect
following the condition given, and also return the numbers of paths from which you will get max coins.*/
public class MaxGoldCoins {

    private static Map pathMap = new HashMap<Integer, String>();

    private static void findMaxCoins(int[][] input, int row, int col){
       int maxCoinsSoFar = 0;
       int indexCol = -1;
       for(int i=0;i<col;i++){
           int coins = recursionHelper(input, row, col, 0, i);

           if(coins > maxCoinsSoFar ) {
               maxCoinsSoFar = coins;
               indexCol = i;
           }
        }
       System.out.println("Index where the person stand to collect the coin = "+indexCol);
       System.out.println("Max coins = "+maxCoinsSoFar);
       System.out.println("Path of the Maximum coins = "+pathMap.get(maxCoinsSoFar));
    }

    private static int recursionHelper(int[][] input, int row, int col, int x, int y){

        if(x == row || y == col || y < 0 )
            return 0;

        int coinsFromDiagonallyRight = recursionHelper(input, row, col, x+1, y+1);
        int coinsFromDiagonallyLeft = recursionHelper(input, row, col, x+1, y-1);
        int coinsFromDiagonallyDown = recursionHelper(input, row, col, x+1, y);

        int maxCoins = input[x][y] +
                Math.max(Math.max(coinsFromDiagonallyLeft, coinsFromDiagonallyRight),coinsFromDiagonallyDown);

        //List path = new ArrayList<Integer>();
        if(coinsFromDiagonallyDown > coinsFromDiagonallyLeft && (coinsFromDiagonallyDown > coinsFromDiagonallyLeft)){
            pathMap.put(maxCoins, "0 -> " + y); //hardcoded as 0 for now as the person can stand only in the first row. Otherwise use x value
        }else if(coinsFromDiagonallyRight > coinsFromDiagonallyLeft && coinsFromDiagonallyRight > coinsFromDiagonallyDown){
            pathMap.put(maxCoins, "0 -> " + (y+1));
        }else if(coinsFromDiagonallyLeft > coinsFromDiagonallyRight && coinsFromDiagonallyLeft > coinsFromDiagonallyDown) {
            pathMap.put(maxCoins, "0 -> " + (y-1));
    }
        return maxCoins;
    }


    public static void main(String[] args){
        int[][] input = new int[][]{
                {10,20,30,40, 50, 60},
                {200,60,500,80,90,100}
        };
        findMaxCoins(input,2,6);
    }
}
