class Solution {
    public long solution(int n) {
        long answer = 0;
         if (n<=3){
            return n % 1000000007;
        }
        
        answer = 3;
        long sum1 = 1;
        long sum2 = 1;
        long temp = 0;

        for (int i = 4; i<=n; i++){
            temp = (sum1 + sum2) % 1000000007;
            answer = answer + temp;
            sum1 = sum2;
            sum2 = temp;
            
        }
        
        return answer % 1000000007;
    }
}