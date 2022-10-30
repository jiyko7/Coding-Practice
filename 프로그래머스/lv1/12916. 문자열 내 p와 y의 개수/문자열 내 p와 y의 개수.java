class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        char[] arrch = s.toCharArray();
        
        for (char c : arrch){
            if (c=='p'||c=='P'){
                countP++;
            }
            else if (c=='y'||c=='Y'){
                countY++;
            }
            else{}    
        } 
        if (countP != countY)
            return false;
        return answer;
    }
}