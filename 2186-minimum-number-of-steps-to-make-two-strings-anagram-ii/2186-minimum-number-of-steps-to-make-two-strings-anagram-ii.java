class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        int n1=s.length();
        int n2=t.length();
        for(int i=0;i<n1;i++)
        {
            int n=s.charAt(i)-'a';
            arr[n]++;
        }
        for(int i=0;i<n2;i++)
        {
            int d=t.charAt(i)-'a';
            arr[d]--;
        }
        int sum=0;
        for(int i=0;i<26;i++)
        {
            System.out.println(arr[i]);
            sum+=Math.abs(arr[i]-0);
        }
        return sum;
        
    }
}