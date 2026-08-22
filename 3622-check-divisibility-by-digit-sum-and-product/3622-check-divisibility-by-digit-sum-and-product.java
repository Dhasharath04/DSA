class Solution {
    public boolean checkDivisibility(int n) {
        int d1=n;
        int s=0;
        int m=1;
        while(n>0)
        {
            int d=n%10;
            s+=d;
            m*=d;
            n/=10;
        }
        // if(d1==s+m)
        // {
        //     return true;
        // }
        // return false;
        return d1%(s+m)==0;
    }
}