class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n=arr.length;
        int[] arr1=new int[n];
        Arrays.sort(arr);
      
        arr1[0]=1;
        // int j=1;
        for(int i=1;i<n;i++)
        {
            if(Math.abs(arr[i]-arr[i-1])<=1 && Math.abs(arr[i]-arr1[i-1])<=1 )
            {
                arr1[i]=arr[i];
            }
            else
            {
                arr1[i]=arr1[i-1]+1;
                System.out.println(arr1[i]);
            }
        } 
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr1[i]);
        // }
        return arr1[n-1];       
    }
}