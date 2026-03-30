class Solution {
    private boolean isvowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean doesAliceWin(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            char cn=s.charAt(i);
            if(isvowel(cn))
            {
                count++;
            }
        }
        if(count>0)
        {
            return true;
        }
        return false;
        
    }
}