import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("}");
		Stack<Integer> stack = new Stack<Integer>();
		int temp = 0;
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()- o2.length();
			}
		});
		for (String ss : arr) {
			ss = ss.replaceAll("\\{", "");
			String[] ssarr = ss.split(",");
			
			for (int i = 0; i<ssarr.length; i++) {
				if (ssarr[i].equals("")) {
					continue;
				}
				temp = Integer.parseInt(ssarr[i]);
				if (!stack.contains(temp)){
					stack.push(temp);
				}
			}
		}
		int[] answer = new int[stack.size()];
		int index = 0;
		for (int c: stack) {
			answer[index++] = c;
		}
        return answer;
    }
}