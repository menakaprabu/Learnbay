package Class1.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TargetSum {

    public static int[] twoSum(int[] nums, int target) {
        final HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            final int difference = target - nums[i];

            if (map.containsKey(difference))
                return new int[]{map.get(difference), i};
            else
                map.put(nums[i], i);
        }
        return null;
    }

    private static List<Integer> targetSum(int[] arr,int targetSum) {
        List<Integer> output = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (targetSum == (arr[i] + arr[j])) {
                    System.out.println(" Pair = " + i + " " + j);
                    output.add(i);
                    output.add(j);

                    return output;
                }
            }
        }
            return output;
        }


    public static void main(String[] args){
        int[] input = new int[]{ 3,6,5,2,7};
        int[] out = twoSum(input, 8);
        System.out.println("value 1 = "+out[0] + " value 2 = "+out[1]);
    }
}
