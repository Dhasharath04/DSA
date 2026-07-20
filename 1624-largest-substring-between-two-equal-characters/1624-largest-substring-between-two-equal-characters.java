class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int n=s.length();
        int ma=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                  ma=Math.max(ma,((j-i)-1)) ;
                }
                
            }
        }
        if(ma>-1)
        {
            return ma;
        }
        return -1;
        
    }
}