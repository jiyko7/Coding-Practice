class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        char[] array = s.toCharArray();
        
        for (char ss : array){
            if (ss == '('){
                count++;
            }
            if (ss == ')'){
                count--;
            }
            if(count<0)
                return false;
        }
        
        if (count != 0) 
            return false;
        return answer;
    }
}