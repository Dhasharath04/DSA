class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
       StringBuilder str=new StringBuilder();
        for(int i=0;i<n;i++)
        { 
            if(i%2==0)
        {
            str.append(s.charAt(i));
        }
        else{
            
            int n1=s.charAt(i)-'0';
            // str.append(s.charAt(i-1));
            char ch=(char)(s.charAt(i-1)+n1);
            str.append(ch);
            
        }
        }
        
        return str.toString();
        
    }
}