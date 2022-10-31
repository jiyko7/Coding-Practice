import java.util.Stack;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        int temp = 0;
        boolean check = true;
		Stack<Integer> list = new Stack<>();
		for (int i : priorities) {
			list.push(i);
		}
		
		while(true) {
			check = true;
			temp = list.remove(0);
			location--;
			
			for (int l:list) {
				if(check) {
					if (l>temp) {
						check = false;
					}
				}
			}
			
			if (check) {
				if (location == -1) {
					break;
				}
				else {
					answer++;
				}
			}
			else {
				if(location<0) {
					location = list.size();
				}
				list.push(temp);
			}
		}
		
        return answer;
    }
}