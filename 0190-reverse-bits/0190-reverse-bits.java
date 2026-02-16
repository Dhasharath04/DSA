class Solution {
    public int reverseBits(int n) {
        String str=Integer.toBinaryString(n);
        System.out.println(str);
        while(str.length()<32)
        {
            str="0"+str;
        }
        String str1=new StringBuilder(str).reverse().toString();
        int d1=0;
        int n1=str1.length();
        for(int i=0;i<n1;i++) 
        {
            d1=d1*2+(str1.charAt(i)-'0');
        }   
        return d1; 
    }
}