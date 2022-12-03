class Solution {
    public int solution(String s) {
        int answer = 0;
        
        char x = s.charAt(0);
        int xYes = 1;
        int xNo = 0;
        
        for (int i = 1; i<s.length(); i++){
            if (s.charAt(i) == x){
                xYes++;
            }
            else{
                xNo++;
            }
            if (xYes == xNo){
                if (i == s.length()-1){
                    break;
                }
                answer++;
                xYes = 1;
                xNo = 0; 
                
                i++;
                x = s.charAt(i);
                
            }
        }
        answer++;
        
        
        return answer;
    }
}