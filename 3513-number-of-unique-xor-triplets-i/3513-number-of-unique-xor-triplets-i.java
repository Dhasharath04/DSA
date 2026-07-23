class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        // int i=0;
        // int j=0;
        // int k=0;
        // int count=0;
        // while(i<=j && j<=k && k<n)
        // {
        //     if(nums[i]^nums[j]^nums[k])
        //     {
        //         count++;
        //     }
        //     k++;
        // }
        //  while(i<=j && j<=k && j<n-1)
        // {
        //     if(nums[i]^nums[j]^nums[k])
        //     {
        //         count++;
        //     }
        //     j++;
        // }
        //  while(i<=j && j<=k && i<n-2)
        // {
        //     if(nums[i]^nums[j]^nums[k])
        //     {
        //         count++;
        //     }
        //     i++;
        // }
        // return count;
             if(n<=2)
             {
                return n;
             }
             int d=1;
             while(d<=n)
             {
                d<<=1;
             }
             return d;
    }
}