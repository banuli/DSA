class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void genSets(int[] nums, int idx, List<Integer> l){
        
        if(idx == nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }

        l.add(nums[idx]);
        genSets(nums,idx+1,l);

        // undo
        l.remove(l.size()-1);
        genSets(nums,idx+1,l);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> l = new ArrayList<>();
        genSets(nums,0,l);
        return ans;
    }
}