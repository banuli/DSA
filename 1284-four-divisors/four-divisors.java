class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans = 0;
        for(int n:nums){
            int count = 0;
            int divsum = 0;
            for(int d = 1; d*d <= n;d++){
                
                if(n%d ==0){
                    int other = n/d;
                    if(d==other){
                        count++;
                        divsum += d;
                    }else{
                        count += 2;
                        divsum += (d+other);
                    }
                    if(count>4)break;
                }
            }
            if(count == 4){
                ans += divsum;
            }
        }
        return ans;   
        
    }
}