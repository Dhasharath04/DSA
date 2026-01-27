class Solution {
    public int countDistinctIntegers(int[] nums) {
    
     
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)
        {
            hs.add(num);
            int d=0;
            int n1=num;
            while(n1>0)
            {
                
                 d=d*10+(n1%10);
                 n1=n1/10;
            }
            hs.add(d);
        }
        return hs.size();
        
    }
}