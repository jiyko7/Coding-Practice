class Solution {
    public int solution(int[] citations) {
            
       for (int answer =citations.length; answer>0; answer--) {
	            int up = 0;
	            
	            int middle = 0;
	            for (int i = 0; i<citations.length; i++) {
	                if (citations[i]>answer) {
	                    up++;
	                }
	                else if (citations[i]==answer) {
	                    middle++;  
	                }
	            }

	            if (up == answer)
	            	return answer;
                if (up + middle == answer || (up + middle)/2 == answer)
	            	return answer;
                
		  }
        return 0;
    }
}