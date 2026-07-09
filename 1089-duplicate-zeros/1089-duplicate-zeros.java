class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
       List<Integer> arr1=new ArrayList<>();
       for(int i=0;i<n && arr1.size()<n;i++)
       {
        arr1.add(arr[i]);
         if(arr[i]==0 && arr1.size()<n)
         {
            arr1.add(0);
         } 
       }
       for(int i=0;i<n;i++)
       {
        arr[i]=arr1.get(i);
       }
    }
}