class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        String str="";
        for(int i=0;i<n;i+=k)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                 sum+=s.charAt(j)-'a';
            }
            int d=sum%26;
            char ch=(char)('a'+d);
            str+=ch;
            
        }
        return str;
        
    }
}