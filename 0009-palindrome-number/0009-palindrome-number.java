class Solution {
    public boolean isPalindrome(int x) {
        // String s=String.valueOf(x);
        // int l=0;
        // int r=s.length()-1;
        // while(l<r)
        // {
        //     if(s.charAt(l)!=s.charAt(r))
        //     {
        //         return false;
        //     }
        // }
        // return true;
        if(x<0) return false;
        int d=x;
        int rev=0;
        while(x>0)
        {
            int d1=x%10;
            rev=rev*10+d1;
            x=x/10;
        }
        if(d!=rev)
        {
            return false;
        }
        return true;

        
    }
}