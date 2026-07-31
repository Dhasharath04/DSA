class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            int d=nums[i];
            int ma=0;
            while(d>0)
            {
                int a=d%10;
                ma=Math.max(ma,a);
                d=d/10;
            }
            arr[i]=ma;
         }
         int m=-1;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        m=Math.max(m,nums[i]+nums[j]);
                    }
                }
            }
            if(m>-1)
            {
                return m;
            }
            return -1;
        
    }
}