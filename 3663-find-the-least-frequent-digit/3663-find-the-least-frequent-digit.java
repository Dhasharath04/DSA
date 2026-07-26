class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] arr=new int[10];
        while(n>0)
        {
            int d=n%10;
            arr[d-0]++;
            n=n/10;
        }
        int j=1;
        while(j<=10)
        {
             for(int i=0;i<10;i++)
             {
                if(arr[i]==j)
                {
                    return i;
                   
                }
             }
             j++;
        }
        return -1;
        
    }
}