class Solution {
    public long[] solution(long n, long m) {
        long[] answer = new long[2];
        long small = n;
        long big = m;
        if (n>m){
            big = n;
            small=m;
        }
        
        for (long i = small; i>0; i--){
            if ((big%i)==0 && (small%i)==0){
                answer[0] = i;
                break;
            }
        }
        int i = 0;
        while(true){
            i++;
            if ((big*i)%small == 0){
                answer[1] = big*i;
                break;
            }
        }
        
        return answer;
    }
}