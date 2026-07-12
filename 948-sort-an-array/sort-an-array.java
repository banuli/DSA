class Solution {
    public void merge(int[] nums, int lo, int mid,int hi){
        int[] temp = new int[hi-lo+1];
        int idx = 0;

        int left = lo;
        int right = mid+1;

        while(left <= mid && right <=hi){
            if(nums[left] < nums[right]){
                temp[idx] = nums[left];
                left++;
            }else{
                temp[idx] = nums[right];
                right++;
            }
            idx++;
        }

        while(left <= mid){
            temp[idx] = nums[left];
            idx++;
            left++;
        }

        while(right <=hi){
            temp[idx] = nums[right];
            idx++;
            right++;
        }

        idx = 0;
        for(int i=lo;i<=hi;i++){
            nums[i] = temp[idx];
            idx++;
        }    
        return;

    }

    public void mergeSort(int[]nums, int lo,int hi){
        // base case
        if(lo >= hi){
            return;
        }
        int mid = (lo + hi)/2;

        mergeSort(nums,lo,mid);
        mergeSort(nums,mid+1,hi);

        merge(nums,lo,mid,hi);
        
    }
    public int[] sortArray(int[] nums) {

        mergeSort(nums,0,nums.length-1);

        return nums;
        
    }
}