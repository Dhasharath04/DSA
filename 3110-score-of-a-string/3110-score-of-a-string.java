class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int s1=0;
        for(int i=0;i<n-1;i++)
        {
            s1+=Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return s1;
        
    }
}