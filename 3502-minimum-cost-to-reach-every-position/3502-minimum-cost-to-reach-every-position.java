class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        int[] arr=new int[n];
        arr[0]=cost[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i-1]>cost[i])
            {
                arr[i]=cost[i];
            }
            else
            {
                arr[i]=arr[i-1];
            }
        }
        return arr;
    }
}