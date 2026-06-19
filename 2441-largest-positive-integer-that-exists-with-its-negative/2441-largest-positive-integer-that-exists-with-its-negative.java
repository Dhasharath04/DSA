class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        // int d=nums[0];
        // int c=Math.abs(d-0);
        // System.out.println(d);
        // System.out.println(c);
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]==c)
        //     {
        //         return c;
        //     }
        // }
        // return -1;
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int d2=nums[i];
               int d11=Math.abs(nums[i]-0);

              if(nums[j]==d11 && d2<0)
              {
                return d11;
              }
            }
        }
        return -1;
    }
}