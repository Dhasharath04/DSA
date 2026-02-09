class Solution {
    private boolean ispalindromic(String s)
    {
        String str=new StringBuilder(s).reverse().toString();
        if(s.equals(str))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
    public String firstPalindrome(String[] words) {
        int n1=words.length;
        String str2="";
        for(int i=0;i<n1;i++)
        {
            if(ispalindromic(words[i]))
            {
                str2+=words[i];
                break;
                
            }
        }
        return str2;
    }
}