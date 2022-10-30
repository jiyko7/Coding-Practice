class Solution {
    public long solution(long n) {
        long answer = 0;
        long result = (long)Math.sqrt(n);
        answer = (long)Math.pow(result,2);
        if (answer == n)
            answer = (long)Math.pow(result+1,2);
        else
            answer = -1;
        return answer;
    }
}