class Solution {
    public int countSeniors(String[] details) {
        int n=details.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            int  ch1=details[i].charAt(11)-'0';
            int ch2=details[i].charAt(12)-'0';
            int num1=ch1*10;
            int num2=num1+ch2;
            if(num2>60)
            {
                count++;
            }

        }
        return count;
        
    }
}