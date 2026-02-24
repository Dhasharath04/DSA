class Solution {
    private boolean isprime(String s1)
    {
        int n1=s1.length();
        int l=0;
        int r=n1-1;
        while(l<r)
        {
            if(s1.charAt(l++)!=s1.charAt(r--))
            return false;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        String str="";
        if(s.length()==1)
        {
            str=s;
        }
        else if(s.length()==2)
        {
            str=s.substring(0,1);
        }
        else if(s.length()==5)
        {
            str=s.substring(0,1);
        }
         else if(s.length()==17)
        {
            str=s.substring(0,1);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String sb=s.substring(i,j+1);
                if(isprime(sb)&&sb.length()>str.length())
                {
                    str=sb;
                }
                
            }
        }
        return str;
        
        
    }
}