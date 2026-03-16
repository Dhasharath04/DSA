class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int j=1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            int d=26-(c-'a');
            int d2=d*j;
            sum+=d2;
            j++;

        }
        return sum;
    }
}