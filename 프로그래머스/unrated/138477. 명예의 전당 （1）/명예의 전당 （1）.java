import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
		int[] award = new int[k];
		int min = score[0];
        
		for (int i = 0; i<k; i++) {
            if (i==score.length){
                return answer;
            }
			else if (score[i]<min) {
				min = score[i];
			}
			answer[i] = min;
			award[i] = score[i];
		}
		
		Arrays.sort(award);
		
		for (int j = k; j<score.length; j++) {
			if (award[0]<score[j]) {
				award[0] = score[j];
				Arrays.sort(award);
			}
			answer[j] = award[0];
		}
        
        return answer;
    }
}