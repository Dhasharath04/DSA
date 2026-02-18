class Solution {
    public int numOfPairs(String[] nums, String target) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                String str=nums[i]+nums[j];
                // System.out.println(str);
                //System.out.println(target);
                if(str.equals(target))
                {
                    count++;
                }
                }
            }
        }
        return count;
        
    }
}