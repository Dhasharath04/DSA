class Solution {
    public int gcdOfOddEvenSums(int n) {
        int se=0;
        int so=0;
        for(int i=1;i<=n+n;i++)
        {
            if(i%2==0)
            {
                 System.out.println(i);
                se+=i;
            }
            else
            {
                so+=i;
            }
        }
        System.out.println(se);
        return Math.abs(so-se);
    }
}