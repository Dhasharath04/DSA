class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int d=n/2;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(candyType[i]);
        }
        if(hs.size()<=d)
        {
            return hs.size();
        }
        return d;
    }
}