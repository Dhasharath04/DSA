class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr1);
        return arr1;
        
    }
}