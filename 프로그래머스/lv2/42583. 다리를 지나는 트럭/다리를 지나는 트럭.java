import java.util.Stack;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Stack<Integer> waitTruck = new Stack<>();
		Stack<Integer> goneTruck = new Stack<>();
		int sum = 0;
		
		for (int i = truck_weights.length-1; i>=0; i--) {
			waitTruck.push(truck_weights[i]);
		}
		
		while(true) {
			if (waitTruck.size()==0)
				break;
			answer++;
			
			if (goneTruck.size()<bridge_length) {
				if (sum <= weight) {
					if (sum+waitTruck.peek() <= weight) {
						goneTruck.push(waitTruck.pop());
						sum += goneTruck.peek();
					}
					else {
						goneTruck.push(0);
					}
				}
			}
			else {
				sum -= goneTruck.get(0);
				goneTruck.remove(0);
				answer--;
			}	
		}
		answer += bridge_length;
        return answer;
    }
}