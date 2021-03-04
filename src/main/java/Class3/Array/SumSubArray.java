package Class3.Array;

//This class will give the maximum sum of the continuous array.
public class SumSubArray {

    private static int findSubArray(int[] input) {
        int maxSoFar = Integer.MIN_VALUE, sum = 0;

        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < input.length; i++) {
            if (sum < 0) {
                sum = input[i];
                startIndex = i;
            } else {
                sum = sum + input[i];
            }

            if (sum > maxSoFar) {
                maxSoFar = sum;
                endIndex = i;
            }
        }
        System.out.println("Start Index = "+startIndex +" End index = "+endIndex);
        return maxSoFar;
    }

    public static void main(String[] args){
        int[] input = new int[]{-4,8, -9, 6,-1, 5};
        int maxSumofContinousSubArray = findSubArray(input);
        System.out.println("maxSumofContinousSubArray = "+maxSumofContinousSubArray);
    }

    /*
    function meetingPlanner(slotsA, slotsB, dur):
    ia = 0
    ib = 0

    while (ia < slotsA.length AND ib < slotsB.length):
        start = max(slotsA[ia][0], slotsB[ib][0])
        end = min(slotsA[ia][1], slotsB[ib][1])

        if (start + dur <= end):
            return [start, start + dur]

        if (slotsA[ia][1] < slotsB[ib][1]):
            ia++
        else:
            ib++

    return []
     */

}
