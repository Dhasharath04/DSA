class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int[] d=new int[n];
        if(n==1)
        {
            d[0]=0;
            return d;
        }
        arr1[0]=0;
        for(int i=1;i<n;i++)
        {
            arr1[i]=arr1[i-1]+nums[i-1];
        }
        arr2[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            arr2[i]=nums[i+1]+arr2[i+1];
            System.out.println(arr2[i]);
        }
        for(int i=0;i<n;i++)
        {
            d[i]=Math.abs(arr1[i]-arr2[i]);
        }
        return d;
    }
}