class Solution {
    private boolean isvowel(char ch)
      {
        return ((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U'));
      }
    public String sortVowels(String s) {
        int n=s.length();
        ArrayList<Character> a=new ArrayList<>();
      for(int i=0;i<n;i++)
      {
        char d=s.charAt(i);
        if(isvowel(d))
        {
            a.add(d);
        }
      }
      Collections.sort(a);

       StringBuilder sb=new StringBuilder();
        int j=0;

      for(int i=0;i<n;i++)
      {
        char d1=s.charAt(i);
        if(isvowel(d1))
        {
            sb.append(a.get(j));
            j++;
        }
        else{
        sb.append(d1);
        }


      }
        

        
       return sb.toString();
        
    }
}