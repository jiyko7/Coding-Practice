import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
		char temp ='a';
		int answer = arr.length;
		Stack<Character> buffer = new Stack<Character>();
		
		
		for (int i = 0; i<arr.length; i++) {
			boolean flag =true;
			for (char c : arr) {
				switch (c) {
				case '(':
					buffer.push(c);
					break;
				case ')':
					if (buffer.isEmpty()) {
						flag = false;
						break;
					}
					temp = buffer.pop();
					if (temp != '(') {
						flag = false;
					}
					break;
				case '[':
					buffer.push(c);
					break;
				case ']':
					if (buffer.isEmpty()) {
						flag = false;
						break;
					}
					temp = buffer.pop();
					if (temp != '[') {
						flag = false;
					}
					break;
				case '{':
					buffer.push(c);
					break;
				case '}':
					if (buffer.isEmpty()) {
						flag = false;
						break;
					}
					temp = buffer.pop();
					if (temp != '{') {
						flag = false;
					}
					break;
				default:
					break;
				}
			}
			if (!flag || !buffer.isEmpty()) {
				answer--;
				buffer.clear();
			}
			
			temp = arr[0];
			for (int j = 0; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
        return answer;
    }
}