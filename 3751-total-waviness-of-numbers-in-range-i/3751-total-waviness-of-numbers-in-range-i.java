class Solution {
    public int totalWaviness(int num1, int num2) {
        int a=0;
        for(int j=num1;j<=num2;j++)
        {
            a+=wee(j);
        }
        return a;
        
    }
    private int wee(int num)
    {
        int count=0;
        String str=String.valueOf(num);
        if(str.length()<3)
        {
            return 0;
        }
            for(int i=1;i<str.length()-1;i++)
            {
                int pr=str.charAt(i-1);
                int cu=str.charAt(i);
                int ne=str.charAt(i+1);
                if(cu>pr&& cu>ne)
                {
                    count++;
                }
                else if(cu<pr && cu<ne)
                {
                    count++;
                }
            }
        
        return count;
    }
}