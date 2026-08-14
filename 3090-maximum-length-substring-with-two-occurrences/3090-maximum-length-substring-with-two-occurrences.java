class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int[] arr=new int[26];
        int l=0;
        int m=0;
        for(int i=0;i<n;i++)
        {
            int d=s.charAt(i)-'a';
            arr[d]++;
            while(arr[d]>2)
            {
                int d1=s.charAt(l)-'a';
                arr[d1]--;
                l++;
            }
            m=Math.max(m,i-l+1);
        }
        return m;
    }
}