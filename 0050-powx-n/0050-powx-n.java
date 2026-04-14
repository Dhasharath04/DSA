class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long N = n;  
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        while (0 < N){
            if (N % 2 == 1) {
                ans = ans * x;
                N=N-1;
            }
            x = x * x;
            N = N / 2;
        }
        return ans;
    }
}