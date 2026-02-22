class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        Map<Character,Integer> mp=new HashMap<>();
      for(int i=0;i<n;i++)
      {
        char ch=s.charAt(i);
        mp.put(ch,mp.getOrDefault(ch,0)+1);

      }
      List<Character> arr=new ArrayList<>(mp.keySet());
      Collections.sort(arr,(a,b)->mp.get(b)-mp.get(a));
      StringBuilder sb=new StringBuilder();
      for(char ch1:arr)
      {
        int f=mp.get(ch1);
        for(int i=0;i<f;i++)
        {
            sb.append(ch1);
        }
      }
        

        return sb.toString();
        
    }
}