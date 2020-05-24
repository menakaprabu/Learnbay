package Class3.Array;

import java.util.*;

//This class is to return the count of unique pair such that when we add them we get the target value.
//Time complexity is  O(N log(N)) + O(N)
public class UniquePairOfTwoSum {

    private static Map getPair(int[] input, int target){
        Arrays.sort(input);
        int fromFirst = 0;
        int fromLast = input.length -1;

        int count = 1;
        Map<Integer, List<Integer>> uniquePairMap = new HashMap<>();
        //2,5,6,7,8,11,15 (2,11: 5,8: 6,7)
        while(fromFirst < fromLast){
            if(input[fromFirst] + input[fromLast] == target){
               List<Integer> pairList = new ArrayList();
               pairList.add(input[fromFirst]);
               pairList.add(input[fromLast]);
               uniquePairMap.put(count, pairList);
               count++;
               fromFirst++;
            }
            else if((input[fromFirst] + input[fromLast]) > target){
                fromLast--;
            }else{
                fromFirst++;
            }
        }
        return uniquePairMap;
    }

    public static void main(String[] args){
        int[] input = new int[]{6, 2, 5, 7, 11, 8, 15};
        Map pairsMap = getPair(input, 13);
        System.out.println("no of pairs = "+pairsMap.size());
        System.out.println("uniquePairs = "+pairsMap);
    }
}
