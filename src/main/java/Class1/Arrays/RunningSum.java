package Class1.Arrays;

import java.util.List;

public class RunningSum {

    private static void runningSum(int[] arr) {

        int[] output = new int[arr.length];
       int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            output[i] = sum;
            System.out.println("output[i] = "+output[i]);
        }
    }

    public static void main(String[] args){
        int[] input = new int[]{ 1,2,3,4};
        runningSum(input);
    }
}
