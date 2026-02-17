class Solution {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int n=words.length;
        int n1=pattern.length();
        List<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            String str4=words[i];
    
            if(checkmap(str4,pattern))
            {
                arr.add(str4);
            }
        }
         return arr;   
    }

   
    public boolean checkmap(String str1,String pattern)
    {
        if(str1.length() !=pattern.length())
        { 
            return false;
        }
         Map<Character,Character> h1=new HashMap<>();
        Map<Character,Character> h2=new HashMap<>();
        int n4=str1.length();
        for(int i=0;i<n4;i++)
        {
            char ch1=str1.charAt(i);
            char ch2=pattern.charAt(i);
            if(h1.containsKey(ch1) && h1.get(ch1)!=ch2)
             return false;
             if(h2.containsKey(ch2) && h2.get(ch2)!=ch1)
             return false;
             h1.put(ch1,ch2);
             h2.put(ch2,ch1);
        }
        return true;
        
    }

}