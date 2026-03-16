class Solution {
    public int finalValueAfterOperations(String[] o) {
        int n=o.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            System.out.println(o[i]);
            if(o[i].equals("++X")||o[i].equals("X++"))
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return count;
        
    }
}