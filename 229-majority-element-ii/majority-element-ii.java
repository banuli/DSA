class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        int majorElmCount = n/3;
        int val1 = 0;
        int val2 = 0;
        int count1 = 0;
        int count2 = 0;

        // at any given point there can only be
        // 2 values that can be greater than n/3;
        for(int num:nums){

            if(val1 == num){
                count1++;
            }else if(val2 == num){
                count2++;
            }else if(count1 == 0){
                val1 = num;
                count1 = 1;
            }else if(count2 == 0){
                val2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }

        // for the values in val1 and val2 get the counts
        count1 = 0;
        count2 = 0;

        for(int num:nums){
            if(val1 == num){
                count1++;
            }else if(val2 == num){
                count2++;
            }
        }

        // build the answer array
        List<Integer> ans = new ArrayList<>();
        if(count1 > majorElmCount){
            ans.add(val1);
        }
        if(count2 > majorElmCount){
            ans.add(val2);
        }
        
        return ans;
    }
}