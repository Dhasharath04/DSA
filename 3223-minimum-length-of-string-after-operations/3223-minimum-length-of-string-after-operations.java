class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int[] arr=new int[26];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            int n1=s.charAt(i)-'a';
            arr[n1]++; 
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==0) continue;
            if(arr[i]%2==0)
            {
                sum+=2;
            }
            else{
                sum+=1;
            }
        }
        return sum;
        
    }
}