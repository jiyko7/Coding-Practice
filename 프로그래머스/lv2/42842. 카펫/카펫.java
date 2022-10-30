class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        brown /= 2;
        int width;
        int height;
        for (int i =1; i<=brown/2; i++){
            height = i;
            width = brown - height;
            if (yellow % height == 0) {
            	if (yellow/height == width-2) {
            		answer[0] = width;
            		answer[1] = height+2;
                    return answer;
            	}
            }
        }
        return answer;
    }
}