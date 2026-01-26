class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int c=1;c<=n;c++)
        {
            for(int a=1;a<=n;a++)
            {
                int b2=c*c-a*a;
                if(b2<=0) continue;

                int d=(int)Math.sqrt(b2);
                if(d<=n && d*d==b2)
                {
                    count++;
                }
            }
            

        }
        return count;
        
    }
}