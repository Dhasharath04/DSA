class Solution {
    public int partitionString(String s) {
        int n=s.length();
        int count=1;
        int[] arr=new int[26];
        for(int i=0;i<n;i++)
        {
            int ch=s.charAt(i)-'a';
          if(arr[ch]==1)
          {
            count++;
            arr=new int[26];
          }
          arr[ch]=1;
        }
       return count;
        
    }
}