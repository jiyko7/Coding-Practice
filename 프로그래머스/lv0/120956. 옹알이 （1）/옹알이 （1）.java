class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] word = {"aya", "ye", "woo", "ma"};
		
		for (String w : word) {
			for (int i = 0; i<babbling.length; i++) {
				System.out.println(babbling[i]);
				babbling[i] = babbling[i].replaceFirst(w," ");
				System.out.println(babbling[i]);
			}
		}
		
		for (String ba : babbling) {
			if (ba.isBlank()) {
				answer++;
			}
		}
        
        return answer;
    }
}