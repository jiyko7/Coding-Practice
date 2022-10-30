import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stackP = new Stack<Integer>();
		Stack<Integer> stackS = new Stack<Integer>();
		
		Stack<Integer> done = new Stack<Integer>();
		int temp = 0;
		int count = 0;
		int index = 0;
		
		for (int i=progresses.length-1; i>=0; i--) {
			stackP.push(progresses[i]);
			stackS.push(speeds[i]);
		}
		
		while(true) {
			if (stackP.size() == 0) {
				break;
			}
			
			temp = (int) Math.ceil((100.0-stackP.pop())/stackS.pop());
			count = 1;
			while(true) {
				index = 0;
				if (stackP.size() == 0) {
					break;
				}
				else if(stackP.peek()+temp*stackS.peek()>=100) {
					stackP.pop();
					stackS.pop();
					count++;
				}
				else {
					while (true) {
						if (index == stackP.size())
							break;
						stackP.set(index,stackP.get(index) + temp*stackS.get(index));
						index++;
					}
					break;
				}
			}
			done.push(count);
		}
        
        
        int[] answer = new int[done.size()];
		index = 0;
		for (int d:done)
			answer[index++] = d;
        
        return answer;
    }
}