class Solution {
    public int bitwiseComplement(int n) {
    String b1=Integer.toBinaryString(n);
    int num=b1.length();
    String str="";
    for(int i=0;i<num;i++)
    {
        if(b1.charAt(i)=='0')
        {
            str+='1';
        }
        else
        {

        
        str+='0';
        }
    }
    int num1=Integer.parseInt(str,2);
    return num1;
        
    }
}