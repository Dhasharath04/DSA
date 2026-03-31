class Solution {
    public int triangularSum(int[] nums) {
        // int n=nums.length;
        // ArrayList<Integer> arr=new ArrayList<>();
        // for(int i=0;i<n;i++)
        // {
        // arr.add(nums[i]);
        // }
        // int n1=arr.size();
        // System.out.println(n1);
        // while(n1>1)
        // {
        //     for(int i=0;i<n1-1;i++)
        //     {
        //        int d1=arr.get(i);
        //        int d2=arr.get(i+1);
        //        int r=(d1+d2)%10;
        //         arr.add(r);

        //     }
           
        // }
        // n1--;
        // return arr.get(0);
        int n=nums.length;
        while(n>1)
        {
            for(int i=0;i<n-1;i++)
            {
                nums[i]=(nums[i]+nums[i+1])%10;
            }
            n--;
        }
        return nums[0];
    }
}