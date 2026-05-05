class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        String str="";
        for(int i=0;i<n;i++)
        {
            char ch1=s.charAt(i);
            if(str.contains(String.valueOf(ch1))){
                return ch1;
            }
            str+=ch1;
            
        }
        return ' ';
        
    }
}