class Solution {
    private boolean isprime(String s1)
    {
     int n=s1.length();
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if(s1.charAt(l++)!=s1.charAt(r--))
              return false;
        }
        return true;
    }

    public int countSubstrings(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String sb=s.substring(i,j+1);
                if(isprime(sb))
                {
                    count++;
                }
            }
        }
        return count;
    }
}