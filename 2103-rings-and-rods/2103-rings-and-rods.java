class Solution {
    public int countPoints(String rings) {
        int n=rings.length();
        int count=0;
        for(int r='0';r<='9';r++)
        {
            boolean hasr=false;
            boolean hasg=false;
            boolean hasb=false;
            for(int i=0;i<n;i+=2)
            {
                char ch1=rings.charAt(i);
                char ch2=rings.charAt(i+1);
                if(r==ch2)
                {
                    if(ch1=='G')
                    {
                       hasg=true;
                    }
                    else if(ch1=='R')
                    {
                        hasr=true;
                    }
                    else if(ch1=='B')
                    {
                        hasb=true;
                    }
                }
            }
            if(hasr && hasg && hasb)
            {
                count++;
            }
        }
        return count;
        
    }
}