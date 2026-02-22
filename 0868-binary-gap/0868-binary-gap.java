class Solution {
    public int binaryGap(int n) {
        String str=Integer.toBinaryString(n);
        int count=-1;
        int max1=0;
        int n1=str.length();
        for(int i=0;i<n1;i++)
        {
            char ch=str.charAt(i);
            if(ch=='1')
            {
                if(count!=-1)
                {
                     max1=Math.max(max1,i-count);
                }
                count=i;
            }  
        }
        return max1; 
    }
}