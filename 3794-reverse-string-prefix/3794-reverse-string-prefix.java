class Solution {
    public String reversePrefix(String s, int k) {
        int n=s.length();
        String str="";
        for(int i=k-1;i>=0;i--)
        {
            str=str+s.charAt(i);
        }
        String str2=s.substring(k,n);
        str=str+str2;
        return str;
        
    }
}