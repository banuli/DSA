class Solution {
    public String largestNumber(int[] nums) {
        // first convert this to a string array
        int n =  nums.length;
        String[] sNums = new String[n];

        for(int i=0;i<n;i++){
            sNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(sNums,(a,b) -> (b+a).compareTo(a+b) );

        StringBuilder sb = new StringBuilder();
        for(String s:sNums){
            sb.append(s);
        }


        return sb.charAt(0) == '0'? "0" : sb.toString();
        
    }
}