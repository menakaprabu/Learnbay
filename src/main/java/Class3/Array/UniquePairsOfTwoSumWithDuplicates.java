package Class3.Array;

import java.util.*;

//This class is to return the count of unique pair such that when we add them we get the target value.
//The input array will have the duplicate elements
//Time complexity is  O(N log(N)) + O(N)
public class UniquePairsOfTwoSumWithDuplicates {

    private static Map getPair(int[] input, int target){
        Arrays.sort(input);
        int fromFirst = 0;
        int fromLast = input.length -1;

        Map<String, Integer> uniquePairMap = new HashMap<>();
        //2,2,5,5,6,7,8,11,15 (2,11: 5,8: 6,7)
        while(fromFirst < fromLast){
            if(input[fromFirst] + input[fromLast] == target){
                String key = input[fromFirst] + ","+input[fromLast];
                if(uniquePairMap.containsKey(key)){
                    uniquePairMap.put(key, uniquePairMap.get(key)+1);
                }else{
                    uniquePairMap.put(key,1);
                }
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
        int[] input = new int[]{6, 2, 5, 7, 11, 2, 5, 8, 15};
        Map pairsMap = getPair(input, 13);
        System.out.println("no of pairs = "+pairsMap.size());
        System.out.println("uniquePairs = "+pairsMap);
    }
}
