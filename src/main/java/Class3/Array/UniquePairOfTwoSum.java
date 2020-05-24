package Class3.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This class is to return the count of unique pair such that when we add them we get the target value.
//Time complexity is O(n
public class UniquePairOfTwoSum {

    private static int getPair(int[] input, int target){
        Arrays.sort(input);
        int fromFirst = 0;
        int fromLast = input.length -1;

        int count = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        //2,5,6,7,8,11,15
        while(fromFirst < fromLast){
            if(input[fromFirst] + input[fromLast] == target){
               count++;
               fromFirst++;
            }
            if((input[fromFirst] + input[fromLast]) > target){
                fromLast--;
            }else{
                fromFirst++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] input = new int[]{6, 12, 5, 7, 11, 8, 15};
        int noOfPairs = getPair(input, 13);
        System.out.println("no of pairs = "+noOfPairs);
    }
}
