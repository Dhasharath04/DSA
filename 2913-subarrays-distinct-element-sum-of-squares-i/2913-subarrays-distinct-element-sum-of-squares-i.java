class Solution {
    public int sumCounts(List<Integer> nums) {
        int n1=nums.size();
        int[] arr=new int[n1];
        int k=0;
        int s=0;
        for(int d:nums)
        {
            arr[k++]=d;
        }
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                HashSet<Integer> arr1=new HashSet<>();
                for(int l=i;l<=j;l++)
                {
                    arr1.add(arr[l]);
                }
                int d1=arr1.size();
              s+=d1*d1;
            }
        }
        return s;
    }
}