class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] arr=new int[n+1];
        int max1=-1000000;
        arr[0]=0;
        for(int i=0;i<n;i++)
        {
           arr[i+1]=arr[i]+gain[i];
        }
        for(int i=0;i<n+1;i++)
        {
            max1=Math.max(arr[i],max1);
        }
        return max1;
        
    }
}