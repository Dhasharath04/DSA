class Solution {
    public List<String> stringSequence(String target) {
        int n=target.length();
        ArrayList<String> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append('a');
            arr.add(sb.toString());
            while(sb.charAt(sb.length()-1)!=target.charAt(i))
            {
                char l=sb.charAt(sb.length()-1);
                sb.setCharAt(sb.length()-1,(char)(l+1));
                arr.add(sb.toString());
            }
        }
        return arr;
        
        
    }
}