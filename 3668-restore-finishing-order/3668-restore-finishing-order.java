class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int m=order.length;
        int[] arr=new int[n];
        int k=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                // System.out.println(order[i]);
                //  System.out.println(friends[j]);
                if(order[i]==friends[j])
                {
                    System.out.println(order[i]);
                 System.out.println(friends[j]);
                        arr[k++]=friends[j];
                }
                
            }
        }
        return arr;
    }
}