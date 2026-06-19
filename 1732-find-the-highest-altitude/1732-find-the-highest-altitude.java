class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int srikant=-100000000;
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=0;i<n;i++)
        {
            arr[i+1]=arr[i]+gain[i];
        }
        for(int i=0;i<n+1;i++)
        {
            srikant=Math.max(srikant,arr[i]);
        }
        return srikant;
    }
}