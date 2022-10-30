class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
    	long temp = 0;
    	
    	char[] arr;
    	while (true){
            if (s.equals("1")){
                break;
            }
            String ss ="";
            arr = s.toCharArray();
            for (char c: arr) {
            	if (c=='0') {
            		answer[1]++;
            	}
            	else if (c=='1') {
            		ss += "1";
            	}
            	else {
            	}
            }
            temp =ss.length();
            s = Long.toBinaryString(temp);
            answer[0]++;
        
        }
        return answer;
    }
}