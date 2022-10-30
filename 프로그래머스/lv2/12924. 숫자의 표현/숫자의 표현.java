class Solution {
    public int solution(int n) {
        int answer =0;
        int sum;
        
        for (int i=1 ; i <=n; i++){
            sum = 0;
            int j = i;
            while(sum<n && j<=n){
                sum += j++;
            }
            if (sum == n)
                answer++;
        }
        
        return answer;
    }
}