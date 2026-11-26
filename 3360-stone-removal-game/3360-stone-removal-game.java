class Solution {
    public boolean canAliceWin(int n) {
        if(n<10)
        {
            return false;
        }
        if(n==10)
        {
            return true;
        }
        int d=10;
        int count=0;
        while(n>=d)
        {
            n=n-d;
            d--;
            count++;
        }
        if(count%2==0)
        {
            return false;
        }
        return true;
    }
}