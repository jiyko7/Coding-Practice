//이해는 어느정도 하였으나 내 답안이 아니므로 다시 풀어보자

import java.util.Stack;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> Con = new Stack<>();
		int index = 0;
		int start = 1;
		
		while (start <= order.length) {
			Con.push(start++);
			while(Con.peek() == order[index]) {
				Con.pop();
				index++;
				if (Con.size() == 0) {
					break;
				}
			}
		}
		
		return index;
    }
}