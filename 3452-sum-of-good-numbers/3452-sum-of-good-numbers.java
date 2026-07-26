class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
           int d1=i-k;
           int d2=i+k;
           boolean aa=true;
            if(d1>=0 && nums[i]<=nums[d1])
            {
                aa=false;
            }
           
            if(d2<n && nums[i]<=nums[d2])
            {
                aa=false;
            }
            if(aa)
            {
                s+=nums[i];
            }
           
        }
        return s;
        
    }
}