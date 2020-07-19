package Class14.DP;

public class PaintHouse {

    private static int[][] dp = {{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}}; // Initialize all the values to -1

    private static int minCostRecur (int[][] cost, int n, int color, int currHouse) {
        if(currHouse == n) {
            return 0;
        }
        if(dp[color][currHouse] != -1) {
            return dp[color][currHouse];
        }

       if (currHouse == 0) {
            // Red Color
            int totalCostRed = cost[0][0] +
                    Math.min(minCostRecur(cost, n, 1, currHouse+1), // Blue Color
                            minCostRecur(cost, n, 2, currHouse+1)); // Green Color

            // Blue Color
            int totalCostBlue = cost[1][0] +
                    Math.min(minCostRecur(cost, n, 0, currHouse+1), // Red Color
                            minCostRecur(cost, n, 2, currHouse+1)); // Green Color

            // Green Color
            int totalCostGreen = cost[2][0] +
                    Math.min(minCostRecur(cost, n, 0, currHouse+1), // Red Color
                            minCostRecur(cost, n, 1, currHouse+1));  // Blue Color

            return Math.min(totalCostRed, Math.min(totalCostBlue, totalCostGreen));
        }
        else {
            return dp[color][currHouse] = cost[color][currHouse] +
                    Math.min(minCostRecur(cost, n, (color+1)%3, currHouse+1),
                            minCostRecur(cost, n, (color+2)%3, currHouse+1));
        }
    }

    public static void main(String[] args){
        int[][] cost = {{ 10,	45,	1,	12,	100 },
                        {50,	15,	9,	52,	15 },
                         {25,	35,	3,	12,	18}};

        int minCost = minCostRecur(cost,3, 0, 0);
        System.out.println("MIN cost = "+minCost);
    }

}
