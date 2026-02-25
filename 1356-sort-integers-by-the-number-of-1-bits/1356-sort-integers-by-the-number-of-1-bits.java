class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
    //     Map<Integer,Integer> hm=new HashMap<>();
    //     int[] arr2=new int[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         String str=Integer.toBinaryString(arr[i]);
    //         int count=0;
    //         int d1=str.length();
    //         for(int j=0;j<d1;j++)
    //         {
    //             if(str.charAt(j)=='1')
    //             {
    //                 count++;
    //             }
    //         }
    //        hm.put(arr[i],count);
    //     }
    //     List<Map.Entry<Integer,Integer>> l11=new ArrayList<>(hm.entrySet());
    //     l11.sort((a,b)->
    //     {
    //         if(!a.getValue().equals(b.getValue()))
    //         return a.getValue()-b.getValue();
    //         return a.getKey()-b.getKey();
    // });
    //     int k=0;
    //     for(Map.Entry<Integer,Integer>  e:l11)
    //     {
    //         arr2[k++]=e.getKey();
    //     }
    //     return arr2;
      Integer[] arr1=new Integer[n];
      for(int i=0;i<n;i++)
      {
        arr1[i]=arr[i];
      }
      Arrays.sort(arr1,(a,b)->
      {
        int b1=Integer.bitCount(a);
        int b2=Integer.bitCount(b);
        if(b1!=b2)
        return b1-b2;
        return a-b;
      });
      for(int i=0;i<n;i++)
      {
        arr[i]=arr1[i];
      }

        return arr;
    }
}