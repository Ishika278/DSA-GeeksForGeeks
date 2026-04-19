class Solution {
    int minCost(int[] height) {
        // code here
        int n = height.length;
        Integer[]dp = new Integer[n];
        //int[] dp = new int[n];
        
        return solve(n - 1, height, dp);
    }
    public int solve(int i, int[] height, Integer[] dp)
    {
        if(i == 0) return 0;
        
        if(dp[i] != null) return dp[i];
        
        int take1 = solve(i - 1, height, dp) + Math.abs(height[i] - height[i - 1]);
        
        int take2 = 99999;
        if(i > 1)
        {
            take2 = solve(i - 2, height, dp) + Math.abs(height[i] - height[i - 2]);
        }
        return dp[i] = Math.min(take1, take2);
    }
}