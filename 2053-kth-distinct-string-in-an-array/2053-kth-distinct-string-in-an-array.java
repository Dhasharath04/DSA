class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
        Map<String,Integer> h=new HashMap<>();
        for(String str:arr)
        {
            h.put(str,h.getOrDefault(str,0)+1);
        }
        int count=0;
        for(String str1:arr)
        {
            if(h.get(str1)==1)
            {
                count++;
                if(count==k)
                {
                    return str1;
                }
            }
        }
        return "";

        
    }
}