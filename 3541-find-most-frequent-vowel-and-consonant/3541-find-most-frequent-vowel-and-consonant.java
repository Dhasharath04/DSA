class Solution {
    public int maxFreqSum(String s) {
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int m1=0;
        int m2=0;
        for(int i=0;i<26;i++)
        {
            char ch=(char)(i+'a');
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                 m1=Math.max(m1,arr[i]);
            }
            else{
                m2=Math.max(m2,arr[i]);
            }
        }
        
        return m1+m2;
    }
}