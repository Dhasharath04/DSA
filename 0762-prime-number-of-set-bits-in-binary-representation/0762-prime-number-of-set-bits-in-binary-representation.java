class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count1=0;
        for(int i=left;i<=right;i++)
        {
            int count=0;
            String str=Integer.toBinaryString(i);
            for(char ch:str.toCharArray())
            {
                if(ch=='1')
                {
                    count++;
                }
            }
            System.out.println(count);
            if(primeval(count))
            {
                count1++;
            }

        }
        return count1;
        
    }
    private boolean primeval(int n1)
    {
        if(n1<=1) return false;
        for(int j=2;j<n1;j++)
            {
                if(n1%j==0)
                {
                   return false;
                }
            }
            return true;
    }
}