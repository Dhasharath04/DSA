class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int[] arr=new int[2];
        int k=0;
        int j=0;
        for(int i=1;i<n;i++)
        {
             j=i-1;
            if(nums[i]==nums[j])
            {
               arr[k++]=nums[j];
            }
            
        }
        return arr;
        
    }
}