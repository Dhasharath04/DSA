class Solution {
    public String freqAlphabets(String s) {
        int n=s.length();
        
        StringBuilder sb=new StringBuilder();
    for(int i=n-1;i>=0;i--)
    {
        int d;
        if(s.charAt(i)=='#')
        {
             d=((s.charAt(i-2)-'0')*10)+(s.charAt(i-1)-'0');
            i-=2;
        }
        else
        {
           d=s.charAt(i)-'0'; 
        }
        char d1=(char)(d+96);
        sb.append(d1);

    }
    return sb.reverse().toString();

        
    }
}