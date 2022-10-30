class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arrch = s.toCharArray();
        for (char c : arrch){
            if (c==' '){
                answer += " ";
                continue;
            }
            for (int i=0; i<n; i++){
                if (c=='z'){
                    c='a';
                }
                else if (c=='Z'){
                    c='A';
                }
                else
                c++;
            }
            answer += c;
        }
        return answer;
    }
}