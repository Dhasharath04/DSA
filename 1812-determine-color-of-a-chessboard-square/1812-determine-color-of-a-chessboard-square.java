class Solution {
    public boolean squareIsWhite(String c) {
        char s=c.charAt(0);
        char s1=c.charAt(1);
        int d1=s-'a'+1;
        int d2=s1-'0';
        int d3=d1+d2;
        if(d3%2==0)
        {
            return false;
        }
        return true;
        
    }
}