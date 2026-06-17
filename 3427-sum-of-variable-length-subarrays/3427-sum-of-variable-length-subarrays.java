class Solution {
    public int subarraySum(int[] nums) {
        // PriorityQueue<Integer> p=new PriorityQueue<>();
        // for(int i=0;i<nums.length;i++){
        //     p.add(nums[i]);
        // }
        // int tc=0;
        // while(p.size()>1){
        //     int f=p.poll();
        //     int s=p.poll();
        //     int c=f+s;
        //     tc+=c;
        //     p.add(tc);
        // }
        // return p.peek();
        int n=nums.length;
        int d=0;
        for(int i=0;i<n;i++)
        {
            int s=Math.max(0,i-nums[i]);
            for(int j=s;j<=i;j++)
            {
                d+=nums[j];
            }
        }
        return d;
    }
}