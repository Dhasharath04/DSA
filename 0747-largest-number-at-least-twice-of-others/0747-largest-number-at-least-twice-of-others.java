class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(nums);
        int d=nums[n-1];
        for(int i=0;i<n-1;i++)
        {
            int d1=nums[i]*2;
            System.out.println(d1);
            System.out.println(d);
            if(d1>d)
            {
                return -1;
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(d==arr[i])
            {
                 c+=i;
                 break;
            }
        }
        return c;
        
    }
}