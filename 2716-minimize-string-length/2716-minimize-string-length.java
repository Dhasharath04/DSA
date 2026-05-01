class Solution {
    public int minimizedStringLength(String s) {
        int n=s.length();
        HashSet<Character> hm=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hm.add(s.charAt(i));
        }
        return hm.size();
        
    }
}