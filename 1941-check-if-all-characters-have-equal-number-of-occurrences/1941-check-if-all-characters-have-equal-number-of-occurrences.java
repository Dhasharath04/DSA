class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int[] arr=new int[26];
        for(int i=0;i<n;i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        int n1=s.charAt(0)-'a';
        int s1=arr[n1];
        
        for(int i=0;i<26;i++)
    {
        if(arr[i]!=0 && arr[i]!=s1)
        
            return false;
        
    }
    return true;
    
        
    }
}