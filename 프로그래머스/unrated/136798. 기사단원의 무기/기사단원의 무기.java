class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] num = new int[number];
        
        for (int i = 1; i<=number; i++){
            for (int j=1; j<=Math.sqrt(i); j++){
                if (i%j == 0){
                    if (i/j == j){
                        num[i-1]++;
                    }
                    else{
                        num[i-1] += 2;
                    }
                }
            }    
        }
        
        
        for (int k = 0; k<number; k++){
            if (num[k]>limit){
                answer += power;
            }
            else{
                answer += num[k];
            }
        }
        
        
        return answer;
        
    }
}