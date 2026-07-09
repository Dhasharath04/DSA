class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=distance.length;
       if(start>destination)
       {
        int temp=start;
        start=destination;
        destination=temp;
       }
       int t=0;
       int c=0;
       for(int i=0;i<n;i++)
        {
            t+=distance[i];
            if(i>=start && i<destination)
            {
                c+=distance[i];
            }
        }
        return Math.min(c,t-c);

        
    }
}