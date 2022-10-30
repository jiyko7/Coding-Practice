import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int[] temp;
        int index;
        int count = 0;
        for (int[] c : commands){
            index = 0;
            temp = new int [c[1]-c[0]+1];
            for (int i= c[0]-1; i<c[1];i++){
                temp[index++] = array[i];
            }
            Arrays.sort(temp);
            answer[count++] = temp[c[2]-1];
        }
        return answer;
    }
}