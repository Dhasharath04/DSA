class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println(words[i]);
            String str=words[i];
            int d=str.length();
            for(int j=0;j<d;j++)
            {
                if(str.charAt(j)==x)
                {
                    arr.add(i);
                    break;
                }
            }
        }
        return arr;
    }
}