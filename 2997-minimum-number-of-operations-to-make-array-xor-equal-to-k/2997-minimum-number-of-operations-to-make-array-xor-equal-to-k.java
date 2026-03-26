class Solution {
    public int minOperations(int[] nums, int k) {
        int x=0;
         for(int d:nums)
         {
            x^=d;
         }
         int di=x^k;
         int count=0;
         while(di>0)
         {
            count+=di&1;
            di>>=1;
         }
 
        return count;
    }
}