class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;

        // if toal gas  < total cost return -1
        int totalGas = 0;
        int totalCost = 0;
        for(int i=0;i<n;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if(totalGas < totalCost) return -1;

        int runningGas = 0;
        int idx = 0;
        for (int i=0;i<n;i++){
            runningGas += gas[i] - cost[i];

            if(runningGas < 0){
                runningGas = 0;
                idx = i+1;
            }
        }


        return idx;
    }
}