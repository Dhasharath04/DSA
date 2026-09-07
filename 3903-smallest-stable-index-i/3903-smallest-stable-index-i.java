class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            int max1=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
         
           for(int j=0;j<=i;j++)
           {
            max1=Math.max(max1,nums[j]);
           } 
           System.out.println(max1);
           for(int j=i;j<n;j++)
         {
            min1=Math.min(min1,nums[j]);
           }   
           System.out.println(min1);
         
              int d=max1-min1;

              if(d<=k)
              {
                return i;
              }
          
        }
        return -1;
        
    }
}