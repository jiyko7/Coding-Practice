import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
		Stack<Integer> s = new Stack<>();
		boolean check = true;
		int start = 0;
        
		for (int ingre : ingredient) {
			s.push(ingre);
		}
		
		while (true) {
			check = true;
			for (int i = start; i<s.size()-3;i++) {
				if (s.get(i)==1) {
					if (checkburger(s,i+1,2)) {
						if (checkburger(s,i+2,3)) {
							if (checkburger(s,i+3,1)) {
								check = false;
								s.remove(i+3);
								s.remove(i+2);
								s.remove(i+1);
								s.remove(i);
                                if (i-3 >= 0){
                                    start = i-3;
                                }
                                else{
                                    start = 0;
                                }
								answer++;
                                break;
							}
						}
					}
				}
			}
			
			if (check) {
				break;
			}
		}
		return answer;
	}
    
	static boolean checkburger(Stack<Integer> s, int index, int checknum) {
		if (s.get(index) == checknum) {
			return true;
		}
		return false;
	}
}