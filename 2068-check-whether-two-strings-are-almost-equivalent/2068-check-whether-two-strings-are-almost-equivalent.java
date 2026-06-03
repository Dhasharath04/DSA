class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int[] a1=new int[26];
        int[] a2=new int[26];
        for(int i=0;i<n1;i++)
        {
            char ch1=word1.charAt(i);
            a1[ch1-'a']++;
        }
        for(int i=0;i<n1;i++)
        {
            char ch2=word2.charAt(i);
            a2[ch2-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            int d=Math.abs(a1[i]-a2[i]);
            if(d>3)
            {
                return false;
            }
        }
        return true;
    }
}