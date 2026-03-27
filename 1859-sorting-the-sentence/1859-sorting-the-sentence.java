class Solution {
    public String sortSentence(String s) {
      String[] str=s.split(" ");
      Arrays.sort(str,(a,b)->
      {
        int num1=a.charAt(a.length()-1)-'0';
        int num2=b.charAt(b.length()-1)-'0';
        return num1-num2;
      });
        int n=str.length;
          StringBuilder d=new StringBuilder();
      for(int i=0;i<n;i++)
      {
            String w=str[i].substring(0,str[i].length()-1);
            d.append(w);
            if(i!=str.length-1)
            {
                d.append(" ");
            }
      }
      return d.toString();
      }
        
    }
