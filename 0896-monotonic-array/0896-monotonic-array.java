class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean in=true;
        boolean d=true;
         for(int i=1;i<n;i++)
         {
            if(nums[i]>nums[i-1]) d=false;
            if(nums[i]<nums[i-1]) in=false;

         }
         return in||d;

    }
}