class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int k=0;
        int[] arr=new int[2*n];
        for(int i=0;i<n;i++)
        {
            arr[k++]=nums[i];
        }
        for(int i=0;i<n;i++)
        {
           arr[k++]=nums[i]; 
        }
        return arr;
    }
}