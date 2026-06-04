class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int[] arr=new int[128];
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            arr[ch]++;
        }
        boolean o=false;
        int sum=0;
        for(int i=0;i<128;i++)
        {
            if(arr[i]%2==0)
            {
                sum+=arr[i];
                
            } 
            else 
            {
                sum+=arr[i]-1;
                o=true;
            }
        }
        if(o)
        {
            sum++;
        }
        return sum;
    }

}