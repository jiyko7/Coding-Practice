import java.util.*;

class Solution {
    ArrayList<Integer> array = new ArrayList<>();
    public int[][] solution(int n) {
       
        
        hanoi(n,1,2,3);
        
        int[][] answer = new int[array.size()/2][2];
        for (int i = 0; i <array.size(); i++){
            answer[i/2][0] = array.get(i);
            answer[i/2][1] = array.get(++i);
        }
        return answer;
    }
    
    public void move(int n , int start, int to){
        array.add(start);
        array.add(to);
    }
    
    public void hanoi(int n, int start, int tmp, int to){
        if (n==1)
            move(1, start, to);
        else{
            hanoi(n-1, start, to, tmp);
            move(n, start, to);
            hanoi(n-1, tmp, start, to);
        }
    }
}