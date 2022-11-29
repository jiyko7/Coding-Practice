class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int num = 0;
		int temp = 0;
        int[] count = new int[10];
		
		for (int i = 0; i<score.length; i++) {
			count[score[i]]++;
		}
		
		for (int j = k; j>=1; j--) {
			num += count[j];
			temp = num/m;
			answer += j * m * temp;
			num -= temp*m;
		}
        
        return answer;
    }
}