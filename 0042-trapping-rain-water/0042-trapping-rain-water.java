class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] ls=new int[n];
        int[] rs=new int[n];
        int l=0;
        int r=0;
        for(int i=0;i<n;i++)
        {
            l=Math.max(height[i],l);
            ls[i]=l;
        }
        for(int i=n-1;i>=0;i--)
        {
            r=Math.max(height[i],r);
            rs[i]=r;
        }
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=Math.min(ls[i],rs[i])-height[i];

        }
        return s;
        
    }
}