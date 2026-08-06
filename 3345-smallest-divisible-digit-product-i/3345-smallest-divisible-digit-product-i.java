class Solution {
    public int smallestNumber(int n, int t) {
        
        for(int i=n;;i++)
        {
            int s=1;
            int d=i;
            while(d>0)
            {
                int d1=d%10;
                s*=d1;
                d/=10;
            }
            if(s%t==0)
            {
                return i;
            }
        }
        
        
    }
}