import java.util.Stack;

class Solution {
    public String solution(int n) {
        String answer = "";
        Stack<Integer> s = new Stack<>();
        
        int temp = 0;
        
        while(true){
            if(n<4){
                break;
            }
            
            temp = n%3;
            
            if (temp== 0){
                s.push(4);
                n = n/3 -1;
            }
            else{
                s.push(temp);
                n /= 3;
            }
        }
        
        if (n==3){
            n=4;
        }
        s.push(n);
            
        while (!s.isEmpty()){
            answer += String.valueOf(s.pop());
        }
            
         
        
        return answer;
    }
}