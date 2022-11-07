class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int row = board.length;
		int column = board[0].length;
		boolean[][] check = new boolean[row][column];
		for (int i = 0; i <row; i++) {
			for (int j = 0; j <column; j++) {
				if (board[i][j] == 1) {
					check[i][j] = true;
					
					if (i>0) {
						check[i-1][j] = true;
						if(j>0)
							check[i-1][j-1] = true;	
					}
					
					if (j>0) {
						check[i][j-1] = true;
					}
					
					if(i+1<row) {
						check[i+1][j] = true;
						if (j>0) {
							check[i+1][j-1] = true;
						}
					}

					if (j+1 <column) {
						check[i][j+1] = true;
						if (i>0) {
							check[i-1][j+1] = true;
						}
						if (i+1<row) {
							check[i+1][j+1] = true;
						}
					}
				}
			}
		}
		
		for (int k = 0; k <row; k++) {
			for (int l = 0; l <column; l++) {
				if (check[k][l]) {
					answer++;
				}
			}
		}
		
		return(check.length * check[0].length - answer);
    }
}