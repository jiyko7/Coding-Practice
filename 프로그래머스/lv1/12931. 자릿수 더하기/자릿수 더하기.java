import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] list = String.valueOf(n).split("");
        for (String s : list){
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}