class Solution {
    public int minSwaps(String s) {
        int n=s.length();
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='[')
            {
                k++;
            }
            else if(k>0)
            {
                k--;
            }
             
        }
        return (k+1)/2;
        
    }
}