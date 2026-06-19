class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        StringBuilder sb=new StringBuilder();
        long s=0;
        while(l<r)
        {
            String str1=Integer.toString(nums[l]);
            String str2=Integer.toString(nums[r]);
            String str11=str1+str2;
            int d=Integer.parseInt(str11);
            s+=d;
            l++;
            r--;

        }
        if(n%2!=0)
        {
           s=s+nums[n/2];
        }
        return s;
    }
}