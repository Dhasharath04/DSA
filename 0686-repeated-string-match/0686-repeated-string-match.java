class Solution {
    public int repeatedStringMatch(String a, String b) {
        // int n=b.length();
        // String str="";
        // int count=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(str.contains(b))
        //     {
        //         return count;
             
        //     }
        //     else
        //     {
        //         count++;
        //         str+=a;
        //     }
        //     System.out.println(count);
        //     System.out.println(str);
        // }
        // return count;
        StringBuilder db=new StringBuilder();
       int count=0;
       while(db.length()<b.length())
       {
         db.append(a);
          count++;
       }
       if(db.toString().contains(b))
       {
        return count;
       }
       db.append(a);
       count++;
       if(db.toString().contains(b))
       {
        return count;
       }
       return -1;
        
        
    }
}