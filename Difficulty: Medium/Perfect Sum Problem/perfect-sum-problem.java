class Solution {
    public static int solve(int[] nums, int target, int i, int[][] dp)
    {
        int n = nums.length;
        
        
        if(i == n)
        {
        if(target == 0) return 1;
         else return 0;
        }
        
        if(dp[i][target] != -1) return dp[i][target];
        
        int take = 0;
        if(nums[i] <= target)
        {
            take = solve(nums, target - nums[i], i + 1, dp);
        }
        int nottake = solve(nums, target, i + 1, dp);
        
        return dp[i][target] = take + nottake;
        
    }
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int[][] dp = new int[n][target + 1];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= target; j++)
            {
                dp[i][j] = -1;
            }
        }
        return solve(nums, target, 0, dp);
    }
}