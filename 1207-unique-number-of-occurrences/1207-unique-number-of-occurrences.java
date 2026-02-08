class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        Map<Integer,Integer> arr1=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr1.put(arr[i],arr1.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> st=new HashSet<>();
       for(int val:arr1.values())
       {
        if(!st.add(val))
        {
            return false;
        }
       }
       return true;
        
    }
}