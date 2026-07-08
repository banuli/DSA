class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public void genPermute(int[]nums, HashSet<Integer> hs,List<Integer> set){
        if(set.size() == nums.length){
            result.add(new ArrayList<>(set));
            return;
        }

        for(int val:nums){
            if(!hs.contains(val)){
                set.add(val);
                hs.add(val);
                genPermute(nums,hs,set);
                set.remove(set.size()-1);
                hs.remove(val);

            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> set = new ArrayList<>();
        genPermute(nums,hs,set);

        return result;
        
    }
}