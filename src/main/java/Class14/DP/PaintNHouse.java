package Class14.DP;

import java.util.HashMap;
import java.util.Map;
/**
 * This is DP problem
 * There are p colors given to you. There are n houses and there is a cost to paint each of the
 * houses with each of these p colors. You can’t paint the consecutive houses with the same color.
 * You need to find the minimum cost to paint all the houses.
 *
 */
public class PaintNHouse {

    private static int[][] costs ;

    private static Map<String, Integer> map = new HashMap();

    private static int noOfColors;

    private static int noOfHouses;

    private static int findMinCosts(int[][] costs){
        if (costs.length == 0) {
            return 0;
        }
        noOfColors = costs[0].length; //Row represents house
        noOfHouses = costs.length; //Col represents paint colors
        PaintNHouse.costs = costs;

        int minCost = Integer.MAX_VALUE;
        for(int color=0;color<noOfColors;color++){
           minCost = Math.min(minCost, paintCost(0, color));
        }
        return minCost;
    }

    private static int paintCost(int house, int color){
        // Base case: There are no more houses after this.
        if (house == noOfHouses - 1) {
            return costs[house][color];
        }
        // If we have already calculated the same combination, use the already calculated value.
        if(map.containsKey(getMapKey(house, color))){
            return map.get(getMapKey(house, color));
        }
        int minRemainingCost = Integer.MAX_VALUE;
        for(int c=0;c<noOfColors;c++){
            if(c == color){
                continue; //No two same colors can be painted to adjacent house
            }
            minRemainingCost = Math.min(paintCost(house+1, c), minRemainingCost);
        }
        int totalCost = costs[house][color] + minRemainingCost;
        map.put(getMapKey(house, color), totalCost);
        return totalCost;
    }

    private static String getMapKey(int house, int color) {
        return house + " " + color;
    }

    public static void main(String[] args){
                        // R    G    B   Y   W
        int[][] cost =  {{10,	45,	1,	12,	100 }, //H0
                         {50,	15,	9,	52,	15 }, //H1
                         {25,	35,	3,	12,	18}, //H2
                         {10,	20,	8,	13,	2}}; //H3
            // H0 - Blue: 1 + H1: White/Green - 15 + H2: Blue - 3 + H3: White - 2
             // Total = ( 1 + 15 + 3 + 2 = 21)

        int minCost = findMinCosts(cost);
        System.out.println("Min cost to paint the house = "+minCost);
    }
}
