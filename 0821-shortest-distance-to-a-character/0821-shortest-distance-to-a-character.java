class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] arr1=new int[n];  
        List<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(c==s.charAt(i))
            {
                a.add(i);
            }
        }
    int[] arr2=new int[a.size()];
        int r=0;
        for(int d:a)
        {
            arr2[r++]=d;
        }
        
        for(int i=0;i<n;i++)
        {
            int ma=Integer.MAX_VALUE;
           for(int j=0;j<arr2.length;j++)
           {
            ma=Math.min(ma,Math.abs(i-arr2[j]));
           }
           arr1[i]=ma;
        }
        return arr1;
    }
}