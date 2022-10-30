class Solution {
    public int solution(long num) {
        int answer = 0;
        int count = 0;
        while (num != 1){
            num = num%2==0 ? num/2 : num*3+1;
            count++;
            if (count == 500)
                break;
        }
        answer = num==1 ? count : -1;
        return answer;
    }
}