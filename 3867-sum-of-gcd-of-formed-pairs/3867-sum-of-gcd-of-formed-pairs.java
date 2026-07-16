class Solution {
    static int gcd(int a,int b)
    {
        while(b!=0)
            {
                int temp=a%b;
                a=b;
                b=temp;
            }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int[] max=new int[n];
        max[0]=nums[0];
        for(int i=1;i<n;i++)
           max[i]=Math.max(max[i-1],nums[i]);
        int[] preg=new int[n];
        preg[0]=gcd(nums[0],max[0]);
        for(int i=0;i<n;i++)
            {
                preg[i]=gcd(nums[i],max[i]);
            }
        long sum=0;
        Arrays.sort(preg);
        int l=0;
        int r=n-1;
        while(l<r)
            {
                sum+=gcd(preg[l],preg[r]);
                r--;
                l++;
            }
        return sum;
        
    }
}