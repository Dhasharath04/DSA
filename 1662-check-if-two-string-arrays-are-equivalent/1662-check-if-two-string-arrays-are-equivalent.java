class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1=word1.length;
        int n2=word2.length;
        String str1="";
        for(int i=0;i<n1;i++)
        {
                 str1+=word1[i];
        }
        String str2="";
        for(int i=0;i<n2;i++)
        {
           str2+=word2[i];
        }
int l1=str1.length();
int l2=str2.length();
if(l1!=l2)
{
    return false;
}
       for(int i=0;i<l1;i++)
       {
        char ch1=str1.charAt(i);
        char ch2=str2.charAt(i);
        if(ch1!=ch2)
        {
            return false;
        }
       }
       return true;
        
    }
}