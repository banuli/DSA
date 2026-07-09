class Solution {

    public void merge(int[]nums,int lo, int mid, int hi){

        int[] temp = new int[hi-lo+1];
        int i=0;

        int left = lo;
        int right = mid+1;

        while(left <= mid && right <= hi){
            if(nums[left] < nums[right]){
                temp[i] = nums[left];
                left++;
            }else{
                temp[i] = nums[right];
                right++;
            }
            i++;
        }

        // if any element is remaining
        while(left <= mid){
            temp[i] = nums[left];
            left++;
            i++;
        }

        while(right <= hi){
            temp[i] = nums[right];
            i++;
            right++;
        }

        int idx = 0;
        // populate temp value to nums
        for(int k=lo;k<=hi;k++){
            nums[k] = temp[idx];
            idx++;
        }
        return;
    }
    public void mergeSort(int[] nums,int lo, int hi){
        // base case
        if(lo >= hi) return;

        int mid = (lo+hi)/2;
        mergeSort(nums,lo,mid);
        mergeSort(nums,mid+1,hi);
        merge(nums,lo,mid,hi);


    }
    public int[] sortArray(int[] nums) {

        // use merge sort to sort an array
        mergeSort(nums,0,nums.length-1);

        return nums; 
        
    }
}