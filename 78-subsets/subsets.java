class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void generateSubsets(int[] nums, int idx, List<Integer> set){
        // base case
        if(idx == nums.length){
            result.add(new ArrayList<>(set));
            return;
        }

        // include the index value
        set.add(nums[idx]);
        generateSubsets(nums,idx+1,set);

        //do not incude the index value
        set.remove(set.size()-1);
        generateSubsets(nums,idx+1,set);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> set = new ArrayList<>();
        generateSubsets(nums,0,set);

        return result;


        
    }
}