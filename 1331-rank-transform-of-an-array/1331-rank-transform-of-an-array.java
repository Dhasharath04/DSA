class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] arr2=arr.clone();
        Arrays.sort(arr2);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int r=1;
        for(int n1:arr2)
        {
            if(!hm.containsKey(n1))
            {
                hm.put(n1,r++);
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=hm.get(arr[i]);
        }
            return arr;
       
        
        
    }
}