class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // resultant list
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for(int i=0;i<n;i++){

            //if there are duplicate value come to the last one
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = n-1;
            while(l<r){
                int threeSum = nums[i] + nums[l] + nums[r];
                if(threeSum > 0){
                    r--;
                }else if(threeSum <0){
                    l++;
                }else{
                    // add the values to the resultant
                    List<Integer> res = new ArrayList<>();
                    res.add(nums[i]);
                    res.add(nums[l]);
                    res.add(nums[r]);
                    result.add(res);
                    // increment l to the unique last value
                    l++;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return result;
        
    }
}