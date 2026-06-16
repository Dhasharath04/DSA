class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
        }
        int s1=0;
        for(int i=0;i<n;i++)
        {
            
            int n1=nums[i];
            while(n1>0)
            {
                s1+=n1%10;
                n1=n1/10;
            }
        }
       int a=Math.abs(s1-s);
       return a;
        
    }
}