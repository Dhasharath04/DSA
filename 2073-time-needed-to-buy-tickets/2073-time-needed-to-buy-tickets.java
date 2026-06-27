class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n=tickets.length;
        // Arrays.sort(tickets);
        // int d=tickets[n-1];
        int d=0;
        for(int i=0;i<n;i++)
        {
            if(i<=k)
            {
              d+=Math.min(tickets[k],tickets[i]);  
            }else
            {
                d+=Math.min(tickets[i],tickets[k]-1);
            } 
        }
        // int s=0;
        // for(int i=0;i<n;i++)
        // {
        //     s+=tickets[i];
        // }
        // System.out.println(s);
        // System.out.println(d);
        // System.out.println(tickets[k]);
        // if(d==tickets[k])
        // {
        //     return s;
        // }
        // return s-1;
        return d;
    }
}