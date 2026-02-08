class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> l=new ArrayList<>();
        int max1=0;
        for(int i=0;i<n;i++)
        {
           max1=Math.max(max1,candies[i]);

        }
        System.out.println(max1);
        for(int i=0;i<n;i++)
        {
            int d=candies[i]+extraCandies;

            if(d>=max1)
            {
                l.add(true);
            }
            else
            {
            l.add(false);
            }
        }
        return l;
    
    }
}