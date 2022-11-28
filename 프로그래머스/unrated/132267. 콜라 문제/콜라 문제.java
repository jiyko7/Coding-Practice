class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n>=a) {
			int temp = 0;
			if (n%a != 0) {
				temp = n%a;
			}
			n = n/a*b;
			answer += n;
			n += temp;
		}
        
        return answer;
    }
}