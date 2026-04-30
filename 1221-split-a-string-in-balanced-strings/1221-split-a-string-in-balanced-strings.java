class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        int count=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='R')
            {
                count++;
            }
            else{
                count--;
            }
            if(count==0)
            {
                c++;
            }
        }
        return c;
        
    }
}