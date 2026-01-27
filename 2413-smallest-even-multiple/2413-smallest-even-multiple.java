class Solution {
    public int smallestEvenMultiple(int n) {
        if(n%2==0)
        {
           return Math.max(n,2);
        }
        else
         return n*2;
        
    }
}