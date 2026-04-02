class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList();
        int n=nums.length;
        int subsets=1<<n;
        Set<List<Integer>> ans1=new HashSet<>();

        for(int i=0;i<subsets;i++)
        {
             List<Integer> sub1=new ArrayList();
             for(int j=0;j<n;j++)
             {
             if((i &(1<<j)) !=0){
                sub1.add(nums[j]);
             }
             }
         ans1.add(sub1);
        }
        ans.addAll(ans1);
        return ans;

        
        
    }
}