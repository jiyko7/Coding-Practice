class Solution {
    public long solution(long w, long h) {
        long answer = 0;
        
        double prev = 0;
        double now = 0;
        
        
        
        for (int i = 1; i<=w; i++){
            now = (double)h*i/(double)w;
            double temp = 1 * Math.ceil(now) - Math.floor(prev);
            answer += (long)temp;
            prev = now;
        }
        answer = w*h - answer;
        
        return answer;
    }
}