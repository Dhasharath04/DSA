class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            m1=Math.min(nums[i],m1);
        }
        for(int i=0;i<n;i++)
        {
            m2=Math.max(nums[i],m2);
        }
        int d=m2-m1;
        long f11=(long) d*k;
        return f11;
    }
}