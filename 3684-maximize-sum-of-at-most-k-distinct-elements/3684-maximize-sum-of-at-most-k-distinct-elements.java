class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int j=0;
        List<Integer> arr=new ArrayList<>();
        for(int i=n-1;i>=0;i--)
        {
            if(!arr.contains(nums[i])&& arr.size()<=k-1)
            {
                arr.add(nums[i]);
            }
        }
        System.out.println(arr);
        int[] ar1=new int[arr.size()];
       for(int d:arr)
       {
        ar1[j++]=d;
       }
       return ar1;
        
    }
}