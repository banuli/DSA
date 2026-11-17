class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalGas = 0;
        int totalCost = 0;
        int n = gas.length;

        for(int i=0;i<n;i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }

        // if the cost is greater than gas return -1
        if(totalCost > totalGas) return -1;

        // get the starting point
        int start = 0;
        int runningGas = 0;

        for(int i=0;i<n;i++){
            runningGas += gas[i] - cost[i];

            // if cost is greater than gas set it gas back to 0
            if(runningGas  < 0){
                runningGas = 0;
                start = i+1;
            }
        }
        return start;
    }
}