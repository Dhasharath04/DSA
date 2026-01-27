class Solution {
    public int maximumXOR(int[] nums) {
       
        int xor=0;
        for(int num:nums)
        {
            xor|=num;

        }
        return xor;
        
    }
}