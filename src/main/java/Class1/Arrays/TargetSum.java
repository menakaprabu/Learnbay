package Class1.Arrays;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

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
        targetSum(input, 8);
    }
}
