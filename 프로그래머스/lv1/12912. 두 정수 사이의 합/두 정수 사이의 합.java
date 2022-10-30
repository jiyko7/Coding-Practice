class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        long small = a;
        long big = b;
        
        if (a>b){
            small = b;
            big = a;
        }
        
        for (long i = small; i<=big; i++){
            answer += i;
        }
        
        return answer;
    }
}