class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        String temp = phone_number.substring(length-4);
        for (int i=0; i<length-4;  i++){
            answer += "*";
        }
        answer += temp;
        return answer;
    }
}