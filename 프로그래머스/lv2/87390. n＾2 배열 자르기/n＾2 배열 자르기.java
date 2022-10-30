class Solution {
    public long[] solution(int n, long left, long right) {
        long row = left/n;
		long column = left%n;

		
		long[] answer = new long[(int)(right-left+1)];
        
		for (int k =0; k<right-left+1; k++) {
			answer[k] = Math.max(row, column)+1;
			column++;
			if (column == n) {
				column =0;
				row++;
			}
		}				
        
        return answer;
    }
}