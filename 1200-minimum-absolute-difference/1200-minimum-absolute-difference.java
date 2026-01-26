class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int max1=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            max1=Math.min(max1,arr[i]-arr[i-1]);
        }
                List<List<Integer>> arr1=new ArrayList<>();

        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1]==max1)
            {
                arr1.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return arr1;

        
    }
}