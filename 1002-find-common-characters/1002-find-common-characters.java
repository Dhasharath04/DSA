class Solution {
    public List<String> commonChars(String[] words) {
        int n=words.length;
        int[] c=new int[26];
        for(char ch:words[0].toCharArray())
        {
            c[ch-'a']++;
        }
        for(int i=1;i<n;i++)
        {
            int[] f=new int[26];
            for(char ch:words[i].toCharArray())
            {
                f[ch-'a']++;
            }
            for(int j=0;j<26;j++)
            {
                c[j]=Math.min(c[j],f[j]);
            }
        }
        List<String> str=new ArrayList<>();
        for(int i=0;i<26;i++)
        {
            while(c[i]>0)
            {
                str.add(String.valueOf((char)('a'+i)));
                c[i]--;
            }
        }

        return str;
    }
}