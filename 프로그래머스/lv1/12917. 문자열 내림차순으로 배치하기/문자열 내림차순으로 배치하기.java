import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arrch = s.toCharArray();
        Arrays.sort(arrch);
        answer = new StringBuilder(new String(arrch)).reverse().toString();
        return answer;
    }
}