class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        StringBuilder str=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++)
        {
            st.push(i+1);
            if(i==n||pattern.charAt(i)=='I')
            {
                while(!st.isEmpty())
                {
                    str.append(st.pop());
                }
            }
        }  
        return str.toString();      
    }
}