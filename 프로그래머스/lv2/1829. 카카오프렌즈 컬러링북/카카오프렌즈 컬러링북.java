class Solution {
    static int areaSize;
	static int numberOfArea;
	static int maxSizeOfOneArea;
	static boolean[][] area;
    
    public int[] solution(int m, int n, int[][] picture) {
        areaSize = 0;
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        
        area = new boolean[m][n];
        
        for (int i = 0; i< m; i++) {
        	for (int j=0; j<n; j++) {
        		if (picture[i][j] == 0) {
        			
        		}
        		else {
        			areaSize = 0;
                    check(picture[i][j],picture,i,j); 
        		}
        		 
        	}
        }

        int[] answer = new int[2];
  
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        
        return answer;
    }
    
    static void check(int value, int[][]  picture, int row, int column) {
		if (picture[row][column] == value) {
			if (area[row][column]) {
				return;
			}

			areaSize++;
			if (areaSize == 1) {
				numberOfArea++;
			}
				
			if (areaSize>maxSizeOfOneArea) {
				maxSizeOfOneArea = areaSize;
			}
			area[row][column] = true;
			
			if (column != 0) {
				check(value,picture,row,column-1);
			}
            
            if (row != 0) {
					check(value,picture,row-1,column);
			}
			
			if (column+1 != area[0].length) {
				check(value,picture,row,column+1);
			}
			
			if (row+1 != area.length) {
				check(value,picture,row+1,column);
			}
		}
	
	}
}