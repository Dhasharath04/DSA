class Solution {
    public boolean hasAlternatingBits(int n) {
        String str=Integer.toBinaryString(n);
        int n1=str.length();
        for(int i=1;i<n1;i++)
        {
            if(str.charAt(i-1)==str.charAt(i))
            {
                return false;
            }
        }
        return true;
        
    }
}