class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] arrch = s.toCharArray();
        int count = 0;
        
        for (char c : arrch){
            if (c==' '){
                count = 0;
                answer += " ";
                continue;
            }
            count++;
            if (count%2 != 0)
                answer += Character.toUpperCase(c);
            else
                answer += Character.toLowerCase(c);
        }
        
        return answer;
    }
    
    
    
}