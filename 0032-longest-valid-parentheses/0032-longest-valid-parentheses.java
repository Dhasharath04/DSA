class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int max1=0;
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(i);
            }
            else {
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }
                else
                {
                    int max11=i-st.peek();
                   max1=Math.max(max1,max11);
                }
            }
            
        }
        return max1;
        
    }
}