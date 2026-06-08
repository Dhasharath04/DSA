class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int d=0;
        int l=0;
        Set<Character> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            if(!st.contains(c))
            {
                st.add(c);
                 d=Math.max(d,i-l+1);
            }
            else{
            while(st.contains(c))
            {
                st.remove(s.charAt(l));
                l++;
            }
           st.add(c);
            }
        }
        
        return d;
    }
}