class Solution {
    public int findPermutationDifference(String s, String t) {
        int n=s.length();
        int sum=0;
        if(s.length()==t.length())
        {
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                int d1=s.indexOf(ch);
                int d2=t.indexOf(ch);
                int a=Math.abs(d1-d2);
                sum+=a;
            }
            return sum;
        }
        return 0;
        
    }
}