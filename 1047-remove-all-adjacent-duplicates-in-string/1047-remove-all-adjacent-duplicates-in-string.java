class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
      int n=s.length();
      for(int i=0;i<n;i++)
       {
        if(!st.isEmpty() && s.charAt(i)==st.peek())
        {
            st.pop();
        }
        else 
        {
            st.push(s.charAt(i));
        }
       }
        StringBuilder  sb=new StringBuilder();
        for(char st1:st)
        {
            sb.append(st1);
        }
        String r=sb.toString();
       return r;

        
    }
}