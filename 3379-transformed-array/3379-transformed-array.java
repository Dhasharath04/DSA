class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
            arr[i]=nums[i];
            }
            // else if(nums[i]>0)
            // {
            //     int d=(i+nums[i])%n;
            //     arr[i]=nums[d];
            // }
            else{
                int d1=(i+nums[i])%n;
                if(d1<0)
                {
                    d1+=n;
                }
                arr[i]=nums[d1];
            }
        }
        return arr;

        
    }
}