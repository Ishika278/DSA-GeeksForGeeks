class Solution {
    public static int solve(int arr[], int i, int currsum, int totalsum, int[][] dp)
    {
      int n = arr.length;
      
      if(i == n)
      {
          return Math.abs(totalsum - 2 * currsum);
      }
      
      if(dp[i][currsum] != -1) return dp[i][currsum];
      
      int take = solve(arr, i + 1, currsum + arr[i], totalsum, dp);
      
      int nottake = solve(arr, i + 1, currsum, totalsum, dp);
      
      return dp[i][currsum] = Math.min(take, nottake);
    }
    public int minDifference(int arr[]) {
        // code here
      int n = arr.length;
      int totalsum = 0;
      
      for(int num : arr) totalsum += num;
      int[][] dp = new int[n][totalsum + 1];
      
      for(int i = 0; i < n; i++)
      {
         Arrays.fill(dp[i], -1);
      }
      return solve(arr, 0, 0, totalsum, dp);  
    }
}
