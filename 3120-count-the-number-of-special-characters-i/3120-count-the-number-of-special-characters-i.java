class Solution {
    public int numberOfSpecialChars(String word) {
        int n=word.length();
        boolean[] arr1=new boolean[26];
        boolean[] arr2=new boolean[26];

        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z')
            {
                arr1[ch-'a']=true;
            }
            else if(ch>='A' && ch<='Z')
            {
                arr2[ch-'A']=true;
            }
        }
        int c=0;
        for(int i=0;i<26;i++)
        {
            if(arr1[i]&&arr2[i])
            {
                c++;
            }
        }
        return c;
    }
}