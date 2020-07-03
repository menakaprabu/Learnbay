package Companies.Flexton;

import java.util.List;
/*
Check if there exist two elements in an array whose sum is equal to the sum of rest of the array
Input  : arr[] = {2, 11, 5, 1, 4, 7}
Output : Elements are 4 and 11
Note that 4 + 11 = 2 + 5 + 1 + 7


Input  : arr[] = {1,  6, 5, 2, 8}
Output : Elements are 5 and 6
Note that 6 + 5 = 1 + 2 + 8

Input  : arr[] = {2, 4, 2, 1, 11, 15}
Output : Elements do not exist
*/

import java.util.ArrayList;

public class FlextonFirstRound {

    private static List<Integer> sumPair(int[] arr){
        List<Integer> output = new ArrayList<Integer>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        if(sum%2 != 0){
            return output;
        }
        sum = sum/2;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(i != j && sum == (arr[i] + arr[j])){
                    System.out.println(" Pair = "+arr[i]+ " "+arr[j]);
                    output.add(arr[i]);
                    output.add(arr[j]);

                    return output;
                }
            }
        }
        return output;
    }

    public static void main(String[] args){
        int[] input = new int[]{ 2, 11, 5, 1, 4, 7};
        sumPair(input);
    }
}
