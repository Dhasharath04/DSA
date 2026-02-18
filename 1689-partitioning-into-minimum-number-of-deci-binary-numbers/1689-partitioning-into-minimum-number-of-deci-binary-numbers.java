class Solution {
    public int minPartitions(String n) {
        int n1=n.length();
        int[] arr=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr[i]=n.charAt(i)-'0';
        }
        Arrays.sort(arr);
        return arr[n1-1];
        
    }
}