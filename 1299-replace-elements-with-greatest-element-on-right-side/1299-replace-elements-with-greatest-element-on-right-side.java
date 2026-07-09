class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max1=-1;
    int[] arr1=new int[n];
    for(int i=0;i<n;i++)
    {
         for(int j=i+1;j<n;j++)
         {
            if(max1<arr[j])
            {
                max1=arr[j];
            }
         }
        
         arr1[i]=max1;
         max1=-1;
    }
    return arr1;
        
    }
}