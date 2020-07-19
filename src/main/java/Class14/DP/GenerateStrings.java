package Class14.DP;

public class GenerateStrings {

    private static int dp[][][]; // Initialize -1

    int countStrings(int length, String currString, int countB, int countC) {

        if(dp[length][countB][countC] != -1)
            return dp[length][countB][countC];

        if(currString.length() == length) {
            return 1;
        }

        int ans = 0;
        String newStringA = new String();
        newStringA = currString + 'a';
        ans += countStrings(length, newStringA, countB, countC);


        if(countB != 0) {
            String newStringB = new String();
            newStringB = currString + 'b';
            ans += countStrings(length, newStringB, countB-1, countC);

        }

        if(countC != 0) {
            String newStringC = new String();
            newStringC = currString + 'c';
            ans += countStrings(length, newStringC, countB, countC-1);
        }

        dp[length][countB][countC] = ans;
        return ans;

    }

}
