class Solution {
    public int maxChunksToSorted(int[] arr) {

        int maxchunks = 0;
        int idxprefix = 0; // prefix the index values
        int arrprefix = 0; // prefix the arr values

        // if idxprefix == arrprefix then thata one chunk that can be sorted
        for(int i=0; i < arr.length;i++){

            idxprefix += i;
            arrprefix += arr[i];

            if(idxprefix == arrprefix){
                maxchunks++;
            }
        }
        return maxchunks;
        
        
    }
}