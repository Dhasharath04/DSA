class Solution {
    public String makeFancyString(String s) {
        
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            int d=sb.length();
            if(d>=2&&sb.charAt(d-1)==ch&&
            sb.charAt(d-2)==ch)
            {
                continue;
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}