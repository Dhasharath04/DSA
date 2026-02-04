class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int n=Math.min(n1,n2);
        String str="";
        for(int i=0;i<n;i++)
        {
            str+=word1.charAt(i);
            str+=word2.charAt(i);
        }
        if(n<n2)
        {
            for(int i=n;i<n2;i++)
            {
                str+=word2.charAt(i);
            }
        }
        else{
            for(int i=n;i<n1;i++)
            {
                str+=word1.charAt(i);
            }
        }
        return str;
        
    }
}