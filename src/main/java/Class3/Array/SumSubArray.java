package Class3.Array;

public class SumSubArray {

    private static int findSubArray(int[] input) {
        int maxSoFar = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (sum < 0)
                sum = input[i];
            else
                sum = sum + input[i];

            if (sum > maxSoFar)
                maxSoFar = sum;
        }
        return maxSoFar;
    }

    public static void main(String[] args){
        int[] input = new int[]{-4,6,-1, 5};
        int maxSumofContinousSubArray = findSubArray(input);
        System.out.println("Output = "+maxSumofContinousSubArray);
    }

}
