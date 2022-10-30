class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length()==4 || s.length()==6){
            char[] arrch = s.toCharArray();
            for (char c : arrch){
                if (!Character.isDigit(c))
                    return false;
            }     
        }
        else {
            answer = false;
        }
        return answer;
    }
}