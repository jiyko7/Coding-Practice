import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        int temp=-1;
        for (int i : arr){
            if (i!= temp){
                array.add(i);
                temp = i;
            }
        }
        int[] answer = new int[array.size()];
        int s = 0;
        for (int a : array)
            answer[s++] = a;
            
        return answer;
    }
}