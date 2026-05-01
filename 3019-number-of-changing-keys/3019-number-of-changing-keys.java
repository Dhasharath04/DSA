class Solution {
    public int countKeyChanges(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            int num1=s.charAt(i);
             int num2=s.charAt(i+1);
             int num3=Math.abs(num1-num2);
             if((num1<=num2 ||num1>=num2) && num3!=32 && num3!=0)
             {
                count++;
             }
             

        }
       return count;
        

        
    }
}