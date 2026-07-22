class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            // if((colors[i]==1&&colors[i+1]==0) ||(colors[i]==0&&colors[i+1]==1))
            // {
            //     count++;
            // }
            // else
            // {
            // count=1;
            // }
            // System.out.println(count);
            // max=Math.max(max,count);
        int a=colors[i];
        int b=colors[(i+1)%n];
        int c=colors[(i+2)%n];
        if(a!=b && b!=c)
        {
            count++;
        }

        }
        return count;
    }
}