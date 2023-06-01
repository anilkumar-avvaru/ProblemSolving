package com.problems;
import com.problems.DebugUtils;
public class MinCoinChange {
    private static final int INFINITY = -9999;

    public static int solve(){
        return solve(false);
    }
    public static int solve(boolean debug){
        int S = 19;
        int[] w = {1, 3, 5, 11};
        int m = w.length;
        int dp[][] = new int[m][S+1];
        dp[0][0] = 0;
        for(int i=1; i<=S; i++){
            if(i%w[0]==0){
                dp[0][i] = i/w[0];
            }else{
                dp[0][i] = INFINITY;
            }
        }

        for(int i=1; i<m; i++){
            for(int j=0; j<=S; j++){
                dp[i][j] = INFINITY;
                if(j<w[i]){
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                int a = dp[i-1][j];
                int b = dp[i][j-w[i]];
                if(a!=INFINITY || b!=INFINITY){
                    dp[i][j] = Math.min(a, 1+b);
                }
            }
        }

        if(debug){
            DebugUtils du = new DebugUtils();
            du.printTwoDimensionalArray(dp, "dp");
        }
        return dp[m-1][S];
    }
}
