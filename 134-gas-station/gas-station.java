class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = cost.length;

        //if cost is more than gas return -1
        int totalCost = 0;
        int totalGas = 0;
        for(int i=0;i<n;i++){
            totalCost += cost[i];
            totalGas += gas[i];
        }

        if(totalCost > totalGas) return -1;

        // else find the index where we have a positive index
        int runningGas = 0;
        int index = 0;
        for(int i=0;i<n;i++){

            runningGas += gas[i]-cost[i];
            if(runningGas < 0){
                runningGas = 0;
                index = i+1;
            }
        }
        return index;
    }
}