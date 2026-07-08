class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void genSubset(int[] nums, int idx, List<Integer> set){
        if(idx == nums.length){
            result.add(new ArrayList<>(set));
            return;
        }

        // add the value in idx
        set.add(nums[idx]);
        genSubset(nums,idx+1,set);

        // do not add the value in idx
        set.remove(set.size()-1);
        while(idx+1 < nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }
        genSubset(nums,idx+1,set);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> set = new ArrayList<>();
        genSubset(nums,0,set);

        return result;
        
    }
}