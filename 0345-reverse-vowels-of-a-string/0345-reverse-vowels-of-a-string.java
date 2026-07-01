class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> ch1=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(strv(ch))
            {
                ch1.add(ch);
            }
        }
        Collections.reverse(ch1);
        int j=0;
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(strv(ch))
            {
                sb.append(ch1.get(j++));
            }
            else 
            {
                sb.append(ch);
            }
        }
        return sb.toString();

        
        
    }
    boolean strv(char s1)
    {
        if(s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u'||s1=='A'||s1=='E'||s1=='I'||s1=='O'||s1=='U')
        {
            return true;
        }
        return false;
    }
}