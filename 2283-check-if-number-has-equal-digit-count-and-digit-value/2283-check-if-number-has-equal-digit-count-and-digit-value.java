class Solution {
    public boolean digitCount(String num) {
        int n=num.length();
        int[] arr=new int[10];
        for(int i=0;i<n;i++)
        {
            char ch=num.charAt(i);
            arr[ch-'0']++;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=num.charAt(i)-'0')
            {
                return false;
            }
        }
        return true;
        
    }
}