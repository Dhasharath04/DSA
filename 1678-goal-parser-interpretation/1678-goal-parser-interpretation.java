class Solution {
    public String interpret(String command) {
        int n=command.length();
        String str="";
        for(int i=0;i<n;i++)
        {
            if(command.charAt(i)=='(' && command.charAt(i+1)==')')
               str+='o';
              else if(command.charAt(i)==')')
              continue;
              else if(command.charAt(i)=='(')
              continue;
              else
              str+=command.charAt(i);
               
        }
        return str;
        
    }
}