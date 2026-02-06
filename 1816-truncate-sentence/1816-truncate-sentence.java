class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
     StringBuilder str1=new StringBuilder();
        for(int i=0;i<k;i++)
        {
           if(i>0)
           {
            str1.append(" ");
           }
           str1.append(str[i]);
        }
        return str1.toString();
        
    }
}