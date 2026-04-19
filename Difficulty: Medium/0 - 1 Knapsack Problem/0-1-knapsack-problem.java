class Solution {
    public static int solve(int W, int[] val, int[] wt, int i, int[][] dp)
    {
        int n = val.length;
        if(W == 0 || i == n) return 0;
        
        if(dp[i][W] != -1) return dp[i][W];
        int take = 0;
        if(wt[i] <= W)
        {
            take = val[i] + solve(W - wt[i], val, wt, i + 1, dp);
        }
        int nottake = solve(W, val, wt, i + 1, dp);
        
        dp[i][W] = Math.max(take, nottake);
        return dp[i][W];
    }
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        int [][] dp = new int [n][W + 1];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= W; j++)
            {
               dp[i][j] = -1; 
            }
        }
        return solve(W, val,  wt, 0, dp);
    }
}
