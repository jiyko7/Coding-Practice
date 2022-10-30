import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        
        for (int i =0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        
        for (int j =0; j<sizes.length; j++)
            max = max<sizes[j][0]? sizes[j][0]:max;
        
        for (int k =0; k<sizes.length; k++)
            answer = answer<sizes[k][1]? sizes[k][1]:answer;
        
        return answer*max;
    }
}