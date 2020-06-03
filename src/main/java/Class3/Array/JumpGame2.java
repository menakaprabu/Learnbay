package Class3.Array;

public class JumpGame2 {

    private static int jump(int[] nums) {

        //reachable is each value.
        int maxSoFar = 0, lastReachable = 0, steps = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            maxSoFar = Math.max(maxSoFar, i + nums[i]);
            if (i == lastReachable) {
                steps++;
                lastReachable = maxSoFar;

                if (maxSoFar >= nums.length - 1) {
                    break;
                }
            }
        }
        return steps;
    }

    public static void main(String[] args){
        int[] input = new int[]{2,1,2,1,4};

        int minSteps = jump(input);
        System.out.println("min Steps = "+minSteps);
    }

}

