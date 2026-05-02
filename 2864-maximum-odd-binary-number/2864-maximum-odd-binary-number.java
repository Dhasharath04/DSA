class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        System.out.println(count);
        int n1=n-count;
        String str="";
        for(int i=0;i<=count-2;i++)
        {
            str+='1';
            System.out.println(str);
        }
        for(int i=0;i<n1;i++)
        {
            str+='0';
        }
        str+='1';
        return str;
        
    }
}