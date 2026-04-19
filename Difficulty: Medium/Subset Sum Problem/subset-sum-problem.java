class Solution {
    public static Boolean solve(int[] arr, int sum, int i , int[][] dp)
    {
        int n = arr.length;
        if(sum == 0)return true;
        if(i == n) return false;
        
        if(dp[i][sum] != -1) return dp[i][sum] == 1;
        boolean take = false;
        if(arr[i] <= sum)
        {
            take = solve(arr, sum - arr[i], i + 1, dp);
        }
        boolean nottake = solve(arr, sum, i + 1, dp);
        
        dp[i][sum] = (take || nottake) ? 1 : 0;
        return take || nottake;
        // dp[i][sum] = take || nottake;
        // return dp[i][sum];
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n = arr.length;
        int [][] dp = new int[n][sum + 1];
        
        for(int i = 0; i < n; i++)
        {
            for (int j = 0; j <= sum; j++)
            {
                dp[i][j] = -1;
            }
        }
        return solve(arr, sum, 0, dp);
    }
}