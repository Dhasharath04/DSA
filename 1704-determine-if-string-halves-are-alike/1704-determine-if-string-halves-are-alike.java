class Solution {
       boolean isvowel(char s1)
        {
        return (s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u'||s1=='A'||s1=='I'||s1=='O'||s1=='E'||s1=='U');
        
           
        }
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count1=0;
        int count2=0;
        for(int i=0;i<n/2;i++)
       {
        char str=s.charAt(i);
        if(isvowel(str))
        {
            count1++;
        }
       }  
       for(int i=n/2;i<n;i++)
       {
        char str2=s.charAt(i);
        if(isvowel(str2))
        {
            count2++;
        }
       }   
       if(count1!=count2)
       {
        return false;
       }
       return true;
       
        
    }
}