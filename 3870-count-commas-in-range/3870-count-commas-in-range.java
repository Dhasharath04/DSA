class Solution {
    public int countCommas(int n) {
        int d=0;
        if(n>999 && n<=100000)
        {
           d+=n-999;
        }
        // else
        // {
        //     d+=n-999;
        // }
        return d;
    }
}