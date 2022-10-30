import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> Aanswer = new ArrayList<Integer>();
        for (int i : arr){
            if (i%divisor == 0)
                Aanswer.add(i);
        }
        
        int length = Aanswer.size();
        int[] answer = new int[length];
        if (length==0){
            answer = new int[]  {-1};
            return answer;
        }
        int size=0;
        for(int temp : Aanswer) 
            answer[size++] = temp;
         Arrays.sort(answer);
        return answer;
    }
}