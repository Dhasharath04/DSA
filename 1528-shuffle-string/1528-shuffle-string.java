class Solution {
    public String restoreString(String s, int[] indices) {
        int n1=s.length();
        int n2=indices.length;
     char[] ch=new char[n2];
        for(int i=0;i<n2;i++)
        {
           ch[indices[i]]=s.charAt(i);

        }
        return new String(ch);
        
    }
}