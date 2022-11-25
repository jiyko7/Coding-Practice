class Solution {
    static int max = 0;
    public String solution(String number, int k) {
        
        int size = number.length() - k;
		int count = size;
		char[] arr = new char[size];
		int checkpoint = 0;
		int divide = 0;
		int start = 0;

		
		for (int i = 0; i<size; i++) {
			checkpoint = 0;
			divide = number.length() - count+1;
			
			arr[i] = '.';
			for (int j = start; j<divide; j++) {
				if (number.charAt(j) == '9'){
                    arr[i] = '9';
                    checkpoint = j;
                    break;
                }
				else if (arr[i] < number.charAt(j)) {
					arr[i] = number.charAt(j);
					checkpoint = j;
				}
			}
			
			start = checkpoint+1;
			count--;

		}
		
		
        return new String(arr);

    }
}