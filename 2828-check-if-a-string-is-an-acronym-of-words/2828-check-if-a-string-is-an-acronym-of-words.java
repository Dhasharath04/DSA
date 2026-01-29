class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n=words.size();
        int n1=s.length();
        if(n!=n1)
        {
            return false;
        }
        String str1="";
        for(String str:words)
        {
            char ch=str.charAt(0);
            str1+=ch;
        }
        if(s.equals(str1))
        {
            return true;
        }
        
        return false;
        
    }
}