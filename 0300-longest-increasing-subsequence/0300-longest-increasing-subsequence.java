class Solution {
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;
        int dp[][]=new int[n+1][n+1];

        for(int i=n-1;i>=0;i--)
        {
            for(int j=i-1;j>=-1;j--)
            {
                int notPick=dp[i+1][j+1];
                int pick=0;
                if(j==-1 || nums[j]<nums[i])
                {
                    pick=1+dp[i+1][i+1];
                }
                dp[i][j+1]=Math.max(notPick,pick);
            }
        }
        return dp[0][0];
        
        // return lis(nums,0,-1,dp);
    }

    public static int lis(int nums[],int i,int prev,Integer dp[][])
    {
        if(i==nums.length) return 0;

        if(dp[i][prev+1]!=null) return dp[i][prev+1];

        int pick=0;
        int notPick=lis(nums,i+1,prev,dp);
        if(prev==-1 || nums[prev]<nums[i])
        {
            pick=1+lis(nums,i+1,i,dp);
        }

        return dp[i][prev+1]=Math.max(notPick,pick);
    }
}