class Solution {
    public int minMoves2(int[] nums) {
        
        int n=nums.length;
        Arrays.sort(nums);
        if(n%2==1)
        {
            int ans=0;
            int target=nums[n/2];
            for(int num:nums)
            {
                ans+=Math.abs(num-target);
            }
            return ans;
        }
        else
        {
            int ans=0;
            int target=(nums[n/2]+nums[n/2-1])/2;
            for(int num:nums)
            {
                ans+=Math.abs(num-target);
            }
            return ans;
        }

    }
}