class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String temp = "";
        for (int i = 0; i<t*m; i++){
            temp += Integer.toString(i,n);
        }
        
        for (int j = 1; j<=t; j++){
            answer += temp.substring(p-1,p).toUpperCase();
            p = p+m;
        }
        
        
        return answer;
    }
}