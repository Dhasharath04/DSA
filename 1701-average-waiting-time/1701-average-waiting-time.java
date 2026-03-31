class Solution {
    public double averageWaitingTime(int[][] customers) {
        long c1=0;
        long r=0;
        for(int[] c:customers)
        {
            int a=c[0];
            int t=c[1];
            if(c1<a)
            {
                c1=a;
            }
            c1+=t;
            r+=(c1-a);
        }

        return (double) r/customers.length;
    }
}