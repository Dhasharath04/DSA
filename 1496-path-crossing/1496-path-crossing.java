class Solution {
    public boolean isPathCrossing(String path) {
        int n=path.length();
        // int c1=0; int c3=0;
        // int c2=0; int c4=0;
        // if(n<4)
        // {
        //     return false;
        // }
        // for(int i=0;i<n;i++)
        // {
        //     char ch=path.charAt(i);
        //     if(ch=='N')
        //     {
        //         c1++;
        //     }
        //     else if(ch=='S')
        //     {
        //         c2++;
        //     }
        //     else if(ch=='E')
        //     {
        //         c3++;
        //     }
        //     else
        //     {
        //         c4++;
        //     }
        // }
        // System.out.println(c1);
        //  System.out.println(c2);
        //   System.out.println(c3);
        //    System.out.println(c4);
        //    if(n==3)
        //    {
        //     return false;
        //    }
        // if((c1==0 || c2==0) && (c3==0 || c4==0))
        // {
        //       return false;
        // }
        // int d1=Math.min(c1,c2);
        // int d2=Math.min(c3,c4);
        // if((c1>=d1 && c2>=d1)&&(c3>=d2&&c4>=d2))
        // {
        //     return true;
        // }
        // return false;
        Set<String> hs=new HashSet<>();
          hs.add("0,0");
          int c1=0;
          int c2=0;
          for(int i=0;i<n;i++)
          {
            char ch=path.charAt(i);
             if(ch=='N')
            {
                c1++;
            }
            else if(ch=='S')
            {
                c1--;
            }
            else if(ch=='E')
            {
                c2++;
            }
            else
            {
                c2--;
            }
            String p=c1+","+c2;
            if(hs.contains(p))
            {
                return true;
            }
            else
            {
                hs.add(p);
            }
              
          }
          return false;
        
    }
}