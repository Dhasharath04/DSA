class Solution {
    List<List<Integer>> d=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findsub(nums,0,new ArrayList<>());
        return d;
        
    }
    public void findsub(int nums[],int ind,ArrayList<Integer> arr)
    {
        if(ind==nums.length)
        {
            d.add(new ArrayList<>(arr));
            return;
        }
            arr.add(nums[ind]);
            findsub(nums,ind+1,arr);
            arr.remove(arr.size()-1);
            findsub(nums,ind+1,arr);
    }
}