class Solution {
    public String[] solution(String[] quiz) {
        int size = quiz.length;
        String[] answer = new String[size];
        
        boolean plus = true;
        
        for (int i = 0; i<size; i++){
            String[] temp = quiz[i].split(" ");
            int X = 0;
            int Y = 0;
            int Z = 0;
            plus = true;
            
            for (int j = 0; j<5; j++){
                switch(j){
                    case 0: 
                        X = Integer.parseInt(temp[j]);
                        break;
                    case 1: 
                        if (temp[j].equals("-")){
                            plus = false;
                        }
                        break;
                    case 2: 
                        Y = Integer.parseInt(temp[j]);
                        break;
                    case 4: 
                        Z = Integer.parseInt(temp[j]);
                        break;
                    default:
                        break;
                        
                }  
            }
            
            if (plus){
                if (X+Y == Z){
                    answer[i] = "O";
                    continue;
                }
                answer[i] = "X";
                continue;
            }
            
            if (X-Y == Z){
                answer[i] = "O";
                continue;
            }
            answer[i] = "X";
            continue;   
        }
       
        return answer;
    }
}