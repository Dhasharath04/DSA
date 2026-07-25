class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0)
        {
            int d=n%10;
                arr.add(d);
            n=n/10;
        }
        Collections.sort(arr);
        int n1=arr.size();
        int d1=arr.get(n1-1);
        int d2=arr.get(n1-2);
        return d1*d2;
        
    }
}