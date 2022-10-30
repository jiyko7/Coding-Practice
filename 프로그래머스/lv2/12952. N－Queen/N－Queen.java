class Solution {
    int answer;
    int[] check;
    public int solution(int n) {
        answer = 0;
        
        for (int i = 0; i<n; i++){
            check = new int[n];
            check[0] = i;
            Nqueen(1, n);
        }
        
        return answer;
    }
    
    public void Nqueen(int start, int n){
        if (start == n){
            answer++;
            return;
        }
        
        
        for(int i = 0 ; i < n ; i++){
            check[start] = i;
             if(isPossible(start)){
                Nqueen(start + 1, n);
            } 
        }
    }
    
    
    private boolean isPossible(int start){
        for(int i = 0 ; i < start ; i++){
            if(check[i] == check[start]) return false;
            if(Math.abs(start - i) == Math.abs(check[start] - check[i])) return false;
        }
        return true;
    }
}