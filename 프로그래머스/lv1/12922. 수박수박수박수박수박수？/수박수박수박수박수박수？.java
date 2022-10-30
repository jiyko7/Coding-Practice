class Solution {
    public String solution(int n) {
        String answer = "";
        while (n>1){
            answer += "수박";
            n -= 2;
        }
        if (n==1)
            answer += "수";
        return answer;
    }
}