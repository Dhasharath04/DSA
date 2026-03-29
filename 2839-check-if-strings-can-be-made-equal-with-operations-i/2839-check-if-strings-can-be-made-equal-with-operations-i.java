class Solution {
    public boolean canBeEqual(String s1, String s2) {
        // int n=s1.length();
        // for(int i=1;i<n;i++)
        // {
        //     int n1=Math.abs(s2.charAt(i-1)-s2.charAt(i));
        //     System.out.println(n1);
        //     if(n1!=1 && n1!=3)
        //     {
        //         return false;
        //     }
        // }
        // return true;
        char[] b1={s1.charAt(0),s1.charAt(2)};
        char[] d1={s1.charAt(1),s1.charAt(3)};
         char[] b2={s2.charAt(0),s2.charAt(2)};
        char[] d2={s2.charAt(1),s2.charAt(3)};
        Arrays.sort(b1);
        Arrays.sort(d1);
        Arrays.sort(b2);
        Arrays.sort(d2);
        return Arrays.equals(b1,b2)&& Arrays.equals(d1,d2);


        
        
    }
}