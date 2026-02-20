class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     arr[i]=height[i];
        // }
        // int max1=0;
        // int max2=0;
        // for(int i=0;i<n;i++)
        // {
        //     max1=Math.max(max1,height[i]);
        //     if(max2<max1)
        //     {
        //     max2=max1;
        //     }
        // }
        // System.out.println(max1);
        // System.out.println(max2);
        // int max3=Math.min(max1,max2);
        // return max3*max3;
        int l=0;
        int r=n-1;
        int max1=0;
        while(l<r)
        {
            int h=Math.min(height[l],height[r]);
            int h1=r-l;
            int g=h*h1;
            max1=Math.max(g,max1);
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return max1;

    }
}