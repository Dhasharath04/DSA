class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length();
        int r=0;
        int c=1;
        int p=0;
        for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                c++;
            }
            else{
            r+=Math.min(p,c);
            p=c;
            c=1;
        }
        }
         r+=Math.min(p,c);
         return r;

        
    }
}