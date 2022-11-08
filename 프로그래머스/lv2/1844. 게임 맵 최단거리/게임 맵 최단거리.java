import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
		int row = maps.length;
		int column = maps[0].length;
		
		Queue<node> queue = new LinkedList<>();
		boolean[][] check = new boolean[row][column];
		
		check[0][0]= true;
		queue.add(new node(0,0,1));
		
		while (!queue.isEmpty()) {
			node temp = queue.poll();
			int x = temp.x;
			int y = temp.y;
			int count = temp.count;
			
			if (x==row-1 && y==column-1) {
				return count;
			}
			
			if (x>0) {
				if (maps[x-1][y] == 1 && !check[x-1][y]) {
					queue.offer(new node(x-1,y,count+1));
					check[x-1][y]  = true;
				}
			}
			if (x<row-1) {
				if (maps[x+1][y] == 1 && !check[x+1][y]) {
					queue.offer(new node(x+1,y,count+1));
					check[x+1][y]  = true;
				}
			}
			if (y>0) {
				if (maps[x][y-1] == 1 && !check[x][y-1]) {
					queue.offer(new node(x,y-1,count+1));
					check[x][y-1]  = true;
				}
			}
			if (y<column-1) {
				if (maps[x][y+1] == 1 && !check[x][y+1]) {
					queue.offer(new node(x,y+1,count+1));
					check[x][y+1]  = true;
				}
			}
		}
        return -1;
    }
}

class node{
	int x;
	int y;
	int count;
	node(int x, int y, int count){
		this.x = x;
		this.y = y;
		this.count = count;
	}
}