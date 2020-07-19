package Class14.DP;

public class DenominationsCoins {

   private static int dp[][] = new int [100][1000]; // Represents dp[curr][totalSum]

   private static int count = 0;

    private static boolean sumExist(int denom[], int n, int curr, int totalSum) {
        if(totalSum < 0) {
            return false;
        }
        if(curr == n && totalSum == 0) {
            count++;
            return true;
        }
        if(curr ==n &&  totalSum != 0) {
            return false;
        }
        if(dp[curr][totalSum] != -1) {
            if(dp[curr][totalSum] == 0)
                return false;
            else
                return true;
        }
        boolean take_curr = sumExist( denom, n, curr+1, totalSum - denom[curr]);
        boolean dont_take_curr = sumExist(denom, n, curr+1, totalSum);

        boolean ans = take_curr || dont_take_curr;
        if(ans == false)
            dp[curr][totalSum] = 0;
        else {
            dp[curr][totalSum] = 1;
        }

        return ans;
    }

    public static void main(String[] args){
       for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                dp[i][j] = -1;
            }
        }
        int[] input = {2,  3, 1, 5 , 0};
        boolean sumExist = sumExist(input, input.length , 0 , 6);
        System.out.println("Is sum exist = "+sumExist);
        System.out.println("Count = "+count);
    }

}
