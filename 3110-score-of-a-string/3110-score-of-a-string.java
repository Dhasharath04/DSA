class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
        for(int i=1;i<n;i++)
        {
            int n1=Math.abs(s.charAt(i-1)-s.charAt(i));
                sum+=n1;
        }
        return sum;
        
    }
}