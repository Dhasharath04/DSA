class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int d=0;
        int min1=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                 d=i;
                    min1=Math.min(min1,Math.abs(d-start));
                
            }
        }
        return min1;
        
    }
}