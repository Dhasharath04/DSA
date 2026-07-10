class Solution {
    public int arraySign(int[] nums) {
        int n=nums.length;
               int s=1;
        for(int i=0;i<n;i++)
        {
           if(nums[i]==0)
           {
            return 0;
           }
           if(nums[i]<0)
           {
            s*=-1;
           }
         
        }
        return s;
       
      
    }
}