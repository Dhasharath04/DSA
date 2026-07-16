class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        int prefix[]=new int[n];
        int max=nums[0];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            max=Math.max(max,nums[i]);
            prefix[i]=gcd(max,nums[i]);
        }
        Arrays.sort(prefix);
        long sum=0;
        for(int i=0;i<n/2;i++)
        {
            sum+=gcd(prefix[i],prefix[n-1-i]);
        }
        return sum;

    }
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}