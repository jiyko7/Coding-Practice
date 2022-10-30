import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
    	char temp = words[0].charAt(0);
    	ArrayList<String> list = new ArrayList<String>();
    	for (int i = 0; i<words.length; i++) {
    		if (words[i].charAt(0) != temp) {
    			answer = returnAnswer(i,n);
    			break;
    		}
    		temp = words[i].charAt(words[i].length()-1);
    		if (list.contains(words[i])) {
    			answer = returnAnswer(i,n);
                break;
    		}
    		list.add(words[i]);
    	}
    	return answer;
    }
    
     public int[] returnAnswer(int i, int n){
    	return new int[] {i%n+1, i/n+1};
     }
}