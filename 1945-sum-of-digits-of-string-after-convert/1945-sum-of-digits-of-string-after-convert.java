class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
         int s1=0;
        for(int i=0;i<n;i++)
        {
            int d=s.charAt(i)-'a'+1;
        
       
        while(d>0)
        {
            s1+=d%10;
            d=d/10;
        }
        }
        for(int i=2;i<=k;i++)
        {
            int ns=0;
            while(s1>0)
            {
                ns+=s1%10;
                s1=s1/10;
            }
            s1=ns;
        }

        return s1;
    }
}