class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            arr.add(index[i],nums[i]);
        }
        int i=0;
        for(int x:arr)
        {
            System.out.println(x);
            a[i++]=x;
        }
        return a;
    }
}