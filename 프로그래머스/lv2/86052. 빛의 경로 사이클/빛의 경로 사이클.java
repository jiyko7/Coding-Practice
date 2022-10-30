import java.util.Stack;
import java.util.Collections;

class Solution {
    public int[] solution(String[] grid) {
		Stack<Integer> stack  = new Stack<Integer>();
		int[] moveRow = {1,0,-1,0}; 
		int[] moveColumn = {0,1,0,-1};
		//상좌하우
		
		int row = grid.length;
		int column = grid[0].length();
		boolean[][][]gridcheck = new boolean[row][column][4];
		//체크 배열
		
		for (int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++) {
				for (int k= 0; k<4; k++) {
					if (!gridcheck[i][j][k]) { //방문해보지 않은 사이클인 경우
						stack.push(check(grid, gridcheck, moveRow, moveColumn, i, j ,k)); //사이클 경로를 추가
					}
				}
			}
		}
		
		int[] answer = new int[stack.size()];
		int index = 0;
        Collections.sort(stack);
		for (Integer s :stack) {
			answer[index++] = s;
		}
		
		
	    return answer;
	}

	private static Integer check(String[] grid, boolean[][][] gridcheck, 
			int[] moveRow, int[] moveColumn, int i, int j,int k) {
		
		int count =0;
		
		while(true){
			if (gridcheck[i][j][k])
				break;
			
			count++;
			gridcheck[i][j][k] = true;
			
			if (grid[i].charAt(j) == 'L')
				k = (k+3)%4; //좌회전
			else if (grid[i].charAt(j) == 'R')
				k = (k+1)%4; //우회전
			
			i = (i +moveRow[k] + gridcheck.length) % gridcheck.length;
			j = (j +moveColumn[k] + gridcheck[i].length) % gridcheck[i].length;
			
		}
		
		return count;
	}
}